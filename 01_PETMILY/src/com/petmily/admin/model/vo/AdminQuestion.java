package com.petmily.admin.model.vo;

public class AdminQuestion {
	
	private String userId;
	private String emailTitle;
	private String sendEmail;
	private String queYN;
	private String emailDate;
	
	public AdminQuestion() {
		// TODO Auto-generated constructor stub
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmailTitle() {
		return emailTitle;
	}

	public void setEmailTitle(String emailTitle) {
		this.emailTitle = emailTitle;
	}

	public String getSendEmail() {
		return sendEmail;
	}

	public void setSendEmail(String sendEmail) {
		this.sendEmail = sendEmail;
	}

	public String getQueYN() {
		return queYN;
	}

	public void setQueYN(String queYN) {
		this.queYN = queYN;
	}

	public String getEmailDate() {
		return emailDate;
	}

	public void setEmailDate(String emailDate) {
		this.emailDate = emailDate;
	}

	@Override
	public String toString() {
		return "AdminQuestion [userId=" + userId + ", emailTitle=" + emailTitle + ", sendEmail=" + sendEmail
				+ ", queYN=" + queYN + ", emailDate=" + emailDate + "]";
	}
	
	
	

}
