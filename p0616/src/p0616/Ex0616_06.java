package p0616;

public class Ex0616_06 {

	public static void main(String[] args) {
		
		String str = "Hello";
		str.charAt(2); // �� 1
		
		String str2 = "789450";
		char ch = str2.charAt(0);
		System.out.println("ch charAt: " + ch);
		
		//ch �� int�� �����ϴ� ���	
		int num = ch-'0';	//7 �� 55-48=7
		int num2 = 8;	//String ���: 8+""="8"
		
		str2.substring(0, 3);
		System.out.println("str2.substring(0, 3): "+ str2.substring(0, 3));
		
		String str3 = "�ڹټ����� �������� �ֽ��ϴ�.";
		System.out.println(str3.substring(0, 5));
		System.out.println(str3.substring(11, 15));
		
//		char a = ' ';
//		String str = "";	// ������� �����Ϳ� ���� ��
//		String str2 = null; // ������ ��������� ����
//		
//		String s1 = "";	//s1,s2,s3 �� ���� ���� ���(�޸� ����)
//		String s2 = "";
//		String s3 = "";
//		
//		String s4 = new String("");	//s4,s5,s6 �� �ٸ� ���� ���(�޸� ����)
//		String s5 = new String("");
//		String s6 = new String("");
		
//		double num1 = 12.578;
//		Math.round(num1);	//�޼ҵ�ȣ��
		// ()���� �����͸� �������ִ� �� �� �޼ҵ� ���ǵ� ������
		
	}	//main

}	//class
