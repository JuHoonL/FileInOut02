package com.biz.files.vo;

public class GradeVO {

	private String strNum;
	private String strName;
	private int intKor;
	private int intEng;
	private int intMth;
	
	private int intSum;
	private float floatAvg;
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMth() {
		return intMth;
	}
	public void setIntMth(int intMth) {
		this.intMth = intMth;
	}
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public float getFloatAvg() {
		return floatAvg;
	}
	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}

	public String toString() {
		return "GradeVO [strNum=" + strNum + ", strName=" + strName + ", intKor=" + intKor + ", intEng=" + intEng
				+ ", intMth=" + intMth + ", intSum=" + intSum + ", floatAvg=" + floatAvg + "]";
	}
	
	
}
