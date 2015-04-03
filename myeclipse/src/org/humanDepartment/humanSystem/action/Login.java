package org.humanDepartment.humanSystem.action;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletContext;
import  javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;
import org.dao.BaseDao;
import org.dao.PageResults;
import org.dao.service.BaseAction;
import org.dao.service.DepartmentemployeeService;
import org.dao.service.DepartmentmanagerService;
import org.dao.service.MembersService;
import org.dao.service.SupermanagerService;
import org.dao.service.UserpasswordService;
import com.opensymphony.xwork2.ActionSupport;
import org.humanDepartment.humanSystem.pojo.Departmentemployee;
import org.humanDepartment.humanSystem.pojo.Departmentmanager;
import org.humanDepartment.humanSystem.pojo.Members;
import org.humanDepartment.humanSystem.pojo.Supermanager;
import org.humanDepartment.humanSystem.pojo.Team;
import org.humanDepartment.humanSystem.pojo.Userpassword;
import org.model.SpringUtil;

public class Login extends BaseAction
{
//TODO ��½Action��ֻ��һ�����������ض��ֵ����ͬ������

	/*����ע�����ݿ����DAO*/
	private UserpasswordService service;
	private String userName;
	private String password;
	private String message;
	private Supermanager superManager;
	private Departmentmanager departmentManager;
	private Departmentemployee departmentEmployee;
	private Members member;
	private Team team;
	private PageResults pageResults;
	
	public Team getTeam()
	{
		return team;
	}

	public String getMessage()
	{
		return message;
	}


	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public Supermanager getSuperManager()
	{
		return superManager;
	}

	public Departmentmanager getDepartmentManager()
	{
		return departmentManager;
	}

	public Departmentemployee getDepartmentEmployee()
	{
		return departmentEmployee;
	}

	public Members getMember()
	{
		return member;
	}

	public UserpasswordService getService()
	{
		return service;
	}

	/*����ע������Ҫ�ķ���*/
	public void setService(UserpasswordService service)
	{
		this.service = service;
	}

	//����Ĭ�Ϸ���
	@Override
	public String execute() throws Exception{
		Userpassword user;
		SupermanagerService smService;
		DepartmentmanagerService dmService;
		DepartmentemployeeService deService;
		MembersService mService;
		user = service.findLoginUser(userName, password);
		if(user == null) return "login";
		switch(user.getUpPower()){
			case 1:
				smService = (SupermanagerService) SpringUtil.getBean("supermanagerService");
				superManager = smService.findId(user.getUpId());
				dmService = (DepartmentmanagerService) SpringUtil.getBean("departmentmanagerService");
				pageResults = dmService.findAPage(null, null, 0, 10);
				this.message = "��½�ɹ�";
				return "superManager";
			case 2:
				//TODO �ⷵ�ص��ǲ��Ź���Ա����������ʦ����½ҳ�����в�����Ϣ��ʾ��Ҫ��ӻ���������ҵ����
				dmService = (DepartmentmanagerService) SpringUtil.getBean("departmentmanagerService");
				departmentManager = dmService.findById(user.getUpId());
				deService = (DepartmentemployeeService) SpringUtil.getBean("departmentemployeeService");
				pageResults = deService.findAPage(null, null, 0, 10);
				return "departmentManager";
			case 3:
				//TODO �ⷵ�ص��ǲ��Ź���Ա����Ա��ѧ������½ҳ�����в�����Ϣ��ʾ��Ҫ��ӻ���������ҵ����
				deService = (DepartmentemployeeService) SpringUtil.getBean("departmentemployeeService");
				departmentEmployee = deService.findById(user.getUpId());
				return "departmentEmployee";
			case 4:
				//TODO 
				return "member";
		}
		return null;
		
	}

	
}
