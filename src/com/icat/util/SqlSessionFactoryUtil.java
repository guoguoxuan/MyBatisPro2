package com.icat.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtil {
	
	//单例工厂
	private static SqlSessionFactory sqlSessionFactory;
	
	//连接工厂(数据库连接)
	public static SqlSessionFactory getSqlSessionFactory(){
		if (sqlSessionFactory==null) {
			//输入流
			InputStream inputStream = null;  
			try{
				//获取输入流
				inputStream = Resources.getResourceAsStream("mybatis-config.xml");
				//构建配置文件输入流
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		//返回工厂
		return sqlSessionFactory;
	}
	
	//打开会话(操作数据库)
	public static SqlSession openSession(){
		return getSqlSessionFactory().openSession();
		
	}

}
