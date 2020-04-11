package com.petmily.blind.model.vo;

public class BlindRequest {

	private String userId;
	private String petSitterId;
	private int userReviewNo;
	private int petSitterReviewNo;
	private int boardNo;
	private String blindText;
	private String blindType;
	public BlindRequest() {
		// TODO Auto-generated constructor stub
	}
	public BlindRequest(String userId, String petSitterId, int userReviewNo, int petSitterReviewNo, int boardNo,
			String blindText, String blindType) {
		super();
		this.userId = userId;
		this.petSitterId = petSitterId;
		this.userReviewNo = userReviewNo;
		this.petSitterReviewNo = petSitterReviewNo;
		this.boardNo = boardNo;
		this.blindText = blindText;
		this.blindType = blindType;
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
	public int getUserReviewNo() {
		return userReviewNo;
	}
	public void setUserReviewNo(int userReviewNo) {
		this.userReviewNo = userReviewNo;
	}
	public int getPetSitterReviewNo() {
		return petSitterReviewNo;
	}
	public void setPetSitterReviewNo(int petSitterReviewNo) {
		this.petSitterReviewNo = petSitterReviewNo;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBlindText() {
		return blindText;
	}
	public void setBlindText(String blindText) {
		this.blindText = blindText;
	}
	public String getBlindType() {
		return blindType;
	}
	public void setBlindType(String blindType) {
		this.blindType = blindType;
	}
	@Override
	public String toString() {
		return "BlindRequest [userId=" + userId + ", petSitterId=" + petSitterId + ", userReviewNo=" + userReviewNo
				+ ", petSitterReviewNo=" + petSitterReviewNo + ", boardNo=" + boardNo + ", blindText=" + blindText
				+ ", blindType=" + blindType + "]";
	}
	
}
