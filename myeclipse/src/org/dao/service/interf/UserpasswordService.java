package org.dao.service.interf;

import java.io.Serializable;
import java.util.List;
import org.dao.PageResults;
import org.humanDepartment.humanSystem.pojo.Userpassword;
import org.springframework.transaction.annotation.Transactional;

public interface UserpasswordService
{
	/**添加一条账号密码
	 * 返回一个主键
	 * @param user 账号密码对应表实体
	 * @return 账号
	 */
	public String addUser(Userpassword user);
	
	/**删除一条账号密码
	 * 返回一个主键
	 * @param userName 账号
	 */
	public void delUserById(String userName);
	
	/**删除一条账号密码
	 * 返回一个主键
	 * @param user 账号密码实体
	 */
	public void delUser(Userpassword user);
	
	/**修改密码
	 * 返回是否更新成功
	 * @param power 账号等级
	 * @param personId 账号的人所在表的id
	 * @param oldPassword 旧密码
	 * @param newPassword 新密码
	 * @return 是否修改成功
	 */
	public boolean changePassword(int power, int personId, String oldPassword, String newPassword);
	
	/**单个账号密码查询
	 * 返回一个登陆的账号密码实体
	 * @param userName 账号
	 * @param password 密码
	 * @return 账号存在，密码正确则返回对应实体否则返回null
	 */
	public Userpassword findLoginUser(String userName, String password);
	
	/**
	 * 分页查询账号密码
	 * @param hql 对象查询语句，默认查询所有对象，默认值为null
	 * @param countHql 记录数查询语句，默认查询所有记录条数，默认值为null
	 * @param pageNo 分页后对应的页码数，默认第一页，默认值为1
	 * @param pageSize 一个页面的记录数，必须手动输入
	 * @param values 对象参数，用于保存对应页面的各条记录以便后期使用，默认不填
	 * @return 分页的数据
	 */
	public PageResults<Userpassword> findAllUserInPage(String hql, String countHql, int pageNo, int pageSize, Object... values);

	/**通过账号找找账户信息
	 * 返回一个账号密码实体
	 * @param userName
	 * @return
	 */
	public Userpassword findUserById(String userName);
	

	public Userpassword findByPersonId(int power, int id);
	

	
}
