package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.User;

/**
 * �û�Service�ӿ�
 * 
 * @author Administrator
 *
 */
public interface UserService {

	public User login(User user);

	public List<User> find(Map<String, Object> map);

	public Long getTotal(Map<String, Object> map);
}
