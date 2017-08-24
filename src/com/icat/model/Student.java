package com.icat.model;

public class Student {
	
	private Integer id;
	private String name;
	private String age;
	
	
	//构造方法(默认)
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//构造方法(带参数)
	public Student(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	//重载构造器
	public Student(Integer id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	
	


	
	
	
	
}
