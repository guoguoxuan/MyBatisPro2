package com.icat.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.icat.mappers.StudentMapper;
import com.icat.model.Student;
import com.icat.util.SqlSessionFactoryUtil;

public class StudentTest2 {
	
	private static Logger logger = Logger.getLogger(StudentTest2.class);
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
	public void testAdd() {
		logger.info("添加学生");
		Student student = new Student("王五", "11");
		int result = studentMapper.add(student);
		sqlSession.commit();	
	}
	
	@Test
	public void testUpdate() {
		logger.info("修改学生");
		Student student = new Student(2, "王五2", "14");
		studentMapper.update(student);
		sqlSession.commit();
	}
	
	@Test
	public void testDelete() {
		logger.info("删除学生");
		studentMapper.delete(2);
		sqlSession.commit();	
	}
	
	@Test
	public void testFindById() {
		logger.info("通过ID查找学生");
		//查找3，返回的是学生类型
		Student student = studentMapper.findById(3);
		System.out.println(student);
	}
	
	@Test
	public void testFind() {
		logger.info("查找所有学生");
		List<Student> studentList = studentMapper.find();
		for (Student s : studentList) {
			System.out.println(s);
		}
	}

}
