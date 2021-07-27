import java.util.Scanner;

public class Ex0513_06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// [5][5]배열 → 1~25까지 랜덤숫자를 넣어서 출력
		
		int[] num = new int[25];
		for(int i=0; i<num.length; i++) {
			num[i] = i + 1; // 1-25
		}
		
		int temp = 0;
		int rnum = 0;
		for(int i=0; i<num.length*5; i++) {
			rnum = (int)(Math.random()*25); // 1-25
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		//출력 
		int[][] arr = new int[5][5];
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num[count];
				count++;
//				arr[i][j] = num[5*i+j];
			}
			
		}
		
		// 무한반복
		while(true) {
		
			//배열 출력
			System.out.printf("번호\t[0]\t[1]\t[2]\t[3]\t[4]\n");
			System.out.println("------------------------------------------------------");
			for(int i=0; i<arr.length; i++) {
				System.out.print("["+i+"]\t");
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			//번호입력
			System.out.println("0-4까지 숫자를 입력하세요.>>");
			int input = scan.nextInt();
			System.out.println("0-4까지 숫자를 입력하세요.>>");
			int input1 = scan.nextInt();
			System.out.println("입력: " + input + "," + input1);
			
			//입력한 값 [0,1] → 0
			arr[input][input1]=0;
		}

	} //main

}//class
