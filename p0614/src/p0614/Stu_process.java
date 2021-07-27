package p0614;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_process {
	Scanner scan = new Scanner(System.in);
		
	//1.
	void student_insert(ArrayList list) {
		String stu_name = " ";
		int kor = 0, eng = 0, math = 0;
		
		while(true) {
			System.out.println("�л� �̸��� �Է��ϼ��� ��(0. �����޴��� �̵�)");
			stu_name = scan.next();
			if(stu_name.equals("0")) {
				System.out.println("��� �޴��� �̵��մϴ�.");
				break;
			}
			System.out.println("���� ������ �Է��ϼ��� �� ");
			kor = scan.nextInt();
			System.out.println("���� ������ �Է��ϼ��� �� ");
			eng = scan.nextInt();
			System.out.println("���� ������ �Է��ϼ��� �� ");
			math = scan.nextInt();

			list.add(new Student(stu_name, kor, eng, math));
		}
		
	}
	//2.
	void student_print(ArrayList list) {
		System.out.print("��ȣ\t�̸�\t����\t����\t����\t�հ�\t���\t���\n");
		System.out.println("----------------------------------------");
		
		for(int i=0; i<list.size(); i++) {
			Student s = (Student)list.get(i);
			System.out.print(s.stu_num+"\t");
			System.out.print(s.stu_name+"\t");
			System.out.print(s.kor+"\t");
			System.out.print(s.eng+"\t");
			System.out.print(s.math+"\t");
			System.out.print(s.total+"\t");
			System.out.printf("%.2f \t", s.avg);
			System.out.print(s.rank+"\n");
			
		}
	}
	//3.
	void student_update(ArrayList list) {
		String stu_name = " ";
		int kor = 0, eng = 0, math = 0;
		
		System.out.println("�˻��� �л��� �̸��� �Է��ϼ��� �� ");
		stu_name = scan.next();
		
		int check_flag = 0;
		for(int i=0; i<list.size(); i++) {
			Student s = (Student)list.get(i);
			if(stu_name.equals(stu_name)) {
				System.out.println("�����ϰ��� �ϴ� �л��� ã�ҽ��ϴ�!");
				System.out.println("[ ������ ���� ���� ]");
				System.out.println("1.���� 2.���� 3.����");
				System.out.println("������ ���� ��ȣ�� �Է��ϼ��� ��");
				int choice = scan.nextInt();
				switch (choice) {
				case 1:
					System.out.println("���� ����: " + s.kor);
					System.out.println("�����ϰ� ���� ������ �Է��ϼ��� �� ");
					s.kor = scan.nextInt();
					break;
				case 2:
					System.out.println("���� ����: " + s.eng);
					System.out.println("�����ϰ� ���� ������ �Է��ϼ��� �� ");
					s.eng = scan.nextInt();
					break;
				case 3:
					System.out.println("���� ����: " + s.math);
					System.out.println("�����ϰ� ���� ������ �Է��ϼ��� �� ");
					s.math = scan.nextInt();
					break;
				}
				s.total = s.kor + s.eng + s.math;
				s.avg = s.total/3.0;
				check_flag = 1;
			}
		}
		if(check_flag == 0) {
			System.out.println("ã�� �����Ͱ� �����ϴ�.");
		}
	}
	
	//4.
	void student_search(ArrayList list) {
		String stu_name = " ";
		int kor = 0, eng = 0, math = 0;
		
		System.out.println("�˻��� �л��� �̸��� �Է��ϼ��� �� ");
		stu_name = scan.next();
		
		int check_flag = 0;
		for(int i=0; i<list.size(); i++) {
			Student s = (Student)list.get(i);
			
			if(s.stu_name.contains(stu_name)) {
				System.out.print(s.stu_num+"\t");
				System.out.print(s.stu_name+"\t");
				System.out.print(s.kor+"\t");
				System.out.print(s.eng+"\t");
				System.out.print(s.math+"\t");
				System.out.print(s.total+"\t");
				System.out.printf("%.2f \t", s.avg);
				System.out.print(s.rank+"\n");
				check_flag = 1;
			}
		}
		if(check_flag == 0) {
			System.out.println("ã�� �����Ͱ� �����ϴ�.");
		}
		
	}
	
	//5.
	void student_rank(ArrayList list) {
		for(int i=0; i<list.size(); i++) {
			Student s1 = (Student)list.get(i);
			int rCount = 1;
			for(int j=0; j<list.size(); j++) {
				Student s2 = (Student)list.get(i);	
				if(s1.total<s2.total) {
					rCount++;
				}
			}
			s1.rank = rCount;
		}
		System.out.println("��� ó���� �Ϸ�Ǿ����ϴ�.");
	}

}
