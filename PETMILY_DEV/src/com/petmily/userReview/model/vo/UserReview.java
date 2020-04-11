package com.petmily.userReview.model.vo;

import java.sql.Date;

public class UserReview {

	private int userReviewNo;
	private String userId;
	private String petsitterName;
	private int reservationCode;
	private Date checkIn;
	private Date checkOut;
	private String petsitterId;
	private String reviewText;
	private int reviewStar;
	private Date reviewDate;
	private String reviewType;
	private String reviewBlindText;
	
	public UserReview() {
		// TODO Auto-generated constructor stub
	}

	public UserReview(int userReviewNo, String userId, String petsitterName, int reservationCode, Date checkIn,
			Date checkOut, String petsitterId, String reviewText, int reviewStar, Date reviewDate, String reviewType,
			String reviewBlindText) {
		super();
		this.userReviewNo = userReviewNo;
		this.userId = userId;
		this.petsitterName = petsitterName;
		this.reservationCode = reservationCode;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.petsitterId = petsitterId;
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

	public String getPetsitterName() {
		return petsitterName;
	}

	public void setPetsitterName(String petsitterName) {
		this.petsitterName = petsitterName;
	}

	public int getReservationCode() {
		return reservationCode;
	}

	public void setReservationCode(int reservationCode) {
		this.reservationCode = reservationCode;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public String getPetsitterId() {
		return petsitterId;
	}

	public void setPetsitterId(String petsitterId) {
		this.petsitterId = petsitterId;
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
		return "UserReview [userReviewNo=" + userReviewNo + ", userId=" + userId + ", petsitterName=" + petsitterName
				+ ", reservationCode=" + reservationCode + ", checkIn=" + checkIn + ", checkOut=" + checkOut
				+ ", petsitterId=" + petsitterId + ", reviewText=" + reviewText + ", reviewStar=" + reviewStar
				+ ", reviewDate=" + reviewDate + ", reviewType=" + reviewType + ", reviewBlindText=" + reviewBlindText
				+ "]";
	}
	

	
}
