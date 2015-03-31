package org.dao.service;

import org.dao.BaseDao;
import org.humanDepartment.humanSystem.pojo.Supermanager;

public class SupermanagerServiceImpl implements SupermanagerService
{


	/**
	 * ���е�serviceImpl��Ҫ���������
	 * �ҡ�<>���������ڵĲ���Ҫʹ�ö�Ӧ��
	 * ʵ��POJO�Ĳ����ֱ��Ƕ�Ӧ
	 * ʵ������ͺ�����������
	 */
	private BaseDao<Supermanager, Integer> dao;
	
	/**
	 * ���е�serviceImpl��Ҫ�����geter����
	 * @return
	 */
	public BaseDao<Supermanager, Integer> getDao()
	{
		return dao;
	}

	/**
	 * ���е�serviceImpl��Ҫ�����seter���췽��
	 * @param dao
	 */
	public void setDao(BaseDao<Supermanager, Integer> dao)
	{
		this.dao = dao;
		this.dao.setEntityClass(Supermanager.class);
	}
	
	
	
	@Override
	public Supermanager findId(int id)
	{
		return dao.get(id);
	}

	@Override
	public void update(int id, String name, String lphong)
	{
		Supermanager su = null;
		su = dao.get(id);
		if(name != null)
			su.setSmName(name);
		if(lphong != null)
			su.setSmLphone(lphong);
		dao.update(su);
	}

}
