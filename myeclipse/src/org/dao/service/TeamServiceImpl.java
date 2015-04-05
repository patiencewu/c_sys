package org.dao.service;

import java.io.Serializable;
import org.dao.BaseDao;
import org.dao.PageResults;
import org.dao.service.interf.TeamService;
import org.humanDepartment.humanSystem.pojo.Team;

public class TeamServiceImpl implements TeamService
{
	
	
	/**
	 * 所有的serviceImpl都要有这个参数
	 * 且“<>”尖括号内的参数要使用对应的
	 * 实体POJO的参数分别是对应
	 * 实体的类型和主键的类型
	 */
	private BaseDao<Team, Integer> dao;

	/**
	 * 所有的serviceImpl都要有这个geter方法
	 * @return
	 */
	public BaseDao<Team, Integer> getDao()
	{
		return dao;
	}

	/**
	 * 所有的serviceImpl都要有这个seter构造方法
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
