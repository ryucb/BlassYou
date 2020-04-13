package com.petmily.petsitter.model.vo;

public class PetSitterBookmark {

	private String userId;
	private String petSitterId;
	public PetSitterBookmark() {
		// TODO Auto-generated constructor stub
	}
	public PetSitterBookmark(String userId, String petSitterId) {
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
	
}
