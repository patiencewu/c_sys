
package org.humanDepartment.humanSystem.pojo;


/**
 * Departmentemployee entity. @author MyEclipse Persistence Tools
 */

public class Departmentemployee implements java.io.Serializable
{


	// Fields

	private Integer deId;
	private String deName;
	private String deSex;
	private String dmBirthday;
	private String deLphone;
	private String deSphone;
	private String deEmail;
	private String deAddress;
	private String deOtherContactInformation;
	private String dePhoto;
	private String deCollege;
	private String deMajor;
	private String deClass;
	private String dePostcode;
	private Integer deDepartmentId;
	private Integer version;


	// Constructors

	/** default constructor */
	public Departmentemployee()
	{}

	/** minimal constructor */
	public Departmentemployee(String deName, String deSex)
	{
		this.deName = deName;
		this.deSex = deSex;
	}

	/** full constructor */
	public Departmentemployee(String deName,
							  String deSex,
							  String dmBirthday,
							  String deLphone,
							  String deSphone,
							  String deEmail,
							  String deAddress,
							  String deOtherContactInformation,
							  String dePhoto,
							  String deCollege,
							  String deMajor,
							  String deClass,
							  String dePostcode,
							  Integer deDepartmentId,
							  Integer version)
	{
		this.deName = deName;
		this.deSex = deSex;
		this.dmBirthday = dmBirthday;
		this.deLphone = deLphone;
		this.deSphone = deSphone;
		this.deEmail = deEmail;
		this.deAddress = deAddress;
		this.deOtherContactInformation = deOtherContactInformation;
		this.dePhoto = dePhoto;
		this.deCollege = deCollege;
		this.deMajor = deMajor;
		this.deClass = deClass;
		this.dePostcode = dePostcode;
		this.deDepartmentId = deDepartmentId;
		this.version = version;
	}


	// Property accessors

	public Integer getDeId()
	{
		return this.deId;
	}

	public void setDeId(Integer deId)
	{
		this.deId = deId;
	}

	public String getDeName()
	{
		return this.deName;
	}

	public void setDeName(String deName)
	{
		this.deName = deName;
	}

	public String getDeSex()
	{
		return this.deSex;
	}

	public void setDeSex(String deSex)
	{
		this.deSex = deSex;
	}

	public String getDmBirthday()
	{
		return this.dmBirthday;
	}

	public void setDmBirthday(String dmBirthday)
	{
		this.dmBirthday = dmBirthday;
	}

	public String getDeLphone()
	{
		return this.deLphone;
	}

	public void setDeLphone(String deLphone)
	{
		this.deLphone = deLphone;
	}

	public String getDeSphone()
	{
		return this.deSphone;
	}

	public void setDeSphone(String deSphone)
	{
		this.deSphone = deSphone;
	}

	public String getDeEmail()
	{
		return this.deEmail;
	}

	public void setDeEmail(String deEmail)
	{
		this.deEmail = deEmail;
	}

	public String getDeAddress()
	{
		return this.deAddress;
	}

	public void setDeAddress(String deAddress)
	{
		this.deAddress = deAddress;
	}

	public String getDeOtherContactInformation()
	{
		return this.deOtherContactInformation;
	}

	public void setDeOtherContactInformation(String deOtherContactInformation)
	{
		this.deOtherContactInformation = deOtherContactInformation;
	}

	public String getDePhoto()
	{
		return this.dePhoto;
	}

	public void setDePhoto(String dePhoto)
	{
		this.dePhoto = dePhoto;
	}

	public String getDeCollege()
	{
		return this.deCollege;
	}

	public void setDeCollege(String deCollege)
	{
		this.deCollege = deCollege;
	}

	public String getDeMajor()
	{
		return this.deMajor;
	}

	public void setDeMajor(String deMajor)
	{
		this.deMajor = deMajor;
	}

	public String getDeClass()
	{
		return this.deClass;
	}

	public void setDeClass(String deClass)
	{
		this.deClass = deClass;
	}

	public String getDePostcode()
	{
		return this.dePostcode;
	}

	public void setDePostcode(String dePostcode)
	{
		this.dePostcode = dePostcode;
	}

	public Integer getDeDepartmentId()
	{
		return this.deDepartmentId;
	}

	public void setDeDepartmentId(Integer deDepartmentId)
	{
		this.deDepartmentId = deDepartmentId;
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
