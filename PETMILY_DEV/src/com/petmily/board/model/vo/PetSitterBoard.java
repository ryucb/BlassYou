package com.petmily.board.model.vo;

public class PetSitterBoard {

	private int boardNo;
	private String userId;
	private String boardTitle;
	private String boardInfo;
	private int smallPrice;
	private int middlePrice;
	private int bigPrice;
	private String boardAddress;
	private String boardAddressContent;
	private String boardBlind;
	public PetSitterBoard() {
		// TODO Auto-generated constructor stub
	}
	public PetSitterBoard(int boardNo, String userId, String boardTitle, String boardInfo, int smallPrice,
			int middlePrice, int bigPrice, String boardAddress, String boardAddressContent, String boardBlind) {
		super();
		this.boardNo = boardNo;
		this.userId = userId;
		this.boardTitle = boardTitle;
		this.boardInfo = boardInfo;
		this.smallPrice = smallPrice;
		this.middlePrice = middlePrice;
		this.bigPrice = bigPrice;
		this.boardAddress = boardAddress;
		this.boardAddressContent = boardAddressContent;
		this.boardBlind = boardBlind;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public int getSmallPrice() {
		return smallPrice;
	}
	public void setSmallPrice(int smallPrice) {
		this.smallPrice = smallPrice;
	}
	public int getMiddlePrice() {
		return middlePrice;
	}
	public void setMiddlePrice(int middlePrice) {
		this.middlePrice = middlePrice;
	}
	public int getBigPrice() {
		return bigPrice;
	}
	public void setBigPrice(int bigPrice) {
		this.bigPrice = bigPrice;
	}
	public String getBoardAddress() {
		return boardAddress;
	}
	public void setBoardAddress(String boardAddress) {
		this.boardAddress = boardAddress;
	}
	public String getBoardAddressContent() {
		return boardAddressContent;
	}
	public void setBoardAddressContent(String boardAddressContent) {
		this.boardAddressContent = boardAddressContent;
	}
	public String getBoardBlind() {
		return boardBlind;
	}
	public void setBoardBlind(String boardBlind) {
		this.boardBlind = boardBlind;
	}
	@Override
	public String toString() {
		return "PetSitterBoard [boardNo=" + boardNo + ", userId=" + userId + ", boardTitle=" + boardTitle
				+ ", boardInfo=" + boardInfo + ", smallPrice=" + smallPrice + ", middlePrice=" + middlePrice
				+ ", bigPrice=" + bigPrice + ", boardAddress=" + boardAddress + ", boardAddressContent="
				+ boardAddressContent + ", boardBlind=" + boardBlind + "]";
	}
	
}
