import java.util.Scanner;

public class Ex0513_08 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		//1-100까지 중 1개의 숫자를 랜덤으로 받아 숫자를 맞추는 프로그램을 구현
		// 횟수는 10까지만 도전 가능!, 입력한 값을 출력
		int randomNo = (int)(Math.random()*100)+1;
		int[] arr = new int[10];
		int count = 0;
		while(true) {
			if(count>10) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("숫자를 입력하세요.>>");
			int input = scan.nextInt();
			arr[count] = input; //입력한 수를 arr배열에 저장
			if(randomNo==input) {
				System.out.println("정답입니다.");
				break;
			}else if(randomNo<input) {
				System.out.println(input + "보다 작은 수를 입력하세요. 다시 도전!");
			}else {
				System.out.println(input + "보다 큰 수를 입력하세요. 다시 도전!");
			}
			count++;
		}
		
		System.out.println("정답: " + randomNo);
		System.out.println("총 도전 횟수: " + (count+1));
		System.out.print("입력한 숫자: ");
		for(int i=0; i<(count+1); i++) {
			System.out.print(arr[i]+"\t");
		}
		
//		System.out.println("글자를 입력하세요.>>");
//		String input = scan.next();
//		// 한국직업전문학교
//		// 전 자만 출력하시오.
//		// 입력한 모든 글자를 1개씩 출력
//		for(int i=0; i<input.length();i++) {
//			System.out.println(input.charAt(i)); //charAt 한글자만 지정가능
//		}
//		System.out.println(input.substring(4,7)); //substring 글자 범위 지정 가능
//		

	} // main

} // class
