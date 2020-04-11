package com.petmily.admin.model.vo;

public class User {

	private String userId;
	private String password;
	private String userName;
	private String userBirth;
	private String phone;
	private String zipCode;
	private String address;
	private String detAddress;
	private String email;
	private String gender;
	private String status;
	private String userType;
	private String bellRes;
	private String bellChatt;
	private String enrollDate;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDetAddress() {
		return detAddress;
	}
	public void setDetAddress(String detAddress) {
		this.detAddress = detAddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getBellRes() {
		return bellRes;
	}
	public void setBellRes(String bellRes) {
		this.bellRes = bellRes;
	}
	public String getBellChatt() {
		return bellChatt;
	}
	public void setBellChatt(String bellChatt) {
		this.bellChatt = bellChatt;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", userName=" + userName + ", userBirth="
				+ userBirth + ", phone=" + phone + ", zipCode=" + zipCode + ", address=" + address + ", detAddress="
				+ detAddress + ", email=" + email + ", gender=" + gender + ", status=" + status + ", userType="
				+ userType + ", bellRes=" + bellRes + ", bellChatt=" + bellChatt + ", enrollDate=" + enrollDate + "]";
	}
	
	

}