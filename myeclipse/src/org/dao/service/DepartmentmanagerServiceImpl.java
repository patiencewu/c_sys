package org.dao.service;

import org.dao.BaseDao;
import org.dao.PageResults;
import org.dao.service.interf.DepartmentmanagerService;
import org.dao.service.interf.UserpasswordService;
import org.humanDepartment.humanSystem.pojo.Departmentmanager;
import org.model.SpringUtil;

public class DepartmentmanagerServiceImpl implements DepartmentmanagerService
{


	
	/**
	 * ���е�serviceImpl��Ҫ���������
	 * �ҡ�<>���������ڵĲ���Ҫʹ�ö�Ӧ��
	 * ʵ��POJO�Ĳ����ֱ��Ƕ�Ӧ
	 * ʵ������ͺ�����������
	 */
	private BaseDao<Departmentmanager, Integer> dao;
	
	/**
	 * ���е�serviceImpl��Ҫ�����geter����
	 * @return
	 */
	public BaseDao<Departmentmanager, Integer> getDao()
	{
		return dao;
	}

	/**
	 * ���е�serviceImpl��Ҫ�����seter���췽��
	 * @param dao
	 */
	public void setDao(BaseDao<Departmentmanager, Integer> dao)
	{
		this.dao =  (BaseDao<Departmentmanager, Integer>) dao;
		this.dao.setEntityClass(Departmentmanager.class);
	}
	
	
	@Override
	public int add(Departmentmanager entity)
	{
		return dao.save(entity);
	}

	@Override
	public void delete(Departmentmanager entity)
	{
		dao.delete(entity);

	}

	@Override
	public void update(Departmentmanager entity)
	{
		dao.update(entity);

	}

	@Override
	public Departmentmanager findById(int id)
	{
		return dao.get(id);
	}

	@Override
	public PageResults<Departmentmanager> findAPage(String hql,
													String countHql,
													int pageNo,
													int pageSize,
													Object... values)
	{
		if(hql == null)
			hql = "from Departmentmanager as a order by a.dmId asc";
		return dao.findPageByFetchedHql(hql, countHql, pageNo, pageSize, values);
	}

	@Override
	public void deleteById(int id)
	{
		dao.deleteById(id);
		
	}

	@Override
	public boolean changePassword(int id, String oldPassword, String newPassword)
	{
		UserpasswordService service = (UserpasswordService) SpringUtil.getBean("userpasswordService");
		return service.changePassword(2, id, oldPassword, newPassword);
	}
	
}
