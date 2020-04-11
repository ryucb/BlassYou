package com.petmily.reservation.model.vo;

public class Chatting {

	private int reservationCode;
	private String userId;
	private String petSitterId;
	private String chatData;
	private String chatDate;
	private String chatYN;
	public Chatting() {
		// TODO Auto-generated constructor stub
	}
	public Chatting(int reservationCode, String userId, String petSitterId, String chatData, String chatDate,
			String chatYN) {
		super();
		this.reservationCode = reservationCode;
		this.userId = userId;
		this.petSitterId = petSitterId;
		this.chatData = chatData;
		this.chatDate = chatDate;
		this.chatYN = chatYN;
	}
	public int getReservationCode() {
		return reservationCode;
	}
	public void setReservationCode(int reservationCode) {
		this.reservationCode = reservationCode;
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
	public String getChatData() {
		return chatData;
	}
	public void setChatData(String chatData) {
		this.chatData = chatData;
	}
	public String getChatDate() {
		return chatDate;
	}
	public void setChatDate(String chatDate) {
		this.chatDate = chatDate;
	}
	public String getChatYN() {
		return chatYN;
	}
	public void setChatYN(String chatYN) {
		this.chatYN = chatYN;
	}
	@Override
	public String toString() {
		return "Chatting [reservationCode=" + reservationCode + ", userId=" + userId + ", petSitterId=" + petSitterId
				+ ", chatData=" + chatData + ", chatDate=" + chatDate + ", chatYN=" + chatYN + "]";
	}
	
}
