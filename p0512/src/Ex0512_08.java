import java.util.Scanner;

public class Ex0512_08 {

	public static void main(String[] args) {
		// 3개를 입력받아 출력하고
		// 로또번호 3개를 출력하세요.
		// 정답 순서: 1 → 3개 입력받아 출력 / 2 → 로또번호 배열 생성 / 3 → 로또번호 순차적으로 값넣기 / 4 → 로또번호 섞기 / 5 → 로또번호 3개 출력하기
		// teacher answer
		Scanner scan = new Scanner(System.in);
		int[] mynum = new int[6];
		
		// 번호 입력
		for(int i=0; i<mynum.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.>>");
			mynum[i]  = scan.nextInt();
		}
		// 번호 출력
		System.out.println("[입력한 번호]");
		for(int i=0; i<mynum.length; i++) {
			System.out.print(mynum[i] + " ");
		}
		System.out.println();
		
		// --------------------------------------------------------------
		//1. 로또 번호 배열 45개
		int[] ball = new int[45]; 
		//2. 번호 넣기
		for(int i=0; i<ball.length; i++) {
			ball[i]=i+1;
		}
		//3. 번호 섞기
		int temp=0; //임시저장
		for(int i=0; i<200; i++) {
			int rnum = (int)(Math.random()*45); // 0-44
			//0번방과 랜덤방 값 변경
			temp = ball[0];
			ball[0] = ball[rnum];
			ball[rnum] = temp;
		}
		//4. 번호 출력
		System.out.println("[로또 랜덤 번호]");
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
		
		//5. 같은 번호 찾기
		int count = 0;
		int[] win = new int[6]; //당첨 번호 배열
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(mynum[i] == ball[j]) {
					win[count]=mynum[i]; //당첨번호를 당첨배열에 저장
					count++;
					
				}
			}
		}
		System.out.println("[ 당첨 번호 갯수 : " + count + " 개 ]");
		System.out.println("[ 당첨 번호 ]");
		for(int i=0; i<count; i++) {
			System.out.print(win[i] + " ");
		}
		System.out.println();
		
	} // main

} // class
