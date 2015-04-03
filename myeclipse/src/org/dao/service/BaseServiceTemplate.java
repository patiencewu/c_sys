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

}
