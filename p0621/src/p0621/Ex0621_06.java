package p0621;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex0621_06 {

	public static void main(String[] args) {
		// ȫ�浿, �̼���, ������, ������, �豸, ������, ������
		// �˻��� ������ �̸� �Է¹޾� �� �� �����͸� MapProŬ������ �޼ҵ� �Ű������� �Ѱܼ�
		// �����͸� �˻��� ����
		// main���� �����͸� �Ѱ� ���
		// ��ü �̸�������, �˻��ߴ� �̸�
		// �˻� ��� �� "�̸��� �˻��Ǿ����ϴ�.", "�̸��� �˻����� �ʾҽ��ϴ�."
		// �˻� �ڵ� �� "success", "fail"

		//teachers answer
		Scanner scan = new Scanner(System.in);
		MapPro mp = new MapPro();
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "ȫ�浿",100,100,100));
		list.add(new Student(2, "�̼���",90, 90, 91));
		list.add(new Student(3, "ȫ����",99, 99, 98));
		list.add(new Student(4, "������",80,80,89));
		list.add(new Student(5, "�豸",100,100,99));
		list.add(new Student(6, "����ȫ",70,70,79));
		list.add(new Student(7, "������",99,99,100));
		
		System.out.println("�̸��� �Է��ϼ��� �� ");
		String input = scan.next();
		
		HashMap map = mp.selectPro(list, input);
		System.out.println("��ü�̸�: " + map.get("nameAll"));
		System.out.println("���: " + map.get("result"));
		System.out.println("����ڵ�: " + map.get("resultCode"));
		System.out.println("�˻��� �̸�: " + map.get("nameResult"));
		System.out.println("�˻��� �̸�: " + map.get("searchName"));
		
		//me answer
//		Scanner scan = new Scanner(System.in); 
//		ArrayList<Student> list = new ArrayList<Student>();
//		MapPro mp = new MapPro();
//		
//		HashMap map = mp.selectStudent(list);
//		
//		System.out.println("�̸� �Է� �� ");
//		strName = scan.next();
//		System.out.println("�̸� �Է� �� ");
//		strName = scan.next();
//		System.out.println("�̸� �Է� �� ");
//		strName = scan.next();
//		System.out.println("�̸� �Է� �� ");
//		strName = scan.next();
//		
//		System.out.println("list��� �̸�: " + map.get("strName"));
//		System.out.println("result ��ȣ: " + map.get("result"));
//		System.out.println("result ���: " + map.get("resultTitle"));
//		System.out.println("�˻���� �̸�: " + map.get("name"));
	}

}
