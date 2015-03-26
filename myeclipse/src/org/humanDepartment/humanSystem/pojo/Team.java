
package org.humanDepartment.humanSystem.pojo;

import java.util.Date;


/**
 * Team entity. @author MyEclipse Persistence Tools
 */

public class Team implements java.io.Serializable
{


	// Fields

	private Integer TId;
	private String TName;
	private Short TAmount;
	private String TDescription;
	private String TTeacher;
	private Date TSetUp;
	private String TStatus;
	private Integer TLeaderId;


	// Constructors

	/** default constructor */
	public Team()
	{}

	/** minimal constructor */
	public Team(String TName,
				Short TAmount,
				Date TSetUp,
				String TStatus,
				Integer TLeaderId)
	{
		this.TName = TName;
		this.TAmount = TAmount;
		this.TSetUp = TSetUp;
		this.TStatus = TStatus;
		this.TLeaderId = TLeaderId;
	}

	/** full constructor */
	public Team(String TName,
				Short TAmount,
				String TDescription,
				String TTeacher,
				Date TSetUp,
				String TStatus,
				Integer TLeaderId)
	{
		this.TName = TName;
		this.TAmount = TAmount;
		this.TDescription = TDescription;
		this.TTeacher = TTeacher;
		this.TSetUp = TSetUp;
		this.TStatus = TStatus;
		this.TLeaderId = TLeaderId;
	}


	// Property accessors

	public Integer getTId()
	{
		return this.TId;
	}

	public void setTId(Integer TId)
	{
		this.TId = TId;
	}

	public String getTName()
	{
		return this.TName;
	}

	public void setTName(String TName)
	{
		this.TName = TName;
	}

	public Short getTAmount()
	{
		return this.TAmount;
	}

	public void setTAmount(Short TAmount)
	{
		this.TAmount = TAmount;
	}

	public String getTDescription()
	{
		return this.TDescription;
	}

	public void setTDescription(String TDescription)
	{
		this.TDescription = TDescription;
	}

	public String getTTeacher()
	{
		return this.TTeacher;
	}

	public void setTTeacher(String TTeacher)
	{
		this.TTeacher = TTeacher;
	}

	public Date getTSetUp()
	{
		return this.TSetUp;
	}

	public void setTSetUp(Date TSetUp)
	{
		this.TSetUp = TSetUp;
	}

	public String getTStatus()
	{
		return this.TStatus;
	}

	public void setTStatus(String TStatus)
	{
		this.TStatus = TStatus;
	}

	public Integer getTLeaderId()
	{
		return this.TLeaderId;
	}

	public void setTLeaderId(Integer TLeaderId)
	{
		this.TLeaderId = TLeaderId;
	}


}
