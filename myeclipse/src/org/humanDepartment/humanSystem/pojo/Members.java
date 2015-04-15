package org.humanDepartment.humanSystem.pojo;

/**
 * Members entity. @author MyEclipse Persistence Tools
 */

public class Members implements java.io.Serializable {

	// Fields

	private Integer MId;
	private String MName;
	private String MIdNumber;
	private String MStudentNumber;
	private String MSex;
	private String MBirthday;
	private String MNation;
	private String MNativePlace;
	private String MPliticsStatus;
	private String MSchool;
	private String MCollege;
	private String MDepartment;
	private String MClass;
	private String MMajor;
	private Integer MGrade;
	private String MEducationBackground;
	private Boolean MStudents;
	private String MSphone;
	private String MLphone;
	private String MAddress;
	private String MPostcode;
	private String MPhoto;
	private Integer MEducationSystem;
	private String MEmail;
	private String MHomeAddress;
	private Integer version;
	private String MTeamName;
	private Integer MTeamId;
	private Integer MIsCaptain;

	// Constructors

	/** default constructor */
	public Members() {
	}

	/** full constructor */
	public Members(String MName, String MIdNumber, String MStudentNumber,
			String MSex, String MBirthday, String MNation, String MNativePlace,
			String MPliticsStatus, String MSchool, String MCollege,
			String MDepartment, String MClass, String MMajor, Integer MGrade,
			String MEducationBackground, Boolean MStudents, String MSphone,
			String MLphone, String MAddress, String MPostcode, String MPhoto,
			Integer MEducationSystem, String MEmail, String MHomeAddress,
			Integer version, String MTeamName, Integer MTeamId,
			Integer MIsCaptain) {
		this.MName = MName;
		this.MIdNumber = MIdNumber;
		this.MStudentNumber = MStudentNumber;
		this.MSex = MSex;
		this.MBirthday = MBirthday;
		this.MNation = MNation;
		this.MNativePlace = MNativePlace;
		this.MPliticsStatus = MPliticsStatus;
		this.MSchool = MSchool;
		this.MCollege = MCollege;
		this.MDepartment = MDepartment;
		this.MClass = MClass;
		this.MMajor = MMajor;
		this.MGrade = MGrade;
		this.MEducationBackground = MEducationBackground;
		this.MStudents = MStudents;
		this.MSphone = MSphone;
		this.MLphone = MLphone;
		this.MAddress = MAddress;
		this.MPostcode = MPostcode;
		this.MPhoto = MPhoto;
		this.MEducationSystem = MEducationSystem;
		this.MEmail = MEmail;
		this.MHomeAddress = MHomeAddress;
		this.version = version;
		this.MTeamName = MTeamName;
		this.MTeamId = MTeamId;
		this.MIsCaptain = MIsCaptain;
	}

	// Property accessors

	public Integer getMId() {
		return this.MId;
	}

	public void setMId(Integer MId) {
		this.MId = MId;
	}

	public String getMName() {
		return this.MName;
	}

	public void setMName(String MName) {
		this.MName = MName;
	}

	public String getMIdNumber() {
		return this.MIdNumber;
	}

	public void setMIdNumber(String MIdNumber) {
		this.MIdNumber = MIdNumber;
	}

	public String getMStudentNumber() {
		return this.MStudentNumber;
	}

	public void setMStudentNumber(String MStudentNumber) {
		this.MStudentNumber = MStudentNumber;
	}

	public String getMSex() {
		return this.MSex;
	}

	public void setMSex(String MSex) {
		this.MSex = MSex;
	}

	public String getMBirthday() {
		return this.MBirthday;
	}

	public void setMBirthday(String MBirthday) {
		this.MBirthday = MBirthday;
	}

	public String getMNation() {
		return this.MNation;
	}

	public void setMNation(String MNation) {
		this.MNation = MNation;
	}

	public String getMNativePlace() {
		return this.MNativePlace;
	}

	public void setMNativePlace(String MNativePlace) {
		this.MNativePlace = MNativePlace;
	}

	public String getMPliticsStatus() {
		return this.MPliticsStatus;
	}

	public void setMPliticsStatus(String MPliticsStatus) {
		this.MPliticsStatus = MPliticsStatus;
	}

	public String getMSchool() {
		return this.MSchool;
	}

	public void setMSchool(String MSchool) {
		this.MSchool = MSchool;
	}

	public String getMCollege() {
		return this.MCollege;
	}

	public void setMCollege(String MCollege) {
		this.MCollege = MCollege;
	}

	public String getMDepartment() {
		return this.MDepartment;
	}

	public void setMDepartment(String MDepartment) {
		this.MDepartment = MDepartment;
	}

	public String getMClass() {
		return this.MClass;
	}

	public void setMClass(String MClass) {
		this.MClass = MClass;
	}

	public String getMMajor() {
		return this.MMajor;
	}

	public void setMMajor(String MMajor) {
		this.MMajor = MMajor;
	}

	public Integer getMGrade() {
		return this.MGrade;
	}

	public void setMGrade(Integer MGrade) {
		this.MGrade = MGrade;
	}

	public String getMEducationBackground() {
		return this.MEducationBackground;
	}

	public void setMEducationBackground(String MEducationBackground) {
		this.MEducationBackground = MEducationBackground;
	}

	public Boolean getMStudents() {
		return this.MStudents;
	}

	public void setMStudents(Boolean MStudents) {
		this.MStudents = MStudents;
	}

	public String getMSphone() {
		return this.MSphone;
	}

	public void setMSphone(String MSphone) {
		this.MSphone = MSphone;
	}

	public String getMLphone() {
		return this.MLphone;
	}

	public void setMLphone(String MLphone) {
		this.MLphone = MLphone;
	}

	public String getMAddress() {
		return this.MAddress;
	}

	public void setMAddress(String MAddress) {
		this.MAddress = MAddress;
	}

	public String getMPostcode() {
		return this.MPostcode;
	}

	public void setMPostcode(String MPostcode) {
		this.MPostcode = MPostcode;
	}

	public String getMPhoto() {
		return this.MPhoto;
	}

	public void setMPhoto(String MPhoto) {
		this.MPhoto = MPhoto;
	}

	public Integer getMEducationSystem() {
		return this.MEducationSystem;
	}

	public void setMEducationSystem(Integer MEducationSystem) {
		this.MEducationSystem = MEducationSystem;
	}

	public String getMEmail() {
		return this.MEmail;
	}

	public void setMEmail(String MEmail) {
		this.MEmail = MEmail;
	}

	public String getMHomeAddress() {
		return this.MHomeAddress;
	}

	public void setMHomeAddress(String MHomeAddress) {
		this.MHomeAddress = MHomeAddress;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getMTeamName() {
		return this.MTeamName;
	}

	public void setMTeamName(String MTeamName) {
		this.MTeamName = MTeamName;
	}

	public Integer getMTeamId() {
		return this.MTeamId;
	}

	public void setMTeamId(Integer MTeamId) {
		this.MTeamId = MTeamId;
	}

	public Integer getMIsCaptain() {
		return this.MIsCaptain;
	}

	public void setMIsCaptain(Integer MIsCaptain) {
		this.MIsCaptain = MIsCaptain;
	}

}