package org.humanDepartment.humanSystem.action;

import org.BaseAction;
import org.dao.PageResults;
import org.dao.service.interf.MembersService;
import org.dao.service.interf.TeamService;
import org.humanDepartment.humanSystem.pojo.Members;
import org.model.SpringUtil;

public class TeamToMember extends BaseAction
{
//TODO �鿴�Ŷ��ڳ�Ա����ļ��������Ա���߳���Ա
	
private PageResults<Members> allMyTeamMember;
private String memberId;

	//	�鿴�Ŷ��ڳ�Ա
	public String checkMyTeamMembers(){
		MembersService mService = (MembersService) SpringUtil.getBean("membersService");
		Members member = mService.findById(Integer.valueOf(session.get("id").toString()));
		allMyTeamMember = mService.findAPage("from Members as a where a.MTeamId = " + member.getMTeamId(), null, 0, 50);
		return "teamDetail";
	}
//	TODO ��ļ��������Ա
//	�߳���Ա
	public String fireMyTeamMember(){
		if(memberId == null) return null;
		MembersService mService = (MembersService) SpringUtil.getBean("membersService");
		Members member = mService.findById(Integer.valueOf(memberId));
		member.setMTeamId(null);
		member.setMTeamName(null);
		mService.update(member);
//		TODO ����Ҫ��һ����ʾ��Ϣ�����߳���
		return "haveFired";
	}
//	������getter��setter
}
