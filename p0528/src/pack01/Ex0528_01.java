package pack01;

import java.util.Scanner;

public class Ex0528_01 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		while(true) {
			Process01 p = new Process01();
			System.out.println("[ 프로그램 ]");
			System.out.println("1. 두수의 합"); // 2+7=9
			System.out.println("2. 두수 사이의 합"); // 1~10 = 55(1에서 10까지)
			System.out.println("3. 두수 크기 비교"); //두수입력받아 큰수: 10, 작은수: 5 찾아내기
			System.out.println("원하는 번호를 입력하세요 → ");
			int choice = scan.nextInt();
			
			//두수 입력받기 메소드
			int[] num = p.numInput();
			
			switch (choice) {
			case 1:
				// 1.두수를 입력받아 2.계산을 해야한다.
				int result = p.add(num[0], num[1]);
				System.out.println("결과 값: " + result);
				
				break;
				
				
			case 2:
				// 1.두수를 입력받아 2.for문 이용하여 3.더하기 계산을 한다.
				//num[0],num[1]
				
				int sum = p.numBetween(num[0],num[1]); 	//참조변수명.메소드명
				System.out.println("두수의 사이 값 : " + sum);
				break;
				
			case 3:
				// 1.두수를 입력받아 2.if문을 이용하여 3.큰수 작은수를 계산한다
				//num[0],num[1]
				//teacher answer
				
				String str = p.numCompare(num[0], num[1]);
				System.out.println(str);
				//me answer
//				int result1 = p.numCompare(num[0],num[1]); 	//참조변수명.메소드명
				break;
				
			default:
				break;
			}
		} //while

	} //main
	
} //class
