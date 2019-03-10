package com.java1234.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java1234.entity.User;
import com.java1234.service.UserService;

/**
 * 用户Controller层
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("/login")
	public String login(User user, HttpServletRequest request) throws Exception {
		User userResult = userService.login(user);
		if (userResult == null) {
			request.setAttribute("user", user);
			request.setAttribute("errorMsg", "用户名或密码错误！");
			return "login";
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("currenUser", userResult);
			return "redirect:/main.jsp";
		}
	}
}
