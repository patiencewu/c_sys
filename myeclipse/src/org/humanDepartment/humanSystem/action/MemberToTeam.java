package org.humanDepartment.humanSystem.action;

import org.BaseAction;
import org.dao.PageResults;
import org.dao.service.interf.MembersService;
import org.dao.service.interf.TeamService;
import org.humanDepartment.humanSystem.pojo.Members;
import org.humanDepartment.humanSystem.pojo.Team;
import org.model.SpringUtil;

public class MemberToTeam extends BaseAction
{
//组建团队、解散团队、确认加入、查看本团队、查看其它团队、退出团队、改团队信息
	private TeamService tService;
	private MembersService mService;
	private Team team;
	private PageResults<Team> allTeam;
	
//	组建团队
	/**
	 * 新一个团队，建立一个全新的团队（暂时不包含有其他成员），暂时只有队长
	 * @return
	 */
	public String builtATeam(){
		Members mem;
		int teamId;
		int memberId = Integer.valueOf(session.get("id").toString());
		
		team.setTLeaderId(memberId);
		teamId = tService.add(team);
		
		mem = mService.findById(memberId);
		mem.setMTeamId(teamId);
		mem.setMTeamName(team.getTName());
		mem.setMIsCaptain(1);
		
		mService.update(mem);
		
		return "builSuccess";
	}
	
	/**
	 * 前往新建团队的界面，如果还没有团队则可以新建，如果有团队，则不能新建团队
	 * @return
	 */
	public String goToBuilTeam(){
		Members member = mService.findById(Integer.valueOf(session.get("id").toString()));
		if(member.getMTeamId() != null || member.getMIsCaptain() != null){
			message = "您已经是一个团队的成员了，不能再组建团队了";
			return "cannotBuilt";
		}
		return "builTeam";
	}
	
//	退出团队
	/**
	 * 离开团队，如果是队长，则要先提拔一人为队长才可以，否则解散团队
	 * @return
	 */
	public String leaveTeam(){
		Members member = mService.findById(Integer.valueOf(session.get("id").toString()));
		
		if(member.getMIsCaptain() == 1) {return "cannotLeave";}//TODO 这里要改为解散或者提拔，并且自己退出
		
		member.setMTeamId(null);
		member.setMTeamName(null);
		member.setMIsCaptain(null);
		
		return "leaveSuccess";
	}
	
//	TODO 确认加入团队
//	查看本团队
	public String checkMyTeam(){
		Members member = mService.findById(Integer.valueOf(session.get("id").toString()));
		team = tService.findById(member.getMTeamId());
		return "teamDetail";
	}
//	查看其它所有团队
	public String checkAllTeam(){
		allTeam = tService.findAPage(null, "select count(*) from Team", 0, 10);
		return "allTeam";
	}
//	修改团队信息
	public String changeMyTeamDetail(){
		if(team == null) return null;
		tService.update(team);
		message = "修改成功";
		return "changeTeamDetailSuccess";
	}
//	解散团队
	public String dismissTeam(){
		Members member = mService.findById(Integer.valueOf(session.get("id").toString()));
		PageResults<Members> thisTeamMembers = mService.findAPage("from Members as a where a.MTeamId = " + member.getMTeamId(), null, 0, 50);
		for(Members m : thisTeamMembers.getResults()){
			Members mm = m;
			mm.setMTeamId(null);
			mm.setMTeamName(null);
			mService.update(mm);
		}
		team = tService.findById(member.getMTeamId());
		team.setTName(team.getTName() + "（已解散）");
		team.setTStatus("已解散");
		tService.update(team);
		return "TeamDismiss";
	}
//	TODO 以下是getter和setter
	
}
