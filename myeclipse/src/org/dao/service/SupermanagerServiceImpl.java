package org.dao.service;

import org.dao.BaseDao;
import org.humanDepartment.humanSystem.pojo.Supermanager;

public class SupermanagerServiceImpl implements SupermanagerService
{


	/**
	 * 所有的serviceImpl都要有这个参数
	 * 且“<>”尖括号内的参数要使用对应的
	 * 实体POJO的参数分别是对应
	 * 实体的类型和主键的类型
	 */
	private BaseDao<Supermanager, Integer> dao;
	
	/**
	 * 所有的serviceImpl都要有这个geter方法
	 * @return
	 */
	public BaseDao<Supermanager, Integer> getDao()
	{
		return dao;
	}

	/**
	 * 所有的serviceImpl都要有这个seter构造方法
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
