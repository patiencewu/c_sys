package org.dao.service;

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
}
