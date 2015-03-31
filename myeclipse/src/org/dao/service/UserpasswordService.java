package org.dao.service;

import java.io.Serializable;
import java.util.List;
import org.dao.PageResults;
import org.humanDepartment.humanSystem.pojo.Userpassword;
import org.springframework.transaction.annotation.Transactional;

public interface UserpasswordService
{
	/**���һ���˺�����
	 * ����һ������
	 * @param user
	 * @return
	 */
	public String addUser(Userpassword user);
	
	/**ɾ��һ���˺�����
	 * ����һ������
	 * @param userName
	 * @return
	 */
	public void delUserById(String userName);
	
	/**�޸�����
	 * �����Ƿ���³ɹ�
	 * @param userName
	 * @param oldPassword
	 * @param newPassword
	 * @return
	 */
	public boolean changePassword(String userName, String oldPassword, String newPassword);
	
	/**�����˺������ѯ
	 * ����һ����½���˺�����ʵ��
	 * @param userName
	 * @param password
	 * @return
	 */
	public Userpassword findLoginUser(String userName, String password);
	
	//ȫ���˺������ѯ
	public List findAllUser();
	
	/**��ҳ��ѯ�˺�����
	 * ����һ���˺�����ҳ��
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public PageResults findAllUserInPage(int pageNo,int pageSize);

	/**ͨ���˺������˻���Ϣ
	 * ����һ���˺�����ʵ��
	 * @param userName
	 * @return
	 */
	public Userpassword findUserById(String userName);
	
}
