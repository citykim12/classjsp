import java.util.Scanner;

public class Ex0520_06 {

	public static void main(String[] args) {
		// �Ǽ��� �Է¹޾� �� �ݿø�(round), �ø�(ceil), ����(floor)
		// main() �� �Ǽ��Է�, myMath �޼ҵ� ȣ��
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�Ǽ��� �Է��ϼ���.>>");
		double num1 = scan.nextDouble();
		
		System.out.println("[ �Ҽ��� ��� ���� ]");
		System.out.println("1.�ݿø� 2.�ø� 3.����");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
		int choice = scan.nextInt();
		//�޼ҵ� ȣ��
		double result = myMath(num1, choice);
		
		System.out.println(result);
	}
	static double myMath(double num1, int choice) {
		double result = 0;
		if(choice==1) {
			result = Math.round(num1);
		}else if(choice==2) {
			result = Math.ceil(num1);
		}else {
			result = Math.floor(num1);
		}
		return result;
	}
		
		
//		System.out.println("�Ǽ��� �Է��ϼ���.>>");
//		double num1 = scan.nextDouble();
////		System.out.println("1.�ݿø� 2.�ø� 3.����");
//		long result = myMath(num1);
//		System.out.println("�ݿø�: " + result);
//		double result1 = myMath1(num1);
//		System.out.println("�ø�: " + result1);
//		double result2 = myMath2(num1);
//		System.out.println("����: " + result2);
//
//	}
//	static long myMath(double num1) {
//		long result = Math.round(num1);
//		return result;
//	}
//	static double myMath1(double num1) {
//		double result1 = Math.ceil(num1);
//		return result1;
//	}
//	static double myMath2(double num1) {
//		double result2 = Math.floor(num1);
//		return result2;
//	}
}
