package cn.itcast.dao.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.domain.User;

public class Main1 {
	SqlSessionFactory sqlSessionFactory;
	@Before
	public void beforeConfig() throws Exception{
		String resource ="sqlMapConfig.xml";
		//��ȡmybatis��ȫ�������ļ�
		 InputStream inputStream = Resources.getResourceAsStream(resource);
		//��ȡsqlSessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
	}
	@Test
	public void testDao(){
		UserDaoImpl userDao = new UserDaoImpl(sqlSessionFactory);
		List<User> list = userDao.findAll();
		System.out.println(list);
		
	}
	
	@Test
	public void testDaoFindUserByID(){
		UserDaoImpl userDao = new UserDaoImpl(sqlSessionFactory);
		User user = userDao.findUserByID(38);
		System.out.println(user);
		
	}
	
	@Test
	public void testDaoFindUserByUsername(){
		UserDaoImpl userDao = new UserDaoImpl(sqlSessionFactory);
		List<User> list = userDao.findUserByUsername("��");
		
		System.out.println(list);
		
	}
}
