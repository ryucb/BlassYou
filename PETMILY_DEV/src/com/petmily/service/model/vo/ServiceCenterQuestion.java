package com.petmily.service.model.vo;

public class ServiceCenterQuestion {

	private String answerEmail;
	private String userId;
	private String answerContent;
	private String answerYN;
	public ServiceCenterQuestion() {
		// TODO Auto-generated constructor stub
	}
	public ServiceCenterQuestion(String answerEmail, String userId, String answerContent, String answerYN) {
		super();
		this.answerEmail = answerEmail;
		this.userId = userId;
		this.answerContent = answerContent;
		this.answerYN = answerYN;
	}
	public String getAnswerEmail() {
		return answerEmail;
	}
	public void setAnswerEmail(String answerEmail) {
		this.answerEmail = answerEmail;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAnswerContent() {
		return answerContent;
	}
	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}
	public String getAnswerYN() {
		return answerYN;
	}
	public void setAnswerYN(String answerYN) {
		this.answerYN = answerYN;
	}
	@Override
	public String toString() {
		return "ServiceCenterQuestion [answerEmail=" + answerEmail + ", userId=" + userId + ", answerContent="
				+ answerContent + ", answerYN=" + answerYN + "]";
	}
	
}
