package org.dao.service;

import org.dao.BaseDao;
import org.dao.PageResults;
import org.humanDepartment.humanSystem.pojo.Department;

public class DepartmentServiceImpl implements DepartmentService
{

	/**
	 * ���е�serviceImpl��Ҫ���������
	 * �ҡ�<>���������ڵĲ���Ҫʹ�ö�Ӧ��
	 * ʵ��POJO�Ĳ����ֱ��Ƕ�Ӧ
	 * ʵ������ͺ�����������
	 */
	private BaseDao<Department, Integer> dao;
	
	/**
	 * ���е�serviceImpl��Ҫ�����geter����
	 * @return
	 */
	public BaseDao<Department, Integer> getDao()
	{
		return dao;
	}

	/**
	 * ���е�serviceImpl��Ҫ�����seter���췽��
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
