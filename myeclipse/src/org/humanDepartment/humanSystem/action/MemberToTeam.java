package org.humanDepartment.humanSystem.action;

import org.BaseAction;
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
	
	
}
