package org.humanDepartment.humanSystem.action;

import org.BaseAction;
import org.dao.service.interf.MembersService;
import org.dao.service.interf.TeamService;
import org.humanDepartment.humanSystem.pojo.Members;
import org.humanDepartment.humanSystem.pojo.Team;
import org.model.SpringUtil;

public class MemberToTeam extends BaseAction
{
//�齨�Ŷӡ���ɢ�Ŷӡ�ȷ�ϼ��롢�鿴���Ŷӡ��鿴�����Ŷӡ��˳��Ŷӡ����Ŷ���Ϣ
	private TeamService tService;
	private MembersService mService;
	private Team team;
	
	/**
	 * ��һ���Ŷӣ�����һ��ȫ�µ��Ŷӣ���ʱ��������������Ա������ʱֻ�жӳ�
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
	 * ǰ���½��ŶӵĽ��棬�����û���Ŷ�������½���������Ŷӣ������½��Ŷ�
	 * @return
	 */
	public String goToBuilTeam(){
		Members member = mService.findById(Integer.valueOf(session.get("id").toString()));
		if(member.getMTeamId() != null || member.getMIsCaptain() != null){
			message = "���Ѿ���һ���Ŷӵĳ�Ա�ˣ��������齨�Ŷ���";
			return "cannotBuilt";
		}
		return "builTeam";
	}
	
	/**
	 * �뿪�Ŷӣ�����Ƕӳ�����Ҫ�����һ��Ϊ�ӳ��ſ��ԣ������ɢ�Ŷ�
	 * @return
	 */
	public String leaveTeam(){
		Members member = mService.findById(Integer.valueOf(session.get("id").toString()));
		
		if(member.getMIsCaptain() == 1) {return "cannotLeave";}//TODO ����Ҫ��Ϊ��ɢ������Σ������Լ��˳�
		
		member.setMTeamId(null);
		member.setMTeamName(null);
		member.setMIsCaptain(null);
		
		return "leaveSuccess";
	}
	
	
}
