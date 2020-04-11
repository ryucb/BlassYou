package com.petmily.petsitter.model.vo;

public class PetSitterSchedule {

	private String petSitterID;
	private String scheduleDateOff;
	public PetSitterSchedule() {
		// TODO Auto-generated constructor stub
	}
	public PetSitterSchedule(String petSitterID, String scheduleDateOff) {
		super();
		this.petSitterID = petSitterID;
		this.scheduleDateOff = scheduleDateOff;
	}
	public String getPetSitterID() {
		return petSitterID;
	}
	public void setPetSitterID(String petSitterID) {
		this.petSitterID = petSitterID;
	}
	public String getScheduleDateOff() {
		return scheduleDateOff;
	}
	public void setScheduleDateOff(String scheduleDateOff) {
		this.scheduleDateOff = scheduleDateOff;
	}
	@Override
	public String toString() {
		return "PetSitterSchedule [petSitterID=" + petSitterID + ", scheduleDateOff=" + scheduleDateOff + "]";
	}
	
}
