package p0616;

public class Ex0616_06 {

	public static void main(String[] args) {
		
		String str = "Hello";
		str.charAt(2); // → 1
		
		String str2 = "789450";
		char ch = str2.charAt(0);
		System.out.println("ch charAt: " + ch);
		
		//ch → int로 변경하는 방법	
		int num = ch-'0';	//7 → 55-48=7
		int num2 = 8;	//String 방법: 8+""="8"
		
		str2.substring(0, 3);
		System.out.println("str2.substring(0, 3): "+ str2.substring(0, 3));
		
		String str3 = "자바수업이 끝나가고 있습니다.";
		System.out.println(str3.substring(0, 5));
		System.out.println(str3.substring(11, 15));
		
//		char a = ' ';
//		String str = "";	// 빈공백이 데이터에 저장 됨
//		String str2 = null; // 데이터 저장공간이 없음
//		
//		String s1 = "";	//s1,s2,s3 → 같은 공간 사용(메모리 단축)
//		String s2 = "";
//		String s3 = "";
//		
//		String s4 = new String("");	//s4,s5,s6 → 다른 공간 사용(메모리 폭발)
//		String s5 = new String("");
//		String s6 = new String("");
		
//		double num1 = 12.578;
//		Math.round(num1);	//메소드호출
		// ()안의 데이터를 전달해주는 것 → 메소드 정의된 곳으로
		
	}	//main

}	//class
