package com.huayu.action;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.stereotype.Repository;

import com.huayu.pojo.News;
import com.huayu.service.INewsService;
import com.opensymphony.xwork2.ActionSupport;

@Repository
@Namespace(value="/")
@Action(value="News")
@SuppressWarnings("serial")
public class NewsAction extends ActionSupport {
	@Resource
	private INewsService newsService;
	
	public void insert(){
		News vo=new News();
		vo.setTitle("新闻标题——"+System.currentTimeMillis());
		vo.setContent("新闻内容——"+System.currentTimeMillis());
		vo.setPubDate(new Date());
		try {
			System.out.println(this.newsService.insert(vo));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void list(){
		
		try {
			System.out.println(this.newsService.list());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
