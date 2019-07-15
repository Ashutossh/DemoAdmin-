package com.lti.homloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.homloan.model.Admin;
import com.lti.homloan.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminLoginController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/adminLoginForm")
	public String showFormForAdd(ModelMap theModel) {
		Admin theAdmin=new Admin();
		//addAttribute will include all the property of Customer
		theModel.addAttribute("admin", theAdmin);
		return "login-admin";
	}
    
	@RequestMapping(value = "/loginAdmin",  method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView processLogin(@ModelAttribute Admin theUser) {
		Admin adm = adminService.checkUser(theUser);
		ModelAndView model = null;
		if (adm == null) {
			model = new ModelAndView("login-admin");
			model.addObject("error", "Invalid Username or Password");
		} else {
			model = new ModelAndView("welcome");
			model.addObject("adm", adm);
			//model.addObject("usr", usr.getEmail());
		}
		return model;
	}
}