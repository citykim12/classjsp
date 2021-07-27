import java.util.Scanner;

public class Ex0512_09 {

	public static void main(String[] args) {
		//1. 6개 입력받아 출력
		//2. 로또번호 배열생성
		//3. 로또번호 순차적으로 번호넣기
		//4. 로또번호 섞기
		//5. 로또번호 6개 출력하기
		//6. 로또번호 개수 출력
		//7. 당첨번호 출력
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[6];
		
		for(int i=0; i<num.length; i++) {
			System.out.println((i+1) + "번째 번호를 입력하세요.>>");	
			num[i] = scan.nextInt();
		}
		System.out.println("[ 입력한 번호 ]");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+ " ");	
		}
		System.out.println();
		//---------------------------------------------
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;	
		}
		int temp = 0;
		for(int i=0; i<200; i++) {
			int rdnum = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = rdnum;
			rdnum = temp;
		}
		System.out.println("[ 로또 번호 ]");
		for(int i=0; i<6; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println();
		//-------------------------------------------------	
		int count = 0;
		int[] win = new int[6];
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(num[i] == ball[j]) {
					win[count]=num[i];
					count++;
				}
				
			}
		}
		System.out.println("[ 당첨 번호 갯수: " + count + " 개 ]");
		System.out.println("[ 당첨 번호 ]");
		for(int i=0; i<count; i++) {
			System.out.print(win[i] + " ");
		}
		System.out.println();

	} // main

} // class
