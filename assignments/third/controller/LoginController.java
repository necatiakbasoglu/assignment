package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Login;
import model.User;
import service.UserService;

@Controller
public class LoginController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("login");
		modelAndView.addObject("login",new Login());
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
		@ModelAttribute("login") Login login) {
		
		ModelAndView modelAndView = null;
		User user = userService.validateUser(login);
		if (null != user) {
			modelAndView = new ModelAndView("welcome");
			modelAndView.addObject("username", user.getUserName());
		} else {
			modelAndView = new ModelAndView("login");
			modelAndView.addObject("message", "Username or Password is wrong!!");
		}
		return modelAndView;
	}
	
}
