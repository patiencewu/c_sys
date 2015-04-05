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
	 * ���е�serviceImpl��Ҫ���������
	 * �ҡ�<>���������ڵĲ���Ҫʹ�ö�Ӧ��
	 * ʵ��POJO�Ĳ����ֱ��Ƕ�Ӧ
	 * ʵ������ͺ�����������
	 */
	private BaseDao<Supermanager, Integer> dao;
	
	/**
	 * ���е�serviceImpl��Ҫ�����geter����
	 * @return
	 */
	public BaseDao<Supermanager, Integer> getDao()
	{
		return dao;
	}

	/**
	 * ���е�serviceImpl��Ҫ�����seter���췽��
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
