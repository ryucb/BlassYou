package com.petmily.service.model.vo;

public class ServiceCenter {

	private int scCode;
	private int scQuestion;
	private String scAnswer;
	public ServiceCenter() {
		// TODO Auto-generated constructor stub
	}
	public ServiceCenter(int scCode, int scQuestion, String scAnswer) {
		super();
		this.scCode = scCode;
		this.scQuestion = scQuestion;
		this.scAnswer = scAnswer;
	}
	public int getScCode() {
		return scCode;
	}
	public void setScCode(int scCode) {
		this.scCode = scCode;
	}
	public int getScQuestion() {
		return scQuestion;
	}
	public void setScQuestion(int scQuestion) {
		this.scQuestion = scQuestion;
	}
	public String getScAnswer() {
		return scAnswer;
	}
	public void setScAnswer(String scAnswer) {
		this.scAnswer = scAnswer;
	}
	@Override
	public String toString() {
		return "ServiceCenter [scCode=" + scCode + ", scQuestion=" + scQuestion + ", scAnswer=" + scAnswer + "]";
	}
	
	
}
