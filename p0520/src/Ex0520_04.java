import java.util.Scanner;

public class Ex0520_04 {

	public static void main(String[] args) {
		// �μ��� �Է¹޾� ū���� �������� ǥ���Ͻÿ�.
		// ū��: 10, ������: 5 ��Ÿ�� �� �ְ�
		// ���ϴ� ������ �޼ҵ�� �и��Ͻÿ�.
		
		//1. main �� �μ��� �Է¹ް�
		// compare(num1,num2);
		
		//2. compare�޼ҵ� �� ���
		//static void compare(int num1, int num2){}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���.>>");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		compare(num1,num2);

	}//main
	
	static void compare(int num1, int num2) {
		if(num1>num2) {
			System.out.printf("ū��: %d, ������: %d \n", num1, num2);
		}else if(num1<num2) {
			System.out.printf("ū��: %d, ������: %d \n", num2, num1);
		}else {
			System.out.printf("�μ��� ����: %d, %d \n", num2, num1);
		}
	}

}//class
