import java.util.Scanner;

public class Ex0518_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� ���� �Է��ϼ���.>>");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int result = add(num1, num2);

		System.out.println("������" + result);
		
	}// main �޼ҵ�
	
	// �μ��� ���ؼ� �������ִ� �޼ҵ�
	static int add(int num1, int num2) {
		int result = num1+num2; //��� ��
		return result;
	}
	
	
	// �� ���߿� ū ���� �����ϱ�
//	if(num1>num2) {
//		result = num1;
//	}else {
//		result = num2;
//	}
	
	
}// class
