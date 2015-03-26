
package org.humanDepartment.humanSystem.pojo;

import java.util.Date;


/**
 * Departmentmanager entity. @author MyEclipse Persistence Tools
 */

public class Departmentmanager implements java.io.Serializable
{


	// Fields

	private Integer dmId;
	private String dmName;
	private String dmSex;
	private Date dmBirthday;
	private String dmLphone;
	private String dmSphone;
	private String dmEmail;
	private String dmAddress;
	private String dmOtherContactInformation;
	private String dmPhoto;
	private Short dmPostcode;


	// Constructors

	/** default constructor */
	public Departmentmanager()
	{}

	/** minimal constructor */
	public Departmentmanager(String dmName, String dmSex)
	{
		this.dmName = dmName;
		this.dmSex = dmSex;
	}

	/** full constructor */
	public Departmentmanager(String dmName,
							 String dmSex,
							 Date dmBirthday,
							 String dmLphone,
							 String dmSphone,
							 String dmEmail,
							 String dmAddress,
							 String dmOtherContactInformation,
							 String dmPhoto,
							 Short dmPostcode)
	{
		this.dmName = dmName;
		this.dmSex = dmSex;
		this.dmBirthday = dmBirthday;
		this.dmLphone = dmLphone;
		this.dmSphone = dmSphone;
		this.dmEmail = dmEmail;
		this.dmAddress = dmAddress;
		this.dmOtherContactInformation = dmOtherContactInformation;
		this.dmPhoto = dmPhoto;
		this.dmPostcode = dmPostcode;
	}


	// Property accessors

	public Integer getDmId()
	{
		return this.dmId;
	}

	public void setDmId(Integer dmId)
	{
		this.dmId = dmId;
	}

	public String getDmName()
	{
		return this.dmName;
	}

	public void setDmName(String dmName)
	{
		this.dmName = dmName;
	}

	public String getDmSex()
	{
		return this.dmSex;
	}

	public void setDmSex(String dmSex)
	{
		this.dmSex = dmSex;
	}

	public Date getDmBirthday()
	{
		return this.dmBirthday;
	}

	public void setDmBirthday(Date dmBirthday)
	{
		this.dmBirthday = dmBirthday;
	}

	public String getDmLphone()
	{
		return this.dmLphone;
	}

	public void setDmLphone(String dmLphone)
	{
		this.dmLphone = dmLphone;
	}

	public String getDmSphone()
	{
		return this.dmSphone;
	}

	public void setDmSphone(String dmSphone)
	{
		this.dmSphone = dmSphone;
	}

	public String getDmEmail()
	{
		return this.dmEmail;
	}

	public void setDmEmail(String dmEmail)
	{
		this.dmEmail = dmEmail;
	}

	public String getDmAddress()
	{
		return this.dmAddress;
	}

	public void setDmAddress(String dmAddress)
	{
		this.dmAddress = dmAddress;
	}

	public String getDmOtherContactInformation()
	{
		return this.dmOtherContactInformation;
	}

	public void setDmOtherContactInformation(String dmOtherContactInformation)
	{
		this.dmOtherContactInformation = dmOtherContactInformation;
	}

	public String getDmPhoto()
	{
		return this.dmPhoto;
	}

	public void setDmPhoto(String dmPhoto)
	{
		this.dmPhoto = dmPhoto;
	}

	public Short getDmPostcode()
	{
		return this.dmPostcode;
	}

	public void setDmPostcode(Short dmPostcode)
	{
		this.dmPostcode = dmPostcode;
	}


}
