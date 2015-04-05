package org.dao.service;

import java.io.Serializable;
import org.dao.BaseDao;
import org.dao.PageResults;
import org.dao.service.interf.MembersService;
import org.humanDepartment.humanSystem.pojo.Members;
public class MembersServiceImpl implements MembersService
{
	

	/**
	 * ���е�serviceImpl��Ҫ���������
	 * �ҡ�<>���������ڵĲ���Ҫʹ�ö�Ӧ��
	 * ʵ��POJO�Ĳ����ֱ��Ƕ�Ӧ
	 * ʵ������ͺ�����������
	 */
	private BaseDao<Members,Integer> dao;
	
	/**
	 * ���е�serviceImpl��Ҫ�����geter����
	 * @return
	 */
	public BaseDao<Members,Integer> getDao()
	{
		return dao;
	}

	/**
	 * ���е�serviceImpl��Ҫ�����seter���췽��
	 * @param dao
	 */
	public void setDao(BaseDao<Members, Integer> dao)
	{
		this.dao = (BaseDao<Members, Integer>) dao;
		this.dao.setEntityClass(Members.class);
	}
	

	@Override
	public int add(Members entity)
	{
		return dao.save((Members) entity);
	}

	@Override
	public void delete(Members entity)
	{
		dao.delete(entity);

	}

	@Override
	public void update(Members entity)
	{
		dao.update(entity);

	}

	@Override
	public Members findById(int id)
	{
		return dao.get(id);
	}

	@Override
	public PageResults<Members> findAPage(String hql,
								 String countHql,
								 int pageNo,
								 int pageSize,
								 Object... values)
	{
		if(hql == null)
			hql = "from Members as a";
		return dao.findPageByFetchedHql(hql, countHql, pageNo, pageSize, values);
	}

}
