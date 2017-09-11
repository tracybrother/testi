package cn.itcast.dao;

import java.util.List;

import cn.itcast.domain.User;

public interface UserDao {
	
	//查询所有用户
	public List<User> findAll();
	//根据用户ID进行查询
	public User findUserByID(Integer id);
	//根据用户名进行模糊查询
	public List<User> findUserByUsername(String username);

}
