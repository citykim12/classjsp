import java.util.Scanner;

public class Ex0511_01 {

	public static void main(String[] args) {
		// 문제2
		// 숫자 2.031457 입력 받아 5자리 반올림해서 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.>>");
		double num = scan.nextDouble();
		double result = Math.round(num*10000) / 10000d;
		System.out.println("result: " + result);
		
		// 문제 1
		// 숫자를 입력 받아 짝수인지, 홀수 인지 출력하시오.(if)
//        Scanner scan = new Scanner(System.in);
//        int num = 0;
//         System.out.print("숫자를 입력하세요.>> ");
//         num = scan.nextInt();
//         scan.nextLine();
//         System.out.println("문자를 입력하세요.>>");
//         String str = scan.nextLine(); // 문자열 신림역 사거리
//         System.out.println("출력:" + num);
//         System.out.println("문자 출력:" + str);
//         if (num % 2 == 0) {
//            System.out.print(num + "는 짝수입니다.");
//        } else {
//            System.out.print(num + "는 홀수입니다.");
//	}
//         
//         scan.nextInt(); // 정수형
//         scan.nextDouble(); // 실수형
//         scan.nextFloat(); // 실수형
//         scan.next(); // 문자열 신림역 사거리
//         scan.nextLine(); // 문자열 신림역 사거리

	}
}