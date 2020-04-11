package com.petmily.review.model.vo;

public class ReviewPetSitter {

	private int userReviewNo;
	private String userId;
	private int reservationCode;
	private String petSitterId;
	private String reviewText;
	private int reviewStar;
	private String reviewDate;
	private String reviewType;
	private String reviewBilnd;
	public ReviewPetSitter() {
		// TODO Auto-generated constructor stub
	}
	public ReviewPetSitter(int userReviewNo, String userId, int reservationCode, String petSitterId, String reviewText,
			int reviewStar, String reviewDate, String reviewType, String reviewBilnd) {
		super();
		this.userReviewNo = userReviewNo;
		this.userId = userId;
		this.reservationCode = reservationCode;
		this.petSitterId = petSitterId;
		this.reviewText = reviewText;
		this.reviewStar = reviewStar;
		this.reviewDate = reviewDate;
		this.reviewType = reviewType;
		this.reviewBilnd = reviewBilnd;
	}
	public int getUserReviewNo() {
		return userReviewNo;
	}
	public void setUserReviewNo(int userReviewNo) {
		this.userReviewNo = userReviewNo;
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
	public int getReviewStar() {
		return reviewStar;
	}
	public void setReviewStar(int reviewStar) {
		this.reviewStar = reviewStar;
	}
	public String getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}
	public String getReviewType() {
		return reviewType;
	}
	public void setReviewType(String reviewType) {
		this.reviewType = reviewType;
	}
	public String getReviewBilnd() {
		return reviewBilnd;
	}
	public void setReviewBilnd(String reviewBilnd) {
		this.reviewBilnd = reviewBilnd;
	}
	@Override
	public String toString() {
		return "ReviewPetSitter [userReviewNo=" + userReviewNo + ", userId=" + userId + ", reservationCode="
				+ reservationCode + ", petSitterId=" + petSitterId + ", reviewText=" + reviewText + ", reviewStar="
				+ reviewStar + ", reviewDate=" + reviewDate + ", reviewType=" + reviewType + ", reviewBilnd="
				+ reviewBilnd + "]";
	}
	
}
