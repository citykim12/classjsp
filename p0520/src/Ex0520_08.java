import java.util.Scanner;

public class Ex0520_08 {
	
	public static void main(String[] args) {
		//�μ��� �Է�, sum�޼ҵ�ȣ��, return�� ���
		//sum �� �μ� ������ ���� ���Ͽ� ���� ����
		// main �μ� �Է�: 1, 100 �� return 5050�޾� main���� ���
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�μ��� �Է��ϼ���.>>");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result = sum(num1, num2);
		
		System.out.println("��� ��: " + result);
		
		
	}//main
	
	static int sum(int num1, int num2) {
		int result = 0;
		for(int i=num1; i<=num2; i++) {
			result = result + i;
		}
		return result;
	}
}//class
