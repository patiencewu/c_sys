package org.dao.service;

import java.util.List;
import org.dao.BaseDao;
import org.dao.PageResults;
import org.dao.service.interf.UserpasswordService;
import org.humanDepartment.humanSystem.pojo.Members;
import org.humanDepartment.humanSystem.pojo.Userpassword;

public class UserpasswordServiceImpl implements UserpasswordService
{


	
	/**
	 * 所有的serviceImpl都要有这个参数
	 * 且“<>”尖括号内的参数要使用对应的
	 * 实体POJO的参数分别是对应
	 * 实体的类型和主键的类型
	 */
	private BaseDao<Userpassword, String> dao;

	/**
	 * 所有的serviceImpl都要有这个空构造方法
	 */
	public UserpasswordServiceImpl(){
	}
	
	/**
	 * 所有的serviceImpl都要有这个geter方法
	 * @return
	 */
	public BaseDao<Userpassword, String> getDao()
	{
		return dao;
	}

	/**
	 * 所有的serviceImpl都要有这个seter构造方法
	 * @param dao
	 */
	public void setDao(BaseDao<Userpassword, String> dao)
	{
		this.dao = (BaseDao<Userpassword, String>)dao;
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
		Userpassword u;
		u = (Userpassword) dao.getSession().get(Userpassword.class, userName);
		dao.delete(u);
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
			hql = "from Userpassword as a order by a.upId asc";
		return dao.findPageByFetchedHql(hql, countHql, pageNo, pageSize, values);
	}

	@Override
	public Userpassword findUserById(String userName)
	{
		return (Userpassword) dao.getSession().get(Userpassword.class, userName);
		
//		return dao.get(userName);
	}

	@Override
	public void delUser(Userpassword user)
	{
		dao.delete(user);
		
	}

	@Override
	public Userpassword findByPersonId(int power, int id)
	{
		return dao.getByHQL("from Userpassword as a where a.upPower = "+String.valueOf(power) + " and a.upId = " + String.valueOf(id));
	}

	@Override
	public boolean changePassword(int power, int personId,
								  String oldPassword,
								  String newPassword)
	{
		Userpassword user = findByPersonId(power, personId);
		if(user != null){
			if(user.getUpPassword().equals(oldPassword)){
				user.setUpPassword(newPassword);
				dao.update(user);
				return true;
			}
		}
		return false;
	}
	
}
