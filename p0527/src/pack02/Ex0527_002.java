package pack02;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex0527_002 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// ��ü �迭 �ּҼ��� - �������� �ּҸ� ������.
		Student[] s = new Student[10]; // 10���� ������ ����迭
		ArrayList list = new ArrayList();
		int stu_number = 0, kor = 0, eng = 0, math = 0, tota = 0, rank = 0;
		double avg = 0;
		Score_Process score = new Score_Process();

		loop1: while (true) {
			score.mainPrint(); // ���θ޴� ��� �޼ҵ�
			int choice = scan.nextInt();

			switch (choice) {
			case 1: // �л������߰�
				score.student_insert(list); // �л������߰� �޼ҵ�ȣ��
				break;
			case 2: // �л��������
				score.student_print(list); // �л�������� �޼ҵ�
				break;
			case 3: // �л���������
				score.student_update(list); // �л����� ���� �޼ҵ�
				break;
			case 4: // �л������˻�
				score.student_search(list); // �л����� �˻� �޼ҵ�
				break;
			case 5: // �л� ���ó��
				score.rank_process(list);
				break;
			case 0: // ����
				System.out.println("���α׷��� �����մϴ�.");
				break loop1;
			}
		}

	} // main method


} // class
