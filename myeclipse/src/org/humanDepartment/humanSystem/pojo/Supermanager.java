
package org.humanDepartment.humanSystem.pojo;


/**
 * Supermanager entity. @author MyEclipse Persistence Tools
 */

public class Supermanager implements java.io.Serializable
{


	// Fields

	private Integer smId;
	private String smName;
	private String smLphone;
	private Integer version;


	// Constructors

	/** default constructor */
	public Supermanager()
	{}


	/** full constructor */
	public Supermanager(String smName, String smLphone, Integer version)
	{
		this.smName = smName;
		this.smLphone = smLphone;
		this.version = version;
	}


	// Property accessors

	public Integer getSmId()
	{
		return this.smId;
	}

	public void setSmId(Integer smId)
	{
		this.smId = smId;
	}

	public String getSmName()
	{
		return this.smName;
	}

	public void setSmName(String smName)
	{
		this.smName = smName;
	}

	public String getSmLphone()
	{
		return this.smLphone;
	}

	public void setSmLphone(String smLphone)
	{
		this.smLphone = smLphone;
	}

	public Integer getVersion()
	{
		return this.version;
	}

	public void setVersion(Integer version)
	{
		this.version = version;
	}


}
