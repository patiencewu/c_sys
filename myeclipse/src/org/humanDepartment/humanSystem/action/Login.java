package org.humanDepartment.humanSystem.action;
import org.BaseAction;
import org.dao.PageResults;
import org.dao.service.interf.DepartmentemployeeService;
import org.dao.service.interf.DepartmentmanagerService;
import org.dao.service.interf.MembersService;
import org.dao.service.interf.SupermanagerService;
import org.dao.service.interf.UserpasswordService;
import org.humanDepartment.humanSystem.pojo.Departmentemployee;
import org.humanDepartment.humanSystem.pojo.Departmentmanager;
import org.humanDepartment.humanSystem.pojo.Members;
import org.humanDepartment.humanSystem.pojo.Supermanager;
import org.humanDepartment.humanSystem.pojo.Team;
import org.humanDepartment.humanSystem.pojo.Userpassword;
import org.model.SpringUtil;
import org.springframework.transaction.annotation.Transactional;
import org.thepublic.pojo.Information;
import org.thepublic.service.InformationService;

public class Login extends BaseAction
{
// 登陆Action，只有一个方法，返回多个值区别不同类别的人

	/*依赖注入数据库访问DAO*/
	private UserpasswordService service;
	private String userName;
	private String password;
	private String message;
	private Supermanager superManager;
	private Departmentmanager departmentManager;
	private Departmentemployee departmentEmployee;
	private Members member;
	private Team team;
	private PageResults pageResults;
	
	public Team getTeam()
	{
		return team;
	}

	public String getMessage()
	{
		return message;
	}


	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public Supermanager getSuperManager()
	{
		return superManager;
	}

	public Departmentmanager getDepartmentManager()
	{
		return departmentManager;
	}

	public Departmentemployee getDepartmentEmployee()
	{
		return departmentEmployee;
	}

	public Members getMember()
	{
		return member;
	}

	public UserpasswordService getService()
	{
		return service;
	}

	/*依赖注入所需要的方法*/
	public void setService(UserpasswordService service)
	{
		this.service = service;
	}

	public String getUserName() {
		return userName;
	}

	//定义默认方法
	@Override
	public String execute() throws Exception{
		Userpassword user;
		SupermanagerService smService;
		DepartmentmanagerService dmService;
		DepartmentemployeeService deService;
		MembersService mService;
		
		user = service.findLoginUser(userName, password);
		if(user == null) return "login";
		
		session.put("userName", userName);
		Integer id = null;
		if(user.getUpPower() < 10){
			id = user.getUpId();
			session.put("id", id);
		}
		switch(user.getUpPower()){
			case 1:
				smService = (SupermanagerService) SpringUtil.getBean("supermanagerService");
				superManager = smService.findId(id);
				session.put("name", superManager.getSmName());
				session.put("id", superManager.getSmId());
				session.put("power", "1");
				this.message = "登陆成功";
				return "superManager";
			case 2:
				//这返回的是部门管理员（部长或老师）登陆页，还有部门信息提示需要添加或者其他的业务功能
				dmService = (DepartmentmanagerService) SpringUtil.getBean("departmentmanagerService");
				departmentManager = dmService.findById(user.getUpId());
				session.put("name", departmentManager.getDmName());
				session.put("id", departmentManager.getDmId());
				session.put("power", "2");
				return "managerHome";
			case 3:
				//这返回的是部门管理员（部员或学生）登陆页，还有部门信息提示需要添加或者其他的业务功能
				deService = (DepartmentemployeeService) SpringUtil.getBean("departmentemployeeService");
				departmentEmployee = deService.findById(user.getUpId());
				session.put("name", departmentEmployee.getDeName());
				session.put("id", departmentEmployee.getDeId());
				session.put("power", "3");
				session.put("departmentId", departmentEmployee.getDeDepartmentId());
				return "managerHome";
			case 4:
				//TODO 这里返回的是入住的成员的主页
				mService = (MembersService) SpringUtil.getBean("membersService");
				member = mService.findById(user.getUpId());
				session.put("name", member.getMName());
				session.put("id", member.getMId());
				session.put("power", "4");
				session.put("teamId", member.getMTeamId());
				session.put("isCaptain", member.getMIsCaptain());
				return "memberHome";
			case 110:
				session.put("power", 110);
				return "teacherDataChange";
			case 111:
				session.put("power", 111);
				return "teacherDataChange";
			case 112:
				session.put("power", 112);
				return "teacherDataChange";
			case 113:
				session.put("power", 113);
				return "teacherDataChange";
			case 114:
				session.put("power", 114);
				return "teacherDataChange";
			case 120:
				session.put("power", 120);
				return "employeeDataChange";
			case 121:
				session.put("power", 121);
				return "employeeDataChange";
			case 122:
				session.put("power", 122);
				return "employeeDataChange";
			case 123:
				session.put("power", 123);
				return "employeeDataChange";
			case 124:
				session.put("power", 124);
				return "employeeDataChange";
		}
		return null;
		
	}

//	退出时将session全部的保存的东西删掉
	public String exit(){
		session.clear();
		return "login";
	}
}
