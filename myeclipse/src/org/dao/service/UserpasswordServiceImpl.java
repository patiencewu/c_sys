package org.dao.service;

import org.dao.BaseDao;
import org.dao.PageResults;
import org.humanDepartment.humanSystem.pojo.Members;
import org.humanDepartment.humanSystem.pojo.Userpassword;

public class UserpasswordServiceImpl
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
