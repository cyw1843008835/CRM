package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Product;

/**
 * ��Ʒ��ϢService�ӿ�
 * 
 * @author Administrator
 *
 */
public interface ProductService {

	public List<Product> find(Map<String, Object> map);

	public Long getTotal(Map<String, Object> map);

}
