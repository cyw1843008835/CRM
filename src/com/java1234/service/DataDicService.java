package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.DataDic;

/**
 * 数据字典Service接口
 * 
 * @author Administrator
 *
 */
public interface DataDicService {

	public List<DataDic> find(Map<String, Object> map);

	public List<DataDic> findAll();

	public Long getTotal(Map<String, Object> map);

	public int add(DataDic dataDic);

	public int update(DataDic dataDic);

	public int delete(Integer id);

}
