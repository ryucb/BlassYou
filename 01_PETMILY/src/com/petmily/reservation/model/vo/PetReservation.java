package com.petmily.reservation.model.vo;

public class PetReservation {

	private int reservationCode;
	private String sitterName;
	private String petSitterId;
	private String userId;
	private int boardNo;
	private String checkIn;
	private String checkOut;
	private String careType;
	private String petType;
	private int petBath;
	private String petMedication;
	private String petPickup;
	private String plusQuestion;
	private String priceEndDate;
	private int price;
	private String resType;
	private String boardTitle;
	private int small;
	private int middle;
	private int big;
	private String address;
	private String comment;
	private String boardBlind;
	
	public PetReservation() {
		// TODO Auto-generated constructor stub
	}

	public PetReservation(int reservationCode, String sitterName, String petSitterId, String userId, int boardNo,
			String checkIn, String checkOut, String careType, String petType, int petBath, String petMedication,
			String petPickup, String plusQuestion, String priceEndDate, int price, String resType, String boardTitle,
			int small, int middle, int big, String address, String comment, String boardBlind) {
		super();
		this.reservationCode = reservationCode;
		this.sitterName = sitterName;
		this.petSitterId = petSitterId;
		this.userId = userId;
		this.boardNo = boardNo;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.careType = careType;
		this.petType = petType;
		this.petBath = petBath;
		this.petMedication = petMedication;
		this.petPickup = petPickup;
		this.plusQuestion = plusQuestion;
		this.priceEndDate = priceEndDate;
		this.price = price;
		this.resType = resType;
		this.boardTitle = boardTitle;
		this.small = small;
		this.middle = middle;
		this.big = big;
		this.address = address;
		this.comment = comment;
		this.boardBlind = boardBlind;
	}

	public String getSitterName() {
		return sitterName;
	}

	public void setSitterName(String sitterName) {
		this.sitterName = sitterName;
	}

	public int getReservationCode() {
		return reservationCode;
	}
	public void setReservationCode(int reservationCode) {
		this.reservationCode = reservationCode;
	}
	public String getPetSitterId() {
		return petSitterId;
	}
	public void setPetSitterId(String petSitterId) {
		this.petSitterId = petSitterId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	public String getCareType() {
		return careType;
	}
	public void setCareType(String careType) {
		this.careType = careType;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public int getPetBath() {
		return petBath;
	}
	public void setPetBath(int petBath) {
		this.petBath = petBath;
	}
	public String getPetMedication() {
		return petMedication;
	}
	public void setPetMedication(String petMedication) {
		this.petMedication = petMedication;
	}
	public String getPetPickup() {
		return petPickup;
	}
	public void setPetPickup(String petPickup) {
		this.petPickup = petPickup;
	}
	public String getPlusQuestion() {
		return plusQuestion;
	}
	public void setPlusQuestion(String plusQuestion) {
		this.plusQuestion = plusQuestion;
	}
	public String getPriceEndDate() {
		return priceEndDate;
	}
	public void setPriceEndDate(String priceEndDate) {
		this.priceEndDate = priceEndDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getResType() {
		return resType;
	}
	public void setResType(String resType) {
		this.resType = resType;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public int getSmall() {
		return small;
	}
	public void setSmall(int small) {
		this.small = small;
	}
	public int getMiddle() {
		return middle;
	}
	public void setMiddle(int middle) {
		this.middle = middle;
	}
	public int getBig() {
		return big;
	}
	public void setBig(int big) {
		this.big = big;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getBoardBlind() {
		return boardBlind;
	}
	public void setBoardBlind(String boardBlind) {
		this.boardBlind = boardBlind;
	}
	@Override
	public String toString() {
		return "PetReservation [reservationCode=" + reservationCode + ", petSitterId=" + petSitterId + ", userId="
				+ userId + ", boardNo=" + boardNo + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", careType="
				+ careType + ", petType=" + petType + ", petBath=" + petBath + ", petMedication=" + petMedication
				+ ", petPickup=" + petPickup + ", plusQuestion=" + plusQuestion + ", priceEndDate=" + priceEndDate
				+ ", price=" + price + ", resType=" + resType + ", boardTitle=" + boardTitle + ", small=" + small
				+ ", middle=" + middle + ", big=" + big + ", address=" + address + ", comment=" + comment
				+ ", boardBlind=" + boardBlind + "]";
	}
	
	
	
}
