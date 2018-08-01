package com.controller;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Accredit;
import com.model.Users;
import com.service.LoginService;

@Controller
@Scope("prototype")
public class LoginController extends GenericController{
	@Resource(name="loginService")
	private LoginService loginService;

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	@RequestMapping("/loginController_login.do")
	public ModelAndView login(String username,String password) {
		Users user = this.loginService.loginValidate(username);
		if(user!=null) {
			if(user.getPassword().equals(password)) {
				this.session.setAttribute("currentUser", user);
				System.out.println("权限"+user.getUsersRole().getAccredits().size());
				
				return new ModelAndView("index");
			}else {
				this.session.setAttribute("error", "密码错误");
				return new ModelAndView("login");
			}
		}else {
			this.session.setAttribute("error", "用户不存在");
			return new ModelAndView("login");
		}
	}
}
