package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Product;

/**
 * ��Ʒ��Ϣ�ӿ�
 * 
 * @author Administrator
 *
 */
public interface ProductDao {

	public List<Product> find(Map<String, Object> map);

	/**
	 * ��ȡ�ܼ�¼��
	 * 
	 * @param map
	 * @return
	 */

	public Long getTotal(Map<String, Object> map);

}
