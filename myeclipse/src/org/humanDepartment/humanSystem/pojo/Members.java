
package org.humanDepartment.humanSystem.pojo;


/**
 * Members entity. @author MyEclipse Persistence Tools
 */

public class Members implements java.io.Serializable
{


	// Fields

	private Integer MId;
	private String MName;
	private Long MIdNumeber;
	private Long MStudentNumber;
	private String MSex;
	private String MBirthday;
	private String MNation;
	private String MNativePlace;
	private String MPliticsStatus;
	private String MSchool;
	private String MCollege;
	private String MDepartment;
	private String MMajor;
	private String MClass;
	private String MGrade;
	private String MEducationBackground;
	private Boolean MStudents;
	private String MSphone;
	private String MLphone;
	private String MAddress;
	private Short MPostcode;
	private String MPhoto;
	private String MEducationSystem;


	// Constructors

	/** default constructor */
	public Members()
	{}

	/** minimal constructor */
	public Members(String MName,
				   Long MIdNumeber,
				   String MSex,
				   String MNation,
				   String MNativePlace)
	{
		this.MName = MName;
		this.MIdNumeber = MIdNumeber;
		this.MSex = MSex;
		this.MNation = MNation;
		this.MNativePlace = MNativePlace;
	}

	/** full constructor */
	public Members(String MName,
				   Long MIdNumeber,
				   Long MStudentNumber,
				   String MSex,
				   String MBirthday,
				   String MNation,
				   String MNativePlace,
				   String MPliticsStatus,
				   String MSchool,
				   String MCollege,
				   String MDepartment,
				   String MMajor,
				   String MClass,
				   String MGrade,
				   String MEducationBackground,
				   Boolean MStudents,
				   String MSphone,
				   String MLphone,
				   String MAddress,
				   Short MPostcode,
				   String MPhoto,
				   String MEducationSystem)
	{
		this.MName = MName;
		this.MIdNumeber = MIdNumeber;
		this.MStudentNumber = MStudentNumber;
		this.MSex = MSex;
		this.MBirthday = MBirthday;
		this.MNation = MNation;
		this.MNativePlace = MNativePlace;
		this.MPliticsStatus = MPliticsStatus;
		this.MSchool = MSchool;
		this.MCollege = MCollege;
		this.MDepartment = MDepartment;
		this.MMajor = MMajor;
		this.MClass = MClass;
		this.MGrade = MGrade;
		this.MEducationBackground = MEducationBackground;
		this.MStudents = MStudents;
		this.MSphone = MSphone;
		this.MLphone = MLphone;
		this.MAddress = MAddress;
		this.MPostcode = MPostcode;
		this.MPhoto = MPhoto;
		this.MEducationSystem = MEducationSystem;
	}


	// Property accessors

	public Integer getMId()
	{
		return this.MId;
	}

	public void setMId(Integer MId)
	{
		this.MId = MId;
	}

	public String getMName()
	{
		return this.MName;
	}

	public void setMName(String MName)
	{
		this.MName = MName;
	}

	public Long getMIdNumeber()
	{
		return this.MIdNumeber;
	}

	public void setMIdNumeber(Long MIdNumeber)
	{
		this.MIdNumeber = MIdNumeber;
	}

	public Long getMStudentNumber()
	{
		return this.MStudentNumber;
	}

	public void setMStudentNumber(Long MStudentNumber)
	{
		this.MStudentNumber = MStudentNumber;
	}

	public String getMSex()
	{
		return this.MSex;
	}

	public void setMSex(String MSex)
	{
		this.MSex = MSex;
	}

	public String getMBirthday()
	{
		return this.MBirthday;
	}

	public void setMBirthday(String MBirthday)
	{
		this.MBirthday = MBirthday;
	}

	public String getMNation()
	{
		return this.MNation;
	}

	public void setMNation(String MNation)
	{
		this.MNation = MNation;
	}

	public String getMNativePlace()
	{
		return this.MNativePlace;
	}

	public void setMNativePlace(String MNativePlace)
	{
		this.MNativePlace = MNativePlace;
	}

	public String getMPliticsStatus()
	{
		return this.MPliticsStatus;
	}

	public void setMPliticsStatus(String MPliticsStatus)
	{
		this.MPliticsStatus = MPliticsStatus;
	}

	public String getMSchool()
	{
		return this.MSchool;
	}

	public void setMSchool(String MSchool)
	{
		this.MSchool = MSchool;
	}

	public String getMCollege()
	{
		return this.MCollege;
	}

	public void setMCollege(String MCollege)
	{
		this.MCollege = MCollege;
	}

	public String getMDepartment()
	{
		return this.MDepartment;
	}

	public void setMDepartment(String MDepartment)
	{
		this.MDepartment = MDepartment;
	}

	public String getMMajor()
	{
		return this.MMajor;
	}

	public void setMMajor(String MMajor)
	{
		this.MMajor = MMajor;
	}

	public String getMClass()
	{
		return this.MClass;
	}

	public void setMClass(String MClass)
	{
		this.MClass = MClass;
	}

	public String getMGrade()
	{
		return this.MGrade;
	}

	public void setMGrade(String MGrade)
	{
		this.MGrade = MGrade;
	}

	public String getMEducationBackground()
	{
		return this.MEducationBackground;
	}

	public void setMEducationBackground(String MEducationBackground)
	{
		this.MEducationBackground = MEducationBackground;
	}

	public Boolean getMStudents()
	{
		return this.MStudents;
	}

	public void setMStudents(Boolean MStudents)
	{
		this.MStudents = MStudents;
	}

	public String getMSphone()
	{
		return this.MSphone;
	}

	public void setMSphone(String MSphone)
	{
		this.MSphone = MSphone;
	}

	public String getMLphone()
	{
		return this.MLphone;
	}

	public void setMLphone(String MLphone)
	{
		this.MLphone = MLphone;
	}

	public String getMAddress()
	{
		return this.MAddress;
	}

	public void setMAddress(String MAddress)
	{
		this.MAddress = MAddress;
	}

	public Short getMPostcode()
	{
		return this.MPostcode;
	}

	public void setMPostcode(Short MPostcode)
	{
		this.MPostcode = MPostcode;
	}

	public String getMPhoto()
	{
		return this.MPhoto;
	}

	public void setMPhoto(String MPhoto)
	{
		this.MPhoto = MPhoto;
	}

	public String getMEducationSystem()
	{
		return this.MEducationSystem;
	}

	public void setMEducationSystem(String MEducationSystem)
	{
		this.MEducationSystem = MEducationSystem;
	}


}
