import java.util.Scanner;

public class Ex0510_06 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		
		// 97점이상 A+
		// 94-96점 A
		// 93-90점 A-
		// 87점이상 B+
		// 84-86점 B
		// 80-83점 B-
		// 77점이상 C+
		// 74-76점 C
		// 70-73점 C-
		// 67점이상 D+
		// 64-66점 D
		// 60-63점 D-
		// 59점이하 F
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.>>");
		int score = scan.nextInt();
						
		if(score >= 97) {
			if(score > 93) {
				System.out.println("A+");
			}else if(score > 89) {
					System.out.println("A");	
				}else {
					System.out.println("A-");
			}
		}else{
		System.out.println("F");			
	}
	
		
		// 점수를 입력받아
		// 90점 이상이면 A, 80 → B, 70 → C, 60 → D, F 
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요.>>");
//		int num = scan.nextInt();
//		num = num/10;
//		
//		switch (num) {
//		case 9:
//			System.out.println("A");
//			break;
//		case 8:
//			System.out.println("B");
//			break;
//		case 7:
//			System.out.println("C");
//			break;
//		case 6:
//			System.out.println("D");
//			break;
//		default:
//			System.out.println("F");
//			break;
//		}
//		
		
		
//		if(num >= 90) {
//			System.out.println("A");
//		}else if(num >=80) {
//			System.out.println("B");
//		}else if(num >=70) {
//			System.out.println("C");
//		}else if(num >=60) {
//			System.out.println("D");
//		}else{
//			System.out.println("F");			
//		}
//		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("국번을 입력하세요.>>");
//		int num = scan.nextInt();
//		
//		if(num==1 || num==7) {
//			System.out.println("SK");
//		}else if(num==6) {
//			System.out.println("KTF");
//		}else if(num==9) {
//			System.out.println("LG");
//		}else {
//			System.out.println("통신사 없음");
//		}
	}

}
