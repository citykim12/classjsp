import java.util.Scanner;

public class Ex0520_07 {

	public static void main(String[] args) {
		// �μ��� �Է¹޾� ������� ��¡� cal()�޼ҵ� ȣ��
		// cal() �� ���ϱ�, ����, ���ϱ�, �����⸦ �ؼ� ���� ����.
		Scanner scan = new Scanner(System.in);
		SignData s = new SignData();
		System.out.println("�μ��� �Է��ϼ���.>>");
		s.num1 = scan.nextInt();
		s.num2 = scan.nextInt();
		
		System.out.println("main �޼ҵ�: " + s);
		cal(s);
		
		System.out.println("�μ� ���ϱ� : " + s.result1);
		System.out.println("�μ� ���� : " + s.result2);
		System.out.println("�μ� ���ϱ� : " + s.result3);
		System.out.println("�μ� ������ : " + s.result4);

	} //main
	static void cal(SignData s) {
		System.out.println("cal�޼ҵ�: " + s);
		s.result1 = s.num1 + s.num2;
		s.result2 = s.num1 - s.num2;
		s.result3 = s.num1 * s.num2;
		s.result4 = s.num1 / s.num2;
	}

} //class
