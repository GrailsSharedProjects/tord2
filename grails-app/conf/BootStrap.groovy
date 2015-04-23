import org.springframework.context.i18n.LocaleContextHolder

import com.tord.Header
import com.tord.MenuStyle
import com.tord.Page
import com.tord.PageLayout
import com.tord.Photo
import com.tord.SiteSettings
import com.tord.Slider
import com.tord.SliderRevolution
import com.tord.auth.Role
import com.tord.auth.User
import com.tord.auth.UserRole

class BootStrap {

    def init = { servletContext ->
		
		setupUsers();
		setupSiteSettings();
		setupPagesAndSliders();
		
    }
    def destroy = {
		
    }
	
	def setupUsers() {
		// debug users
		def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
		def userRole = new Role(authority: 'ROLE_USER').save(flush: true)
		def testUser = new User(username: 'me', password: 'password')
		testUser.save(flush: true)
		UserRole.create testUser, adminRole, true
		assert User.count() == 1
		assert Role.count() == 2
		assert UserRole.count() == 1
	}
	
	def setupSiteSettings() {
		//// reset
		SiteSettings.deleteAllRows();
		
		def settings = new SiteSettings();
		settings.putIt("SiteLayout", "Lhome");
		settings.putIt("AdminLayout", "Ladmin");
		settings.putIt("SiteName", "拓德");
		settings.putIt("SiteEnglishName", "Tord");
		settings.putIt("CurrentVersion", "v1.0");
		settings.putIt("ICP", "京ICP证0000000号 ");
		def locale = new Locale("zh", "CN");
		LocaleContextHolder.setLocale(locale);
		settings.putIt("DefaultLocale", locale);
		def thisYear = Calendar.getInstance().get(Calendar.YEAR);
		settings.putIt("CopyRight", "©${thisYear} ${settings.getIt('SiteEnglishName')} ${settings.getIt('ICP')} ");
		settings.putIt("LogoDarkUrl", "logo.png");
		settings.putIt("LogoLightUrl", "logo2.png");
		settings.save(flush: true, insert: true);
		
		PageLayout.deleteAllRows();
		
		new PageLayout(name: "home").save();
		new PageLayout(name: "admin").save();
		new PageLayout(name: "portfolio").save();
		new PageLayout(name: "uploader").save();
		
	}
	
	def setupPagesAndSliders() {
		////// reset values
		Page.deleteAllRows();
//		Slider.deleteAllRows();
//		SliderRevolution.deleteAllRows();
		
		/////// header & menu
		def homeHeader = new Header(name: "HOME_PAGE_HEADER", style: HeaderStyle.FIXED_DARK, );
		def menu1 = homeHeader.createMenu("首页", "home", "index");
		def menu2 = homeHeader.createMenu("新品发布", "home", "index", MenuStyle.FOUR_GROUPS);
		menu2.createSubMenu("釉面砖1", "home", "index", 0)
		menu2.createSubMenu("釉面砖2", "home", "index", 0)
		menu2.createSubMenu("釉面砖3", "home", "index", 0)
		menu2.createSubMenu("釉面砖4", "home", "index", 0)
		menu2.createSubMenu("釉面砖5", "home", "index", 1)
		menu2.createSubMenu("釉面砖6", "home", "index", 1)
		menu2.createSubMenu("釉面砖7", "home", "index", 1)
		menu2.createSubMenu("釉面砖8", "home", "index", 1)
		menu2.createSubMenu("釉面砖9", "home", "index", 2)
		menu2.createSubMenu("釉面砖0", "home", "index", 2)
		menu2.createSubMenu("釉面砖1", "home", "index", 2)
		menu2.createSubMenu("釉面砖2", "home", "index", 2)
		menu2.createSubMenu("釉面砖3", "home", "index", 3)
		menu2.createSubMenu("釉面砖4", "home", "index", 3)
		menu2.createSubMenu("釉面砖5", "home", "index", 3)
		menu2.createSubMenu("釉面砖6", "home", "index", 3)
		def menu3 = homeHeader.createMenu("产品培训", "home", "index");
		def sub1 = menu3.createSubMenu("瓷砖", "home", "index");
		def sub2 = menu3.createSubMenu("墙面砖", "home", "index");
		def subsub1 = sub2.createSubMenu("墙面砖1", "home", "index");
		def subsub2 = sub2.createSubMenu("墙面砖2", "home", "index");
		def menu4 = homeHeader.createMenu("成功案例", "home", "index");
		def menu5 = homeHeader.createMenu("建材超市", "home", "index");
		homeHeader.save();
		
		////// revolution slider
		def slider1 = new Slider(style: 1, bgImage: new Photo(url: "demos/slider-re1.jpg", alt: "slider1").save(), row1: "现在购买卫浴系列", row2: "享受", row3: "10%的", row4: "额外优惠！")
		def slider2 = new Slider(style: 2, bgImage: new Photo(url: "demos/slider-re2.jpg", alt: "slider2").save(), row1: "拓德家装O2O平台", row2: "互联网领先的一站式家装解决方案提供商", row3: "了解更多")
		def slider3 = new Slider(style: 3, bgImage: new Photo(url: "demos/slider-re3.jpg", alt: "slider3").save(), row1: "新品折扣", row2: "专业卫浴瓷砖", row3: "享受额外的10%优惠政策", row4: "立即购买")
		def slider4 = new Slider(style: 2, bgImage: new Photo(url: "demos/slider-re4.jpg", alt: "slider4").save(), row1: "拓德家装O2O平台", row2: "有你所需要的全部", row3: "随便逛逛")
		def revSliders = new SliderRevolution(desc: "首页巨幅幻灯片");
		revSliders.addToSliders(slider1);
		revSliders.addToSliders(slider2);
		revSliders.addToSliders(slider3);
		revSliders.addToSliders(slider4);
		revSliders.save()
		
		def homePage = new Page(name: "HOME_PAGE", title: "成都装修_成都家装公司_拓德官网_拓德一站式O2O平台_四川拓德进出口贸易有限公司_建材_瓷砖", 
			sliderRevolution: revSliders, header: homeHeader, layout: PageLayout.findByName("home"));
		homePage.save(flush:true);
		
		////////////////////////////////////
		def adminHeader = new Header(name: "ADMIN_PAGE_HEADER").save();
		
		def adminPage = new Page(name: "ADMIN_PAGE", title: "后台管理", header: adminHeader, layout: PageLayout.findByName("admin"));
		adminPage.save(flush:true);
	}
	
}
