package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.User;

/**
 * 用户Dao接口
 * 
 * @author Administrator
 *
 */
public interface UserDao {
	/**
	 * 用户登陆
	 * 
	 * @param user
	 * @return
	 */
	public User login(User user);

	/**
	 * 查询用户集合
	 * 
	 * @param map
	 * @return
	 */
	public List<User> find(Map<String, Object> map);

	/**
	 * 获取总记录数
	 * 
	 * @param map
	 * @return
	 */

	public Long getTotal(Map<String, Object> map);

	/**
	 * 用户信息添加
	 * 
	 * @param user
	 * @return
	 */
	public int add(User user);

	/**
	 * 用户信息修改
	 * 
	 * @param user
	 * @return
	 */
	public int update(User user);

	/**
	 * 用户信息删除
	 * 
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
}
