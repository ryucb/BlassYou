package com.petmily.user.model.vo;

import java.util.List;

public class UserBookMarkBoard {
//	펫시터 북마크 + 보드 테이블 합친 객체
	private String userId; // user_id1
	private String petSitterId; // user_id
	private String userName; // user_name
	private int boardCode; // board_code
	private String boardTitle; // board_title
	private int onedaySprice; // one_day_care_s_price (not null)
	private int onedayMprice; // one_day_care_m_price (not null)
	private int onedayBprice; // one_day_care_b_price (not null)
	private int rnum;
	
	public UserBookMarkBoard() { }

	public UserBookMarkBoard(String userId, String petSitterId, String userName, int boardCode, String boardTitle,
			int onedaySprice, int onedayMprice, int onedayBprice, int rnum) {
		super();
		this.userId = userId;
		this.petSitterId = petSitterId;
		this.userName = userName;
		this.boardCode = boardCode;
		this.boardTitle = boardTitle;
		this.onedaySprice = onedaySprice;
		this.onedayMprice = onedayMprice;
		this.onedayBprice = onedayBprice;
		this.rnum = rnum;
	}
	
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getBoardCode() {
		return boardCode;
	}

	public void setBoardCode(int boardCode) {
		this.boardCode = boardCode;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public int getOnedaySprice() {
		return onedaySprice;
	}

	public void setOnedaySprice(int onedaySprice) {
		this.onedaySprice = onedaySprice;
	}

	public int getOnedayMprice() {
		return onedayMprice;
	}

	public void setOnedayMprice(int onedayMprice) {
		this.onedayMprice = onedayMprice;
	}

	public int getOnedayBprice() {
		return onedayBprice;
	}

	public void setOnedayBprice(int onedayBprice) {
		this.onedayBprice = onedayBprice;
	}

	@Override
	public String toString() {
		return "UserBookMarkBoard [userId=" + userId + ", petSitterId=" + petSitterId + ", userName=" + userName
				+ ", boardCode=" + boardCode + ", boardTitle=" + boardTitle + ", onedaySprice=" + onedaySprice
				+ ", onedayMprice=" + onedayMprice + ", onedayBprice=" + onedayBprice + "]";
	}

	
}
