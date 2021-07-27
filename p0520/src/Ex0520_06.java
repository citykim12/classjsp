import java.util.Scanner;

public class Ex0520_06 {

	public static void main(String[] args) {
		// 실수를 입력받아 → 반올림(round), 올림(ceil), 버림(floor)
		// main() → 실수입력, myMath 메소드 호출
		Scanner scan = new Scanner(System.in);
		
		System.out.println("실수를 입력하세요.>>");
		double num1 = scan.nextDouble();
		
		System.out.println("[ 소수점 계산 선택 ]");
		System.out.println("1.반올림 2.올림 3.버림");
		System.out.println("원하는 번호를 입력하세요.>>");
		int choice = scan.nextInt();
		//메소드 호출
		double result = myMath(num1, choice);
		
		System.out.println(result);
	}
	static double myMath(double num1, int choice) {
		double result = 0;
		if(choice==1) {
			result = Math.round(num1);
		}else if(choice==2) {
			result = Math.ceil(num1);
		}else {
			result = Math.floor(num1);
		}
		return result;
	}
		
		
//		System.out.println("실수를 입력하세요.>>");
//		double num1 = scan.nextDouble();
////		System.out.println("1.반올림 2.올림 3.버림");
//		long result = myMath(num1);
//		System.out.println("반올림: " + result);
//		double result1 = myMath1(num1);
//		System.out.println("올림: " + result1);
//		double result2 = myMath2(num1);
//		System.out.println("버림: " + result2);
//
//	}
//	static long myMath(double num1) {
//		long result = Math.round(num1);
//		return result;
//	}
//	static double myMath1(double num1) {
//		double result1 = Math.ceil(num1);
//		return result1;
//	}
//	static double myMath2(double num1) {
//		double result2 = Math.floor(num1);
//		return result2;
//	}
}
