package cn.itcast.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;

public class UserDaoImpl implements UserDao {
	//sqlsessionFactory
	private SqlSessionFactory sqlSessionFactory;
	public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
		
		this.sqlSessionFactory=sqlSessionFactory;
	}
	
	@Override
	public List<User> findAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<User> list = sqlSession.selectList("test.findAll");
		return list;
	}

	@Override
	public User findUserByID(Integer id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user = sqlSession.selectOne("test.findUserByID", id);
		return user;
	}

	@Override
	public List<User> findUserByUsername(String username) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<User> list = sqlSession.selectList("test.findUserByUsername",username);
		return list;
	}

}
