package com.petmily.admin.model.vo;

public class AdminUser {
	
	private String userId;
	private String userName;
	private String userBirth;
	private double StarCount;
	private int BlindCount;
	
	public AdminUser() {
		// TODO Auto-generated constructor stub
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

	public String getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}

	public double getStarCount() {
		return StarCount;
	}

	public void setStarCount(double starCount) {
		StarCount = starCount;
	}

	public int getBlindCount() {
		return BlindCount;
	}

	public void setBlindCount(int blindCount) {
		BlindCount = blindCount;
	}

	@Override
	public String toString() {
		return "AdminUser [userId=" + userId + ", userName=" + userName + ", userBirth=" + userBirth + ", StarCount="
				+ StarCount + ", BlindCount=" + BlindCount + "]";
	}

	
	
	
	

}
