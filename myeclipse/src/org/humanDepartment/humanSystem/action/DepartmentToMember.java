package org.humanDepartment.humanSystem.action;

import org.BaseAction;
import org.dao.PageResults;
import org.dao.service.interf.MembersService;
import org.humanDepartment.humanSystem.pojo.Members;
import org.model.SpringUtil;

public class DepartmentToMember extends BaseAction
{
//TODO 部门管理员对注册会员的管理，包括：查、删
	
private PageResults<Members> pageResults;
private String id;
private Members member;
private String pageNo;

	//前往注册会员管理
	public String goToManageMember(){
		MembersService mService = (MembersService) SpringUtil.getBean("membersService");
		//pageResults表示注册会员的详细信息
		if(pageNo == null || pageNo.equals("0")) pageNo="1";
		pageResults = mService.findAPage(null, "select count(*) from Members", Integer.valueOf(pageNo), 10); 
		return "manageMembers";
	}
	//查询详情
	public String checkTheDetail(){
		MembersService mService = (MembersService) SpringUtil.getBean("membersService");
		this.member = mService.findById(Integer.valueOf(id));
		return "memberDetail";
	}
	
	
	/**
	 * @return pageResults
	 */
	public PageResults getPageResults()
	{
		return pageResults;
	}

	/**
	 * @return member
	 */
	public Members getMember()
	{
		return member;
	}
	
	/**
	 * @param member 要设置的 member
	 */
	public void setMember(Members member)
	{
		this.member = member;
	}
	/**
	 * @param pageNo 要设置的 pageNo
	 */
	public void setPageNo(String pageNo)
	{
		this.pageNo = pageNo;
	}
	/**
	 * @param id 要设置的 id
	 */
	public void setId(String id)
	{
		this.id = id;
	}
	
	
}
