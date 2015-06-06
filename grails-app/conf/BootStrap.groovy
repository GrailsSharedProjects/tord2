import org.springframework.context.i18n.LocaleContextHolder

import com.tord.Header
import com.tord.HeaderStyle
import com.tord.Menu
import com.tord.MenuStyle
import com.tord.Page
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
		def adminRole = Role.findOrSaveByAuthority('ROLE_ADMIN');
		def userRole = Role.findOrSaveByAuthority('ROLE_USER');
		def testUser = User.findByUsername('me');
		if(!testUser) {
			testUser = new User(username: 'me', password: 'password');
			testUser.save(flush: true);
		}
		def userRoleInst = UserRole.findByUserAndRole(testUser, adminRole);
		if(!userRoleInst) {
			UserRole.create testUser, adminRole, true
		}
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
		
		settings.save(flush: true, insert: true);
		
	}
	
	def setupPagesAndSliders() {
		////// reset values
		Page.deleteAllRows();
		Menu.deleteAllRows();
		Header.deleteAllRows();
		SliderRevolution.deleteAllRows();
		Slider.deleteAllRows();
		
		/////// header & menu
		def homeHeader = createHeader("HOME_HEADER", HeaderStyle.FIXED_DARK);
		
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
			sliderRevolution: revSliders, header: homeHeader, layoutName: 'site', customJavaScript: 'home.js', );
		homePage.save(flush:true);
		
		////////////////////////////////////
		def adminHeader = new Header(name: "ADMIN_PAGE_HEADER").save();
		
		def adminPage = new Page(name: "ADMIN_PAGE", title: "后台管理", header: adminHeader, layoutName: 'admin', customJavaScript: 'admin.js');
		adminPage.save(flush:true);
		
		////////////////////////////////////
		def siteHeader = createHeader("PAGE_HEADER", HeaderStyle.LIGHT);
		
		def showPortfolioPage = new Page(name: "SHOW_PORTFOLIO_PAGE", title: "查看详情", header: siteHeader, layoutName: 'site', customJavaScript: 'portfolio.js');
		showPortfolioPage.save(flush: true);
		
		def newProductPage = new Page(name: "NEW_PRODUCT_PAGE", title: "新品发布", header: siteHeader, layoutName: 'site', customJavaScript: 'portfolio.js');
		newProductPage.save(flush: true);
		
		def sucessProjectPage = new Page(name: "SUCCESS_PROJECT_PAGE", title: "成功案例", header: siteHeader, layoutName: 'site', customJavaScript: 'portfolio.js');
		sucessProjectPage.save(flush: true);
		
		def blogPage = new Page(name: "BLOG_PAGE", title: "产品培训", header: siteHeader, layoutName: 'site', customJavaScript: 'blog.js');
		blogPage.save(flush: true);
		
		def shopPage = new Page(name: "SHOP_PAGE", title: "建材超市", header: siteHeader, layoutName: 'site', customJavaScript: 'shop.js');
		shopPage.save(flush: true);
		
	}

	private Header createHeader(String name, HeaderStyle headerStyle) {
		def homeHeader = new Header(name: name, style: headerStyle, );
		def menu1 = homeHeader.createMenu("首页", "home", "index");
		def menu2 = homeHeader.createMenu("新品发布", "portfolio", "index", MenuStyle.FOUR_GROUPS);
		menu2.createSubMenu("釉面砖1", "portfolio", "index", 0)
		menu2.createSubMenu("釉面砖2", "portfolio", "index", 0)
		menu2.createSubMenu("釉面砖3", "portfolio", "index", 0)
		menu2.createSubMenu("釉面砖4", "portfolio", "index", 0)
		menu2.createSubMenu("釉面砖5", "portfolio", "index", 1)
		menu2.createSubMenu("釉面砖6", "portfolio", "index", 1)
		menu2.createSubMenu("釉面砖7", "portfolio", "index", 1)
		menu2.createSubMenu("釉面砖8", "portfolio", "index", 1)
		menu2.createSubMenu("釉面砖9", "portfolio", "index", 2)
		menu2.createSubMenu("釉面砖0", "portfolio", "index", 2)
		menu2.createSubMenu("釉面砖1", "portfolio", "index", 2)
		menu2.createSubMenu("釉面砖2", "portfolio", "index", 2)
		menu2.createSubMenu("釉面砖3", "portfolio", "index", 3)
		menu2.createSubMenu("釉面砖4", "portfolio", "index", 3)
		menu2.createSubMenu("釉面砖5", "portfolio", "index", 3)
		menu2.createSubMenu("釉面砖6", "portfolio", "index", 3)
		def menu3 = homeHeader.createMenu("产品培训", "blog", "index");
		def menu4 = homeHeader.createMenu("成功案例", "portfolio", "project");
		def menu5 = homeHeader.createMenu("建材超市", "shop", "index");
		homeHeader.save()
		return homeHeader
	}
	
}
