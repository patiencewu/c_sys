package org.dao.service;

import java.util.List;
import org.dao.BaseDao;
import org.dao.PageResults;
import org.humanDepartment.humanSystem.pojo.Members;
import org.humanDepartment.humanSystem.pojo.Userpassword;

public class UserpasswordServiceImpl implements UserpasswordService
{


	
	/**
	 * ���е�serviceImpl��Ҫ���������
	 * �ҡ�<>���������ڵĲ���Ҫʹ�ö�Ӧ��
	 * ʵ��POJO�Ĳ����ֱ��Ƕ�Ӧ
	 * ʵ������ͺ�����������
	 */
	private BaseDao<Userpassword, String> dao;

	/**
	 * ���е�serviceImpl��Ҫ������չ��췽��
	 */
	public UserpasswordServiceImpl(){
	}
	
	/**
	 * ���е�serviceImpl��Ҫ�����geter����
	 * @return
	 */
	public BaseDao<Userpassword, String> getDao()
	{
		return dao;
	}

	/**
	 * ���е�serviceImpl��Ҫ�����seter���췽��
	 * @param dao
	 */
	public void setDao(BaseDao<Userpassword, String> dao)
	{
		this.dao = dao;
		this.dao.setEntityClass(Userpassword.class);
	}
	
	
	


	@Override
	public String addUser(Userpassword user)
	{
		return dao.save(user);
	}

	@Override
	public void delUserById(String userName)
	{
			dao.deleteById(userName);
	}

	@Override
	public boolean changePassword(String userName,
								  String oldPassword,
								  String newPassword)
	{
		Userpassword user;
		user = dao.get(userName);
		if(user != null){
			if(user.getUpPassword().equals(oldPassword))
				user.setUpPassword(newPassword);
			return true;
		}
		return false;

	}

	@Override
	public Userpassword findLoginUser(String userName, String password)
	{
		Userpassword user = (Userpassword) dao.getSession().get(Userpassword.class, userName);
		if(user == null || !user.getUpPassword().equals(password)) return null;
		return user;
	}

	@Override
	public PageResults<Userpassword> findAllUserInPage(String hql, String countHql, int pageNo, int pageSize, Object... values)
	{
		if(hql == null)
			hql = "from Userpassword as a";
		return dao.findPageByFetchedHql(hql, countHql, pageNo, pageSize, values);
	}

	@Override
	public Userpassword findUserById(String userName)
	{
		return dao.get(userName);
	}

	@Override
	public void delUser(Userpassword user)
	{
		dao.delete(user);
		
	}

}
