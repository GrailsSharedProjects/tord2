import com.tord.Page
import com.tord.Slider
import com.tord.SliderRevolution
import com.tord.auth.Role
import com.tord.auth.User
import com.tord.auth.UserRole

class BootStrap {

    def init = { servletContext ->
		
		def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
		def userRole = new Role(authority: 'ROLE_USER').save(flush: true)
  
		def testUser = new User(username: 'me', password: 'password')
		testUser.save(flush: true)
  
		UserRole.create testUser, adminRole, true
  
		assert User.count() == 1
		assert Role.count() == 2
		assert UserRole.count() == 1
		
		
		////// setup pages & sliders
		def slider1 = new Slider(style: 1, bgImgUrl: "A", row1: "B", row2: "C", row3: "D", row4: "E")
		def slider2 = new Slider(style: 2, bgImgUrl: "", row1: "", row2: "", row3: "", row4: "")
		def slider3 = new Slider(style: 3, bgImgUrl: "", row1: "", row2: "", row3: "", row4: "")
		def slider4 = new Slider(style: 2, bgImgUrl: "", row1: "", row2: "", row3: "", row4: "")
		
		def revSliders = new SliderRevolution(desc: "Home Page Rev Slider");
		revSliders.addToSliders(slider1);
		revSliders.addToSliders(slider2);
		revSliders.addToSliders(slider3);
		revSliders.addToSliders(slider4);
		revSliders.save()
		
		def home = new Page(title: "成都装修_成都家装公司_拓德官网_拓德一站式O2O平台_四川拓德进出口贸易有限公司_建材_瓷砖", sliderRevolution: revSliders);
		home.save(flush:true);

    }
    def destroy = {
		
    }
}
