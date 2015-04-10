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
	 * 所有的serviceImpl都要有这个参数
	 * 且“<>”尖括号内的参数要使用对应的
	 * 实体POJO的参数分别是对应
	 * 实体的类型和主键的类型
	 */
	private BaseDao<Departmentmanager, Integer> dao;
	
	/**
	 * 所有的serviceImpl都要有这个geter方法
	 * @return
	 */
	public BaseDao<Departmentmanager, Integer> getDao()
	{
		return dao;
	}

	/**
	 * 所有的serviceImpl都要有这个seter构造方法
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
