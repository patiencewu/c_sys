package org.humanDepartment.humanSystem.pojo;

/**
 * Userpassword entity. @author MyEclipse Persistence Tools
 */

public class Userpassword implements java.io.Serializable {

	// Fields

	private String upUser;
	private String upPassword;
	private Integer upId;
	private Short upPower;
	private Integer version;

	// Constructors

	/** default constructor */
	public Userpassword() {
	}

	/** minimal constructor */
	public Userpassword(String upUser, String upPassword, Short upPower) {
		this.upUser = upUser;
		this.upPassword = upPassword;
		this.upPower = upPower;
	}

	/** full constructor */
	public Userpassword(String upUser, String upPassword, Integer upId,
			Short upPower, Integer version) {
		this.upUser = upUser;
		this.upPassword = upPassword;
		this.upId = upId;
		this.upPower = upPower;
		this.version = version;
	}

	// Property accessors

	public String getUpUser() {
		return this.upUser;
	}

	public void setUpUser(String upUser) {
		this.upUser = upUser;
	}

	public String getUpPassword() {
		return this.upPassword;
	}

	public void setUpPassword(String upPassword) {
		this.upPassword = upPassword;
	}

	public Integer getUpId() {
		return this.upId;
	}

	public void setUpId(Integer upId) {
		this.upId = upId;
	}

	public Short getUpPower() {
		return this.upPower;
	}

	public void setUpPower(Short upPower) {
		this.upPower = upPower;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}