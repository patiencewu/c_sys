package org.dao.service;

import org.dao.BaseDao;
import org.dao.service.interf.SupermanagerService;
import org.dao.service.interf.UserpasswordService;
import org.humanDepartment.humanSystem.pojo.Supermanager;
import org.humanDepartment.humanSystem.pojo.Departmentemployee;
import org.humanDepartment.humanSystem.pojo.Userpassword;
import org.model.SpringUtil;

public class SupermanagerServiceImpl implements SupermanagerService
{


	/**
	 * 所有的serviceImpl都要有这个参数
	 * 且“<>”尖括号内的参数要使用对应的
	 * 实体POJO的参数分别是对应
	 * 实体的类型和主键的类型
	 */
	private BaseDao<Supermanager, Integer> dao;
	
	/**
	 * 所有的serviceImpl都要有这个geter方法
	 * @return
	 */
	public BaseDao<Supermanager, Integer> getDao()
	{
		return dao;
	}

	/**
	 * 所有的serviceImpl都要有这个seter构造方法
	 * @param dao
	 */
	public void setDao(BaseDao<Supermanager, Integer> dao)
	{
		this.dao = (BaseDao<Supermanager, Integer>)dao;
		this.dao.setEntityClass(Supermanager.class);
	}
	
	@Override
	public int add(Supermanager manager){
		return dao.save(manager);
	}
	
	@Override
	public Supermanager findId(int id)
	{
		return dao.get(id);
	}

	@Override
	public void update(int id, String name, String lphong)
	{
		Supermanager su = null;
		su = dao.get(id);
		if(name != null)
			su.setSmName(name);
		if(lphong != null)
			su.setSmLphone(lphong);
		dao.update(su);
	}

	@Override
	public boolean changePassword(int id, String oldPassword, String newPassword)
	{
		UserpasswordService service = (UserpasswordService) SpringUtil.getBean("userpasswordService");
		return service.changePassword(1, id, oldPassword, newPassword);
	}

	@Override
	public void delById(int id)
	{
		dao.deleteById(id);
		
	}

}
