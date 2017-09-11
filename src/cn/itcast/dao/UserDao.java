package cn.itcast.dao;

import java.util.List;

import cn.itcast.domain.User;

public interface UserDao {
	
	//��ѯ�����û�
	public List<User> findAll();
	//�����û�ID���в�ѯ
	public User findUserByID(Integer id);
	//�����û�������ģ����ѯ
	public List<User> findUserByUsername(String username);

}
