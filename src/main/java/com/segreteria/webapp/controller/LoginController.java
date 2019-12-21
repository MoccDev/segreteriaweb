package com.segreteria.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.segreteria.webapp.model.Login;
import com.segreteria.webapp.model.Student;
import com.segreteria.webapp.service.LoginService;

@Controller//Identifica questa classe come un controller
public class LoginController 
{
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String getLogin(Model model)
	{
		Login login = new Login();
		model.addAttribute("login", login);
		return "index";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String makeLogin(@ModelAttribute Login login, Model model)
	{
		Student persona = loginService.makeLogin(login);
		login.setError("Access denied");
		model.addAttribute("login", login);
		return "index";
	}
}
