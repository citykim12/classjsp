package p0617_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_process {

	Scanner scan = new Scanner(System.in); 
	
	//1.
	void Student_insert(ArrayList list) {
		String name="";
		int kor=0, eng=0,math=0;
		
		while(true) {
			System.out.println("�л� �̸��� �Է��ϼ��� �� (0.�����޴� �̵�)");
			name = scan.next();
			if(name.equals("0")) {
				break;
			}
			
				System.out.println("���� ������ �Է��ϼ��� �� ");
				kor = scan.nextInt();
				System.out.println("���� ������ �Է��ϼ��� �� ");
				eng = scan.nextInt();
				System.out.println("���� ������ �Է��ϼ��� �� ");
				math = scan.nextInt();
				
				int total = kor+eng+math;
				double avg = total/3.0;  
				
				list.add(new Student(name, kor, eng, math));
			}
	}
	
	void Student_print(ArrayList list){

		System.out.println("��ȣ\t�̸�\t����\t����\t����\t�հ�\t���\t���\n");
		System.out.println("-----------------------------------------");
		
		for(int i=0;i<list.size();i++) {
			Student s = (Student)list.get(i);
			System.out.print(s.num + "\t");
			System.out.print(s.name + "\t");
			System.out.print(s.kor + "\t");
			System.out.print(s.eng + "\t");
			System.out.print(s.math + "\t");
			System.out.print(s.total + "\t");
			System.out.printf("%.2f \t", s.avg);
			System.out.print(s.rank + "\n");
		}
	}
	
	void Student_update(ArrayList list) {
		System.out.println("������ �л� �̸��� �Է��ϼ��� �� ");
		String name = scan.next();
		
		int check_flag = 0;
		for(int i=0;i<list.size();i++) {
			Student s = (Student)list.get(i);
			if(name.equals(s.name)) {
				System.out.println("�����ϰ��� �ϴ� �л��� ã�ҽ��ϴ�!");
				System.out.println("[ �������� ���� ]");
				System.out.println("1.���� 2.���� 3.����");
				System.out.println("���ϴ� ��ȣ�� �����ϼ��� �� ");
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
			System.out.println("������ �л��� ã�� ���Ͽ����ϴ�.");
		}
	}
	
	void Student_search(ArrayList list) {
		System.out.println("�˻��� �л� �̸��� �Է��ϼ��� �� ");
		String name = scan.next();
		
		int check_flag = 0;
		for(int i=0; i<list.size();i++) {
			Student s = (Student)list.get(i);
			if(s.name.contains(name)) {
				System.out.print(s.num + "\t");
				System.out.print(s.name + "\t");
				System.out.print(s.kor + "\t");
				System.out.print(s.eng + "\t");
				System.out.print(s.math + "\t");
				System.out.print(s.total + "\t");
				System.out.printf("%.2f \t", s.avg);
				System.out.print(s.rank + "\n");
				check_flag = 1;
			}
		}
		if(check_flag == 0) {
			System.out.println("ã�� �����Ͱ� �����ϴ�.");
		}
	}
	
	void Student_rank(ArrayList list) {
		for(int i=0; i<list.size(); i++) {
			Student s1 = (Student) list.get(i);
			int rCount = 1;
			for(int j=0; j<list.size();j++) {
				Student s2 = (Student) list.get(i);
				if(s1.total<s2.total) {
					rCount++;
				}
			}
			s1.rank=rCount;
		}
		System.out.println("���ó���� �Ϸ�Ǿ����ϴ�.");
	}

}
