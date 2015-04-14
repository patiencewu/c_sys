package org.humanDepartment.humanSystem.action;

import java.sql.Date;
import java.util.Map;

import org.BaseAction;
import org.dao.service.interf.DepartmentemployeeService;
import org.dao.service.interf.DepartmentmanagerService;
import org.dao.service.interf.MembersService;
import org.dao.service.interf.UserpasswordService;
import org.humanDepartment.humanSystem.pojo.Departmentemployee;
import org.humanDepartment.humanSystem.pojo.Departmentmanager;
import org.humanDepartment.humanSystem.pojo.Members;
import org.humanDepartment.humanSystem.pojo.Userpassword;
import org.model.SpringUtil;

public class Register extends BaseAction
{
	/*依赖注入*/
	private UserpasswordService uService;
	/*依赖注入*/
	private MembersService mService;
	private String message;
	private String userName;
	private String password;
	private String name;
	private String sex;
	private String birthDay;
	private String nation;
	private String nativePlace;
	private String pliticsStatus;
	private String lphone;
	private String sphone;
	private String email;
	private String educationBackground;
	private String address;
	private String idNumber;
	private String studentNumber;
	private String school;
	private String college;
	private String department;
	private String major;
	private String clazz;
	private String grade;
	private String educationSystem;
	private String homePhone;
	private String postcode;
	private String homeaddress;
	
	public String enroll() throws Exception
	{
		Userpassword user = uService.findUserById(userName);
		if(user != null) {
			this.message = "账号已经被注册，请换个账号试试";
			return "register";
		}
		
		
		Members member = (Members) SpringUtil.getBean("members");
		member.setMAddress(address);
		member.setMBirthday(birthDay);
		member.setMClass(clazz);
		member.setMCollege(college);
		member.setMDepartment(department);
		member.setMEducationBackground(educationBackground);
//		member.setMEducationSystem(Integer.valueOf(educationSystem));
		member.setMEmail(email);
		member.setMGrade(Integer.valueOf(grade));
		member.setMHomeAddress(homeaddress);
		member.setMIdNumber(idNumber);
		member.setMLphone(lphone);
		member.setMMajor(major);
		member.setMName(name);
		member.setMNation(nation);
		member.setMNativePlace(nativePlace);
//		member.setMPhoto(photo);  TODO 这里以后要添加照片的录入
		member.setMPliticsStatus(pliticsStatus);
		member.setMPostcode(postcode);
		member.setMSchool(school);
		member.setMSex(sex);
		member.setMSphone(sphone);
		member.setMStudentNumber(studentNumber);
//		if(this.school != null || !this.school.equals("")) member.setMStudents(true);
//		else member.setMStudents(false);
		
		int id = mService.add(member);
		
		user = (Userpassword) SpringUtil.getBean("userPassword");
		user.setUpUser(userName);
		user.setUpPower((short) 4);
		user.setUpPassword(password);
		user.setUpId(id);
		uService.addUser(user);
		this.message = "注册成功";
		return "login";
	}

//	老师首次登陆进行信息录入注册
	public String teacherEnroll(){
		Userpassword user = uService.findUserById(userName);
		if(user != null) {
			this.message = "账号已经被注册，请换个账号试试";
			return "teacherDataChange";
		}
		
		Departmentmanager dm = (Departmentmanager) SpringUtil.getBean("departmentManager");
		dm.setDmName(name);
		dm.setDmAddress(address);
		dm.setDmLphone(lphone);
		dm.setDmSphone(sphone);
		dm.setDmEmail(email);
		if(session.get("power").equals(111))
			dm.setDmDepartmentId(1);
		if(session.get("power").equals(112))
			dm.setDmDepartmentId(2);
		if(session.get("power").equals(113))
			dm.setDmDepartmentId(3);
		if(session.get("power").equals(114))
			dm.setDmDepartmentId(4);
		else dm.setDmDepartmentId(0);
		
		DepartmentmanagerService dmService = (DepartmentmanagerService) SpringUtil.getBean("departmentmanagerService");
		
		int id = dmService.add(dm);
		
		user = (Userpassword) SpringUtil.getBean("userPassword");
		user.setUpUser(userName);
		user.setUpPower((short) 2);
		user.setUpPassword(password);
		user.setUpId(id);
		uService.addUser(user);
		uService.delUserById((String) session.get("userName"));
		this.message = "资料修改成功";
		return "login";
	}
	
//	学生管理员首次登陆进行信息录入注册
	public String employeeEnroll(){
		Userpassword user = uService.findUserById(userName);
		if(user != null) {
			this.message = "账号已经被注册，请换个账号试试";
			return "teacherDataChange";
		}
		
		Departmentemployee de = (Departmentemployee) SpringUtil.getBean("departmentEmployee");
		de.setDeAddress(address);
		de.setDeClass(clazz);
		de.setDeCollege(college);
		if(session.get("power").equals(121))
			de.setDeDepartmentId(1);
		if(session.get("power").equals(122))
			de.setDeDepartmentId(2);
		if(session.get("power").equals(123))
			de.setDeDepartmentId(3);
		if(session.get("power").equals(124))
			de.setDeDepartmentId(4);
		else de.setDeDepartmentId(0);
		de.setDeEmail(email);
		de.setDeLphone(lphone);
		de.setDeMajor(major);
		de.setDeName(name);
		de.setDeSex(sex);
		de.setDeSphone(sphone);
		de.setDmBirthday(birthDay);
		
		DepartmentemployeeService deService = (DepartmentemployeeService) SpringUtil.getBean("departmentemployeeService");
		
		int id = deService.add(de);
		
		user = (Userpassword) SpringUtil.getBean("userPassword");
		user.setUpUser(userName);
		user.setUpPower((short) 3);
		user.setUpPassword(password);
		user.setUpId(id);
		uService.addUser(user);
		uService.delUserById((String) session.get("userName"));
		this.message = "资料修改成功";
		return "login";
	}
	
