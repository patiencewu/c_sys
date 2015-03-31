package org.dao.service;

import org.dao.BaseDao;
import org.dao.PageResults;
import org.humanDepartment.humanSystem.pojo.Department;
import org.humanDepartment.humanSystem.pojo.Departmentemployee;

public class DepartmentmanageremployeeServiceImpl implements
												 DepartmentemployeeService
{
	

	/**
	 * ���е�serviceImpl��Ҫ���������
	 * �ҡ�<>���������ڵĲ���Ҫʹ�ö�Ӧ��
	 * ʵ��POJO�Ĳ����ֱ��Ƕ�Ӧ
	 * ʵ������ͺ�����������
	 */
	private BaseDao<Departmentemployee, Integer> dao;
	
	/**
	 * ���е�serviceImpl��Ҫ�����geter����
	 * @return
	 */
	public BaseDao<Departmentemployee, Integer> getDao()
	{
		return dao;
	}

	/**
	 * ���е�serviceImpl��Ҫ�����seter���췽��
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
