import java.util.Scanner;

public class Ex0520_05 {

	public static void main(String[] args) {
		// �� ���� �Է¹޾� ���ϱ⸦ �ؼ� ������� ����Ͻÿ�.
		//main() �� �μ��� �Է�, add�޼ҵ� ȣ��
		//add() �� �μ��� ���ؼ� return�ؼ� ������
		//sub() ����
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�μ��� �Է��ϼ���.>>");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int result = add(num1, num2);
		System.out.println("�μ��� ���ϱ� ��� �� : " + result);
		int result1 = sub(num1, num2);
		System.out.println("�μ��� ���� ��� �� : " + result1);
		int result2 = multi(num1, num2);
		System.out.println("�μ��� ���ϱ� ��� �� : " + result2);
		double result3 = div(num1, num2);
		System.out.println("�μ��� ������ ��� �� : " + result3);
		
	} //main

	static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	static int sub(int num1, int num2) {
		int result1 = num1 - num2;
		return result1;
	}
	static int multi(int num1, int num2) {
		int result2 = num1 * num2;
		return result2;
	}
	static double div(int num1, int num2) {
		double result3 = num1 / num2;
		return result3;
	}
} //class
