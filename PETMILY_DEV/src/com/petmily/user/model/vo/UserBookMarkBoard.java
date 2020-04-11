package com.petmily.user.model.vo;

import java.util.List;

public class UserBookMarkBoard {
//	펫시터 북마크 테이블
	private String userId; // user_id1
	private String petSitterId; // user_id
	
//	게시글 테이블
	private int boardCode; // board_code
	private String boardTitle; // board_title
	private String boardInfo; // board_info
	private int onedaySprice; // one_day_care_s_price (not null)
	private int onedayMprice; // one_day_care_m_price (not null)
	private int onedayBprice; // one_day_care_b_price (not null)
	private String boardAddress; // board_address (not null)
	private String boardAddComment; // board_address_comment
	private String boardBlind; // board_blind (not null)
	
	public UserBookMarkBoard() {
		// TODO Auto-generated constructor stub
	}
	
	public UserBookMarkBoard(String userId, String petSitterId, int boardCode, String boardTitle, String boardInfo,
			int onedaySprice, int onedayMprice, int onedayBprice, String boardAddress, String boardAddComment,
			String boardBlind) {
		super();
		this.userId = userId;
		this.petSitterId = petSitterId;
		this.boardCode = boardCode;
		this.boardTitle = boardTitle;
		this.boardInfo = boardInfo;
		this.onedaySprice = onedaySprice;
		this.onedayMprice = onedayMprice;
		this.onedayBprice = onedayBprice;
		this.boardAddress = boardAddress;
		this.boardAddComment = boardAddComment;
		this.boardBlind = boardBlind;
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

	public String getBoardInfo() {
		return boardInfo;
	}

	public void setBoardInfo(String boardInfo) {
		this.boardInfo = boardInfo;
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

	public String getBoardAddress() {
		return boardAddress;
	}

	public void setBoardAddress(String boardAddress) {
		this.boardAddress = boardAddress;
	}

	public String getBoardAddComment() {
		return boardAddComment;
	}

	public void setBoardAddComment(String boardAddComment) {
		this.boardAddComment = boardAddComment;
	}

	public String getBoardBlind() {
		return boardBlind;
	}

	public void setBoardBlind(String boardBlind) {
		this.boardBlind = boardBlind;
	}

	@Override
	public String toString() {
		return "UserBookMarkBoard [userId=" + userId + ", petSitterId=" + petSitterId + ", boardCode=" + boardCode
				+ ", boardTitle=" + boardTitle + ", boardInfo=" + boardInfo + ", onedaySprice=" + onedaySprice
				+ ", onedayMprice=" + onedayMprice + ", onedayBprice=" + onedayBprice + ", boardAddress=" + boardAddress
				+ ", boardAddComment=" + boardAddComment + ", boardBlind=" + boardBlind + "]";
	}
	
}
