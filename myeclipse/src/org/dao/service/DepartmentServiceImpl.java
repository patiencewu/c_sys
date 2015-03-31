package org.dao.service;

import org.dao.BaseDao;
import org.dao.PageResults;
import org.humanDepartment.humanSystem.pojo.Department;

public class DepartmentServiceImpl implements DepartmentService
{

	/**
	 * 所有的serviceImpl都要有这个参数
	 * 且“<>”尖括号内的参数要使用对应的
	 * 实体POJO的参数分别是对应
	 * 实体的类型和主键的类型
	 */
	private BaseDao<Department, Integer> dao;
	
	/**
	 * 所有的serviceImpl都要有这个geter方法
	 * @return
	 */
	public BaseDao<Department, Integer> getDao()
	{
		return dao;
	}

	/**
	 * 所有的serviceImpl都要有这个seter构造方法
	 * @param dao
	 */
	public void setDao(BaseDao<Department, Integer> dao)
	{
		this.dao =  (BaseDao<Department, Integer>) dao;
		this.dao.setEntityClass(Department.class);
	}
	
	

	@Override
	public int add(Department entity)
	{
		return dao.save(entity);
	}

	@Override
	public void delete(Department entity)
	{
		dao.delete(entity);

	}

	@Override
	public void update(Department entity)
	{
		dao.update(entity);

	}

	@Override
	public Department findById(int id)
	{
		return dao.get(id);
	}

	@Override
	public PageResults<Department> findAPage(String hql,
											 String countHql,
											 int pageNo,
											 int pageSize,
											 Object... values)
	{
		if(hql == null)
			hql = "from Department as a";
		return dao.findPageByFetchedHql(hql, countHql, pageNo, pageSize, values);
	}

}
