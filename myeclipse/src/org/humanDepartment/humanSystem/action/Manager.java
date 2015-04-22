package org.humanDepartment.humanSystem.action;

import java.util.Map;

import org.BaseAction;
import org.dao.service.interf.DepartmentemployeeService;
import org.dao.service.interf.DepartmentmanagerService;
import org.dao.service.interf.MembersService;
import org.humanDepartment.humanSystem.pojo.Departmentemployee;
import org.humanDepartment.humanSystem.pojo.Departmentmanager;
import org.humanDepartment.humanSystem.pojo.Members;
import org.model.SpringUtil;

public class Manager extends BaseAction {

	
//TODO	这些字段的getter和setter暂时没有给出在后面再给出
	private Departmentmanager teacher;
	private Departmentemployee employee;
	private Members member;
	
	public String goToManagerHome(){
		return "managerHome";
	}
	
//	跳转到自己的个人详细信息，然后可能要修改
	public String goToSelfDeatail(){
//		暂时用这个替换
		if(true) return "managerHome";
		switch(Integer.valueOf(session.get("power").toString())){
			case 2:
				//TODO 返回老师的信息修改界面
				DepartmentmanagerService dmService = (DepartmentmanagerService) SpringUtil.getBean("departmentmanagerService");
				teacher = dmService.findById(Integer.valueOf(session.get("id").toString()));
				return "teacherDetail";
			case 3:
				//TODO 返回园区工作人员的信息修改界面
				DepartmentemployeeService deService = (DepartmentemployeeService) SpringUtil.getBean("departmentemployeeService");
				employee = deService.findById(Integer.valueOf(session.get("id").toString()));
				return "employeeDetail";
			case 4:
				//TODO 返回入住人员的个人信息修改界面
				MembersService mService = (MembersService) SpringUtil.getBean("membersService");
				member = mService.findById(Integer.valueOf(session.get("id").toString()));
				return "memberDetail";
		}
		return null;
	}
	
//	这里是修改老师的详细信息资料的操作
	public String changeTeacherDetail(){
		if(teacher == null) return null;
		DepartmentmanagerService dmService = (DepartmentmanagerService) SpringUtil.getBean("departmentmanagerService");
		dmService.update(teacher);
		return "changeSuccess";
	}
	
	
//	这里是修改学生管理员（创业基地的学生工作人员）的操作
	public String changeEmployeeDetail(){
		if(employee == null) return null;
		DepartmentemployeeService deService = (DepartmentemployeeService) SpringUtil.getBean("departmentemployeeService");
		deService.update(employee);
		return "changeSuccess";
	}
	
	
//	这里是修改入住人员的详细资料的操作
	public String changeMembersDetail(){
		if(member == null) return null;
		MembersService mService = (MembersService) SpringUtil.getBean("membersService");
		mService.update(member);
		return "changeSuccess";
	}
	
	
}
