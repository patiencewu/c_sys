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
import org.dao.service.BaseAction;
import org.dao.service.UserpasswordService;
import com.opensymphony.xwork2.ActionSupport;
import org.humanDepartment.humanSystem.pojo.Supermanager;
import org.humanDepartment.humanSystem.pojo.Userpassword;
import org.model.SpringUtil;

public class Login extends BaseAction
{
//TODO ��½Action��ֻ��һ�����������ض��ֵ����ͬ������

	/*����ע�����ݿ����DAO*/
	private UserpasswordService us = (UserpasswordService) SpringUtil.getBean("userpasswordService");
	
	//����Ĭ�Ϸ���
	@Override
	public String execute() throws Exception{
		return null;
		
	}

	
}
