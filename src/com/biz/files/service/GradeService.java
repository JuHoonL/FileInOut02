package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.biz.files.vo.GradeVO;

public class GradeService {

	List<GradeVO> gradeList ;
	List<String> strNumList;

	String strFileName ;

	
	public GradeService(String strFileName) {
		gradeList = new ArrayList();
		strNumList = new ArrayList();
		this.strFileName = strFileName;
	}
	
	public void readFile() {
		FileReader fr;
		BufferedReader br;
		
		try {
			fr = new FileReader(strFileName);
			br = new BufferedReader(fr);
			
			while(true) {
				String readfile = br.readLine();
				if(readfile == null) break;
				
				String[] splitfile = readfile.split(":");
				GradeVO vo = new GradeVO();
				vo.setStrName(splitfile[0]);
				gradeList.add(vo);
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void makeNum() {
		int intLen = gradeList.size();
		for(int i = 0 ; i < intLen ; i ++) {
			strNumList.add(""+(i+1));
		}
	}
	// List<String> strNumList 에 담긴 학번은 현재는 정렬이 된 상태이나 만약 정렬되지 않고, 중복값이 있다고 하면 
//	Set<String> setString = new TreeSet(strNumList);
//	strNumList = new ArrayList(setString);
	
	public int makeGradeScore() {
		return (int)(Math.random() * (100 - 50 +1)) + 50;
	}
	
	
	public void addNum() {
		int intLen = gradeList.size();
		for(int i = 0 ; i < intLen ; i ++) {
			gradeList.get(i).setStrNum(strNumList.get(i));
		/*	GradeVO vo = gradeList.get(i);			=> vo를 gradeList의 i번째 배열로 생성
		  	vo.setStrNum(strNumList.get(i));
		 */
		
		}
	}
	
	public void addGradeScore() {
		int intLen = gradeList.size();
		for(int i = 0 ; i < intLen ; i ++) {
			gradeList.get(i).setIntKor(makeGradeScore());
			gradeList.get(i).setIntEng(makeGradeScore());
			gradeList.get(i).setIntMth(makeGradeScore());
			int intSum = 0;
			intSum = gradeList.get(i).getIntKor();
			intSum += gradeList.get(i).getIntEng();
			intSum += gradeList.get(i).getIntMth();
			gradeList.get(i).setIntSum(intSum);
			gradeList.get(i).setFloatAvg((float)intSum/3);
		}
	}
	
	public void view() {
		for(GradeVO v : gradeList) {
			System.out.println(v);
		}
	}
	
	public void view1() {
		System.out.println("=============================================================================");
		System.out.println("학번\t이름\t\t국어\t영어\t수학\t\t총점\t평균");
		System.out.println("-----------------------------------------------------------------------------");
		int intLen = gradeList.size();
		for(int i = 0 ; i < intLen ; i++) {
			System.out.print(gradeList.get(i).getStrNum() + "\t");
			System.out.print(gradeList.get(i).getStrName() + "\t\t");
			System.out.print(gradeList.get(i).getIntKor() + "\t");
			System.out.print(gradeList.get(i).getIntEng() + "\t");
			System.out.print(gradeList.get(i).getIntMth() + "\t\t");
			System.out.print(gradeList.get(i).getIntSum() + "\t");
//			System.out.println(Math.round((gradeList.get(i).getFloatAvg())));
			System.out.println(String.format("%.2f", (gradeList.get(i).getFloatAvg())));
//			System.out.println((gradeList.get(i).getFloatAvg()));
		}
	}
	
	public void view2() {
		System.out.println("=============================================================================");
		System.out.println("학번\t이름\t\t국어\t영어\t수학\t\t총점\t평균");
		System.out.println("-----------------------------------------------------------------------------");
		for(GradeVO v : gradeList) {
			System.out.print(v.getStrNum() + "\t");
			System.out.print(v.getStrName() + "\t\t");
			System.out.print(v.getIntKor() + "\t");
			System.out.print(v.getIntEng() + "\t");
			System.out.print(v.getIntMth() + "\t\t");
			System.out.print(v.getIntSum() + "\t");
			System.out.println(String.format("%.2f", v.getFloatAvg()));
		}
	}
}
