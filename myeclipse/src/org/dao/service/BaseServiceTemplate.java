package org.dao.service;

import java.io.Serializable;
import org.dao.BaseDao;
import org.dao.PageResults;

public class BaseServiceTemplate<HibernateEntity extends Serializable>
{
	protected BaseDao dao;
	
	public int add(HibernateEntity entity)
	{
		return (Integer) dao.save(entity);

	}

	public void delete(HibernateEntity entity)
	{
		dao.delete(entity);
		
	}

	public void update(HibernateEntity entity)
	{
		dao.update(entity);
		
	}

	public HibernateEntity findById(int id)
	{
		dao.get(id);
		return null;
	}
	
	/**
	 * �븲�Ǹ÷���
	 * @param hql ��ѯ���hql
	 * @param countHql ��ѯ��¼����hql
	 * @param pageNo ҳ�루�ڼ�ҳ��
	 * @param pageSize ҳ��ļ�¼����
	 * @param values �������������ݵı�������
	 * @return ��Ӧ�ķ�ҳ
	 */
	public PageResults<HibernateEntity> findInPage(String hql, String countHql, int pageNo, int pageSize, Object... values){
		return null;
		
	}

}
