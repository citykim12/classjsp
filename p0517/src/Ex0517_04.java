import java.util.Scanner;

public class Ex0517_04 {

	public static void main(String[] args) { //집에가서 해 보셈
		// 번호 시(0-23), 분(0-59), 초(0-59.999)를 입력 받아 출력하시오.
		// time[3][3], second[3]
		// int[] num, int[] hour, int[] minute, double[] second
		// 3개를 입력받아 출력
		// 시간은 수정이 가능하게 출력
		// 1. 시간추가
		// 2. 시간출력
		// 3. 시간수정
		
		// teacher answer
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		int[] hour = new int[3];
		int[] minute = new int[3];
		double[] second = new double[3];
		
		while(true) {
			System.out.println("[ 시간 프로그램 ]");
			System.out.println("1.시간 입력");
			System.out.println("2.시간 출력");
			System.out.println("3.시간 수정");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			
			switch (choice) {
			
			case 1:
				for(int i=0; i<hour.length; i++) {
					num[i] = i+1;
				System.out.println("시를 입력하세요.>>");
				hour[i] = scan.nextInt();
				System.out.println("분을 입력하세요.>>");
				minute[i] = scan.nextInt();
				System.out.println("초를 입력하세요.>>");
				second[i] = scan.nextDouble();
			}
				break;
			case 2:
				for(int i=0; i<hour.length; i++) {
				System.out.print(num[i] + " : ");
				System.out.print(hour[i] + " : ");
				System.out.print(minute[i] + " : ");
				System.out.print(second[i] + "\n");
				
				}
				break;
			case 3:
				//수정부분 homework
				break;	
				
			default:
				break;
			}
			}

		// me answer
//		int[] num = new int[1];
//		int[] time = new int[2];
//		double[] sec = new double[1];
//		int table = 0 ;
//		
//		while(true) {
//			System.out.println("시간확인 프로그램");
//			System.out.println("1. 시간추가");
//			System.out.println("2. 시간출력");
//			System.out.println("3. 시간수정");
//			
//			switch (table) {
//			case 1://시간 추가
//				System.out.println("<시간추가 메뉴>");
//				for(int i=0; i<num.length; i++) {
//				System.out.println("시간 입력(0. 상위메뉴 이동)>>");
//					num[i] = scan.next();
//					if(num[i].equals("0")) {
//						System.out.println("< 상위 메뉴로 이동! >");
//						break;
//					}
//					for(int j=0; j<time[i].length-1; j++) {
//						System.out.println("시간을 입력하세요.>>");
//						time[j] = scan.nextInt(); 
//					}
//					
//				}
//				break;
//				
//			case 2://시간 출력
//				System.out.println("[ 시간 출력하기 ]");
//				for(int i=0; i<num.length; i++) {
//					System.out.println("출력하기");
//					
//				}
//				
//				break;
//
//			default:
//				break;
//			}
//			
//		}
		
		

	} // main

} // class
