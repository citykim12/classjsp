import java.util.Scanner;

public class Ex0510_06 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		
		// 97���̻� A+
		// 94-96�� A
		// 93-90�� A-
		// 87���̻� B+
		// 84-86�� B
		// 80-83�� B-
		// 77���̻� C+
		// 74-76�� C
		// 70-73�� C-
		// 67���̻� D+
		// 64-66�� D
		// 60-63�� D-
		// 59������ F
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.>>");
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
	
		
		// ������ �Է¹޾�
		// 90�� �̻��̸� A, 80 �� B, 70 �� C, 60 �� D, F 
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("������ �Է��ϼ���.>>");
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
//		System.out.println("������ �Է��ϼ���.>>");
//		int num = scan.nextInt();
//		
//		if(num==1 || num==7) {
//			System.out.println("SK");
//		}else if(num==6) {
//			System.out.println("KTF");
//		}else if(num==9) {
//			System.out.println("LG");
//		}else {
//			System.out.println("��Ż� ����");
//		}
	}

}
