import java.util.Scanner;

public class Ex0520_03 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("1��° �����͸� �Է��ϼ���.>>");
		int num1 = scan.nextInt();
		System.out.println("2��° �����͸� �Է��ϼ���.>>");
		int num2 = scan.nextInt();
		System.out.println("[ ��Ģ������ ���� ]");
		System.out.println("1.���ϱ� 2.���� 3.���ϱ� 4.������");
		System.out.println("��ȣ�� �����ϼ���.>>");
		int sign = scan.nextInt();
		String str = "";
		switch(sign) {
		case 1: //���ϱ�
			str = "���ϱ�"; 
			break;
		case 2: //����
			str = "����";
			break;
		case 3: //���ϱ�
			str = "���ϱ�";
			break;
		case 4: //������
			str = "������";
			break;
		}
		double result = calculation(num1,num2,sign);
		
		System.out.println("��Ģ���� ���� : "+ str);
		System.out.println("�����: " + result);

	} //main
	//��Ģ���� �޼ҵ�
	static double calculation(int num1, int num2, int sign) {
		
		double result = 0;
		switch(sign) {
		case 1: //���ϱ�
			result = num1+num2; 
			break;
		case 2: //����
			result = num1-num2;
			break;
		case 3: //���ϱ�
			result = num1*num2;
			break;
		case 4: //������
			result = num1/num2;
			break;
		}
		
		return result;
		
	}

}//class
