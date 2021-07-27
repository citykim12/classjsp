import java.util.Scanner;

public class Ex0513_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[][] score = new int[5][4]; // 학생: 5명, 과목: 3과목
		double[] avg = new double[5];
		
		
		for(int i=0; i<5; i++) {
			// 1번째 학생 성적입력
			System.out.print("이름을 입력하세요.>>");
			name[i] = scan.next();
			for(int j=0; j<3; j++) {
				System.out.print("점수를 입력하세요.>>");
				score[i][j] = scan.nextInt();
//				for(int k=0; k<score.length; k++) {
//					sum += sum[i];}
				}
			score[i][3] = score[i][0] + score[i][1] + score[i][2];
			avg[i] = score[i][3]/3.0; 
			}
		//출력
		for(int i=0; i<5; i++) {
			// 1번째 학생 성적입력
			System.out.print(name[i]+"\t");
			for(int j=0; j<3; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(avg[i] + "\t");
			System.out.println();			
		}
		// 합계 출력
		
		
		
//		char[] hex = { 'C', 'A', 'F', 'E'}; //12,10,15,14
//		String[] octal = {"0", "1", "2", "3", 
//						  "4", "5", "6", "7", 
//						  "8", "9", "10", "11",
//						  "12", "13", "14", "15",};
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("16진수 영문을 입력하시오.(A-F)>>");
//		char hex1 = scan.next().charAt(0);
//		
//		String result="";
//		int temp=0;
//		for(int i=0; i<1; i++) {
//			System.out.println(hex1-'A'+10); //12
//			System.out.println(hex[i]-'A'+10); //12
//			0-48 A-65 C-67 C-A=2+10=12
//			0-48 A-65 	   A-A=0+10=10
//			
		} // main

	} // class
