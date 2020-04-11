package com.petmily.board.model.vo;

import java.util.List;

public class PlusOptionService {

	private int reservcationCode;
	private int boardNo;
	private List<String> plus;
	private int smallPrice;
	private int middlePrice;
	private int bigPrice;
	private int oneWayPrice;
	private int allWayPrice;
	private int salePrice;
	public PlusOptionService() {
		// TODO Auto-generated constructor stub
	}
	public PlusOptionService(int reservcationCode, int boardNo, List<String> plus, int smallPrice, int middlePrice,
			int bigPrice, int oneWayPrice, int allWayPrice, int salePrice) {
		super();
		this.reservcationCode = reservcationCode;
		this.boardNo = boardNo;
		this.plus = plus;
		this.smallPrice = smallPrice;
		this.middlePrice = middlePrice;
		this.bigPrice = bigPrice;
		this.oneWayPrice = oneWayPrice;
		this.allWayPrice = allWayPrice;
		this.salePrice = salePrice;
	}
	public int getReservcationCode() {
		return reservcationCode;
	}
	public void setReservcationCode(int reservcationCode) {
		this.reservcationCode = reservcationCode;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public List<String> getPlus() {
		return plus;
	}
	public void setPlus(List<String> plus) {
		this.plus = plus;
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
	@Override
	public String toString() {
		return "PlusOptionService [reservcationCode=" + reservcationCode + ", boardNo=" + boardNo + ", smallPrice="
				+ smallPrice + ", middlePrice=" + middlePrice + ", bigPrice=" + bigPrice + ", oneWayPrice="
				+ oneWayPrice + ", allWayPrice=" + allWayPrice + ", salePrice=" + salePrice + "]";
	}

	
}
