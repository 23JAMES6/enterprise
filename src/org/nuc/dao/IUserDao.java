package org.nuc.dao;


import org.nuc.entity.User;

public interface IUserDao {
	
	/**
	 * ��ѯ���е��û�
	 * @return User
	 */
	public User queryCheckUser(User user);

	
}
