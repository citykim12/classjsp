import java.util.Scanner;

public class Ex0520_05 {

	public static void main(String[] args) {
		// 두 수를 입력받아 더하기를 해서 결과값을 출력하시오.
		//main() → 두수를 입력, add메소드 호출
		//add() → 두수를 더해서 return해서 돌려줌
		//sub() 빼기
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두수를 입력하세요.>>");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int result = add(num1, num2);
		System.out.println("두수의 더하기 결과 값 : " + result);
		int result1 = sub(num1, num2);
		System.out.println("두수의 빼기 결과 값 : " + result1);
		int result2 = multi(num1, num2);
		System.out.println("두수의 곱하기 결과 값 : " + result2);
		double result3 = div(num1, num2);
		System.out.println("두수의 나누기 결과 값 : " + result3);
		
	} //main

	static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	static int sub(int num1, int num2) {
		int result1 = num1 - num2;
		return result1;
	}
	static int multi(int num1, int num2) {
		int result2 = num1 * num2;
		return result2;
	}
	static double div(int num1, int num2) {
		double result3 = num1 / num2;
		return result3;
	}
} //class
