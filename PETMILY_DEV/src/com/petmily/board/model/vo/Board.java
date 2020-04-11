package com.petmily.board.model.vo;

import java.util.List;

public class Board {
	
	private int no;
	private String id;
	private String title;
	private List<String> files;
	private int count;
	private String introduce;
	private int small;
	private int middle;
	private int big;
	private String addSale;
	private int sale;
	private String address;
	private String map;
	private String play;
	private String walk;
	private String old;
	private String showerOn;
	private int small1;
	private int middle1;
	private int big1;
	private String drug;
	private String pickUp;
	private int oneWay;
	private int allWay;
	
	
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Board(int no, String id, String title, List<String> files, int count, String introduce, int small,
			int middle, int big, String addSale, int sale, String address, String map, String play, String walk,
			String old, String showerOn, int small1, int middle1, int big1, String drug, String pickUp, int oneWay,
			int allWay) {
		super();
		this.no = no;
		this.id = id;
		this.title = title;
		this.files = files;
		this.count = count;
		this.introduce = introduce;
		this.small = small;
		this.middle = middle;
		this.big = big;
		this.addSale = addSale;
		this.sale = sale;
		this.address = address;
		this.map = map;
		this.play = play;
		this.walk = walk;
		this.old = old;
		this.showerOn = showerOn;
		this.small1 = small1;
		this.middle1 = middle1;
		this.big1 = big1;
		this.drug = drug;
		this.pickUp = pickUp;
		this.oneWay = oneWay;
		this.allWay = allWay;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public List<String> getFiles() {
		return files;
	}


	public void setFiles(List<String> files) {
		this.files = files;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public String getIntroduce() {
		return introduce;
	}


	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}


	public int getSmall() {
		return small;
	}


	public void setSmall(int small) {
		this.small = small;
	}


	public int getMiddle() {
		return middle;
	}


	public void setMiddle(int middle) {
		this.middle = middle;
	}


	public int getBig() {
		return big;
	}


	public void setBig(int big) {
		this.big = big;
	}


	public String getAddSale() {
		return addSale;
	}


	public void setAddSale(String addSale) {
		this.addSale = addSale;
	}


	public int getSale() {
		return sale;
	}


	public void setSale(int sale) {
		this.sale = sale;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getMap() {
		return map;
	}


	public void setMap(String map) {
		this.map = map;
	}


	public String getPlay() {
		return play;
	}


	public void setPlay(String play) {
		this.play = play;
	}


	public String getWalk() {
		return walk;
	}


	public void setWalk(String walk) {
		this.walk = walk;
	}


	public String getOld() {
		return old;
	}


	public void setOld(String old) {
		this.old = old;
	}


	public String getShowerOn() {
		return showerOn;
	}


	public void setShowerOn(String showerOn) {
		this.showerOn = showerOn;
	}


	public int getSmall1() {
		return small1;
	}


	public void setSmall1(int small1) {
		this.small1 = small1;
	}


	public int getMiddle1() {
		return middle1;
	}


	public void setMiddle1(int middle1) {
		this.middle1 = middle1;
	}


	public int getBig1() {
		return big1;
	}


	public void setBig1(int big1) {
		this.big1 = big1;
	}


	public String getDrug() {
		return drug;
	}


	public void setDrug(String drug) {
		this.drug = drug;
	}


	public String getPickUp() {
		return pickUp;
	}


	public void setPickUp(String pickUp) {
		this.pickUp = pickUp;
	}


	public int getOneWay() {
		return oneWay;
	}


	public void setOneWay(int oneWay) {
		this.oneWay = oneWay;
	}


	public int getAllWay() {
		return allWay;
	}


	public void setAllWay(int allWay) {
		this.allWay = allWay;
	}


	@Override
	public String toString() {
		return "Board [no=" + no + ", id=" + id + ", title=" + title + ", files=" + files + ", count=" + count
				+ ", introduce=" + introduce + ", small=" + small + ", middle=" + middle + ", big=" + big + ", addSale="
				+ addSale + ", sale=" + sale + ", address=" + address + ", map=" + map + ", play=" + play + ", walk="
				+ walk + ", old=" + old + ", showerOn=" + showerOn + ", small1=" + small1 + ", middle1=" + middle1
				+ ", big1=" + big1 + ", drug=" + drug + ", pickUp=" + pickUp + ", oneWay=" + oneWay + ", allWay="
				+ allWay + "]";
	}

	

	
	
}
