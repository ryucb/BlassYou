package com.petmily.board.model.vo;

public class boardImg {

	private int boardNo;
	private String imgFilename;
	public boardImg() {
		// TODO Auto-generated constructor stub
	}
	public boardImg(int boardNo, String imgFilename) {
		super();
		this.boardNo = boardNo;
		this.imgFilename = imgFilename;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getImgFilename() {
		return imgFilename;
	}
	public void setImgFilename(String imgFilename) {
		this.imgFilename = imgFilename;
	}
	@Override
	public String toString() {
		return "boardImg [boardNo=" + boardNo + ", imgFilename=" + imgFilename + "]";
	}
	
}
