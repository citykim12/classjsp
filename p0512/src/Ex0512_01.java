import java.util.Scanner;

public class Ex0512_01 {

	public static void main(String[] args) {
		// 구구단을 출력하는데
		// 출력할 구구단 범위를 입력받아 출력하시오.
		// 2, 5을 입력받았을 때, 2-5단까지 출력하시오.
		
//		Math.ceil(2.015); // 올림
//		Math.round(3.541); // 반올림
//		Math.floor(10.789); // 버림
//		int num = (int)(Math.random()*100)+1; // 1-100
//		int input1 = Math.max(10, 2); // 큰수 출력, 같은 표현 → Math.max(10, 2);
//		int input2 = Math.min(5, 15); // 작은수 출력, 같은 표현 → Math.min(5, 15);
		
		
		Scanner scan = new Scanner(System.in);
//		// 두수 입력
		System.out.println("시작할 단을 입력하시오.>>");
		int start = scan.nextInt();
		System.out.println("끝날 단을 입력하시오.>>");
		int end = scan.nextInt();
//		System.out.println("구구단 뒷자리를 입력하시오.>>");
//		int gugu = scan.nextInt();
		
		// 비교
//		if(start>end) {
//			int k=0;
//			k = start;
//			start = end;
//			end = k;
//		}
		
		int input1 = Math.max(start, end); // 큰수 출력, 같은 표현 → Math.max(10, 2);
		int input2 = Math.min(start, end);
		
		//구구단 출력
		for(int i=input1; i<=input2; i++) {
			for(int j=1; j<=9; j++){
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println();
		}	
		
		// 1~100까지 더하는 합계값이 200이 넘는 순간의 번호를 출력하시오.
		// 그 값도 출력하시오.

//		int i=0;
//		int sum=0;
//		
//		for(i=1; i<=100; i++) {
//			if(sum>200) {
//				break;
//			}
//			sum = sum + i;
//		}
//		System.out.println("순서 번호: " + ((i-1)-1));
//		System.out.println("최종 합계: " + (sum-(i-1)));
		
//		int i=1;
//		int sum=0;
//		
//		while(true) {
//			if(sum>200) {
//				break;
//			}
//			sum = sum + i;
//			i++;
//		}
//		System.out.println("순차번호: " + (i));
//		System.out.println("합계: " + sum);
		
		
	} //main
} // class
