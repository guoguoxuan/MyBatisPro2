package com.icat.mappers;

import java.util.List;
import java.util.Map;

import com.icat.model.Student;

public interface StudentMapper {
	
	public List<Student> searchStudents(Map<String, Object> map);	
	
	public List<Student> searchStudents2(Map<String, Object> map);	
	
	public List<Student> searchStudents3(Map<String, Object> map);	

	public List<Student> searchStudents4(Map<String, Object> map);	

	public List<Student> searchStudents5(Map<String, Object> map);	
	
	//set
	public int updateStudent(Student student);

}
