package org.thepublic.service;

import java.io.Serializable;
import org.dao.BaseDao;
import org.dao.PageResults;
import org.thepublic.service.interf.ThePublicService;

public class ThePublicServiceImpl<Entity extends Serializable> implements ThePublicService<Entity>
{

	
	
	
	
	
	/**
	 * ���е�serviceImpl��Ҫ���������
	 * �ҡ�<>���������ڵĲ���Ҫʹ�ö�Ӧ��
	 * ʵ��POJO�Ĳ����ֱ��Ƕ�Ӧ
	 * ʵ������ͺ�����������
	 */
	protected BaseDao<Entity, Integer> dao;
	
	/**
	 * ���е�serviceImpl��Ҫ�����geter����
	 * @return
	 */
	public BaseDao<Entity, Integer> getDao()
	{
		return dao;
	}

	
	
	/**
	 * ���е�serviceImpl��Ҫ�����seter���췽��
	 * 		ÿ��ʹ�ö�Ҫʵ�ֲ����������������������仰(Entity��ʾ��ӦҪ������pojo)��Ҫ��Entity�ĵ�
	 *      this.dao.setEntityClass(Entity.class);
	 * 
	 * @param dao
	 */
	public void setDao(BaseDao<Entity, Integer> dao)
	{
		this.dao =  (BaseDao<Entity, Integer>) dao;
//		ÿ��ʹ�ö�Ҫʵ�ֲ����������������������仰(Entity��ʾ��ӦҪ������pojo)��Ҫ��Entity�ĵ�
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
	 * �����Ӧ�Ĳ�ѯ��Ϣ��hql�Ͳ�ѯ��Ϣ������countHqlȻ�󷵻ض�Ӧ��ҳ��
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
