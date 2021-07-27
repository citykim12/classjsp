package p0615;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0615_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		ArrayList list = new ArrayList();
		int[] arr = new int[3];
		int count = 0;
		
		while(true) {
			//[try - catch가 없는 것]
//			System.out.println("3번 실행");
//			System.out.println(0/0);
//			System.out.println("4번 실행");
//			System.out.println("5번 실행");
			
			//		//이상이 없을 경우 try 실행, 이상이 생기면 catch가 실행 됨
			try {
				System.out.println("시작하려면 아무키를 누르세요 → ");
				arr[count] = scan.nextInt();
				
				System.out.println("1번 실행");
				System.out.println("2번 실행");
				
				System.out.println("3번 실행");
//				Exception e = new Exception("고의로 예외 발생 시킴.");
//				throw e;
				System.out.println(0/0);	//0으로 나누는것은 되지 않음 → run타임 에러
				System.out.println("4번 실행");
			} catch (ArithmeticException e) {		//Exception으로 받으면 모든 예외 처리가 가능
//				System.out.println(e.getMessage());
				e.printStackTrace();
				System.out.println("0으로 숫자를 나눈 에러입니다.");
				System.out.println("5번 실행");
				System.out.println("예외처리를 해서 프로그램을 다시 시작합니다.");
			} catch(ArrayIndexOutOfBoundsException e ) {
				System.out.println("예외 발생시 배열을 10개 늘려줌");
				for(int i=0; i<arr.length; i++) {
					list.add(arr[i]);
				}
			}
			System.out.println("6번 실행");
			count++;
			
		} //while
		
	} //main

} //class
