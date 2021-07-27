import java.util.Scanner;

public class Ex0513_07 {

	public static void main(String[] args) {
		//보물찾기
		//[5][5] 배열을 2개 생성
		Scanner scan = new Scanner(System.in);
		int[][] tr1 = new int[5][5]; // 0 또는 1값이 들어가는 배열
		String[][] tr2 = new String[5][5]; // 보물 또는 꽝이 들어가는 배열
		
		int[] ball = new int[25];
		ball[0]=1;
		ball[1]=1;
		ball[2]=1;
		int temp=0, rnum=0;
		for(int i=0; i<ball.length*5; i++) {
			rnum=(int)(Math.random()*25);
			temp = ball[0];
			ball[0] = ball[rnum];
			ball[rnum] = temp;
		}
		//tr1[i][j] = 0또는 1이 들어감.
		int k = 0;
		for(int i=0; i<tr1.length; i++) {
			for(int j=0; j<tr1[i].length; j++) {
				tr1[i][j] = ball[k];
				k++;
			}
		}
		//무한반복
		while(true) {
			//출력
			System.out.print("[번호]\t[0]\t[1]\t[2]\t[3]\t[4]\n");
			for(int i=0; i<tr2.length; i++) {
				System.out.print("["+i+"]\t");
				for(int j=0; j<tr2[i].length; j++) {
					System.out.print(tr2[i][j] + "\t");	
				}
				System.out.println();
			}
			
			System.out.println("1번째 좌표(예시:12): ");
			String input1 = scan.next();
			int input2 = input1.charAt(0)-'0';
			int input3 = input1.charAt(1)-'0';
			
//			System.out.println("2번째 좌표: ");
//			int input4 = scan.nextInt();
			
//			System.out.println("1번째 좌표: ");
//			int input1 = scan.nextInt();
//			System.out.println("2번째 좌표: ");
//			int input2 = scan.nextInt();
			
			if(tr1[input2][input3]==1) {
				tr2[input2][input3] = "보물";
			}else {
				tr2[input2][input3] = "꽝";
			}
			
		}
	} //main

} //calss
