package org.humanDepartment.humanSystem.action;

import org.BaseAction;
import org.dao.PageResults;
import org.dao.service.interf.DepartmentemployeeService;
import org.dao.service.interf.DepartmentmanagerService;
import org.dao.service.interf.UserpasswordService;
import org.humanDepartment.humanSystem.pojo.Userpassword;
import org.model.SpringUtil;

public class DepartmentManagerToEmployee extends BaseAction
{
//TODO �����Բ�����Ա�Ĺ����������ɾ�Ĳ� �ȴ�ǰ̨�����ƴ��
	
	private String newPassword;
	private String confirmPassword;
	private String oldPassword;
	private String newDE;
	private String dePower;
	private String userName;
	private PageResults pageResults;
	private PageResults<Userpassword> pageResults1;
	private PageResults<Userpassword> pageResults2;




	//	�����ز��ŵĲ���ѧ����Ա��DepartmentEmployee��
	public String addNewDE(){
		int ran = (int)(10000+Math.random()*(80000));
		UserpasswordService uService = (UserpasswordService) SpringUtil.getBean("userpasswordService");
		Userpassword user = (Userpassword) SpringUtil.getBean("userPassword");
		System.out.println(newDE);
		user.setUpUser(newDE);
		user.setUpPassword(newDE);
		user.setUpPower(Short.valueOf(dePower));
		user.setUpId(null);
		uService.addUser(user);
		
//		������Ӧ�Ĳ�����ҳ�棨���²�����񲿻�������������������DepartmentManager��
		return "addSuccess";
	}

//	ɾ����Ӧ�˺ŵĲ�Ա��DepartmentEmployee��
	public String deleteDE(){
		UserpasswordService uService = (UserpasswordService) SpringUtil.getBean("userpasswordService");
		Userpassword u =  uService.findUserById(userName);
		if(u.getUpId() == null || u.getUpId() == 0){
			uService.delUserById(userName);
		}
		else{
			uService.delUserById(userName);
			DepartmentemployeeService deService = (DepartmentemployeeService) SpringUtil.getBean("departmentemployeeService");
			deService.deleteById(u.getUpId());
		}
		message = "�ɹ�ɾ���˺�" + userName;
		return goToManageDE();
	}
	
//	ǰ�����ҳ��
	public String goToAdd(){
		return "toAddDE";
	}
	
//	ǰ�������޸�ҳ��
	public String goToChangePassword(){
		return "toChangePassword";
	}
	
//	ǰ����Ա����ҳ�棬ͬʱ��ѯ��ص���Ա����Ա����DepartmentEmployee��
	public String goToManageDE(){
		UserpasswordService uService = (UserpasswordService) SpringUtil.getBean("userpasswordService");
		DepartmentemployeeService deService = (DepartmentemployeeService) SpringUtil.getBean("departmentemployeeService");
		//pageResults2��ʾû��¼����ϸ��Ϣ�Ĳ�Ա
		pageResults2 = uService.findAllUserInPage("from Userpassword as a where a.upPower>=121 and a.upPower<=124", null, 1, 10);
		//pageResults1��ʾ¼������ϸ��Ϣ�Ĳ�Ա���˺�����
		pageResults1 = uService.findAllUserInPage("from Userpassword as a where a.upPower = 3 order by a.upId asc", null, 1, 50);
		//pageResults��ʾ��Ա����ϸ��Ϣ
		pageResults = deService.findAPage(null, null, 1, 50); 
		return "manageDE";
	}
	
//	�޸Ķ�Ӧ������
	public String changePassword(){
		if(!newPassword.equals(confirmPassword)) { message = "�����޸ĳɹ�"; return "changeError";}
		DepartmentmanagerService service = (DepartmentmanagerService) SpringUtil.getBean("departmentmanagerService");
		if(oldPassword == null || newPassword == null) System.out.println("����û�д��ݳɹ�");
		if(!service.changePassword((int)session.get("id"), oldPassword, newPassword)) return "changeError";
		message = "�����޸ĳɹ�";
//TODO		������Ӧ�Ĳ�����ҳ�棨���²�����񲿻�������������������DepartmentManager��
		return "departmentManager";
	}
	
//	ǰ��������ҳ
	public String goToDepartmentManagerP(){
//TODO		������Ӧ�Ĳ�����ҳ�棨���²�����񲿻�������������������DepartmentManager��
		return "departmentManager";
	}

	/**
	 * @return pageResults
	 */
	public PageResults getPageResults()
	{
		return pageResults;
	}

	/**
	 * @return pageResults1
	 */
	public PageResults<Userpassword> getPageResults1()
	{
		return pageResults1;
	}

	/**
	 * @return pageResults2
	 */
	public PageResults<Userpassword> getPageResults2()
	{
		return pageResults2;
	}

	/**
	 * @param newPassword Ҫ���õ� newPassword
	 */
	public void setNewPassword(String newPassword)
	{
		this.newPassword = newPassword;
	}

	/**
	 * @param confirmPassword Ҫ���õ� confirmPassword
	 */
	public void setConfirmPassword(String confirmPassword)
	{
		this.confirmPassword = confirmPassword;
	}

	/**
	 * @param oldPassword Ҫ���õ� oldPassword
	 */
	public void setOldPassword(String oldPassword)
	{
		this.oldPassword = oldPassword;
	}

	/**
	 * @param newDE Ҫ���õ� newDE
	 */
	public void setNewDE(String newDE)
	{
		this.newDE = newDE;
	}

	/**
	 * @param dePower Ҫ���õ� dePower
	 */
	public void setDePower(String dePower)
	{
		this.dePower = dePower;
	}

	/**
	 * @param userName Ҫ���õ� userName
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	
	
}
