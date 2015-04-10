package org.thepublic.service;

import java.io.Serializable;
import org.dao.BaseDao;
import org.dao.PageResults;
import org.thepublic.service.interf.ThePublicService;

public class ThePublicServiceImpl<Entity extends Serializable> implements ThePublicService<Entity>
{

	
	
	
	
	
	/**
	 * 所有的serviceImpl都要有这个参数
	 * 且“<>”尖括号内的参数要使用对应的
	 * 实体POJO的参数分别是对应
	 * 实体的类型和主键的类型
	 */
	protected BaseDao<Entity, Integer> dao;
	
	/**
	 * 所有的serviceImpl都要有这个geter方法
	 * @return
	 */
	public BaseDao<Entity, Integer> getDao()
	{
		return dao;
	}

	
	
	/**
	 * 所有的serviceImpl都要有这个seter构造方法
	 * 		每次使用都要实现并覆盖这个方法加上下面这句话(Entity表示对应要操作的pojo)，要将Entity改掉
	 *      this.dao.setEntityClass(Entity.class);
	 * 
	 * @param dao
	 */
	public void setDao(BaseDao<Entity, Integer> dao)
	{
		this.dao =  (BaseDao<Entity, Integer>) dao;
//		每次使用都要实现并覆盖这个方法加上下面这句话(Entity表示对应要操作的pojo)，要将Entity改掉
//		this.dao.setEntityClass(Entity.class);
	}
	
	
	@Override
	public int add(Entity entity)
	{
		return dao.save(entity);
	}

	@Override
	public void delete(Entity entity)
	{
		dao.delete(entity);
		
	}

	@Override
	public void deleteById(int id)
	{
		dao.deleteById(id);
	}

	@Override
	public void update(Entity entity)
	{
		dao.update(entity);
		
	}


	@Override
	public Entity findById(int id)
	{
		return dao.get(id);
	}

	/**
	 * 输入对应的查询信息的hql和查询信息条数的countHql然后返回对应的页面
	 */
	@Override
	public PageResults<Entity> findAPage(String hql,
										 String countHql,
										 int pageNo,
										 int pageSize,
										 Object... values)
	{
		return dao.findPageByFetchedHql(hql, countHql, pageNo, pageSize, values);
	}

}
