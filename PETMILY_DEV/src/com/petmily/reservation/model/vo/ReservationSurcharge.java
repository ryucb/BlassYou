package com.petmily.reservation.model.vo;

public class ReservationSurcharge {

	private int reservationCode;
	private int finalPrice;
	private String surchargeText;
	private String resSurImgFilename;
	private String resType;
	private String resSurType;
public ReservationSurcharge() {
	// TODO Auto-generated constructor stub
}
public ReservationSurcharge(int reservationCode, int finalPrice, String surchargeText, String resSurImgFilename,
		String resType, String resSurType) {
	super();
	this.reservationCode = reservationCode;
	this.finalPrice = finalPrice;
	this.surchargeText = surchargeText;
	this.resSurImgFilename = resSurImgFilename;
	this.resType = resType;
	this.resSurType = resSurType;
}
public int getReservationCode() {
	return reservationCode;
}
public void setReservationCode(int reservationCode) {
	this.reservationCode = reservationCode;
}
public int getFinalPrice() {
	return finalPrice;
}
public void setFinalPrice(int finalPrice) {
	this.finalPrice = finalPrice;
}
public String getSurchargeText() {
	return surchargeText;
}
public void setSurchargeText(String surchargeText) {
	this.surchargeText = surchargeText;
}
public String getResSurImgFilename() {
	return resSurImgFilename;
}
public void setResSurImgFilename(String resSurImgFilename) {
	this.resSurImgFilename = resSurImgFilename;
}
public String getResType() {
	return resType;
}
public void setResType(String resType) {
	this.resType = resType;
}
public String getResSurType() {
	return resSurType;
}
public void setResSurType(String resSurType) {
	this.resSurType = resSurType;
}
@Override
public String toString() {
	return "ReservationSurcharge [reservationCode=" + reservationCode + ", finalPrice=" + finalPrice
			+ ", surchargeText=" + surchargeText + ", resSurImgFilename=" + resSurImgFilename + ", resType=" + resType
			+ ", resSurType=" + resSurType + "]";
}

}
