package com.petmily.board.model.vo;

public class DefaultService {

	private int reservationCODE;
	private int boardCode;
	private String defaultService;
	public DefaultService() {
		// TODO Auto-generated constructor stub
	}
	public DefaultService(int reservationCODE, int boardCode, String defaultService) {
		super();
		this.reservationCODE = reservationCODE;
		this.boardCode = boardCode;
		this.defaultService = defaultService;
	}
	public int getReservationCODE() {
		return reservationCODE;
	}
	public void setReservationCODE(int reservationCODE) {
		this.reservationCODE = reservationCODE;
	}
	public int getBoardCode() {
		return boardCode;
	}
	public void setBoardCode(int boardCode) {
		this.boardCode = boardCode;
	}
	public String getDefaultService() {
		return defaultService;
	}
	public void setDefaultService(String defaultService) {
		this.defaultService = defaultService;
	}
	@Override
	public String toString() {
		return "DefaultServiceType [reservationCODE=" + reservationCODE + ", boardCode=" + boardCode
				+ ", defaultService=" + defaultService + "]";
	}
	
}
