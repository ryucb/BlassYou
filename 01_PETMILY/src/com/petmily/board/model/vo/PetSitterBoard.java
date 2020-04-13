package com.petmily.board.model.vo;

import java.util.List;

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
	private String boardNewType;
	private int smallPrice1;
	private int middlePrice1;
	private int bigPrice1;
	private int oneWayPrice;
	private int allWayPrice;
	private int salePrice;
	private List<String> boardImages;
	private List<String> serviceTypes;
	private List<String> plus;
	
	public PetSitterBoard() {
		// TODO Auto-generated constructor stub
	}

	public PetSitterBoard(int boardNo, String userId, String boardTitle, String boardInfo, int smallPrice,
			int middlePrice, int bigPrice, String boardAddress, String boardAddressContent, String boardBlind,
			String boardNewType, int smallPrice1, int middlePrice1, int bigPrice1, int oneWayPrice, int allWayPrice,
			int salePrice, List<String> boardImages, List<String> serviceTypes, List<String> plus) {
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
		this.boardNewType = boardNewType;
		this.smallPrice1 = smallPrice1;
		this.middlePrice1 = middlePrice1;
		this.bigPrice1 = bigPrice1;
		this.oneWayPrice = oneWayPrice;
		this.allWayPrice = allWayPrice;
		this.salePrice = salePrice;
		this.boardImages = boardImages;
		this.serviceTypes = serviceTypes;
		this.plus = plus;
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

	public String getBoardNewType() {
		return boardNewType;
	}

	public void setBoardNewType(String boardNewType) {
		this.boardNewType = boardNewType;
	}

	public int getSmallPrice1() {
		return smallPrice1;
	}

	public void setSmallPrice1(int smallPrice1) {
		this.smallPrice1 = smallPrice1;
	}

	public int getMiddlePrice1() {
		return middlePrice1;
	}

	public void setMiddlePrice1(int middlePrice1) {
		this.middlePrice1 = middlePrice1;
	}

	public int getBigPrice1() {
		return bigPrice1;
	}

	public void setBigPrice1(int bigPrice1) {
		this.bigPrice1 = bigPrice1;
	}

	public int getOneWayPrice() {
		return oneWayPrice;
	}

	public void setOneWayPrice(int oneWayPrice) {
		this.oneWayPrice = oneWayPrice;
	}

	public int getAllWayPrice() {
		return allWayPrice;
	}

	public void setAllWayPrice(int allWayPrice) {
		this.allWayPrice = allWayPrice;
	}

	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	public List<String> getBoardImages() {
		return boardImages;
	}

	public void setBoardImages(List<String> boardImages) {
		this.boardImages = boardImages;
	}

	public List<String> getServiceTypes() {
		return serviceTypes;
	}

	public void setServiceTypes(List<String> serviceTypes) {
		this.serviceTypes = serviceTypes;
	}

	public List<String> getPlus() {
		return plus;
	}

	public void setPlus(List<String> plus) {
		this.plus = plus;
	}

	@Override
	public String toString() {
		return "PetSitterBoard [boardNo=" + boardNo + ", userId=" + userId + ", boardTitle=" + boardTitle
				+ ", boardInfo=" + boardInfo + ", smallPrice=" + smallPrice + ", middlePrice=" + middlePrice
				+ ", bigPrice=" + bigPrice + ", boardAddress=" + boardAddress + ", boardAddressContent="
				+ boardAddressContent + ", boardBlind=" + boardBlind + ", boardNewType=" + boardNewType
				+ ", smallPrice1=" + smallPrice1 + ", middlePrice1=" + middlePrice1 + ", bigPrice1=" + bigPrice1
				+ ", oneWayPrice=" + oneWayPrice + ", allWayPrice=" + allWayPrice + ", salePrice=" + salePrice
				+ ", boardImages=" + boardImages + ", serviceTypes=" + serviceTypes + ", plus=" + plus + "]";
	}

	
	
		
}
