package org.dao.service;

import java.io.Serializable;
import org.dao.BaseDao;
import org.dao.PageResults;
import org.humanDepartment.humanSystem.pojo.Members;
import org.humanDepartment.humanSystem.pojo.Userpassword;

public interface BaseService<Entity extends Serializable>
{
//	
//	
//	
//	
//	/**
//	 * ���е�serviceImpl��Ҫ���������
//	 * �ҡ�<>���������ڵĲ���Ҫʹ�ö�Ӧ��
//	 * ʵ��POJO�Ĳ����ֱ��Ƕ�Ӧ
//	 * ʵ������ͺ�����������
//	 */
//	private BaseDao<Userpassword, Integer> dao;
//	
//	/**
//	 * ���е�serviceImpl��Ҫ�����geter����
//	 * @return
//	 */
//	public BaseDao<Userpassword, Integer> getDao()
//	{
//		return dao;
//	}
//
//	/**
//	 * ���е�serviceImpl��Ҫ�����seter���췽��
//	 * @param dao
//	 */
//	public void setDao(BaseDao<Userpassword, Integer> dao)
//	{
//		this.dao =  (BaseDao<Members, Integer>) dao;
//		this.dao.setEntityClass(Userpassword.class);
//	}
//	
//	
//	
//	
//	
	/**
	 * ��Ӽ�¼����һ��ID
	 * @return
	 */
	public int add(Entity entity);
	/**
	 * ɾ��һ����¼
	 * @param member
	 */
	public void delete(Entity entity);
	
	/**
	 * �޸�����
	 * @param member
	 */
	public void update(Entity entity);
	
	/**
	 * ͨ��ID����
	 * @param id
	 */
	public Entity findById(int id);
	
	/**
	 * ��ҳ���ҷ���һ��ҳ�����Ϣ
	 * @return
	 */
	public PageResults<Entity> findAPage(String hql, String countHql, int pageNo, int pageSize, Object... values);

}
