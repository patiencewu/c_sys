package org.humanDepartment.humanSystem.action;

import org.BaseAction;
import org.dao.PageResults;
import org.dao.service.interf.MembersService;
import org.dao.service.interf.TeamService;
import org.humanDepartment.humanSystem.pojo.Members;
import org.model.SpringUtil;

public class TeamToMember extends BaseAction
{
//TODO 查看团队内成员、招募（拉）成员、踢出成员
	
private PageResults<Members> allMyTeamMember;
private String memberId;

	//	查看团队内成员
	public String checkMyTeamMembers(){
		MembersService mService = (MembersService) SpringUtil.getBean("membersService");
		Members member = mService.findById(Integer.valueOf(session.get("id").toString()));
		allMyTeamMember = mService.findAPage("from Members as a where a.MTeamId = " + member.getMTeamId(), null, 0, 50);
		return "teamDetail";
	}
//	TODO 招募（拉）成员
//	踢出成员
	public String fireMyTeamMember(){
		if(memberId == null) return null;
		MembersService mService = (MembersService) SpringUtil.getBean("membersService");
		Members member = mService.findById(Integer.valueOf(memberId));
		member.setMTeamId(null);
		member.setMTeamName(null);
		mService.update(member);
//		TODO 这里要加一个提示信息给被踢出者
		return "haveFired";
	}
//	以下是getter和setter
}
