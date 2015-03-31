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
//	 * 所有的serviceImpl都要有这个参数
//	 * 且“<>”尖括号内的参数要使用对应的
//	 * 实体POJO的参数分别是对应
//	 * 实体的类型和主键的类型
//	 */
//	private BaseDao<Userpassword, Integer> dao;
//	
//	/**
//	 * 所有的serviceImpl都要有这个geter方法
//	 * @return
//	 */
//	public BaseDao<Userpassword, Integer> getDao()
//	{
//		return dao;
//	}
//
//	/**
//	 * 所有的serviceImpl都要有这个seter构造方法
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
	 * 添加记录返回一个ID
	 * @return
	 */
	public int add(Entity entity);
	/**
	 * 删除一条记录
	 * @param member
	 */
	public void delete(Entity entity);
	
	/**
	 * 修改数据
	 * @param member
	 */
	public void update(Entity entity);
	
	/**
	 * 通过ID查找
	 * @param id
	 */
	public Entity findById(int id);
	
	/**
	 * 分页查找返回一个页面的信息
	 * @return
	 */
	public PageResults<Entity> findAPage(String hql, String countHql, int pageNo, int pageSize, Object... values);

}
