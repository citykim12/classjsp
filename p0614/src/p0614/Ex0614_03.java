package p0614;

import java.util.ArrayList;

public class Ex0614_03 {

	public static void main(String[] args) {
		
		ArrayList<Stu> list = new ArrayList<Stu>();
		
		Stu s1 = new Stu();
		s1.stu_num=1;
		s1.pw = "1111";
		s1.name = "홍길동";
		s1.nickName = "길동스";
		Stu s2 = new Stu(2, "2222", "이순신", "순신스");
//		Stu s3 = new Stu(3, "3333", "유관순", "관순스");
//		Stu s4 = new Stu(4, "4444", "강감찬", "감찬스");
//		Stu s5 = new Stu(5, "5555", "김구", "구스");
		
		//toString 받은 것, 간단하게 작성할 때 하는 방법(굳이 하지 않아도 됨)
		System.out.println("s1객체: " + s1);
//		System.out.println("s1객체 번호: " + s1.stu_num);
//		System.out.println("s1객체 비밀번호: " + s1.pw);
//		System.out.println("s1객체 이름: " + s1.name);
//		System.out.println("s1객체 닉네임: " + s1.nickName);
		
		System.out.println("s2객체: " + s2);
//		System.out.println("s2객체 번호: " + s2.stu_num);
//		System.out.println("s2객체 비밀번호: " + s2.pw);
//		System.out.println("s2객체 이름: " + s2.name);
//		System.out.println("s2객체 닉네임: " + s2.nickName);

		list.add(s1); //remove, get, size
		list.add(s2);
		
		//향상된 for문
		for(Stu s:list) {
			System.out.println(s);
		}
		
		//기존 for문
		for(int i=0; i<list.size();i++) {
			Stu s = (Stu)list.get(i);
			
			System.out.println(s.stu_num);
			System.out.println(s.pw);
			System.out.println(s.name);
			System.out.println(s.nickName);
		}
		
		//정석
//		System.out.println("s3객체: " + s3);
//		System.out.println("s3객체 번호: " + s3.stu_num);
//		System.out.println("s3객체 비밀번호: " + s3.pw);
//		System.out.println("s3객체 이름: " + s3.name);
//		System.out.println("s3객체 닉네임: " + s3.nickName);
//
//		System.out.println("s4객체: " + s4);
//		System.out.println("s4객체 번호: " + s4.stu_num);
//		System.out.println("s4객체 비밀번호: " + s4.pw);
//		System.out.println("s4객체 이름: " + s4.name);
//		System.out.println("s4객체 닉네임: " + s4.nickName);
//
//		System.out.println("s5객체: " + s5);
//		System.out.println("s5객체 번호: " + s5.stu_num);
//		System.out.println("s5객체 비밀번호: " + s5.pw);
//		System.out.println("s5객체 이름: " + s5.name);
//		System.out.println("s5객체 닉네임: " + s5.nickName);
	
		
		// 향상 for 문 - 배열, ArrayList
//		int[] arr1 = {1,2,3,4,5};
//		for(int num:arr1) {
//			System.out.println("int 배열: " + num);
//		}
//		
//		char[] ch = {'a','b','c'};
//		for(char a:ch) {
//			System.out.println("char 배열: " + a);
//		}

	}//main

}//class
