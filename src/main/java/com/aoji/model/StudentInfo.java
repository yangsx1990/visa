package com.aoji.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Table(name = "student_info")
public class StudentInfo
{
	/**主键id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**内网学号*/
    @Column(name ="SYSTEM_NO")
	private String systemNo;
	/**学生姓名*/
    @Column(name ="NAME")
	private String name;

    /**姓名拼音**/
    @Column(name="pinyin")
    private String pinyin;
	/**性别*/
    @Column(name ="GENDER")
	private Integer gender;
	/**出生日期*/
    @Column(name ="BIRTHDAY")
	private Date birthday;
	/**家庭住址*/
	@Column(name ="ADDRESS")
	private String address;
 	/**移动电话*/
    @Column(name ="MOBILE")
	private String mobile;
	/**固定电话*/
    @Column(name ="FIXED_PHONE")
	private String fixedPhone;
	/**邮政编码*/
    @Column(name ="POSTALCODE")
	private String postalcode;
	/**qq号*/
    @Column(name ="QQ_NUMBER")
	private String qqNumber;
	/**微信号*/
    @Column(name ="WEICHAT_NUMBER")
	private String weichatNumber;
	/**邮箱*/
    @Column(name ="EMAIL")
	private String email;
	/**分支机构id*/
    @Column(name ="BRANCH_ID")
	private Integer branchId;
	/**是否为vip用户：0-否 1-是*/
    @Column(name ="VIP_STATUS")
	private Integer vipStatus;
	/**是否毕业：0-否 1-是*/
    @Column(name ="GRADUATION_STATUS")
	private Integer graduationStatus;
	/**所在学校*/
    @Column(name ="SCHOOL")
	private String school;
	/**当前学历*/
    @Column(name ="EDUCATION")
	private String education;
	/**专业*/
    @Column(name ="MAJOR")
	private String major;
	/**年级*/
    @Column(name ="GRADE")
	private String grade;
	/**申请账号*/
    @Column(name ="EMAIL_ACCOUNT")
	private String emailAccount;
	/**申请密码*/
    @Column(name ="EMAIL_PASSWORD")
	private String emailPassword;

    /**分支机构名称**/
    @Column(name="branch_name")
	private String branchName;

	/**海外住址**/
    @Column(name="overseas_address")
    private String overseasAddress;

	/**海外联系方式**/
	@Column(name="overseas_phone")
	private String overseasPhone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSystemNo() {
		return systemNo;
	}

	public void setSystemNo(String systemNo) {
		this.systemNo = systemNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFixedPhone() {
		return fixedPhone;
	}

	public void setFixedPhone(String fixedPhone) {
		this.fixedPhone = fixedPhone;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getQqNumber() {
		return qqNumber;
	}

	public void setQqNumber(String qqNumber) {
		this.qqNumber = qqNumber;
	}

	public String getWeichatNumber() {
		return weichatNumber;
	}

	public void setWeichatNumber(String weichatNumber) {
		this.weichatNumber = weichatNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getBranchId() {
		return branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public Integer getVipStatus() {
		return vipStatus;
	}

	public void setVipStatus(Integer vipStatus) {
		this.vipStatus = vipStatus;
	}

	public Integer getGraduationStatus() {
		return graduationStatus;
	}

	public void setGraduationStatus(Integer graduationStatus) {
		this.graduationStatus = graduationStatus;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getEmailAccount() {
		return emailAccount;
	}

	public void setEmailAccount(String emailAccount) {
		this.emailAccount = emailAccount;
	}

	public String getEmailPassword() {
		return emailPassword;
	}

	public void setEmailPassword(String emailPassword) {
		this.emailPassword = emailPassword;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getOverseasAddress() {
		return overseasAddress;
	}

	public void setOverseasAddress(String overseasAddress) {
		this.overseasAddress = overseasAddress;
	}

	public String getOverseasPhone() {
		return overseasPhone;
	}

	public void setOverseasPhone(String overseasPhone) {
		this.overseasPhone = overseasPhone;
	}
}
