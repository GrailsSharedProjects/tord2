import org.springframework.context.i18n.LocaleContextHolder

import com.tord.Photo
import com.tord.Work
import com.tord.WorkCategory
import com.tord.admin.Header
import com.tord.admin.HeaderStyle
import com.tord.admin.Menu
import com.tord.admin.MenuStyle
import com.tord.admin.Page
import com.tord.admin.SiteSettings
import com.tord.admin.Slider
import com.tord.admin.SliderRevolution
import com.tord.auth.Role
import com.tord.auth.User
import com.tord.auth.UserRole

class BootStrap {

    def init = { servletContext ->
		setupUsers();
		setupSiteSettings();
		setupMetaData();
		setupPagesAndSliders();
		
		setupTestData();
		
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
	
	def setupMetaData() {
		WorkCategory.findOrSaveByName("portfolio");
		WorkCategory.findOrSaveByName("project");
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
		def siteHeader = createHeader("PAGE_HEADER", HeaderStyle.LIGHT);
		def adminHeader = createAdminHeader();
		
		////////////////////////////////////
		def homePage = new Page(name: "HOME_PAGE", title: "成都装修_成都家装公司_拓德官网_拓德一站式O2O平台_四川拓德进出口贸易有限公司_建材_瓷砖", 
			sliderRevolution: createHomeRevSlider(), header: homeHeader, customJavaScript: 'home.js', );
		homePage.save(flush:true);
		
		////////////////////////////////////
		def adminPage = new Page(name: "ADMIN_PAGE", title: "后台管理", header: adminHeader, layoutName: 'admin', customJavaScript: 'admin.js');
		adminPage.save(flush:true);
		
		////////////////////////////////////
		def portfolioPage = new Page(name: "PORTFOLIO_PAGE", title: "新品发布", header: siteHeader, customJavaScript: 'portfolio.js');
		portfolioPage.save(flush: true);
		def showPortfolioPage = new Page(name: "SHOW_PORTFOLIO_PAGE", title: "查看商品详情", header: siteHeader, layoutName: 'site');
		showPortfolioPage.save(flush: true);
		
		////////////////////////////////////
		def projectPage = new Page(name: "PROJECT_PAGE", title: "成功案例", header: siteHeader, customJavaScript: 'project.js');
		projectPage.save(flush: true);
		def showProjectPage = new Page(name: "SHOW_PROJECT_PAGE", title: "查看案例", header: siteHeader, layoutName: 'site');
		showProjectPage.save(flush: true);
		
		////////////////////////////////////
		def blogPage = new Page(name: "BLOG_PAGE", title: "产品培训", header: siteHeader, customJavaScript: 'blog.js');
		blogPage.save(flush: true);
		
		////////////////////////////////////
		def shopPage = new Page(name: "SHOP_PAGE", title: "建材超市", header: siteHeader, customJavaScript: 'shop.js');
		shopPage.save(flush: true);
		
	}

	private SliderRevolution createHomeRevSlider() {
		////// revolution slider
		def slider1 = new Slider(name: "首页幻灯页一", style: 1, bgImage: new Photo(url: "demos/slider-re1.jpg", alt: "slider1").save(), row1: "现在购买卫浴系列", row2: "享受", row3: "10%的", row4: "额外优惠！")
		def slider2 = new Slider(name: "首页幻灯页二", style: 2, bgImage: new Photo(url: "demos/slider-re2.jpg", alt: "slider2").save(), row1: "拓德家装O2O平台", row2: "互联网领先的一站式家装解决方案提供商", row3: "了解更多")
		def slider3 = new Slider(name: "首页幻灯页三", style: 3, bgImage: new Photo(url: "demos/slider-re3.jpg", alt: "slider3").save(), row1: "新品折扣", row2: "专业卫浴瓷砖", row3: "享受额外的10%优惠政策", row4: "立即购买")
		def slider4 = new Slider(name: "首页幻灯页四", style: 2, bgImage: new Photo(url: "demos/slider-re4.jpg", alt: "slider4").save(), row1: "拓德家装O2O平台", row2: "有你所需要的全部", row3: "随便逛逛")
		def revSlider = new SliderRevolution(name: "首页巨幅幻灯片");
		revSlider.addToSliders(slider1);
		revSlider.addToSliders(slider2);
		revSlider.addToSliders(slider3);
		revSlider.addToSliders(slider4);
		revSlider.save()
		return revSlider
	}

	private Header createHeader(String name, HeaderStyle headerStyle) {
		def homeHeader = new Header(name: name, style: headerStyle, );
		int i = 0;
		def menu1 = homeHeader.createMenu("${name}_${++i}", "首页", "home", "index");
		def menu2 = homeHeader.createMenu("${name}_${++i}", "新品发布", "portfolio", "index", MenuStyle.FOUR_GROUPS);
		int j = 0;
		menu2.createSubMenu("${name}_${i}_${++j}", "釉面砖1", "portfolio", "index", 0)
		menu2.createSubMenu("${name}_${i}_${++j}", "釉面砖2", "portfolio", "index", 0)
		menu2.createSubMenu("${name}_${i}_${++j}", "釉面砖3", "portfolio", "index", 0)
		menu2.createSubMenu("${name}_${i}_${++j}", "釉面砖4", "portfolio", "index", 0)
		menu2.createSubMenu("${name}_${i}_${++j}", "釉面砖5", "portfolio", "index", 1)
		menu2.createSubMenu("${name}_${i}_${++j}", "釉面砖6", "portfolio", "index", 1)
		menu2.createSubMenu("${name}_${i}_${++j}", "釉面砖7", "portfolio", "index", 1)
		menu2.createSubMenu("${name}_${i}_${++j}", "釉面砖8", "portfolio", "index", 1)
		menu2.createSubMenu("${name}_${i}_${++j}", "釉面砖9", "portfolio", "index", 2)
		menu2.createSubMenu("${name}_${i}_${++j}", "釉面砖0", "portfolio", "index", 2)
		menu2.createSubMenu("${name}_${i}_${++j}", "釉面砖1", "portfolio", "index", 2)
		menu2.createSubMenu("${name}_${i}_${++j}", "釉面砖2", "portfolio", "index", 2)
		menu2.createSubMenu("${name}_${i}_${++j}", "釉面砖3", "portfolio", "index", 3)
		menu2.createSubMenu("${name}_${i}_${++j}", "釉面砖4", "portfolio", "index", 3)
		menu2.createSubMenu("${name}_${i}_${++j}", "釉面砖5", "portfolio", "index", 3)
		menu2.createSubMenu("${name}_${i}_${++j}", "釉面砖6", "portfolio", "index", 3)
		def menu3 = homeHeader.createMenu("${name}_${++i}", "产品培训", "blog", "index");
		def menu4 = homeHeader.createMenu("${name}_${++i}", "成功案例", "project", "index");
		def menu5 = homeHeader.createMenu("${name}_${++i}", "建材超市", "shop", "index");
		def menu6 = homeHeader.createMenu([name: "${name}_${++i}", title: "登录", icon: "fa-sign-in", controller:"login", action:""]);
		homeHeader.save()
		return homeHeader
	}
	
	private Header createAdminHeader() {
		def homeHeader = new Header(name: "ADMIN_HEADER", style: HeaderStyle.HIDDEN_ON_LEFT);
		int i = 0;
		def menu1 = homeHeader.createMenu("ADMIN_HEADER_${++i}", "控制面板", "admin", "index");
		def menu2 = homeHeader.createMenu("ADMIN_HEADER_${++i}", "菜单管理", "menu", "index");
		def menu3 = homeHeader.createMenu("ADMIN_HEADER_${++i}", "页面管理", "page", "index");
		def menu4 = homeHeader.createMenu("ADMIN_HEADER_${++i}", "页眉管理", "header", "index");
		def menu5 = homeHeader.createMenu("ADMIN_HEADER_${++i}", "页脚管理", "footer", "index");
		def menu6 = homeHeader.createMenu("ADMIN_HEADER_${++i}", "幻灯片管理", "sliderRevolution", "index");
		def menu7 = homeHeader.createMenu("ADMIN_HEADER_${++i}", "幻灯页管理", "slider", "index");
		def menu8 = homeHeader.createMenu("ADMIN_HEADER_${++i}", "新品管理", "work", "index");
		def menu9 = homeHeader.createMenu("ADMIN_HEADER_${++i}", "示例项目管理", "project", "index");
		def menu10 = homeHeader.createMenu("ADMIN_HEADER_${++i}", "商店管理", "product", "index");
		def menu11 = homeHeader.createMenu("ADMIN_HEADER_${++i}", "文章管理", "article", "index");
		
		def menuLogin = homeHeader.createMenu([name: "ADMIN_HEADER_${++i}", title: "登录", icon: "fa-sign-in", controller:"login", action:""]);
		homeHeader.save()
		return homeHeader
	}

	def setupTestData() {
		// rest
		Work.deleteAllRows();
		
		WorkCategory portCat = WorkCategory.findByName("portfolio");
		Work protWork1 = new Work(name: "瓷砖A型", category: portCat, title: "盛夏瓷砖A型", titlePic: new Photo(url: "demos/portfolio/product1.jpg", alt: "盛夏瓷砖A型").save(), );
		protWork1.addPhoto("demos/p_gallery1.jpg", "gallery pic1")
		protWork1.addPhoto("demos/p_gallery2.jpg", "gallery pic2")
		protWork1.addPhoto("demos/p_gallery3.jpg", "gallery pic3")
		protWork1.addPhoto("demos/p_gallery4.jpg", "gallery pic4")
		protWork1.addPhoto("demos/p_gallery1.jpg", "gallery pic5")
		protWork1.addPhoto("demos/p_gallery2.jpg", "gallery pic6")
		protWork1.setContentHTML("""
                        <h3 class="p-title">${protWork1.title}</h3>
                        <p>
                            Maecenas ultrices viverra ligula, vel lobortis ante pulvinar sed. Donec erat magna, aliquam vitae semper vitae, accumsan vel nisl. Vivamus pellentesque orci sit amet odio dictum eget commodo nulla consequat. Proin iaculis tristique nisl ut eleifend. Maecenas lacus purus, malesuada eu scelerisque ac, commodo sed orci. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Curabitur a tortor ut leo mattis cursus. Vestibulum laoreet interdum pellentesque. Suspendisse vitae cursus urna.
                        </p>
                        <p>
产品描述产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述
产品描述产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述   
                        </p>                        <p>
产品描述产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述
产品描述产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述   
                        </p>                        <p>
产品描述产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述
产品描述产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述   
                        </p>                        <p>
产品描述产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述
产品描述产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述   
                        </p>                        <p>
产品描述产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述
产品描述产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述   
                        </p>
		""")
		protWork1.save();
		protWork1.addTag("即将上市")
		
		Work protWork2 = new Work(name: "瓷砖X型", category: portCat, title: "拖得瓷砖X型", titlePic: new Photo(url: "demos/portfolio/product2.jpg", alt: "拖得瓷砖X型").save(), );
		protWork2.addPhoto("demos/p_gallery3.jpg", "gallery pic1")
		protWork2.addPhoto("demos/p_gallery2.jpg", "gallery pic2")
		protWork2.addPhoto("demos/p_gallery1.jpg", "gallery pic3")
		protWork2.addPhoto("demos/p_gallery4.jpg", "gallery pic4")
		protWork2.addPhoto("demos/p_gallery3.jpg", "gallery pic5")
		protWork2.addPhoto("demos/p_gallery2.jpg", "gallery pic6")
		protWork2.setContentHTML("""
                        <h3 class="p-title">${protWork2.title}</h3>
                        <p>
                            Maecenas ultrices viverra ligula, vel lobortis ante pulvinar sed. Donec erat magna, aliquam vitae semper vitae, accumsan vel nisl. Vivamus pellentesque orci sit amet odio dictum eget commodo nulla consequat. Proin iaculis tristique nisl ut eleifend. Maecenas lacus purus, malesuada eu scelerisque ac, commodo sed orci. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Curabitur a tortor ut leo mattis cursus. Vestibulum laoreet interdum pellentesque. Suspendisse vitae cursus urna.
                        </p>
                        <p>
产品描述产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述
产品描述产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述   
                        </p>                        <p>
产品描述产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述
产品描述产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述   
                        </p>                        <p>
产品描述产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述
产品描述产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述   
                        </p>                        <p>
产品描述产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述
产品描述产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述 产品描述   
                        </p>
		""")
		protWork2.save();
		protWork2.addTag("四月")
	}
		
}
