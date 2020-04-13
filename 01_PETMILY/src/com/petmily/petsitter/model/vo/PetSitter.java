package com.petmily.petsitter.model.vo;

public class PetSitter {

	private String petSitterId;
	private String certificateYN;
	private String petSitterJob;
	private String petSitterFamily;
	private String petSitterKeeppets;
	private String petSitterActivity;
	private String bankName;
	private String accountNumber;
	private String petSitterType;
	private String petSitterImg;
	public PetSitter() {
		// TODO Auto-generated constructor stub
	}
	public PetSitter(String petSitterId, String certificateYN, String petSitterJob, String petSitterFamily,
			String petSitterKeeppets, String petSitterActivity, String bankName, String accountNumber,
			String petSitterType, String petSitterImg) {
		super();
		this.petSitterId = petSitterId;
		this.certificateYN = certificateYN;
		this.petSitterJob = petSitterJob;
		this.petSitterFamily = petSitterFamily;
		this.petSitterKeeppets = petSitterKeeppets;
		this.petSitterActivity = petSitterActivity;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.petSitterType = petSitterType;
		this.petSitterImg = petSitterImg;
	}
	public String getPetSitterId() {
		return petSitterId;
	}
	public void setPetSitterId(String petSitterId) {
		this.petSitterId = petSitterId;
	}
	public String getCertificateYN() {
		return certificateYN;
	}
	public void setCertificateYN(String certificateYN) {
		this.certificateYN = certificateYN;
	}
	public String getPetSitterJob() {
		return petSitterJob;
	}
	public void setPetSitterJob(String petSitterJob) {
		this.petSitterJob = petSitterJob;
	}
	public String getPetSitterFamily() {
		return petSitterFamily;
	}
	public void setPetSitterFamily(String petSitterFamily) {
		this.petSitterFamily = petSitterFamily;
	}
	public String getPetSitterKeeppets() {
		return petSitterKeeppets;
	}
	public void setPetSitterKeeppets(String petSitterKeeppets) {
		this.petSitterKeeppets = petSitterKeeppets;
	}
	public String getPetSitterActivity() {
		return petSitterActivity;
	}
	public void setPetSitterActivity(String petSitterActivity) {
		this.petSitterActivity = petSitterActivity;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPetSitterType() {
		return petSitterType;
	}
	public void setPetSitterType(String petSitterType) {
		this.petSitterType = petSitterType;
	}
	public String getPetSitterImg() {
		return petSitterImg;
	}
	public void setPetSitterImg(String petSitterImg) {
		this.petSitterImg = petSitterImg;
	}
	@Override
	public String toString() {
		return "PetSitter [petSitterId=" + petSitterId + ", certificateYN=" + certificateYN + ", petSitterJob="
				+ petSitterJob + ", petSitterFamily=" + petSitterFamily + ", petSitterKeeppets=" + petSitterKeeppets
				+ ", petSitterActivity=" + petSitterActivity + ", bankName=" + bankName + ", accountNumber="
				+ accountNumber + ", petSitterType=" + petSitterType + ", petSitterImg=" + petSitterImg + "]";
	}
	
	
}
