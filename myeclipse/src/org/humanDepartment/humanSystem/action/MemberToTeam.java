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
//�齨�Ŷӡ���ɢ�Ŷӡ�ȷ�ϼ��롢�鿴���Ŷӡ��鿴�����Ŷӡ��˳��Ŷӡ����Ŷ���Ϣ
	private TeamService tService;
	private MembersService mService;
	private Team team;
	private PageResults<Team> allTeam;
	
//	�齨�Ŷ�
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
	
//	�˳��Ŷ�
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
	
//	TODO ȷ�ϼ����Ŷ�
//	�鿴���Ŷ�
	public String checkMyTeam(){
		Members member = mService.findById(Integer.valueOf(session.get("id").toString()));
		team = tService.findById(member.getMTeamId());
		return "teamDetail";
	}
//	�鿴���������Ŷ�
	public String checkAllTeam(){
		allTeam = tService.findAPage(null, "select count(*) from Team", 0, 10);
		return "allTeam";
	}
//	�޸��Ŷ���Ϣ
	public String changeMyTeamDetail(){
		if(team == null) return null;
		tService.update(team);
		message = "�޸ĳɹ�";
		return "changeTeamDetailSuccess";
	}
//	��ɢ�Ŷ�
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
		team.setTName(team.getTName() + "���ѽ�ɢ��");
		team.setTStatus("�ѽ�ɢ");
		tService.update(team);
		return "TeamDismiss";
	}
//	TODO ������getter��setter
	
}
