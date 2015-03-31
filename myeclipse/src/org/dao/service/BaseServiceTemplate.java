package org.dao.service;

import java.io.Serializable;
import org.dao.BaseDao;
import org.dao.PageResults;

public class BaseServiceTemplate<Entity extends Serializable>
{
	protected BaseDao dao;
	
	public int add(Entity entity)
	{
		return (Integer) dao.save(entity);

	}

	public void delete(Entity entity)
	{
		dao.delete(entity);
		
	}

	public void update(Entity entity)
	{
		dao.update(entity);
		
	}

	public Entity findById(int id)
	{
		dao.get(id);
		return null;
	}

}
