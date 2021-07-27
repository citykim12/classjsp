import java.util.Scanner;

public class Ex0521_02 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// ��ü �迭 �ּҼ��� - �������� �ּҸ� ������.
		Student[] s = new Student[10]; // 10���� ������ ����迭
		int stu_number = 0, kor = 0, eng = 0, math = 0, tota = 0, rank = 0;
		double avg = 0;
		Score_Process score = new Score_Process();

		loop1: while (true) {
			score.mainPrint(); // ���θ޴� ��� �޼ҵ�
			int choice = scan.nextInt();

			switch (choice) {
			case 1: // �л������߰�
				score.student_insert(s); // �л������߰� �޼ҵ�ȣ��
				break;
			case 2: // �л��������
				score.student_print(s); // �л�������� �޼ҵ�
				break;
			case 3: // �л���������
				student_update(s); // �л����� ���� �޼ҵ�
				break;
			case 4: // �л������˻�
				student_search(s); // �л����� �˻� �޼ҵ�
				break;
			case 5: // �л� ���ó��
				rank_process(s);
				break;
			case 0: // ����
				System.out.println("���α׷��� �����մϴ�.");
				break loop1;
			}
		}

	} // main method
	// 3. �л��������� �޼ҵ�
	static void student_update(Student[] s) {
		String search_name = "";
		int search_num = 1;
		System.out.printf("������ �л��� �̸��� �Է��ϼ���.>>");
		search_name = scan.next();

		if (search_name.equals("0")) {
			System.out.println("�����޴��� �̵��մϴ�.(0. �����޴� �̵�)>>");
//			break;
		} else {
			search_num = -1; // �˻� �����Ͱ� �ִ��� Ȯ���ϴ� ����
			System.out.println("[ �˻��� �л� �̸� ]");
			for (int i = 0; i < Student.count; i++) { // �л�����ŭ �˻�
				if (s[i].name.contains(search_name)) {
					System.out.println(i + "." + s[i].name);
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
					System.out.println("���� ����: " + s[temp_num].kor);
					System.out.println("������ ������ �Է��ϼ���.>>");
					// ��������
					s[temp_num].kor = scan.nextInt();

					break;
				case 1:
					System.out.println("���� ����: " + s[temp_num].eng);
					System.out.println("������ ������ �Է��ϼ���.>>");
					// ��������
					s[temp_num].eng = scan.nextInt();
					break;
				case 2:
					System.out.println("���� ����: " + s[temp_num].math);
					System.out.println("������ ������ �Է��ϼ���.>>");
					// ��������
					s[temp_num].math = scan.nextInt();
					break;
				}
				// �հ����
				s[temp_num].total = s[temp_num].kor + s[temp_num].eng + s[temp_num].math;
				// ��� ����
				s[temp_num].avg = s[temp_num].total / 3.0;
				System.out.println("������ �Ϸ�Ǿ����ϴ�!");
			} //else
		} //if
	}

	// 4. �л����� �˻�
	static void student_search(Student[] s) {
		String search_name = "";
		int search_num = 1;
		System.out.println("�˻��� �л��� �̸��� �Է��ϼ���.>>");
		search_name = scan.next();

		System.out.println("��ȣ\t�̸�\t����\t����\t����\t�հ�\t���\t���\n");
		System.out.println("-----------------------------------------------");

		search_num = -1; // �˻� �����Ͱ� �ִ��� Ȯ���ϴ� ����
		for (int i = 0; i < Student.count; i++) {
			if (s[i].name.contains(search_name)) {
				// ���
				System.out.print(s[i].stu_number + "\t");
				System.out.print(s[i].name + "\t");
				System.out.print(s[i].kor + "\t");
				System.out.print(s[i].eng + "\t");
				System.out.print(s[i].math + "\t");
				System.out.print(s[i].total + "\t");
				System.out.printf("%.2f \t", s[i].avg);
				System.out.print(s[i].rank + "\n");
				search_num = 0; // �����Ͱ� ������� 0���� ����, ���� ��� -1
			}
		}
		// �������
		if (search_num == -1) {
			System.out.println("ã�� �����Ͱ� �����ϴ�.");
		}
	}

	// 5. �л� ���ó��
	static void rank_process(Student[] s) {
		for (int i = 0; i < Student.count; i++) {
			int rankNum = 1; // ���count
			for (int j = 0; j < Student.count; j++) {
				if (s[i].total < s[j].total) {
					rankNum++;
				}
			}
			s[i].rank = rankNum;
		}
		System.out.println("��� ó���� �Ϸ�Ǿ����ϴ�!");
	}

} // class
