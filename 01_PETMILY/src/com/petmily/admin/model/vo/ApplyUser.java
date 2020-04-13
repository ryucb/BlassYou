package com.petmily.admin.model.vo;

public class ApplyUser {
	
	private String userid;
	private String name;
	private String enrollDate;
	
	public ApplyUser() {
		// TODO Auto-generated constructor stub
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}

	@Override
	public String toString() {
		return "ApplyUser [userid=" + userid + ", name=" + name + ", enrollDate=" + enrollDate + "]";
	}
	
	

}
