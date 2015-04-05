package org.dao.service;

import java.io.Serializable;
import org.dao.BaseDao;
import org.dao.PageResults;
import org.dao.service.interf.TeamService;
import org.humanDepartment.humanSystem.pojo.Team;

public class TeamServiceImpl implements TeamService
{
	
	
	/**
	 * ���е�serviceImpl��Ҫ���������
	 * �ҡ�<>���������ڵĲ���Ҫʹ�ö�Ӧ��
	 * ʵ��POJO�Ĳ����ֱ��Ƕ�Ӧ
	 * ʵ������ͺ�����������
	 */
	private BaseDao<Team, Integer> dao;

	/**
	 * ���е�serviceImpl��Ҫ�����geter����
	 * @return
	 */
	public BaseDao<Team, Integer> getDao()
	{
		return dao;
	}

	/**
	 * ���е�serviceImpl��Ҫ�����seter���췽��
	 * @param dao
	 */
	public void setDao(BaseDao<Team, Integer> dao)
	{
		this.dao = (BaseDao<Team, Integer>)dao;
		this.dao.setEntityClass(Team.class);
	}
	

	@Override
	public int add(Team entity)
	{
		return dao.save((Team)entity);
	}

	@Override
	public void delete(Team entity)
	{
		dao.delete((Team)entity);
	}

	@Override
	public void update(Team entity)
	{
		dao.update((Team)entity);
	}

	@Override
	public Team findById(int id)
	{
		return dao.get(id);

	}

	@Override
	public PageResults<Team> findAPage(String hql,
								 String countHql,
								 int pageNo,
								 int pageSize,
								 Object... values)
	{
		if(hql == null)
			hql = "from Team as a";
		return dao.findPageByFetchedHql(hql, countHql, pageNo, pageSize, values);
	}

}
