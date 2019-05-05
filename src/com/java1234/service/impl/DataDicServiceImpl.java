package com.java1234.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.DataDicDao;
import com.java1234.entity.DataDic;
import com.java1234.service.DataDicService;

/**
 * �����ֵ�Serviceʵ����
 * 
 * @author Administrator
 *
 */
@Service("dataDicService")
public class DataDicServiceImpl implements DataDicService {

	@Resource
	private DataDicDao dataDicDao;

	@Override
	public List<DataDic> find(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return dataDicDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return dataDicDao.getTotal(map);
	}

	@Override
	public List<DataDic> findAll() {
		// TODO Auto-generated method stub
		return dataDicDao.findAll();
	}

	@Override
	public int add(DataDic dataDic) {
		// TODO Auto-generated method stub
		return dataDicDao.add(dataDic);
	}

	@Override
	public int update(DataDic dataDic) {
		// TODO Auto-generated method stub
		return dataDicDao.update(dataDic);
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return dataDicDao.delete(id);
	}

}
