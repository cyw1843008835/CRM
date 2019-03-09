package com.java1234.dao;

import com.java1234.entity.User;

/**
 * 用户Dao接口
 * 
 * @author Administrator
 *
 */
public interface UserDao {

	/**
	 * 用户登录
	 * 
	 * @param user
	 * @return
	 */
	public User login(User user);
}
