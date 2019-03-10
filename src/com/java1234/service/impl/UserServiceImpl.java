package com.java1234.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.UserDao;
import com.java1234.entity.User;
import com.java1234.service.UserService;

/**
 * 用户Service实现类
 * 
 * @author Administrator
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}
}
