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
	void student_insert(Student[] s) {
		String name = "";
		int kor = 0, eng = 0, math = 0;

		for (int i = Student.count; i < s.length; i++) {
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
			s[i] = new Student(name, kor, eng, math);
		}
	}// �л������߰� �޼ҵ�
	
	// ������ �κ� �޼ҵ�
	void top_title() {
		System.out.printf("��ȣ\t�̸�\t����\t����\t����\t�հ�\t���\t���\n");
		System.out.println("-----------------------------------------------");
	}

	// 2. �л�������� �޼ҵ�
	void student_print(Student[] s) {
		top_title(); // ������ �κ� �޼ҵ�
		for (int i = 0; i < Student.count; i++) {
			System.out.print(s[i].stu_number + "\t");
			System.out.print(s[i].name + "\t");
			System.out.print(s[i].kor + "\t");
			System.out.print(s[i].eng + "\t");
			System.out.print(s[i].math + "\t");
			System.out.print(s[i].total + "\t");
			System.out.printf("%.2f\t", s[i].avg);
			System.out.print(s[i].rank + "\n");
		}
	}
}
