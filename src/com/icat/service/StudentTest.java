package com.icat.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.icat.mappers.StudentMapper;
import com.icat.model.Student;
import com.icat.util.SqlSessionFactoryUtil;

/**
 * MyBatis3------动态SQL
 * */

public class StudentTest {
	
	private static Logger logger = Logger.getLogger(StudentTest.class);
	private SqlSession sqlSession = null;
	private StudentMapper studentMapper = null;
	

	/**
	 * 测试方法前调用
	 * */
	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		studentMapper = sqlSession.getMapper(StudentMapper.class);
	}

	/**
	 * 测试方法前调用
	 * */
	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}

	@Test
	public void testSerchStudents() {
		logger.info("查询学生(带条件 if)");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("gradeId", 2);
		map.put("name", "%王%");
		map.put("age", "11");
		List<Student> studentList = studentMapper.searchStudents(map);
		//遍历
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testSerchStudents2() {
		logger.info("查询学生(带条件choose when otherwise)");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchBy", "age");
		map.put("gradeId", 2);
		map.put("name", "%王%");  //注意传值乱码
		//map.put("age", "11");
		List<Student> studentList = studentMapper.searchStudents2(map);
		for (Student student :studentList) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testSerchStudents3() {
		logger.info("查询学生(带条件  where)");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("gradeId", 1);
		//map.put("name", "%王%");
		map.put("age", 14);
		List<Student> studentList = studentMapper.searchStudents3(map);
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testSerchStudents4() {
		logger.info("查询学生(带条件  where)");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("gradeId", 1);
		//map.put("name", "%王%");
		map.put("age", 14);
		List<Student> studentList = studentMapper.searchStudents4(map);
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testSearchStudents5() {
		logger.info("查询学生(带条件  foreach)");
		Map<String, Object> map = new HashMap<String, Object>();
		List<Integer> gradeIds = new ArrayList<Integer>();
		gradeIds.add(1);
		//gradeIds.add(2);
		map.put("gradeIds", gradeIds);
		List<Student> studentList = studentMapper.searchStudents5(map);
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testUpdateStudent() {
		logger.info("更新学生");
		Student student = new Student();
		student.setId(6);
		student.setName("李四2");
		student.setAge("14");
		studentMapper.updateStudent(student);
		sqlSession.commit();
	}

}