	public String goToRegister(){
		return "register";
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSex()
	{
		return sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}

	public String getBirthDay()
	{
		return birthDay;
	}

	public void setBirthDay(String birthDay)
	{
		this.birthDay = birthDay;
	}

	public String getNation()
	{
		return nation;
	}

	public void setNation(String nation)
	{
		this.nation = nation;
	}

	public String getNativePlace()
	{
		return nativePlace;
	}

	public void setNativePlace(String nativePlace)
	{
		this.nativePlace = nativePlace;
	}

	public String getPliticsStatus()
	{
		return pliticsStatus;
	}

	public void setPliticsStatus(String pliticsStatus)
	{
		this.pliticsStatus = pliticsStatus;
	}

	public String getLphone()
	{
		return lphone;
	}

	public void setLphone(String lphone)
	{
		this.lphone = lphone;
	}

	public String getSphone()
	{
		return sphone;
	}

	public void setSphone(String sphone)
	{
		this.sphone = sphone;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getEducationBackground()
	{
		return educationBackground;
	}

	public void setEducationBackground(String educationBackground)
	{
		this.educationBackground = educationBackground;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getIdNumber()
	{
		return idNumber;
	}

	public void setIdNumber(String idNumber)
	{
		this.idNumber = idNumber;
	}

	public String getStudentNumber()
	{
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber)
	{
		this.studentNumber = studentNumber;
	}

	public String getSchool()
	{
		return school;
	}

	public void setSchool(String school)
	{
		this.school = school;
	}

	public String getCollege()
	{
		return college;
	}

	public void setCollege(String college)
	{
		this.college = college;
	}

	public String getDepartment()
	{
		return department;
	}

	public void setDepartment(String department)
	{
		this.department = department;
	}

	public String getMajor()
	{
		return major;
	}

	public void setMajor(String major)
	{
		this.major = major;
	}

	public String getClazz()
	{
		return clazz;
	}

	public void setClazz(String clazz)
	{
		this.clazz = clazz;
	}

	public void setGrade(String grade)
	{
		this.grade = grade;
	}

	public void setEducationSystem(String educationSystem)
	{
		this.educationSystem = educationSystem;
	}

	public String getHomePhone()
	{
		return homePhone;
	}

	public void setHomePhone(String homePhone)
	{
		this.homePhone = homePhone;
	}

	public String getPostcode()
	{
		return postcode;
	}

	public void setPostcode(String postcode)
	{
		this.postcode = postcode;
	}

	public String getHomeaddress()
	{
		return homeaddress;
	}

	public void setHomeaddress(String homeaddress)
	{
		this.homeaddress = homeaddress;
	}

	public void setuService(UserpasswordService uService)
	{
		this.uService = uService;
	}

	public void setmService(MembersService mService)
	{
		this.mService = mService;
	}

	
	
}
