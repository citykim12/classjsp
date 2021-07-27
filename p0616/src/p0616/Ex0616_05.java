package p0616;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex0616_05 {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동", 100, 100, 100);
		Student s2 = new Student(2, "이순신", 90, 90, 90);
		
		System.out.println("s1의 class 이름: " + s1.getClass().getName());
		
		
		//입력된 데이터를 출력하시오
		System.out.println(s1);
		System.out.println(s2.toString());
		
	} //main

} //class
