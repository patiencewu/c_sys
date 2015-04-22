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

	
//TODO	��Щ�ֶε�getter��setter��ʱû�и����ں����ٸ���
	private Departmentmanager teacher;
	private Departmentemployee employee;
	private Members member;
	
	public String goToManagerHome(){
		return "managerHome";
	}
	
//	��ת���Լ��ĸ�����ϸ��Ϣ��Ȼ�����Ҫ�޸�
	public String goToSelfDeatail(){
//		��ʱ������滻
		if(true) return "managerHome";
		switch(Integer.valueOf(session.get("power").toString())){
			case 2:
				//TODO ������ʦ����Ϣ�޸Ľ���
				DepartmentmanagerService dmService = (DepartmentmanagerService) SpringUtil.getBean("departmentmanagerService");
				teacher = dmService.findById(Integer.valueOf(session.get("id").toString()));
				return "teacherDetail";
			case 3:
				//TODO ����԰��������Ա����Ϣ�޸Ľ���
				DepartmentemployeeService deService = (DepartmentemployeeService) SpringUtil.getBean("departmentemployeeService");
				employee = deService.findById(Integer.valueOf(session.get("id").toString()));
				return "employeeDetail";
			case 4:
				//TODO ������ס��Ա�ĸ�����Ϣ�޸Ľ���
				MembersService mService = (MembersService) SpringUtil.getBean("membersService");
				member = mService.findById(Integer.valueOf(session.get("id").toString()));
				return "memberDetail";
		}
		return null;
	}
	
//	�������޸���ʦ����ϸ��Ϣ���ϵĲ���
	public String changeTeacherDetail(){
		if(teacher == null) return null;
		DepartmentmanagerService dmService = (DepartmentmanagerService) SpringUtil.getBean("departmentmanagerService");
		dmService.update(teacher);
		return "changeSuccess";
	}
	
	
//	�������޸�ѧ������Ա����ҵ���ص�ѧ��������Ա���Ĳ���
	public String changeEmployeeDetail(){
		if(employee == null) return null;
		DepartmentemployeeService deService = (DepartmentemployeeService) SpringUtil.getBean("departmentemployeeService");
		deService.update(employee);
		return "changeSuccess";
	}
	
	
//	�������޸���ס��Ա����ϸ���ϵĲ���
	public String changeMembersDetail(){
		if(member == null) return null;
		MembersService mService = (MembersService) SpringUtil.getBean("membersService");
		mService.update(member);
		return "changeSuccess";
	}
	
	
}
