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

public class StudentTest3 {
	
	private static Logger logger = Logger.getLogger(StudentTest3.class);
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
	public void testFindStudentWithAddress() {
		logger.info("查询学生(带地址)");
		Student student=studentMapper.findStudentWithAddress(3);
		System.out.println(student);	
	}

}
