package com.petmily.user.model.vo;

public class UserBookMark {
	private String userId;
	private String petSitterId;
	
	public UserBookMark() { }

	public UserBookMark(String userId, String petSitterId) {
		super();
		this.userId = userId;
		this.petSitterId = petSitterId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPetSitterId() {
		return petSitterId;
	}

	public void setPetSitterId(String petSitterId) {
		this.petSitterId = petSitterId;
	}

	@Override
	public String toString() {
		return "UserBookMark [userId=" + userId + ", petSitterId=" + petSitterId + "]";
	}
	
	
}
