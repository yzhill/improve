package com.huayu.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * News entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "NEWS", schema = "SCOTT")
public class News implements java.io.Serializable {

	// Fields

	private BigDecimal nid;
	private String title;
	private Date pubDate;
	private String content;

	// Constructors

	/** default constructor */
	public News() {
	}

	/** minimal constructor */
	public News(String title) {
		this.title = title;
	}

	/** full constructor */
	public News(String title, Date pubDate, String content) {
		this.title = title;
		this.pubDate = pubDate;
		this.content = content;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "NID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getNid() {
		return this.nid;
	}

	public void setNid(BigDecimal nid) {
		this.nid = nid;
	}

	@Column(name = "TITLE", nullable = false, length = 40)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PUB_DATE", length = 7)
	public Date getPubDate() {
		return this.pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	@Column(name = "CONTENT", length = 30)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}