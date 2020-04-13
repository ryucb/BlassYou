package com.petmily.admin.model.vo;

public class AdminPetsitter {
	
	// 펫시터 정보
	private String userId;
	private String userName;
	private String enrollDate;
	private double star;
	private String userType;
	// 자격증 정보
	private int cerCount;
	private String CERTIFICATE_NAME;
	private String CERTIFICATION_NAME;
	private String DATE_OF_ACQUISITION;
	private String EXPIRATION_DATE;
	private String CERTIFICATE_FILENAME;
	
	public AdminPetsitter() {
		// TODO Auto-generated constructor stub
	}
	
	public int getCerCount() {
		return cerCount;
	}
	
	public void setCerCount(int cerCount) {
		this.cerCount = cerCount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}

	public double getStar() {
		return star;
	}

	public void setStar(double star) {
		this.star = star;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getCERTIFICATE_NAME() {
		return CERTIFICATE_NAME;
	}

	public void setCERTIFICATE_NAME(String cERTIFICATE_NAME) {
		CERTIFICATE_NAME = cERTIFICATE_NAME;
	}

	public String getCERTIFICATION_NAME() {
		return CERTIFICATION_NAME;
	}

	public void setCERTIFICATION_NAME(String cERTIFICATION_NAME) {
		CERTIFICATION_NAME = cERTIFICATION_NAME;
	}

	public String getDATE_OF_ACQUISITION() {
		return DATE_OF_ACQUISITION;
	}

	public void setDATE_OF_ACQUISITION(String dATE_OF_ACQUISITION) {
		DATE_OF_ACQUISITION = dATE_OF_ACQUISITION;
	}

	public String getEXPIRATION_DATE() {
		return EXPIRATION_DATE;
	}

	public void setEXPIRATION_DATE(String eXPIRATION_DATE) {
		EXPIRATION_DATE = eXPIRATION_DATE;
	}

	public String getCERTIFICATE_FILENAME() {
		return CERTIFICATE_FILENAME;
	}

	public void setCERTIFICATE_FILENAME(String cERTIFICATE_FILENAME) {
		CERTIFICATE_FILENAME = cERTIFICATE_FILENAME;
	}

	@Override
	public String toString() {
		return "AdminPetsitter [userId=" + userId + ", userName=" + userName + ", enrollDate=" + enrollDate + ", star="
				+ star + ", userType=" + userType + ", cerCount=" + cerCount + ", CERTIFICATE_NAME=" + CERTIFICATE_NAME
				+ ", CERTIFICATION_NAME=" + CERTIFICATION_NAME + ", DATE_OF_ACQUISITION=" + DATE_OF_ACQUISITION
				+ ", EXPIRATION_DATE=" + EXPIRATION_DATE + ", CERTIFICATE_FILENAME=" + CERTIFICATE_FILENAME + "]";
	}
	
	

}
