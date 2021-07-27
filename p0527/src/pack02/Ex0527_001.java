package pack02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0527_001 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// �л����� ���α׷�
		Student[] s = new Student[10];
		ArrayList list = new ArrayList();
		
		String name = "";
		int stu_num = 0, kor = 0, eng =0, math = 0, total = 0, rank = 0;
		double avg = 0;
		Score_Process score = new Score_Process();
		
		loop1: while(true) {
			score.mainPrint();
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1: // �л����� �߰�
				score.student_insert(list);
				break;
			case 2: // �л����� ���
				score.student_print(list);
				break;
			case 3: // �л����� ����
				student_update(s);
				break;
			case 4: // �л����� �˻�
				score.student_search(list);
				break;
			case 5: // �л� ���ó��
				student_rank(s);
				break;
			case 0: //����
				System.out.println("���α׷��� �����մϴ�.");
				break loop1;
			}
		}
	} //main

	// 3
	static void student_update(Student[] s) {
		// 1. " "(ȫ�浿) �ִ��� ������
		// 2. �ִ� �� ������ ������ �����ϼ���. �� 1.���� 2.���� 3.����
		// ���ϴ� ���� ����
		// 1. �����
		// ���� �������� ""(100) �����Ϸ��� ������ �Է��ϼ���
		// 90 �� 90�� ����Ǿ����ϴ�. out
		// 3. ���� �� out
		
		
		//ȫ�浿 100 100 99 299 99.97
		
		System.out.println("������ �л��� �̸��� �Է��ϼ��� �� (0.�����޴� �̵�)");
		String search_name = scan.next();
		
		// �л� ������� - Student[] s: Student.count(�Էµ� �л���)
		
		System.out.println("[ �����л� ���� ]");
		for(int i=0; i<Student.count; i++) {
			if(s[i].name.contains(search_name)) {
				System.out.println(i + "." + s[i].name);
				
			}
		}
		
		System.out.println("���ϴ� �л� ��ȣ�� �Է��ϼ��� �� ");
		int temp_num = scan.nextInt();
		
		System.out.println("0.���� 1.���� 2.����");
		System.out.println("���������� �����ϼ��� �� ");
		int temp_num2 = scan.nextInt();
		//s[1].eng ����
		switch (temp_num2) {
		case 0:
			System.out.println("���� ����: " + s[temp_num].kor);
			System.out.println("������ ������ �Է��ϼ��� �� ");
			
			s[temp_num].kor = scan.nextInt();
			System.out.println("���� �� ����: " + s[temp_num].kor);
			System.out.println("������ �Ϸ�Ǿ����ϴ�!");
			break;
		case 1:
			System.out.println("���� ����: " + s[temp_num].eng);
			System.out.println("������ ������ �Է��ϼ��� �� ");
			
			s[temp_num].eng = scan.nextInt();
			System.out.println("���� �� ����: " + s[temp_num].eng);
			System.out.println("������ �Ϸ�Ǿ����ϴ�!");
			break;
		case 2:
			System.out.println("���� ����: " + s[temp_num].math);
			System.out.println("������ ������ �Է��ϼ��� �� ");
			
			s[temp_num].math = scan.nextInt();
			System.out.println("���� �� ����: " + s[temp_num].math);
			System.out.println("������ �Ϸ�Ǿ����ϴ�!");
			break;
		}
		
		s[temp_num].total = s[temp_num].kor + s[temp_num].eng + s[temp_num].math;
		s[temp_num].avg = s[temp_num].total/3.0;
	}
	
	// 5
	static void student_rank(Student[] s) {
		for(int i=0; i<Student.count; i++) {
			int rankNum = 1;
			for(int j=0; j<Student.count; j++) {
				if(s[i].total<s[j].total) {
					rankNum++;
				}
			}
			s[i].rank = rankNum;
		}
		System.out.println("���ó���� �Ϸ�Ǿ����ϴ�.");
	}
	
} //class
