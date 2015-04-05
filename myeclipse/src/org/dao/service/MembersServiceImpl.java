package org.dao.service;

import java.io.Serializable;
import org.dao.BaseDao;
import org.dao.PageResults;
import org.dao.service.interf.MembersService;
import org.humanDepartment.humanSystem.pojo.Members;
public class MembersServiceImpl implements MembersService
{
	

	/**
	 * 所有的serviceImpl都要有这个参数
	 * 且“<>”尖括号内的参数要使用对应的
	 * 实体POJO的参数分别是对应
	 * 实体的类型和主键的类型
	 */
	private BaseDao<Members,Integer> dao;
	
	/**
	 * 所有的serviceImpl都要有这个geter方法
	 * @return
	 */
	public BaseDao<Members,Integer> getDao()
	{
		return dao;
	}

	/**
	 * 所有的serviceImpl都要有这个seter构造方法
	 * @param dao
	 */
	public void setDao(BaseDao<Members, Integer> dao)
	{
		this.dao = (BaseDao<Members, Integer>) dao;
		this.dao.setEntityClass(Members.class);
	}
	

	@Override
	public int add(Members entity)
	{
		return dao.save((Members) entity);
	}

	@Override
	public void delete(Members entity)
	{
		dao.delete(entity);

	}

	@Override
	public void update(Members entity)
	{
		dao.update(entity);

	}

	@Override
	public Members findById(int id)
	{
		return dao.get(id);
	}

	@Override
	public PageResults<Members> findAPage(String hql,
								 String countHql,
								 int pageNo,
								 int pageSize,
								 Object... values)
	{
		if(hql == null)
			hql = "from Members as a";
		return dao.findPageByFetchedHql(hql, countHql, pageNo, pageSize, values);
	}

}
