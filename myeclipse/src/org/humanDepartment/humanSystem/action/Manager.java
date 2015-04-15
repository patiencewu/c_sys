package org.humanDepartment.humanSystem.action;

import java.util.Map;

import org.BaseAction;

public class Manager extends BaseAction {

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
				return "teacherDetail";
			case 3:
				//TODO 返回园区工作人员的信息修改界面
				return "employeeDetail";
			case 4:
				//TODO 返回入住人员的个人信息修改界面
				return "memberDetail";
		}
		return null;
	}
}
