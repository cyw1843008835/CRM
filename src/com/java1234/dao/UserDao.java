package com.java1234.dao;

import com.java1234.entity.User;

/**
 * �û�Dao�ӿ�
 * 
 * @author Administrator
 *
 */
public interface UserDao {

	/**
	 * �û���¼
	 * 
	 * @param user
	 * @return
	 */
	public User login(User user);
}
