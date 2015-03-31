package org.dao.service;

import org.dao.BaseDao;
import org.dao.PageResults;
import org.humanDepartment.humanSystem.pojo.Members;
import org.humanDepartment.humanSystem.pojo.Userpassword;

public class UserpasswordServiceImpl
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
		this.dao = dao;
		this.dao.setEntityClass(Userpassword.class);
	}
	
	
	
	
	
	

	public String add(Userpassword u)
	{
		return dao.save(u);
	}


	public void delete(Userpassword u)
	{
		dao.delete(u);
	}


	public void update(Userpassword u)
	{
		dao.update(u);
	}


	public Userpassword findById(String id)
	{
		return dao.get(id);
	}

	public PageResults<Userpassword> findAPage(String hql, String countHql, int pageNo, int pageSize, Object... values)
	{
		if(hql == null)
			hql = "from Userpassword as a";
		return dao.findPageByFetchedHql(hql, countHql, pageNo, pageSize, values);
	}

}
