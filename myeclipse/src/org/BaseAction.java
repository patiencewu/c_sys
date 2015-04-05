package org;

import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements
											 ServletRequestAware,
											 SessionAware,
											 ServletContextAware
{
	
//	
//	
//	/*以下是实例即使用方法*/
//	/*依赖注入数据库访问DAO*/
//	private UserpasswordService service;
//	
//	/*此方法可有可无*/
//	public UserpasswordService getService()
//	{
//		return service;
//	}
//
//	/*依赖注入所set需要的方法*/
//	public void setService(UserpasswordService service)
//	{
//		this.service = service;
//	}
//
//	

	protected HttpServletRequest request;
	protected Map session;
	protected ServletContext application;
	
	public void setServletRequest(HttpServletRequest request) {
	this.request = request;
	}
	
	@SuppressWarnings("unchecked")
	public void setSession(Map session) {
	this.session = session;
	}
	public void setServletContext(ServletContext application) {
	this.application = application;
	}
	
}
