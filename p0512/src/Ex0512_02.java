import java.util.Scanner;

public class Ex0512_02 {

	public static void main(String[] args) {
		// ����1
		// �л��̸�, ��������, ��������, ���������� 4���� �Է¹޾�
		// 3���� �л��̸�, �հ�, ����� ����Ͻÿ�.
		
		// thecher answer
		Scanner scan = new Scanner(System.in);
		String name = "";
		int kor = 0;
		int math = 0;
		int eng = 0;
		String name1 = "";
		int kor1 = 0;
		int math1 = 0;
		int eng1 = 0;
		System.out.println("�̸��� �Է��ϼ���.>>");
		name = scan.next();
		System.out.println("���������� �Է��ϼ���.>>");
		kor = scan.nextInt();
		System.out.println("���������� �Է��ϼ���.>>");
		math = scan.nextInt();
		System.out.println("���������� �Է��ϼ���.>>");
		eng = scan.nextInt();
		
		System.out.println("�̸��� �Է��ϼ���.>>");
		name1 = scan.next();
		System.out.println("���������� �Է��ϼ���.>>");
		kor1 = scan.nextInt();
		System.out.println("���������� �Է��ϼ���.>>");
		math1 = scan.nextInt();
		System.out.println("���������� �Է��ϼ���.>>");
		eng1 = scan.nextInt();
		
		System.out.println("�̸�: " + name);
		System.out.println("�հ�: " + (kor + math + eng));
		System.out.println("���: " + (kor + math + eng)/3.0);
		
		System.out.println("�̸�: " + name1);
		System.out.println("�հ�: " + (kor1 + math1 + eng1));
		System.out.println("���: " + (kor1 + math1 + eng1)/3.0);
//		System.out.printf("���: %.2f %n" (kor, math, eng)/3.0);
		
		// me answer
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�̸��� �Է��ϼ���.>>");
//		String name = scan.nextLine();
//		System.out.println("���������� �Է��ϼ���.>>");
//		int korean = scan.nextInt();
//		System.out.println("���������� �Է��ϼ���.>>");
//		int math = scan.nextInt();
//		System.out.println("���������� �Է��ϼ���.>>");
//		int english = scan.nextInt();
//		
//		int sum = korean + math + english;
//		int sum1 = (korean + math + english)/3;
//		System.out.println("�̸�: " + name +"\n"+ "�հ�: " + sum +"\n"+ "���: " + sum1);
		
		
	} //main

} //class
