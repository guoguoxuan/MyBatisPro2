package com.icat.mappers;

import java.util.List;

import com.icat.model.Student;

//映射
public interface StudentMapper {
	
	//添加
	public int add(Student student);
	
	public int update(Student student);
	
	public int delete(Integer id);
	
	//通ID查找学生
	public Student findById(Integer id);
	
	//查询全部
	public List<Student> find();
	
	//级联查询   一对一
	public Student findStudentWithAddress(Integer id);
	
}
