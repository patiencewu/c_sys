package org.dao.service;

import org.dao.BaseDao;
import org.dao.PageResults;
import org.humanDepartment.humanSystem.pojo.Department;
import org.humanDepartment.humanSystem.pojo.Departmentemployee;

public class DepartmentmanageremployeeServiceImpl implements
												 DepartmentemployeeService
{
	

	/**
	 * 所有的serviceImpl都要有这个参数
	 * 且“<>”尖括号内的参数要使用对应的
	 * 实体POJO的参数分别是对应
	 * 实体的类型和主键的类型
	 */
	private BaseDao<Departmentemployee, Integer> dao;
	
	/**
	 * 所有的serviceImpl都要有这个geter方法
	 * @return
	 */
	public BaseDao<Departmentemployee, Integer> getDao()
	{
		return dao;
	}

	/**
	 * 所有的serviceImpl都要有这个seter构造方法
	 * @param dao
	 */
	public void setDao(BaseDao<Departmentemployee, Integer> dao)
	{
		this.dao =  (BaseDao<Departmentemployee, Integer>) dao;
		this.dao.setEntityClass(Departmentemployee.class);
	}
	
	

	@Override
	public int add(Departmentemployee entity)
	{
		return dao.save(entity);
	}

	@Override
	public void delete(Departmentemployee entity)
	{
		dao.delete(entity);

	}

	@Override
	public void update(Departmentemployee entity)
	{
		dao.update(entity);

	}

	@Override
	public Departmentemployee findById(int id)
	{
		return dao.get(id);
	}

	@Override
	public PageResults<Departmentemployee> findAPage(String hql,
													 String countHql,
													 int pageNo,
													 int pageSize,
													 Object... values)
	{
		if(hql == null)
			hql = "from Departmentemployee as a";
		return dao.findPageByFetchedHql(hql, countHql, pageNo, pageSize, values);
	}

}
