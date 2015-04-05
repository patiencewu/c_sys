package org.dao.service.interf;

import java.io.Serializable;
import java.util.List;
import org.dao.PageResults;
import org.humanDepartment.humanSystem.pojo.Userpassword;
import org.springframework.transaction.annotation.Transactional;

public interface UserpasswordService
{
	/**���һ���˺�����
	 * ����һ������
	 * @param user �˺������Ӧ��ʵ��
	 * @return �˺�
	 */
	public String addUser(Userpassword user);
	
	/**ɾ��һ���˺�����
	 * ����һ������
	 * @param userName �˺�
	 */
	public void delUserById(String userName);
	
	/**ɾ��һ���˺�����
	 * ����һ������
	 * @param user �˺�����ʵ��
	 */
	public void delUser(Userpassword user);
	
	/**�޸�����
	 * �����Ƿ���³ɹ�
	 * @param power �˺ŵȼ�
	 * @param personId �˺ŵ������ڱ��id
	 * @param oldPassword ������
	 * @param newPassword ������
	 * @return �Ƿ��޸ĳɹ�
	 */
	public boolean changePassword(int power, int personId, String oldPassword, String newPassword);
	
	/**�����˺������ѯ
	 * ����һ����½���˺�����ʵ��
	 * @param userName �˺�
	 * @param password ����
	 * @return �˺Ŵ��ڣ�������ȷ�򷵻ض�Ӧʵ����򷵻�null
	 */
	public Userpassword findLoginUser(String userName, String password);
	
	/**
	 * ��ҳ��ѯ�˺�����
	 * @param hql �����ѯ��䣬Ĭ�ϲ�ѯ���ж���Ĭ��ֵΪnull
	 * @param countHql ��¼����ѯ��䣬Ĭ�ϲ�ѯ���м�¼������Ĭ��ֵΪnull
	 * @param pageNo ��ҳ���Ӧ��ҳ������Ĭ�ϵ�һҳ��Ĭ��ֵΪ1
	 * @param pageSize һ��ҳ��ļ�¼���������ֶ�����
	 * @param values ������������ڱ����Ӧҳ��ĸ�����¼�Ա����ʹ�ã�Ĭ�ϲ���
	 * @return ��ҳ������
	 */
	public PageResults<Userpassword> findAllUserInPage(String hql, String countHql, int pageNo, int pageSize, Object... values);

	/**ͨ���˺������˻���Ϣ
	 * ����һ���˺�����ʵ��
	 * @param userName
	 * @return
	 */
	public Userpassword findUserById(String userName);
	

	public Userpassword findByPersonId(int power, int id);
	

	
}
