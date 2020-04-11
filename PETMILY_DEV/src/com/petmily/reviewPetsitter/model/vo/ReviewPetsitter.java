package com.petmily.reviewPetsitter.model.vo;

import java.sql.Date;

public class ReviewPetsitter {
	
	private int userReviewNo;
	private String userId;
	private int reservationCode;
	private String petSitterId;
	private String reviewText;
	private int reviewStar;
	private Date reviewDate;
	private String reviewType;
	private String reviewBlindText;
	
	public ReviewPetsitter() {
		// TODO Auto-generated constructor stub
	}

	public ReviewPetsitter(int userReviewNo, String userId, int reservationCode, String petSitterId, String reviewText,
			int reviewStar, Date reviewDate, String reviewType, String reviewBlindText) {
		super();
		this.userReviewNo = userReviewNo;
		this.userId = userId;
		this.reservationCode = reservationCode;
		this.petSitterId = petSitterId;
		this.reviewText = reviewText;
		this.reviewStar = reviewStar;
		this.reviewDate = reviewDate;
		this.reviewType = reviewType;
		this.reviewBlindText = reviewBlindText;
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

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getReviewType() {
		return reviewType;
	}

	public void setReviewType(String reviewType) {
		this.reviewType = reviewType;
	}

	public String getReviewBlindText() {
		return reviewBlindText;
	}

	public void setReviewBlindText(String reviewBlindText) {
		this.reviewBlindText = reviewBlindText;
	}

	@Override
	public String toString() {
		return "ReviewPetsitter [userReviewNo=" + userReviewNo + ", userId=" + userId + ", reservationCode="
				+ reservationCode + ", petSitterId=" + petSitterId + ", reviewText=" + reviewText + ", reviewStar="
				+ reviewStar + ", reviewDate=" + reviewDate + ", reviewType=" + reviewType + ", reviewBlindText="
				+ reviewBlindText + "]";
	}
	
	

}
