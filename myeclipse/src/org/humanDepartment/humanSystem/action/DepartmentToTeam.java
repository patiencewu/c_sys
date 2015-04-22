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
//TODO 包括批准入住、批准退出、拒绝入住、拒绝退出、查看、删除（只有部长可用）
	
private TeamService service;
private PageResults<Team> allTeams;
private Team team;
private String teamId;
	
	
//	批准入住
//	批准退出
//	拒绝入住
//	拒绝退出
//	查看又有团队
	public String checkAllTeam(){
		allTeams = service.findAPage("from Team", null, 0, 100);
		return "checkAllTeam";
	}
//	查看某个团队详细资料
	public String checkATeamDetail(){
		if(teamId == null) return null;
		team = service.findById(Integer.valueOf(teamId));
		return "checkATeam";
	}
//	踢出团队（只有部长可用）
	public String deleteATeam(){
		if(teamId == null) return null;
		Team t = service.findById(Integer.valueOf(teamId));
		t.setTName(team.getTName() + "（已踢出）");
		t.setTStatus("已踢出");
		service.update(t);
//	TODO 这里还有其它的操作，包括其它的资源的修改等
		return "haveFired";
	}
//	以下是getter和setter
}
