package p0621;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0621_02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		StringBuffer sbf = new StringBuffer(); 
		
		list.add(new Student(1, "ȫ�浿",100,100,100));
		list.add(new Student(2, "�̼���",90, 90, 91));
		list.add(new Student(3, "������",99, 99, 98));
		list.add(new Student(4, "������",80,80,89));
		list.add(new Student(5, "�豸",100,100,99));
		list.add(new Student(6, "������",70,70,79));
		list.add(new Student(7, "������",99,99,100));
		
		for(int i=0; i<list.size();i++) {
			Student s = (Student) list.get(i);
			if(i==0) {
				sbf.append(s.getName());
			}else {
				sbf.append("," + s.getName());
			}
		}
		System.out.println("�̸�StringBuffer: " + sbf.toString());
		
		String[] strName = sbf.toString().split(",");
		for(String i:strName) {
			System.out.println("�̸�: " + i);
		}
		
		for(int i=0; i<list.size(); i++) {
			Student s = (Student)list.get(i);
			System.out.println("�л�����: " + s.getStuNo()+",");
			System.out.println(s.getName() + ",");
			System.out.println(s.getKor() + ",");
			System.out.println(s.getEng() + ",");
			System.out.println(s.getMath() + ",");
			System.out.println(s.getTotal());
		}
		
		// 1 ȫ�浿 100 100 100
		// 2 �̼��� 90 90 91
		// 3 ������ 99 99 98
		// 4 ������ 80 80 89
		// 5 �豸 100 100 99
		// 6 ������ 70 70 79
		// 7 ������ 99 99 100
		// 7���� �л������� ArrayList�� �Է� ��
		// �̸��� StringBuffer�� �߰��� ��, ","�� �����ؼ� ������ ��
		// �̸��� ����ϰ�
		// 2. StringBuffer�� �ִ� �����͸� ���� �и��ؼ�
		// �̸��� ���� ����� �غ�����.
		// 3. ArrayList�� �ִ� ������ ��� ����Ͻÿ�
		
//		Scanner scan = new Scanner(System.in);
//		ArrayList list = new ArrayList();
//		String name = "";
//		int kor = 0, eng =0, math=0;
//		
//		while(true) {
//			System.out.println("1. �л����� �Է�");
//			System.out.println("2. �л����� ���");
//			int choice = scan.nextInt();
//			
//			switch (choice) {
//			
//			case 1: 
//				while(true) {
//					System.out.println("�л� �̸��� �Է��ϼ��� �� (0.�����޴� �̵�)");
//					name = scan.next(); 
//					if(name.equals("0")) {
//						System.out.println("���� �޴��� �̵��մϴ�.");
//					}
//					System.out.println("���� ������ �Է��ϼ��� �� ");
//					kor = scan.nextInt();
//					System.out.println("���� ������ �Է��ϼ��� �� ");
//					eng = scan.nextInt();
//					System.out.println("���� ������ �Է��ϼ��� �� ");
//					math = scan.nextInt();
//					
//					int total = kor+eng+math;
//					double avg = total/3.0;  
//					
//					list.add(new Student(name, kor, eng, math));
//				}
//				
//				break;
//			case 2:
//				String name = "";
//				int kor = 0, eng =0, math=0;
//				
//				System.out.println("��ȣ\t�̸�\t����\t����\t����\t�հ�\n");
//				System.out.println("-----------------------------------------");
//				
//				for(int i=0;i<list.size();i++) {
//					Student s = (Student)list.get(i);
//					System.out.print(s.num + "\t");
//					System.out.print(s.name + "\t");
//					System.out.print(s.kor + "\t");
//					System.out.print(s.eng + "\t");
//					System.out.print(s.math + "\t");
//					System.out.print(s.total + "\t");
//				}
//				
//				break;
//			}
//		}
		
	} //main

} //class
