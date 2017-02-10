package com.huayu.vo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

public class Teacher {
	
	private int id;
	private String name;
	private Set<Student> students=new HashSet<Student>(); 
	
	@ManyToMany
    @JoinTable (name="t_s", //加入中间表
          joinColumns={@JoinColumn(name="teacher_id")},
    	  inverseJoinColumns={@JoinColumn(name="student_id")}
    		)
	public Set<Student> getstudents() {
		return students;
	}
	public void setstudents(Set<Student> students) {
		this.students =students;
	}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
