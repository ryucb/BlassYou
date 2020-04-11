package com.petmily.user.model.vo;

public class PetSitter2 {
	
	//펫시터 회원가입 아이디
	private String petsitterId;
	//펫시터 회원가입 비밀번호
	private String password;
	//펫시터 회원가입 프로필 이미지
	private String sitterImg;
	//펫시터 회원가입 이름
	private String sitterName;
	//펫시터 회원가입 이메일
	private String sitterEmail;
	//펫시터 회원가입 생년월일
	private String sitterBday;
	//펫시터 회원가입 성별
	private String sitterGender;
	//펫시터 회원가입 휴대폰 번호
	private String sitterPhone;
	//펫시터 회원가입 우편번호
	private String postCode;
	//펫시터 회원가입 주소
	private String sitterAddress;
	//펫시터 회원가입 상세주소
	private String addressDetail;
	//펫시터 회원가입 정산계좌 은행명
	private String bankName;
	//펫시터 회원가입 정산계좌 계좌번호
	private String accountNo;
	//펫시터 회원가입 예금주
	private String accountOwner;
	//펫시터 회원가입 자격증 유무
	private String certificateYN;
	//펫시터 회원가입 자격증 이름
	private String certificateName;
	//펫시터 회원가입 자격증 인증기관
	private String issuingOrg;
	//펫시터 회원가입 자격증 취득일자
	private String certiGetDate;
	//펫시터 회원가입 자격증 만료일자
	private String certiEndDate;
	//펫시터 회원가입 자격증 이미지
	private String certiImg;
	//펫시터 타입 : 미승인펫시터
	private String type;
	//펫시터 지원폼 작성 거주지 유형
	private String residenceValue;
	//펫시터 지원폼 작성 직업
	private String petSitterJob;
	//펫시터 지원폼 가족 구성원 
	private String petSitterFamily;
	//펫시터 지원폼 반려동물 반려 경험 여부
	private String petSitterKeeppets;
	//펫시터 지원폼 펫시터 경력활동 유무
	private String petSitterActivity;
	
	public PetSitter2() {
		// TODO Auto-generated constructor stub
	}

	public PetSitter2(String petsitterId, String password, String sitterImg, String sitterName, String sitterEmail,
			String sitterBday, String sitterGender, String sitterPhone, String postCode, String sitterAddress,
			String addressDetail, String bankName, String accountNo, String accountOwner, String certificateYN,
			String certificateName, String issuingOrg, String certiGetDate, String certiEndDate, String certiImg,
			String type, String residenceValue, String petSitterJob, String petSitterFamily, String petSitterKeeppets,
			String petSitterActivity) {
		super();
		this.petsitterId = petsitterId;
		this.password = password;
		this.sitterImg = sitterImg;
		this.sitterName = sitterName;
		this.sitterEmail = sitterEmail;
		this.sitterBday = sitterBday;
		this.sitterGender = sitterGender;
		this.sitterPhone = sitterPhone;
		this.postCode = postCode;
		this.sitterAddress = sitterAddress;
		this.addressDetail = addressDetail;
		this.bankName = bankName;
		this.accountNo = accountNo;
		this.accountOwner = accountOwner;
		this.certificateYN = certificateYN;
		this.certificateName = certificateName;
		this.issuingOrg = issuingOrg;
		this.certiGetDate = certiGetDate;
		this.certiEndDate = certiEndDate;
		this.certiImg = certiImg;
		this.type = type;
		this.residenceValue = residenceValue;
		this.petSitterJob = petSitterJob;
		this.petSitterFamily = petSitterFamily;
		this.petSitterKeeppets = petSitterKeeppets;
		this.petSitterActivity = petSitterActivity;
	}

	public String getPetsitterId() {
		return petsitterId;
	}

	public void setPetsitterId(String petsitterId) {
		this.petsitterId = petsitterId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSitterImg() {
		return sitterImg;
	}

	public void setSitterImg(String sitterImg) {
		this.sitterImg = sitterImg;
	}

	public String getSitterName() {
		return sitterName;
	}

	public void setSitterName(String sitterName) {
		this.sitterName = sitterName;
	}

	public String getSitterEmail() {
		return sitterEmail;
	}

	public void setSitterEmail(String sitterEmail) {
		this.sitterEmail = sitterEmail;
	}

	public String getSitterBday() {
		return sitterBday;
	}

	public void setSitterBday(String sitterBday) {
		this.sitterBday = sitterBday;
	}

	public String getSitterGender() {
		return sitterGender;
	}

	public void setSitterGender(String sitterGender) {
		this.sitterGender = sitterGender;
	}

	public String getSitterPhone() {
		return sitterPhone;
	}

	public void setSitterPhone(String sitterPhone) {
		this.sitterPhone = sitterPhone;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getSitterAddress() {
		return sitterAddress;
	}

	public void setSitterAddress(String sitterAddress) {
		this.sitterAddress = sitterAddress;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public String getCertificateYN() {
		return certificateYN;
	}

	public void setCertificateYN(String certificateYN) {
		this.certificateYN = certificateYN;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getIssuingOrg() {
		return issuingOrg;
	}

	public void setIssuingOrg(String issuingOrg) {
		this.issuingOrg = issuingOrg;
	}

	public String getCertiGetDate() {
		return certiGetDate;
	}

	public void setCertiGetDate(String certiGetDate) {
		this.certiGetDate = certiGetDate;
	}

	public String getCertiEndDate() {
		return certiEndDate;
	}

	public void setCertiEndDate(String certiEndDate) {
		this.certiEndDate = certiEndDate;
	}

	public String getCertiImg() {
		return certiImg;
	}

	public void setCertiImg(String certiImg) {
		this.certiImg = certiImg;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getResidenceValue() {
		return residenceValue;
	}

	public void setResidenceValue(String residenceValue) {
		this.residenceValue = residenceValue;
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

	@Override
	public String toString() {
		return "PetSitter [petsitterId=" + petsitterId + ", password=" + password + ", sitterImg=" + sitterImg
				+ ", sitterName=" + sitterName + ", sitterEmail=" + sitterEmail + ", sitterBday=" + sitterBday
				+ ", sitterGender=" + sitterGender + ", sitterPhone=" + sitterPhone + ", postCode=" + postCode
				+ ", sitterAddress=" + sitterAddress + ", addressDetail=" + addressDetail + ", bankName=" + bankName
				+ ", accountNo=" + accountNo + ", accountOwner=" + accountOwner + ", certificateYN=" + certificateYN
				+ ", certificateName=" + certificateName + ", issuingOrg=" + issuingOrg + ", certiGetDate="
				+ certiGetDate + ", certiEndDate=" + certiEndDate + ", certiImg=" + certiImg + ", type=" + type
				+ ", residenceValue=" + residenceValue + ", petSitterJob=" + petSitterJob + ", petSitterFamily="
				+ petSitterFamily + ", petSitterKeeppets=" + petSitterKeeppets + ", petSitterActivity="
				+ petSitterActivity + "]";
	}


}
