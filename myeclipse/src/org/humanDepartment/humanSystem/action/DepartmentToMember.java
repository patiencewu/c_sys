package org.humanDepartment.humanSystem.action;

import org.BaseAction;
import org.dao.PageResults;
import org.dao.service.interf.MembersService;
import org.humanDepartment.humanSystem.pojo.Members;
import org.model.SpringUtil;

public class DepartmentToMember extends BaseAction
{
//TODO ���Ź���Ա��ע���Ա�Ĺ����������顢ɾ
	
private PageResults<Members> pageResults;
private String id;
private Members member;
private String pageNo;

	//ǰ��ע���Ա����
	public String goToManageMember(){
		MembersService mService = (MembersService) SpringUtil.getBean("membersService");
		//pageResults��ʾע���Ա����ϸ��Ϣ
		if(pageNo == null || pageNo.equals("0")) pageNo="1";
		pageResults = mService.findAPage(null, "select count(*) from Members", Integer.valueOf(pageNo), 10); 
		return "manageMembers";
	}
	//��ѯ����
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
	 * @param member Ҫ���õ� member
	 */
	public void setMember(Members member)
	{
		this.member = member;
	}
	/**
	 * @param pageNo Ҫ���õ� pageNo
	 */
	public void setPageNo(String pageNo)
	{
		this.pageNo = pageNo;
	}
	/**
	 * @param id Ҫ���õ� id
	 */
	public void setId(String id)
	{
		this.id = id;
	}
	
	
}
