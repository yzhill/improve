package com.huayu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huayu.dao.INewsDAO;
import com.huayu.pojo.News;
import com.huayu.service.INewsService;
@Service
public class NewsServiceImpl implements INewsService {
	
    @Resource
	private INewsDAO newsDAO;
	@Override
	public boolean insert(News vo) throws Exception {
		// TODO Auto-generated method stub
		return this.newsDAO.doCreate(vo);
	}

	@Override
	public List<News> list() throws Exception {
		// TODO Auto-generated method stub
		return this.newsDAO.findAll();
	}

}
