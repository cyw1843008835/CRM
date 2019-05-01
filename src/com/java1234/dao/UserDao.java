package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.User;

/**
 * �û�Dao�ӿ�
 * 
 * @author Administrator
 *
 */
public interface UserDao {
	/**
	 * �û���½
	 * 
	 * @param user
	 * @return
	 */
	public User login(User user);

	/**
	 * ��ѯ�û�����
	 * 
	 * @param map
	 * @return
	 */
	public List<User> find(Map<String, Object> map);

	/**
	 * ��ȡ�ܼ�¼��
	 * 
	 * @param map
	 * @return
	 */

	public Long getTotal(Map<String, Object> map);

	/**
	 * �û���Ϣ���
	 * 
	 * @param user
	 * @return
	 */
	public int add(User user);

	/**
	 * �û���Ϣ�޸�
	 * 
	 * @param user
	 * @return
	 */
	public int update(User user);

	/**
	 * �û���Ϣɾ��
	 * 
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
}
