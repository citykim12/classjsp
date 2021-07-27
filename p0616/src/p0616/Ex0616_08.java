package p0616;

public class Ex0616_08 {

	public static void main(String[] args) {
		
		String[] hobby1 = {"game","movie","reading","golf"};
		// "game,movie,reading,golf";
		String[] hobby2 = {"movie"};
		String[] hobby3 = {"game","reading"};
		
		String hobby="";
		for(int i=0;i<hobby1.length;i++) {
			if(i==0) {
				hobby += hobby1[i];
			}else {
				hobby += ", " + hobby1[i];
			}
		}
		System.out.println(hobby);
		
		if(hobby.contains("anime")) {
			System.out.println("게임 checked 활성화");
			System.out.println("<input type=\"checkbox\" name=\"hobby\" value=\"game\" checked>");
		}else {
			System.out.println("게임 checked 활성화");
			System.out.println("<input type=\"checkbox\" name=\"hobby\" value=\"game\">");
		}
		//me answer
//		String hobby = "취미: ".concat(hobby1[0]+","+hobby1[1]+","+hobby1[2]+","+hobby1[3]);
//		System.out.println(hobby);
		
//		String[] s = new String[100];
//		for(int i=1;i<=100;i++) {	//s0001, s0002~
//			//s[i] = String.format("S%04d", i+1);
//			String temp = String.format("%04d", i+1);
//			s[i] = "s".concat(temp);	//문자와 문자를 결합 "S" + "0001
//		}
//		for(int i=0;i<100;i++) {
//			System.out.println(s[i]);
//		}

	}	//main

}	//class
