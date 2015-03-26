
package org.humanDepartment.humanSystem.pojo;


/**
 * Userpassword entity. @author MyEclipse Persistence Tools
 */

public class Userpassword implements java.io.Serializable
{


	// Fields

	private String upUser;
	private String upPassword;
	private Integer upId;
	private Short upPower;


	// Constructors

	/** default constructor */
	public Userpassword()
	{}


	/** full constructor */
	public Userpassword(String upPassword, Integer upId, Short upPower)
	{
		this.upPassword = upPassword;
		this.upId = upId;
		this.upPower = upPower;
	}


	// Property accessors

	public String getUpUser()
	{
		return this.upUser;
	}

	public void setUpUser(String upUser)
	{
		this.upUser = upUser;
	}

	public String getUpPassword()
	{
		return this.upPassword;
	}

	public void setUpPassword(String upPassword)
	{
		this.upPassword = upPassword;
	}

	public Integer getUpId()
	{
		return this.upId;
	}

	public void setUpId(Integer upId)
	{
		this.upId = upId;
	}

	public Short getUpPower()
	{
		return this.upPower;
	}

	public void setUpPower(Short upPower)
	{
		this.upPower = upPower;
	}


}
