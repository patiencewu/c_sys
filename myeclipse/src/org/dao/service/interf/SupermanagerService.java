package org.dao.service.interf;

import org.humanDepartment.humanSystem.pojo.Supermanager;

public interface SupermanagerService
{
//TODO 对supermanager表的怎删改查
	
	/**查信息
	 * 返回一个超级管理员的信息
	 * @param id
	 * @return
	 */
	public Supermanager findId(int id);
	
	/**改名字
	 * 返回是否修改成功
	 * @param id
	 * @param name
	 * @return
	 */
	public void update(int id, String name, String lphong);

	public int add(Supermanager manager);
	
	public boolean changePassword(int id, String oldPassword, String newPassword);
	
	public void delById(int id);
}
