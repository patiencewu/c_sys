package org.dao.service.interf;

import org.humanDepartment.humanSystem.pojo.Supermanager;

public interface SupermanagerService
{
//TODO ��supermanager�����ɾ�Ĳ�
	
	/**����Ϣ
	 * ����һ����������Ա����Ϣ
	 * @param id
	 * @return
	 */
	public Supermanager findId(int id);
	
	/**������
	 * �����Ƿ��޸ĳɹ�
	 * @param id
	 * @param name
	 * @return
	 */
	public void update(int id, String name, String lphong);

	public int add(Supermanager manager);
	
	public boolean changePassword(int id, String oldPassword, String newPassword);
	
	public void delById(int id);
}
