package org.humanDepartment.humanSystem.action;

import java.util.LinkedList;
import java.util.List;
import org.BaseAction;
import org.dao.PageResults;
import org.dao.service.interf.DepartmentmanagerService;
import org.dao.service.interf.SupermanagerService;
import org.dao.service.interf.UserpasswordService;
import org.hibernate.Session;
import org.humanDepartment.humanSystem.pojo.Departmentmanager;
import org.humanDepartment.humanSystem.pojo.Supermanager;
import org.humanDepartment.humanSystem.pojo.Userpassword;
import org.model.SpringUtil;

public class SuperMangerToDepartmentManager extends BaseAction
{
	

	private String userName;
	private String oldPassword;
	private String newPassword;
	private String confirmPassword;
	private String message;
	private String newDM;
	private String dmPower;
	private PageResults pageResults;
	private PageResults pageResults2;
	private PageResults<Userpassword> pageResults1;


//	添加相关部门的部长（DepartmentManager）
	public String addNewDM(){
		int ran = (int)(10000+Math.random()*(80000));
		UserpasswordService uService = (UserpasswordService) SpringUtil.getBean("userpasswordService");
		Userpassword user = (Userpassword) SpringUtil.getBean("userPassword");
		newDM = String.valueOf(ran);
		user.setUpUser(newDM);
		user.setUpPassword(newDM);
		user.setUpPower(Short.valueOf(dmPower));
		user.setUpId(null);
		uService.addUser(user);
		
		return "addSuccess";
	}

//	删除对应账号的部长
	public String deleteDM(){
		UserpasswordService uService = (UserpasswordService) SpringUtil.getBean("userpasswordService");
		Userpassword u =  uService.findUserById(userName);
		if(u.getUpId() == null || u.getUpId() == 0){
			uService.delUserById(userName);
		}
		else{
			uService.delUserById(userName);
			DepartmentmanagerService dmService = (DepartmentmanagerService) SpringUtil.getBean("departmentmanagerService");
			dmService.deleteById(u.getUpId());
		}
		message = "成功删除账号" + userName;
		return goToManageDM();
	}
	
//	前往添加页面
	public String goToAdd(){
		return "toAddDM";
	}
	
//	前往密码修改页面
	public String goToChangePassword(){
		return "toChangePassword";
	}
	
//	前往人员管理页面，同时查询相关的人员（部长）
	public String goToManageDM(){
		DepartmentmanagerService dmService = (DepartmentmanagerService) SpringUtil.getBean("departmentmanagerService");
		UserpasswordService uService = (UserpasswordService) SpringUtil.getBean("userpasswordService");

		//pageResults2表示没有录入详细信息的部长
		pageResults2 = uService.findAllUserInPage("from Userpassword as a where a.upPower>=111 and a.upPower<=114", null, 1, 10);
		//pageResults1表示录入了详细信息的部长的账号密码
		pageResults1 = uService.findAllUserInPage("from Userpassword as a where a.upPower = 2 order by a.upId asc", null, 1, 10);
		//pageResults表示部长的详细信息
		pageResults = dmService.findAPage(null, null, 0, 10); 
		return "manageDM";
	}
	
//	修改对应的密码
	public String changePassword(){
		if(!newPassword.equals(confirmPassword)) return "changeError";
		SupermanagerService service = (SupermanagerService) SpringUtil.getBean("supermanagerService");
		if(oldPassword == null || newPassword == null) System.out.println("密码没有传递成功");
		if(!service.changePassword((int)session.get("id"), oldPassword, newPassword)) return "changeError";
		message = "密码修改成功";
		return "superManager";
	}
	
//	前往超管首页
	public String goToSuperManagerP(){
		return "superManager";
	}
	
//	以下是getter和setter
	public String getMessage()
	{
		return message;
	}

	public String getNewDM()
	{
		return newDM;
	}

	public PageResults getPageResults()
	{
		return pageResults;
	}

	public PageResults getPageResults2()
	{
		return pageResults2;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public void setOldPassword(String oldPassword)
	{
		this.oldPassword = oldPassword;
	}

	public void setNewPassword(String newPassword)
	{
		this.newPassword = newPassword;
	}

	public void setDmPower(String dmPower)
	{
		this.dmPower = dmPower;
	}

	public void setConfirmPassword(String confirmPassword)
	{
		this.confirmPassword = confirmPassword;
	}

	
public PageResults getPageResults1()
	{
		return pageResults1;
	}
	
	
}
