package pack02;
import java.util.ArrayList;
import java.util.Scanner;

public class Score_Process {
	static Scanner scan = new Scanner(System.in);

	// ���� �޴� ��¸޼ҵ�
	void mainPrint() {
		System.out.println("[ �л����� ���α׷� ]");
		System.out.println("1. �л����� �߰�");
		System.out.println("2. �л����� ���");
		System.out.println("3. �л����� ����");
		System.out.println("4. �л����� �˻�");
		System.out.println("5. �л� ���ó��");
		System.out.println("0. ���α׷� ����");
		System.out.println("----------------------------------");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
	}

	// 1. �л������߰� �޼ҵ�
	void student_insert(ArrayList list) {
		String name = "";
		int kor = 0, eng = 0, math = 0;
		
		while(true) {
			// ��ȣ�� �ڵ����� �Էµ�
			System.out.println("�̸��� �Է��ϼ���.>>(0.�����޴��̵�)");
			String check = scan.next();
			
			if (check.equals("0")) {
				System.out.println("�����޴��� �̵��մϴ�.");
				break;
			}
			name = check;
			System.out.println("���� ������ �Է��ϼ���.>>");
			kor = scan.nextInt();
			System.out.println("���� ������ �Է��ϼ���.>>");
			eng = scan.nextInt();
			System.out.println("���� ������ �Է��ϼ���.>>");
			math = scan.nextInt();
			
			// s[i]��ü����
			// list.add(��ü);
			list.add(new Student(name, kor, eng, math));
//			s[i] = new Student(name, kor, eng, math);
			
			}
	}// �л������߰� �޼ҵ�
	
	// ������ �κ� �޼ҵ�
	static void top_title() {
		System.out.printf("��ȣ\t�̸�\t����\t����\t����\t�հ�\t���\t���\n");
		System.out.println("-----------------------------------------------");
	}

	// 2. �л�������� �޼ҵ�
	static void student_print(ArrayList list) {
		top_title(); // ������ �κ� �޼ҵ�
		for (int i = 0; i < list.size(); i++) {
			Student s = (Student) list.get(0); //Student
			
			System.out.print(s.stu_number + "\t");
			System.out.print(s.name + "\t");
			System.out.print(s.kor + "\t");
			System.out.print(s.eng + "\t");
			System.out.print(s.math + "\t");
			System.out.print(s.total + "\t");
			System.out.printf("%.2f\t", s.avg);
			System.out.print(s.rank + "\n");
		}
	}
	// 3. �л��������� �޼ҵ�
	static void student_update(ArrayList list) {
		String search_name = "";
		int search_num = 1;
		System.out.printf("������ �л��� �̸��� �Է��ϼ���.>>");
		search_name = scan.next();
		Student s = (Student) list.get(0);

		if (search_name.equals("0")) {
			System.out.println("�����޴��� �̵��մϴ�.(0. �����޴� �̵�)>>");
//			break;
		} else {
			search_num = -1; // �˻� �����Ͱ� �ִ��� Ȯ���ϴ� ����
			System.out.println("[ �˻��� �л� �̸� ]");
			for (int i = 0; i < Student.count; i++) { // �л�����ŭ �˻�
				if (s.name.contains(search_name)) {
					System.out.println(i + "." + s.name);
					// 0. ȫ�浿
					// 1. ȫ����
					// 2. ȫ���
					search_num = 0; // �˻� �����Ͱ� ���� ���0, ���� ��� -1
				}
			}
			// ���� ���
			if (search_num == -1) {
				System.out.println("ã�� �����Ͱ� �����ϴ�.");
			} else {
				// ���� ���
				System.out.println("������ �л��� ��ȣ�� �Է��ϼ���.>>");
				int temp_num = scan.nextInt();

				// ������ ������ ����
				System.out.println("[ ������ ���� ���� ]");
				System.out.println("0.���� 1.���� 2.����");
				System.out.println("������ �����ȣ�� �Է��ϼ���.>>");
				int temp_num2 = scan.nextInt();

				switch (temp_num2) {
				case 0:
					System.out.println("���� ����: " + s.kor);
					System.out.println("������ ������ �Է��ϼ���.>>");
					// ��������
					s.kor = scan.nextInt();

					break;
				case 1:
					System.out.println("���� ����: " + s.eng);
					System.out.println("������ ������ �Է��ϼ���.>>");
					// ��������
					s.eng = scan.nextInt();
					break;
				case 2:
					System.out.println("���� ����: " + s.math);
					System.out.println("������ ������ �Է��ϼ���.>>");
					// ��������
					s.math = scan.nextInt();
					break;
				}
				// �հ����
				s.total = s.kor + s.eng + s.math;
				// ��� ����
				s.avg = s.total / 3.0;
				System.out.println("������ �Ϸ�Ǿ����ϴ�!");
			} //else
		} //if
	}
	// 4
	static void student_search(ArrayList list) {
		String search_name = "";
		int search_num = 1;
		System.out.println("�˻��� �л��� �̸��� �Է��ϼ��� �� ");
		search_name = scan.next();
		top_title();
		Student s = (Student) list.get(0);
		
		search_num = 1;
		for(int i=0; i<Student.count; i++) {
			if(s.name.contains(search_name)) {
				System.out.print(s.stu_number + "\t");
				System.out.print(s.kor + "\t");
				System.out.print(s.eng + "\t");
				System.out.print(s.math + "\t");
				System.out.print(s.total + "\t");
				System.out.printf("%.2f \t", s.avg);
				System.out.print(s.rank + "\t");
				search_num = 0;
			}
		}
		if(search_num == -1) {
			System.out.println("ã�� �����Ͱ� �����ϴ�.");
		}
	}
	// 5. �л� ���ó��
	static void rank_process(ArrayList list) {
		Student s = (Student) list.get(0);
		for (int i = 0; i < Student.count; i++) {
			int rankNum = 1; // ���count
			for (int j = 0; j < Student.count; j++) {
				if (s.total < s.total) {
					rankNum++;
				}
			}
			s.rank = rankNum;
		}
		System.out.println("��� ó���� �Ϸ�Ǿ����ϴ�!");
	}
	
}
