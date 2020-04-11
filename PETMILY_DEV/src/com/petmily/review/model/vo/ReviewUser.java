package com.petmily.review.model.vo;

public class ReviewUser {
	
	private int petSitterReviewNo;
	private String userId;
	private int reservationCode;
	private String petSitterId;
	private String reviewText;
	private String reviewStar;
	private String reviewDate;
	public ReviewUser() {
		// TODO Auto-generated constructor stub
	}
	public ReviewUser(int petSitterReviewNo, String userId, int reservationCode, String petSitterId, String reviewText,
			String reviewStar, String reviewDate) {
		super();
		this.petSitterReviewNo = petSitterReviewNo;
		this.userId = userId;
		this.reservationCode = reservationCode;
		this.petSitterId = petSitterId;
		this.reviewText = reviewText;
		this.reviewStar = reviewStar;
		this.reviewDate = reviewDate;
	}
	public int getPetSitterReviewNo() {
		return petSitterReviewNo;
	}
	public void setPetSitterReviewNo(int petSitterReviewNo) {
		this.petSitterReviewNo = petSitterReviewNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getReviewText() {
		return reviewText;
	}
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}
	public String getReviewStar() {
		return reviewStar;
	}
	public void setReviewStar(String reviewStar) {
		this.reviewStar = reviewStar;
	}
	public String getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}
	@Override
	public String toString() {
		return "ReviewUser [petSitterReviewNo=" + petSitterReviewNo + ", userId=" + userId + ", reservationCode="
				+ reservationCode + ", petSitterId=" + petSitterId + ", reviewText=" + reviewText + ", reviewStar="
				+ reviewStar + ", reviewDate=" + reviewDate + "]";
	}
	

}
