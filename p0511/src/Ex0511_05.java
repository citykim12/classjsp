import java.util.Scanner;

public class Ex0511_05 {

	public static void main(String[] args) {
		
		// 1~100까지 난수를 생성해서
		// 무한반복해서 번호를 맞출때 break문으로 빠져나오세요.
		// 정답 숫자를 출력하시오.
		
//		// teacher answer
//		Scanner scan = new Scanner(System.in);
//		int score = (int)(Math.random()*100)+1;
//		
//		// 무한 반복
//		int num = 0;
//		int count = 1;
//		while(count<=5) {
//			System.out.println(count + "숫자를 입력하세요.>>");
//			if(num==score) {
//				System.out.println("정답입니다!");
//				break;
//			}else if(num>score) {
//				System.out.println("틀렸습니다.");
//				System.out.println(num + "입력한 숫자보다 작은수를 입력하세요!");
////			else {
////				System.out.println("틀렸습니다. 다시 도전하세요!");
//			}else {
//				System.out.println(num + "입력한 숫자보다 큰수를 입력하세요!");
//			}
//							count++;
//			}
//			System.out.println("정답: " + score);
//		}
//		
		
		// me answer
//		Scanner scan = new Scanner(System.in);
//		int sum = (int)(Math.random()*100)+1;
//		int i=1;
//		while(true) {
//			if(sum>100) {
//				break;
//			}
//			sum = sum + i;
//			i++;
//		}
//		System.out.println("반복: " + i);
//		System.out.println("정답: " + sum);
				
		//1~100까지에서 홀수만 더해서 200이 넘는 sum값과 순차번호를 출력해보세요.
//		teacher answer
//		int i=1;
//		int sum=0;
//		
//		while(true) {
//			if(sum>200) {
//				break;
//			}
//			
//			sum = sum + i;
//			i += 2;
//		}
//		System.out.println("순차번호: " + (i-2));
//		System.out.println("합계: " + sum);
		
//		me answer
//		int i=1;
//		int sum=0;
//		
//		while(true) {
//			if(sum>200) {
//				break;
//			}
//			
//			sum = sum + i;
//			i += 2;
//		}
//		System.out.println("순차번호: " + i);
//		System.out.println("합계: " + sum);
		
		// 1~100까지 합계가 500이 넘어가는 시점의 숫자와 합계를 구하시오.
//		int i=0;
//		int sum=0;
//		
//		while(true) {
//			if(sum>500) {
//				break;
//			}
//			i++;
//			sum = sum + i;
//		}
//		System.out.println("순차번호: "+ i);
//		System.out.println("합계: "+ sum);
		
		
//		int i = 0; // 순차 번호
//		int sum = 0; // 합계 초기화
//		
//		while(true) { //for (;;)과 같음
//			if(sum>100) {
//				break;
//			}
//			i++;
//			sum = sum + i;
//			
//		}
//		System.out.println("순차 번호 : " + i);
//		System.out.println("합계 : " + sum);
		
		// 아래와 같이 표기하라
		// 000
		// 001
		// 002
		// 003 ...
		// 999

		// 한줄 만 있을 경우는 중괄호{} 생략 가능, 왠만하면 넣는게 좋음
//		for(int i=0; i<=9; i++) 
//			for(int j=0; j<=9; j++) 
//				for(int k=0; k<=9; k++) 
//					System.out.println(""+i+j+k);
	}

}
