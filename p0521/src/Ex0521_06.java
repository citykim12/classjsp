import java.util.Scanner;

public class Ex0521_06 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		//10���� �л��� �Է¹���
		Student2[] s = new Student2[10];

		// ���� �ݺ�
		loop1: while(true) {
			menu_print();
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1: //�л����� �߰�
				student_insert(s);
				break;
			case 2: //�л����� ���
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t�հ�\t���\t���\n");
				System.out.println("---------------------------------------------");
				
				for(int i=0; i<s.length; i++) {
					System.out.print(s[i].stu_number + "\t");
					System.out.print(s[i].name + "\t");
					System.out.print(s[i].kor + "\t");
					System.out.print(s[i].eng + "\t");
					System.out.print(s[i].math + "\t");
					System.out.print(s[i].total + "\t");
					System.out.printf("%.2f \t", s[i].avg);
					System.out.print(s[i].rank + "\n");
				}
				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;

			case 0: //���α׷� ����
				System.out.println("���α׷��� �����մϴ�.");
				break loop1;
			} //switch
			
		} //while

	}  //main
	
	// ��ܸ޴� ��� �޼ҵ�
	static void menu_print() {
		System.out.println("[ �л�����ó�� ���α׷� ]");
		System.out.println("1. �л����� �߰�");
		System.out.println("2. �л����� ���");
		System.out.println("3. �л����� ����");
		System.out.println("4. �л����� �˻�");
		System.out.println("5. �л� ���ó��");
		System.out.println("0. ���α׷� ����");
		System.out.println("----------------------------------");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ��� �� ");
	}
	
	// 1. �л����� �߰� �޼ҵ�
	static void student_insert(Student2[] s) {
		// �迭��ŭ �ݺ��Է�
		for (int i=Student2.count; i<s.length; i++) {
			// �ݺ� ����
			System.out.println("�̸��� �Է��ϼ���(0. �����޴��̵�) �� ");
			String name = scan.next();
			if (name.equals("0")) {
				// 0�� �ԷµǾ��� ���
				System.out.println("���� �޴��� �̵��մϴ�.");
			} else {
				// 0�� �ƴ� ���
				System.out.println("���� ������ �Է��ϼ��� �� ");
				int kor = scan.nextInt();
				System.out.println("���� ������ �Է��ϼ��� �� ");
				int eng = scan.nextInt();
				System.out.println("���� ������ �Է��ϼ��� �� ");
				int math = scan.nextInt();
				// 1�� �л����� ���
				s[i] = new Student2(name, kor, eng, math);
				System.out.println("1���� �л��� ��ϵǾ����ϴ�!");
			} 
			// �ݺ� ��
		}
		
	} //1.

} //class
