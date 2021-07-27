import java.util.Scanner;

public class Ex0512_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int kor 5개 만들어서 100
		
		String[] name = new String[3]; 
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		
		// 입력
		for(int i=0; i<name.length; i++) {
			System.out.println("이름을 입력하세요.>>");
			name[i] = scan.next();
			System.out.println("국어 점수를 입력하세요.>>");
			kor[i] = scan.nextInt();
			System.out.println("영어 점수를 입력하세요.>>");
			eng[i] = scan.nextInt();
			System.out.println("수학 점수를 입력하세요.>>");
			math[i] = scan.nextInt();
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0;
		}
		// 출력
		for(int i=0; i<name.length; i++) {
			System.out.print("이름: " + name[i] + "\t");
			System.out.print("국어 점수: " + kor[i] + "\t");
			System.out.print("영어 점수: "+ eng[i] + "\t");
			System.out.print("수학 점수: "+ math[i] + "\t");
			System.out.print("합계: "+ total[i] + "\t");
			System.out.printf("평균: %.2f", avg[i]);
			System.out.println();
		}
		
//		int[] kor = {100, 100, 100, 100, 100};
		
		
//		int[] score = new int[6];
//		score[0] = 100;
//		score[1] = 90;
//		score[2] = 80;
//		score[3] = 70;
//		score[4] = 60;
//		score[5] = 50;
		
//		int[] score= {100, 90, 80, 70, 60};
//		for(int i=0; i<score.length; i++) {
//			System.out.println(score[i]);
//		}

		
		
		//number int 배열 3개를 선언해서 1~3까지 입력하시오.
//		int[] number = new int[3];
//		number[0]=1;
//		number[1]=2;
//		number[2]=3;
//		
//		int[] number2 = {1, 2, 3}; // 위와 동일 지시어
//		
//		int[] num = new int[100];
//		for(int i=0; i<100;i++) {
//			num[i]=i+1;
//		}
//		
//		for(int i=0; i<100; i++) {
//			System.out.println(num[i]);
//		}
				
//		int num = 0;
//		int[] score = new int[5];
//		score[0]=1;
//		score[1]=2;
//		score[2]=3;
//		score[3]=4;
//		score[4]=5;
//
//		if(score[0]==1) {
//			System.out.println("score[0]의 값은 1입니다.");
//		}
//		System.out.println(score[0]);

	}//main
}//class
