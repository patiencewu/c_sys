package org.humanDepartment.humanSystem.action;

import java.util.Map;

import org.BaseAction;

public class Manager extends BaseAction {

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
				return "teacherDetail";
			case 3:
				//TODO ����԰��������Ա����Ϣ�޸Ľ���
				return "employeeDetail";
			case 4:
				//TODO ������ס��Ա�ĸ�����Ϣ�޸Ľ���
				return "memberDetail";
		}
		return null;
	}
}
