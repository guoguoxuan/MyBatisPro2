package com.icat.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.icat.mappers.StudentMapper;
import com.icat.model.Student;
import com.icat.util.SqlSessionFactoryUtil;

public class StudentTest {

	private static Logger logger = Logger.getLogger(StudentTest.class);
	public static void main(String[] args){
		//获取连接
		SqlSession sqlSession = SqlSessionFactoryUtil.openSession();
		//获取接口
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		//添加数据
		Student student = new Student("李四","11");
		//影响行数
		int result = studentMapper.add(student);
		sqlSession.commit();
		if (result>0) {
			logger.info("添加成功!");
		}
		
	}
}
