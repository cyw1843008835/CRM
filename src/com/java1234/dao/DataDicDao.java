package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.DataDic;

/**
 * �����ֵ�ӿ�
 * 
 * @author Administrator
 *
 */
public interface DataDicDao {

	public List<DataDic> find(Map<String, Object> map);

	public List<DataDic> findAll();

	/**
	 * ��ȡ�ܼ�¼��
	 * 
	 * @param map
	 * @return
	 */

	public Long getTotal(Map<String, Object> map);

}
