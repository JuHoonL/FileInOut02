package com.biz.files.exec;

import com.biz.files.service.GradeService;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strFile = "src/com/biz/files/vo/우리말이름.txt";
		GradeService gS = new GradeService(strFile);
		
		gS.readFile();
		gS.makeNum();
		gS.addNum();
		gS.addGradeScore();
		
//		gS.view1();
		gS.view2();
	}

}
