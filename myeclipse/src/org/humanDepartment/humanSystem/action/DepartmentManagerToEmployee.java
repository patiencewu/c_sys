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
//TODO 部长对部门人员的管理包括：增删改查 等待前台界面的拼接
	
	private String newPassword;
	private String confirmPassword;
	private String oldPassword;
	private String newDE;
	private String dePower;
	private String userName;
	private PageResults pageResults;
	private PageResults<Userpassword> pageResults1;
	private PageResults<Userpassword> pageResults2;




	//	添加相关部门的部门学生成员（DepartmentEmployee）
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
		
//		返回相应的部长的页面（人事部或财务部或行政部或外宣部）（DepartmentManager）
		return "addSuccess";
	}

//	删除对应账号的部员（DepartmentEmployee）
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
		message = "成功删除账号" + userName;
		return goToManageDE();
	}
	
//	前往添加页面
	public String goToAdd(){
		return "toAddDE";
	}
	
//	前往密码修改页面
	public String goToChangePassword(){
		return "toChangePassword";
	}
	
//	前往人员管理页面，同时查询相关的人员（部员）（DepartmentEmployee）
	public String goToManageDE(){
		UserpasswordService uService = (UserpasswordService) SpringUtil.getBean("userpasswordService");
		DepartmentemployeeService deService = (DepartmentemployeeService) SpringUtil.getBean("departmentemployeeService");
		//pageResults2表示没有录入详细信息的部员
		pageResults2 = uService.findAllUserInPage("from Userpassword as a where a.upPower>=121 and a.upPower<=124", null, 1, 10);
		//pageResults1表示录入了详细信息的部员的账号密码
		pageResults1 = uService.findAllUserInPage("from Userpassword as a where a.upPower = 3 order by a.upId asc", null, 1, 50);
		//pageResults表示部员的详细信息
		pageResults = deService.findAPage(null, null, 1, 50); 
		return "manageDE";
	}
	
//	修改对应的密码
	public String changePassword(){
		if(!newPassword.equals(confirmPassword)) { message = "密码修改成功"; return "changeError";}
		DepartmentmanagerService service = (DepartmentmanagerService) SpringUtil.getBean("departmentmanagerService");
		if(oldPassword == null || newPassword == null) System.out.println("密码没有传递成功");
		if(!service.changePassword((int)session.get("id"), oldPassword, newPassword)) return "changeError";
		message = "密码修改成功";
//TODO		返回相应的部长的页面（人事部或财务部或行政部或外宣部）（DepartmentManager）
		return "departmentManager";
	}
	
//	前往部长首页
	public String goToDepartmentManagerP(){
//TODO		返回相应的部长的页面（人事部或财务部或行政部或外宣部）（DepartmentManager）
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
	 * @param newPassword 要设置的 newPassword
	 */
	public void setNewPassword(String newPassword)
	{
		this.newPassword = newPassword;
	}

	/**
	 * @param confirmPassword 要设置的 confirmPassword
	 */
	public void setConfirmPassword(String confirmPassword)
	{
		this.confirmPassword = confirmPassword;
	}

	/**
	 * @param oldPassword 要设置的 oldPassword
	 */
	public void setOldPassword(String oldPassword)
	{
		this.oldPassword = oldPassword;
	}

	/**
	 * @param newDE 要设置的 newDE
	 */
	public void setNewDE(String newDE)
	{
		this.newDE = newDE;
	}

	/**
	 * @param dePower 要设置的 dePower
	 */
	public void setDePower(String dePower)
	{
		this.dePower = dePower;
	}

	/**
	 * @param userName 要设置的 userName
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	
	
}
