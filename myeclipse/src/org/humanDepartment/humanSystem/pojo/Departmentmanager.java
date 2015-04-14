package org.humanDepartment.humanSystem.pojo;

/**
 * Departmentmanager entity. @author MyEclipse Persistence Tools
 */

public class Departmentmanager implements java.io.Serializable {

	// Fields

	private Integer dmId;
	private String dmName;
	private String dmSex;
	private String dmBirthday;
	private String dmLphone;
	private String dmSphone;
	private String dmEmail;
	private String dmAddress;
	private String dmOtherContactInformation;
	private String dmPhoto;
	private String dmPostcode;
	private Integer dmDepartmentId;
	private Integer version;

	// Constructors

	/** default constructor */
	public Departmentmanager() {
	}

	/** full constructor */
	public Departmentmanager(String dmName, String dmSex, String dmBirthday,
			String dmLphone, String dmSphone, String dmEmail, String dmAddress,
			String dmOtherContactInformation, String dmPhoto,
			String dmPostcode, Integer dmDepartmentId, Integer version) {
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
		this.dmDepartmentId = dmDepartmentId;
		this.version = version;
	}

	// Property accessors

	public Integer getDmId() {
		return this.dmId;
	}

	public void setDmId(Integer dmId) {
		this.dmId = dmId;
	}

	public String getDmName() {
		return this.dmName;
	}

	public void setDmName(String dmName) {
		this.dmName = dmName;
	}

	public String getDmSex() {
		return this.dmSex;
	}

	public void setDmSex(String dmSex) {
		this.dmSex = dmSex;
	}

	public String getDmBirthday() {
		return this.dmBirthday;
	}

	public void setDmBirthday(String dmBirthday) {
		this.dmBirthday = dmBirthday;
	}

	public String getDmLphone() {
		return this.dmLphone;
	}

	public void setDmLphone(String dmLphone) {
		this.dmLphone = dmLphone;
	}

	public String getDmSphone() {
		return this.dmSphone;
	}

	public void setDmSphone(String dmSphone) {
		this.dmSphone = dmSphone;
	}

	public String getDmEmail() {
		return this.dmEmail;
	}

	public void setDmEmail(String dmEmail) {
		this.dmEmail = dmEmail;
	}

	public String getDmAddress() {
		return this.dmAddress;
	}

	public void setDmAddress(String dmAddress) {
		this.dmAddress = dmAddress;
	}

	public String getDmOtherContactInformation() {
		return this.dmOtherContactInformation;
	}

	public void setDmOtherContactInformation(String dmOtherContactInformation) {
		this.dmOtherContactInformation = dmOtherContactInformation;
	}

	public String getDmPhoto() {
		return this.dmPhoto;
	}

	public void setDmPhoto(String dmPhoto) {
		this.dmPhoto = dmPhoto;
	}

	public String getDmPostcode() {
		return this.dmPostcode;
	}

	public void setDmPostcode(String dmPostcode) {
		this.dmPostcode = dmPostcode;
	}

	public Integer getDmDepartmentId() {
		return this.dmDepartmentId;
	}

	public void setDmDepartmentId(Integer dmDepartmentId) {
		this.dmDepartmentId = dmDepartmentId;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}