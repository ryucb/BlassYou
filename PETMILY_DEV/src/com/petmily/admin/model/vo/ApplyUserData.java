package com.petmily.admin.model.vo;

import java.util.ArrayList;
import java.util.Arrays;

public class ApplyUserData {
	
	// 펫시터 정보 테이블
	private String PET_SITTER_ID;
	private String PET_CERTIFICATE_YN;
	private String PET_SITTER_JOB;
	private String PET_SITTER_FAMILY;
	private String PET_SITTER_KEEP_PETS;
	private String PET_SITTER_ACTIVITY;
	private String PET_SITTER_IMG;
	// 펫시터 거주지유형
	private ArrayList<String> RESIDENCE_VALUE;
	// 펫시터자격증테이블
	private String CERTIFICATE_NAME;
	private String CERTIFICATION_NAME;
	private String DATE_OF_ACQUISITION;
	private String EXPIRATION_DATE;
	private String CERTIFICATE_FILENAME;
	
	public ApplyUserData() {
		// TODO Auto-generated constructor stub
	}

	public String getPET_CERTIFICATE_YN() {
		return PET_CERTIFICATE_YN;
	}

	public void setPET_CERTIFICATE_YN(String pET_CERTIFICATE_YN) {
		PET_CERTIFICATE_YN = pET_CERTIFICATE_YN;
	}

	public String getPET_SITTER_JOB() {
		return PET_SITTER_JOB;
	}

	public void setPET_SITTER_JOB(String pET_SITTER_JOB) {
		PET_SITTER_JOB = pET_SITTER_JOB;
	}

	public String getPET_SITTER_FAMILY() {
		return PET_SITTER_FAMILY;
	}

	public void setPET_SITTER_FAMILY(String pET_SITTER_FAMILY) {
		PET_SITTER_FAMILY = pET_SITTER_FAMILY;
	}

	public String getPET_SITTER_KEEP_PETS() {
		return PET_SITTER_KEEP_PETS;
	}

	public void setPET_SITTER_KEEP_PETS(String pET_SITTER_KEEP_PETS) {
		PET_SITTER_KEEP_PETS = pET_SITTER_KEEP_PETS;
	}

	public String getPET_SITTER_ACTIVITY() {
		return PET_SITTER_ACTIVITY;
	}

	public void setPET_SITTER_ACTIVITY(String pET_SITTER_ACTIVITY) {
		PET_SITTER_ACTIVITY = pET_SITTER_ACTIVITY;
	}

	public String getPET_SITTER_IMG() {
		return PET_SITTER_IMG;
	}

	public void setPET_SITTER_IMG(String pET_SITTER_IMG) {
		PET_SITTER_IMG = pET_SITTER_IMG;
	}

	public ArrayList<String> getRESIDENCE_VALUE() {
		return RESIDENCE_VALUE;
	}

	public void setRESIDENCE_VALUE(ArrayList<String> rESIDENCE_VALUE) {
		RESIDENCE_VALUE = rESIDENCE_VALUE;
	}

	public String getCERTIFICATE_NAME() {
		return CERTIFICATE_NAME;
	}

	public void setCERTIFICATE_NAME(String cERTIFICATE_NAME) {
		CERTIFICATE_NAME = cERTIFICATE_NAME;
	}

	public String getCERTIFICATION_NAME() {
		return CERTIFICATION_NAME;
	}

	public void setCERTIFICATION_NAME(String cERTIFICATION_NAME) {
		CERTIFICATION_NAME = cERTIFICATION_NAME;
	}

	public String getDATE_OF_ACQUISITION() {
		return DATE_OF_ACQUISITION;
	}

	public void setDATE_OF_ACQUISITION(String dATE_OF_ACQUISITION) {
		DATE_OF_ACQUISITION = dATE_OF_ACQUISITION;
	}

	public String getEXPIRATION_DATE() {
		return EXPIRATION_DATE;
	}

	public void setEXPIRATION_DATE(String eXPIRATION_DATE) {
		EXPIRATION_DATE = eXPIRATION_DATE;
	}

	public String getCERTIFICATE_FILENAME() {
		return CERTIFICATE_FILENAME;
	}

	public void setCERTIFICATE_FILENAME(String cERTIFICATE_FILENAME) {
		CERTIFICATE_FILENAME = cERTIFICATE_FILENAME;
	}

	public String getPET_SITTER_ID() {
		return PET_SITTER_ID;
	}

	public void setPET_SITTER_ID(String pET_SITTER_ID) {
		PET_SITTER_ID = pET_SITTER_ID;
	}

	@Override
	public String toString() {
		return "ApplyUserData [PET_SITTER_ID=" + PET_SITTER_ID + ", PET_CERTIFICATE_YN=" + PET_CERTIFICATE_YN
				+ ", PET_SITTER_JOB=" + PET_SITTER_JOB + ", PET_SITTER_FAMILY=" + PET_SITTER_FAMILY
				+ ", PET_SITTER_KEEP_PETS=" + PET_SITTER_KEEP_PETS + ", PET_SITTER_ACTIVITY=" + PET_SITTER_ACTIVITY
				+ ", PET_SITTER_IMG=" + PET_SITTER_IMG + ", RESIDENCE_VALUE=" + RESIDENCE_VALUE
				+ ", CERTIFICATE_NAME=" + CERTIFICATE_NAME + ", CERTIFICATION_NAME=" + CERTIFICATION_NAME
				+ ", DATE_OF_ACQUISITION=" + DATE_OF_ACQUISITION + ", EXPIRATION_DATE=" + EXPIRATION_DATE
				+ ", CERTIFICATE_FILENAME=" + CERTIFICATE_FILENAME + "]";
	}

	
	
	
	
	

}
