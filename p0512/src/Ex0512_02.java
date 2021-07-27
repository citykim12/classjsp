import java.util.Scanner;

public class Ex0512_02 {

	public static void main(String[] args) {
		// 문제1
		// 학생이름, 국어점수, 수학점수, 영어점수를 4개를 입력받아
		// 3개를 학생이름, 합계, 평균을 출력하시오.
		
		// thecher answer
		Scanner scan = new Scanner(System.in);
		String name = "";
		int kor = 0;
		int math = 0;
		int eng = 0;
		String name1 = "";
		int kor1 = 0;
		int math1 = 0;
		int eng1 = 0;
		System.out.println("이름을 입력하세요.>>");
		name = scan.next();
		System.out.println("국어점수를 입력하세요.>>");
		kor = scan.nextInt();
		System.out.println("수학점수를 입력하세요.>>");
		math = scan.nextInt();
		System.out.println("영어점수를 입력하세요.>>");
		eng = scan.nextInt();
		
		System.out.println("이름을 입력하세요.>>");
		name1 = scan.next();
		System.out.println("국어점수를 입력하세요.>>");
		kor1 = scan.nextInt();
		System.out.println("수학점수를 입력하세요.>>");
		math1 = scan.nextInt();
		System.out.println("영어점수를 입력하세요.>>");
		eng1 = scan.nextInt();
		
		System.out.println("이름: " + name);
		System.out.println("합계: " + (kor + math + eng));
		System.out.println("평균: " + (kor + math + eng)/3.0);
		
		System.out.println("이름: " + name1);
		System.out.println("합계: " + (kor1 + math1 + eng1));
		System.out.println("평균: " + (kor1 + math1 + eng1)/3.0);
//		System.out.printf("평균: %.2f %n" (kor, math, eng)/3.0);
		
		// me answer
//		Scanner scan = new Scanner(System.in);
//		System.out.println("이름을 입력하세요.>>");
//		String name = scan.nextLine();
//		System.out.println("국어점수를 입력하세요.>>");
//		int korean = scan.nextInt();
//		System.out.println("수학점수를 입력하세요.>>");
//		int math = scan.nextInt();
//		System.out.println("영어점수를 입력하세요.>>");
//		int english = scan.nextInt();
//		
//		int sum = korean + math + english;
//		int sum1 = (korean + math + english)/3;
//		System.out.println("이름: " + name +"\n"+ "합계: " + sum +"\n"+ "평균: " + sum1);
		
		
	} //main

} //class
