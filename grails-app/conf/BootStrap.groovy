import grails.util.Environment;

import org.springframework.context.i18n.LocaleContextHolder

import com.tord.Article
import com.tord.Info
import com.tord.Photo
import com.tord.Widget
import com.tord.Work
import com.tord.admin.Footer
import com.tord.admin.FooterModule
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

	def getDetail(String title) {
		"""
                        <h3 class="p-title">${title}</h3>
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
		"""
	}

    def init = { servletContext ->
		if(Environment.current == Environment.DEVELOPMENT) {
			setupUsers();
			setupSiteSettings();
			setupMetaData();
			setupPagesAndSliders();
			setupTestData();
			setupHomePage();
			setupArticles();
			setupInfomation();
		}else{
			
		}
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
		
		SiteSettings.putIt("SiteName", "拓德");
		SiteSettings.putIt("SiteEnglishName", "Tord");
		SiteSettings.putIt("CurrentVersion", "v1.0");
		SiteSettings.putIt("ICP", "蜀ICP备15015799号");
		def locale = new Locale("zh", "CN");
		LocaleContextHolder.setLocale(locale);
		SiteSettings.putIt("DefaultLocale", locale.toString());
		def thisYear = Calendar.getInstance().get(Calendar.YEAR);
		SiteSettings.putIt("CopyRight", "©${thisYear} ${SiteSettings.getIt('SiteEnglishName')} ${SiteSettings.getIt('ICP')} ");
		
		SiteSettings.putIt("地址", "成都高新区剑南大道中段保利新座3座11楼7号8号");
		SiteSettings.putIt("电话", "13980046104");
		SiteSettings.putIt("邮箱", "434695383@163.com");
		SiteSettings.putIt("QQ", "434695383");
		SiteSettings.putIt("微博", "434695383");
		SiteSettings.putIt("微信", "434695383");
		
	}
	
	def setupMetaData() {
		/////// header & menu
		Menu.deleteAllRows();
		Header.deleteAllRows();
		def homeHeader = createHeader("HOME_HEADER", HeaderStyle.FIXED_DARK);
		def siteHeader = createHeader("PAGE_HEADER", HeaderStyle.LIGHT);
		def adminHeader = createAdminHeader();

		/////// Footer
		createFooter("PAGE_FOOTER");
	}
	
	def setupPagesAndSliders() {
		////// reset values
		Page.deleteAllRows();
		SliderRevolution.deleteAllRows();
		Slider.deleteAllRows();
		
		////////////////////////////////////
		def homePage = new Page(name: "HOME_PAGE", title: "拓德官网_拓德一站式家装O2O平台_拓德家装公司_四川拓德进出口贸易有限公司_建材_瓷砖", 
			sliderRevolution: createHomeRevSlider(), customJavaScript: 'home.js', layoutName: 'home');
		homePage.save(flush:true);
		
		////////////////////////////////////
		def adminPage = new Page(name: "ADMIN_PAGE", title: "后台管理", layoutName: 'admin', customJavaScript: 'admin.js');
		adminPage.save(flush:true);
		
		////////////////////////////////////
		def portfolioPage = new Page(name: "PORTFOLIO_PAGE", title: "新品发布", customJavaScript: 'portfolio.js');
		portfolioPage.save(flush: true);
		def showPortfolioPage = new Page(name: "SHOW_PORTFOLIO_PAGE", title: "查看商品详情", layoutName: 'site');
		showPortfolioPage.save(flush: true);
		
		////////////////////////////////////
		def projectPage = new Page(name: "PROJECT_PAGE", title: "成功案例", customJavaScript: 'project.js');
		projectPage.save(flush: true);
		def showProjectPage = new Page(name: "SHOW_PROJECT_PAGE", title: "查看案例", layoutName: 'site');
		showProjectPage.save(flush: true);
		
		////////////////////////////////////
		def blogPage = new Page(name: "BLOG_PAGE", title: "产品培训", customJavaScript: 'blog.js');
		blogPage.save(flush: true);
		
		////////////////////////////////////
		def shopPage = new Page(name: "SHOP_PAGE", title: "建材超市", customJavaScript: 'shop.js');
		shopPage.save(flush: true);
		
		////////////////////////////////////
		def infoPage = new Page(name: "INFO_PAGE", title: "信息公告");
		infoPage.save(flush: true);
		
	}

	private SliderRevolution createHomeRevSlider() {
		////// revolution slider
		def slider1 = new Slider(name: "首页幻灯页二", style: 2, bgImage: Photo.createPhoto("demos/slider-re2.jpg"), bgImageAlt: "slider2", row1: "拓德家装O2O平台", row2: "互联网领先的一站式家装解决方案提供商", row3: "了解更多")
		def slider2 = new Slider(name: "首页幻灯页一", style: 1, bgImage: Photo.createPhoto("demos/slider-re1.jpg"), bgImageAlt: "slider1", row1: "现在购买卫浴系列", row2: "享受", row3: "10%的", row4: "额外优惠！")
		def slider3 = new Slider(name: "首页幻灯页四", style: 2, bgImage: Photo.createPhoto("demos/slider-re4.jpg"), bgImageAlt: "slider4", row1: "拓德家装O2O平台", row2: "有你所需要的全部", row3: "随便逛逛")
		def slider4 = new Slider(name: "首页幻灯页三", style: 3, bgImage: Photo.createPhoto("demos/slider-re3.jpg"), bgImageAlt: "slider3", row1: "新品折扣", row2: "专业卫浴瓷砖", row3: "享受额外的10%优惠政策", row4: "立即购买")
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
//		def menu6 = homeHeader.createMenu([name: "${name}_${++i}", title: "登录", icon: "fa-sign-in", controller:"login", action:""]);
		homeHeader.save()
		return homeHeader
	}
	
	private Header createAdminHeader() {
		def homeHeader = new Header(name: "ADMIN_HEADER", style: HeaderStyle.HIDDEN_ON_LEFT);
		int i = 0;
		homeHeader.createMenu("ADMIN_HEADER_${++i}", "控制面板", "admin", "index");
		homeHeader.createMenu("ADMIN_HEADER_${++i}", "新品、案例管理", "work", "index");
		homeHeader.createMenu("ADMIN_HEADER_${++i}", "文章管理", "article", "index");
		homeHeader.createMenu("ADMIN_HEADER_${++i}", "建材超市管理", "product", "index");
		homeHeader.createMenu("ADMIN_HEADER_${++i}", "首页元素管理", "widget", "index");
		homeHeader.createMenu("ADMIN_HEADER_${++i}", "信息公告管理", "infoadmin", "index");
		homeHeader.createMenu("ADMIN_HEADER_${++i}", "幻灯片管理", "sliderRevolution", "index");
		homeHeader.createMenu("ADMIN_HEADER_${++i}", "幻灯子页管理", "slider", "index");
		homeHeader.createMenu("ADMIN_HEADER_${++i}", "菜单管理", "menu", "index");
		
		homeHeader.createMenu("ADMIN_HEADER_${++i}", "页面管理", "page", "index");
		homeHeader.createMenu("ADMIN_HEADER_${++i}", "页眉管理", "header", "index");
		homeHeader.createMenu("ADMIN_HEADER_${++i}", "页脚管理", "footer", "index");
		homeHeader.createMenu("ADMIN_HEADER_${++i}", "页脚元素管理", "footerModule", "index");
		
		homeHeader.createMenu("ADMIN_HEADER_${++i}", "图片管理", "photo", "index");
		homeHeader.createMenu("ADMIN_HEADER_${++i}", "全局设置", "siteSettings", "index");

		homeHeader.createMenu("ADMIN_HEADER_${++i}", "用户管理", "user", "");
		homeHeader.createMenu("ADMIN_HEADER_${++i}", "角色管理", "role", "");
		
//		homeHeader.createMenu([name: "ADMIN_HEADER_${++i}", title: "登录", icon: "fa-sign-in", controller:"login", action:""]);
		
		homeHeader.save()
		return homeHeader
	}

	def setupTestData() {
		// rest
		Work.deleteAllRows();
		
		String portCat = "portfolio";
		
		for(int i = 0; i < 10; i++) {
			Work protWork1 = new Work(name: "瓷砖${'A'+i}型", category: portCat, title: "拓德瓷砖${'A'+i}型", titlePhoto: Photo.createPhoto("demos/portfolio/product${i+1}.jpg"), titlePhotoAlt: "盛夏瓷砖${'A'+i}型");
			protWork1.addPhoto("demos/p_gallery1.jpg")
			protWork1.addPhoto("demos/p_gallery2.jpg")
			protWork1.addPhoto("demos/p_gallery3.jpg")
			protWork1.addPhoto("demos/p_gallery4.jpg")
			protWork1.addPhoto("demos/p_gallery1.jpg")
			protWork1.addPhoto("demos/p_gallery2.jpg")
			protWork1.setContentHTML(getDetail(protWork1.title));
			protWork1.save();
			
			if(i < 3) {
				protWork1.addTag("即将上市")
			}else if(i < 6) {
				protWork1.addTag("七月");
			}else if(i < 9) {
				protWork1.addTag("六月")
			}else {
				protWork1.addTag("往期")
			}
		}

		String projcat = "project";
		for(int i = 0; i < 10; i++) {
			Work projWork1 = new Work(name: "装修案例${i+1}", category: projcat, title: "装修案例${i+1}", titlePhoto: Photo.createPhoto("demos/portfolio/product${i+1}.jpg"), titlePhotoAlt: "装修案例${i+1}");
			
			projWork1.addPhoto("demos/p_gallery1.jpg")
			projWork1.addPhoto("demos/p_gallery2.jpg")
			projWork1.addPhoto("demos/p_gallery3.jpg")
			projWork1.addPhoto("demos/p_gallery4.jpg")
			projWork1.addPhoto("demos/p_gallery1.jpg")
			projWork1.addPhoto("demos/p_gallery2.jpg")
		
			projWork1.setContentHTML(getDetail(projWork1.title));
			
			projWork1.save();
			
			if(i < 3) {
				projWork1.addTag("新项目")
			}else if(i < 6) {
				projWork1.addTag("现代简约");
			}else if(i < 9) {
				projWork1.addTag("简欧")
			}else {
				projWork1.addTag("精装")
			}
		}
		
		for(int j = 0; j < 9; j++) {
			int i = j + 1;
			if(j == 7)i = 2;
			if(j == 8)i = 5;
			
			Work homeProtWork1 = new Work(name: "首页展示案例${j+1}", category: projcat, title: "首页展示案例${j+1}", titlePhoto: Photo.createPhoto("demos/portfolio/p${i}.jpg"), titlePhotoAlt: "首页展示案例${j+1}");
			
			homeProtWork1.addPhoto("demos/portfolio/p${i}.jpg")
			homeProtWork1.addPhoto("demos/p_gallery1.jpg")
			homeProtWork1.addPhoto("demos/p_gallery2.jpg")
			homeProtWork1.addPhoto("demos/p_gallery3.jpg")
			homeProtWork1.setContentHTML(getDetail(homeProtWork1.title));
			
			homeProtWork1.setShowOnHomePage(true);
			
			homeProtWork1.save();
			
			if(j < 3) {
				homeProtWork1.addTag("新项目")
			}else if(j < 6) {
				homeProtWork1.addTag("现代简约")
			}else if(j < 9) {
				homeProtWork1.addTag("简欧")
			}
		}
		
	}
		
	def setupHomePage() {
		Widget.deleteAllRows();
		
		new Widget(name: "首页关于1", category: "首页关于", 
				photo: Photo.createPhoto("demos/about-bk.jpg"), 
				title: "我们够专业", contentHTML: "老牌建材公司，积累了一流的人才、雄厚的资金和宽广的渠道，为您提供最专业的服务").save();
		new Widget(name: "首页关于2", category: "首页关于", 
				photo: Photo.createPhoto("demos/about-bk.jpg"), 
				title: "我们够专注", contentHTML: "多年专注于整体式装修设计，选材，施工，监理和质量保证。").save();
		new Widget(name: "首页关于3", category: "首页关于", 
				photo: Photo.createPhoto("demos/about-bk.jpg"), 
				title: "我们够专心", contentHTML: "专心只为做好一件事，为客户考虑，为客户分忧。").save();

		new Widget(name: "首页团队1", category: "首页团队", 
				photo: Photo.createPhoto("demos/team1.jpg"), 
				title: "xuepf", contentHTML: "总工程师").save();
		new Widget(name: "首页团队2", category: "首页团队", 
				photo: Photo.createPhoto("demos/team2.jpg"), 
				title: "陈某某", contentHTML: "总设计师").save();
		new Widget(name: "首页团队3", category: "首页团队", 
				photo: Photo.createPhoto("demos/team3.jpg"), 
				title: "王某", contentHTML: "CEO & CFO").save();
		new Widget(name: "首页团队4", category: "首页团队", 
				photo: Photo.createPhoto("demos/team4.jpg"), 
				title: "super man", contentHTML: "著名艺术家").save();
		new Widget(name: "首页团队5", category: "首页团队", 
				photo: Photo.createPhoto("demos/team5.jpg"), 
				title: "某美女", contentHTML: "前台").save();
			
		new Widget(name: "首页售后", category: "首页售后", 
				title: "全场包邮，七天包退", contentHTML: "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
				refController: "info", refAction: "policy", refText: "了解跟多售后保障").save();
	
		int k = 1;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 6; j++) {
				new Widget(name: "首页合作伙伴${k++}", category: "首页合作伙伴",
					photo: Photo.createPhoto("demos/partler${j + 1}.png"),
					title: "合作伙伴${k++}", contentHTML: "").save();
			}
		}
	}
	
	
	def createFooter(String name) {
		Footer.deleteAllRows();
		FooterModule.deleteAllRows();
		
		def footer = new Footer(name: name);
		
		def footerModule1 = new FooterModule(name: "页脚元素1", title: "关于", 
			type: "html", contentHTML: "拓德一站式家装O2O，是业界领先的在线家装平台。Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur quis mollis tellus, et ullamcorper velit.").save();
		def footerModule2 = new FooterModule(name: "页脚元素2", title: "联系方式", 
			type: "contact").save();
		def footerModule3 = new FooterModule(name: "页脚元素3", title: "最新文章", 
			type: "recent-post").save();
		def footerModule4 = new FooterModule(name: "页脚元素4", title: "最新展示", 
			type: "recent-portfolio").save();
		
		footer.setModule1(footerModule1);
		footer.setModule2(footerModule2);
		footer.setModule3(footerModule3);
		footer.setModule4(footerModule4);
		
		footer.save();
	}
	
	def setupArticles() {
		Article.deleteAllRows();
		
		def arc = new Article(name: "文章1", title: "文章1", contentHTML: "文章文章文章，文章文章文章，文章文章文章，文章文章文章。", titlePhoto: Photo.createPhoto("demos/last-1.jpg"));
		arc.save();
	}
	
	def setupInfomation(){
		Info.deleteAllRows();

		def infoPolicy = new Info(name: "POLICY_INFO", title: "售后服务政策", contentHTML: "<h2>售后服务政策<h2><p>内容内容内容，内容内容</p><p><ol><li>内容内容内容，内容内容</li><li>内容内容内容，内容内容</li><li>内容内容内容，内容内容</li></ol></p>")
		infoPolicy.save();
		
		def infoAbout = new Info(name: "ABOUT_INFO", title: "关于我们", contentHTML: "<h2>拓德一站式家装O2O平台<h2><p>内容内容内容，内容内容</p><p><ol><li>内容内容内容，内容内容</li><li>内容内容内容，内容内容</li><li>内容内容内容，内容内容</li></ol></p>")
		infoAbout.save();
	}
}
