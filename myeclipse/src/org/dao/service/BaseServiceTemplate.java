package org.dao.service;

import java.io.Serializable;
import org.dao.BaseDao;
import org.dao.PageResults;

public class BaseServiceTemplate<HibernateEntity extends Serializable>
{
	protected BaseDao dao;
	
	public int add(HibernateEntity entity)
	{
		return (Integer) dao.save(entity);

	}

	public void delete(HibernateEntity entity)
	{
		dao.delete(entity);
		
	}

	public void update(HibernateEntity entity)
	{
		dao.update(entity);
		
	}

	public HibernateEntity findById(int id)
	{
		dao.get(id);
		return null;
	}
	
	/**
	 * 请覆盖该方法
	 * @param hql 查询语句hql
	 * @param countHql 查询记录数的hql
	 * @param pageNo 页码（第几页）
	 * @param pageSize 页面的记录条数
	 * @param values 用来保存呢数据的变量参数
	 * @return 对应的分页
	 */
	public PageResults<HibernateEntity> findInPage(String hql, String countHql, int pageNo, int pageSize, Object... values){
		return null;
		
	}

}
