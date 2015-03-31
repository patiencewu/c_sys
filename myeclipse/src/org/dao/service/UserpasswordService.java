package org.dao.service;

import java.io.Serializable;
import java.util.List;
import org.dao.PageResults;
import org.humanDepartment.humanSystem.pojo.Userpassword;
import org.springframework.transaction.annotation.Transactional;

public interface UserpasswordService
{
	/**添加一条账号密码
	 * 返回一个主键
	 * @param user
	 * @return
	 */
	public String addUser(Userpassword user);
	
	/**删除一条账号密码
	 * 返回一个主键
	 * @param userName
	 * @return
	 */
	public void delUserById(String userName);
	
	/**修改密码
	 * 返回是否更新成功
	 * @param userName
	 * @param oldPassword
	 * @param newPassword
	 * @return
	 */
	public boolean changePassword(String userName, String oldPassword, String newPassword);
	
	/**单个账号密码查询
	 * 返回一个登陆的账号密码实体
	 * @param userName
	 * @param password
	 * @return
	 */
	public Userpassword findLoginUser(String userName, String password);
	
	//全部账号密码查询
	public List findAllUser();
	
	/**分页查询账号密码
	 * 返回一个账号密码页面
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public PageResults findAllUserInPage(int pageNo,int pageSize);

	/**通过账号找找账户信息
	 * 返回一个账号密码实体
	 * @param userName
	 * @return
	 */
	public Userpassword findUserById(String userName);
	
}
