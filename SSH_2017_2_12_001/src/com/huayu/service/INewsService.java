package com.huayu.service;

import java.util.List;

import com.huayu.pojo.News;

public interface INewsService {
	
    public boolean  insert(News vo) throws Exception;
	
	public List<News> list()throws Exception;
	


}
