package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.User;
import service.UserService;

@Controller
public class RegistrationController {
	@Autowired
	public UserService userService;
	
	@RequestMapping(value="/register",method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("register");
		modelAndView.addObject("user",new User());
		return modelAndView;
	}
	
	public ModelAndView addUser(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("user") User user) {
		
		userService.register(user);
		return new ModelAndView("welcome","username",user.getUserName());
	}
	
	
}
