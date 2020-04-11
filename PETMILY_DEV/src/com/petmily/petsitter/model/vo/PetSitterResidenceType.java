package com.petmily.petsitter.model.vo;

public class PetSitterResidenceType {
	
	private String petSitterId;
	private String residenceValue;
	public PetSitterResidenceType() {
		// TODO Auto-generated constructor stub
	}
	public PetSitterResidenceType(String petSitterId, String residenceValue) {
		super();
		this.petSitterId = petSitterId;
		this.residenceValue = residenceValue;
	}
	public String getPetSitterId() {
		return petSitterId;
	}
	public void setPetSitterId(String petSitterId) {
		this.petSitterId = petSitterId;
	}
	public String getResidenceValue() {
		return residenceValue;
	}
	public void setResidenceValue(String residenceValue) {
		this.residenceValue = residenceValue;
	}
}
