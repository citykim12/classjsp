package pack03;

import java.util.Scanner;

public class Homework_01_City {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Student[] s = new Student[10];
		String name = "";
		int stu_num = 0, kor = 0, eng = 0, math = 0, total = 0, rank = 0;
		double avg = 0;
		
		loop1: while(true) {
			mainPrint();
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				student_insert(s);
				break;
			case 2:
				student_print(s);
				break;
			case 3:
				student_update(s);
				break;
			case 4:
				student_search(s);
				break;
			case 5:
				rank_process(s);
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				break loop1;
			}
		}
		

	} //main
	static void mainPrint() {
		System.out.println("- �л����� ���α׷� -");
		System.out.println("1. �л����� �߰�");
		System.out.println("2. �л����� ���");
		System.out.println("3. �л����� ����");
		System.out.println("4. �л����� �˻�");
		System.out.println("5. �л� ���ó��");
		System.out.println("0. ���α׷� ����");
		System.out.println("---------------------------------");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ��� �� ");
	}
	// 1. 
	static void student_insert(Student[] s) {
		String name = "";
		int kor = 0, eng = 0, math = 0;
		
		for(int i=Student.count; i<s.length; i++) {
			System.out.println("�̸��� �Է��ϼ��� �� (0.�����޴� �̵�)");
			String check = scan.next();
			
			if(check.equals("0")) {
				System.out.println("���� �޴��� �̵��մϴ�.");
				break;
			}
			name = check;
			System.out.println("���� ������ �Է��ϼ��� �� ");
			kor = scan.nextInt();
			System.out.println("���� ������ �Է��ϼ��� �� ");
			eng = scan.nextInt();
			System.out.println("���� ������ �Է��ϼ��� �� ");
			math = scan.nextInt();
			
			s[i] = new Student(name, kor, eng, math);
		}
	}
	
	//��� ���
	static void top_title() {
		System.out.printf("��ȣ\t�̸�\t����\t����\t����\t�հ�\t���\t���\n");
		System.out.println("--------------------------------------------------");
	}
	
	// 2.
	static void student_print(Student[] s) {
		top_title();
		for(int i=0; i<Student.count; i++) {
			System.out.print(s[i].stu_num + "\t");
			System.out.print(s[i].name + "\t");
			System.out.print(s[i].kor + "\t");
			System.out.print(s[i].eng + "\t");
			System.out.print(s[i].math + "\t");
			System.out.print(s[i].total + "\t");
			System.out.printf("%.2f \t", s[i].avg);
			System.out.print(s[i].rank + "\n");
		}
	}
	//3. 
	static void student_update(Student[] s) {
		String search_name = "";
		int search_num = 1;
		System.out.println("������ �л��� �̸��� �Է��ϼ��� �� ");
		search_name = scan.next();
		
		if(search_name.equals("0")) {
			System.out.println("���� �޴��� �̵��մϴ�. (0.�����޴��� �̵�)");
		}else {
			search_num = -1;
			System.out.println("- �˻��� �л� �̸� -");
			for(int i=0; i<Student.count; i++) {
				if(s[i].name.contains(search_name)) {
					System.out.println(i + "." + s[i].name);
					search_num = 0;
				}
			}
			if(search_num == -1) {
				System.out.println("ã�� �����Ͱ� �����ϴ�.");
			}else {
				System.out.println("������ �л��� ��ȣ�� �Է��ϼ��� �� ");
				int temp_num = scan.nextInt();
				
				System.out.println("- ������ ���� ���� -");
				System.out.println("0.���� 1.���� 2.����");
				System.out.println("������ �����ȣ�� �Է��ϼ��� �� ");
				int temp_num2 = scan.nextInt();
				
				switch (temp_num2) {
				case 0:
					System.out.println("���� ����: " + s[temp_num].kor);
					System.out.println("������ ������ �Է��ϼ��� �� ");
					s[temp_num].kor = scan.nextInt();
					break;
				case 1:
					System.out.println("���� ����: " + s[temp_num].eng);
					System.out.println("������ ������ �Է��ϼ��� �� ");
					s[temp_num].eng = scan.nextInt();
					break;
				case 2:
					System.out.println("���� ����: " + s[temp_num].math);
					System.out.println("������ ������ �Է��ϼ��� �� ");
					s[temp_num].math = scan.nextInt();
					break;
				}
				s[temp_num].total = s[temp_num].kor + s[temp_num].eng + s[temp_num].math;
				s[temp_num].avg = s[temp_num].total/3.0;
				System.out.println("������ �Ϸ�Ǿ����ϴ�!");
			}
		}
		
	}
	//4.
	static void student_search(Student[] s) {
		String search_name = "";
		int search_num = 1;
		System.out.println("�˻��� �л��� �̸��� �Է��ϼ��� �� ");
		search_name = scan.next();
		
		top_title();
		search_num = -1;
		for(int i=0; i<Student.count; i++) {
			if(s[i].name.contains(search_name)) {
				System.out.print(s[i].stu_num + "\t");
				System.out.print(s[i].name + "\t");
				System.out.print(s[i].kor + "\t");
				System.out.print(s[i].eng + "\t");
				System.out.print(s[i].math + "\t");
				System.out.print(s[i].total + "\t");
				System.out.printf("%.2f \t", s[i].avg);
				System.out.print(s[i].rank + "\n");
			}
		}
		if(search_num == -1) {
			System.out.println("ã�� �����Ͱ� �����ϴ�.");
		}
	}
	//5.
	static void rank_process(Student[] s) {
		for(int i=0; i<Student.count; i++) {
			int rankNum = 1;
			for(int j=0; j<Student.count; j++) {
				if(s[i].total<s[j].total) {
					rankNum++;
				}
			}
			s[i].rank = rankNum;
		}
		System.out.println("��� ó���� �Ϸ�Ǿ����ϴ�!");
	}
	
} //class
