package org.humanDepartment.humanSystem.action;

import org.BaseAction;
import org.dao.PageResults;
import org.dao.service.interf.MembersService;
import org.dao.service.interf.TeamService;
import org.humanDepartment.humanSystem.pojo.Members;
import org.humanDepartment.humanSystem.pojo.Team;
import org.model.SpringUtil;

public class DepartmentToTeam extends BaseAction
{
//TODO ������׼��ס����׼�˳����ܾ���ס���ܾ��˳����鿴��ɾ����ֻ�в������ã�
	
private TeamService service;
private PageResults<Team> allTeams;
private Team team;
private String teamId;
	
	
//	��׼��ס
//	��׼�˳�
//	�ܾ���ס
//	�ܾ��˳�
//	�鿴�����Ŷ�
	public String checkAllTeam(){
		allTeams = service.findAPage("from Team", null, 0, 100);
		return "checkAllTeam";
	}
//	�鿴ĳ���Ŷ���ϸ����
	public String checkATeamDetail(){
		if(teamId == null) return null;
		team = service.findById(Integer.valueOf(teamId));
		return "checkATeam";
	}
//	�߳��Ŷӣ�ֻ�в������ã�
	public String deleteATeam(){
		if(teamId == null) return null;
		Team t = service.findById(Integer.valueOf(teamId));
		t.setTName(team.getTName() + "�����߳���");
		t.setTStatus("���߳�");
		service.update(t);
//	TODO ���ﻹ�������Ĳ�����������������Դ���޸ĵ�
		return "haveFired";
	}
//	������getter��setter
}
