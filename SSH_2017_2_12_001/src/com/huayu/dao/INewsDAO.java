package com.huayu.dao;

import java.util.List;

import com.huayu.pojo.News;

public interface INewsDAO {
	
	public boolean  doCreate(News vo) throws Exception;
	
	public List<News> findAll()throws Exception;
	

}
