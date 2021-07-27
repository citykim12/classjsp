import java.util.Scanner;

public class Ex0518_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//��ü �迭 �ּҼ��� - �������� �ּҸ� ������.
		Student2[] s = new Student2[10];
		String search_name = ""; //ȫ
		int search_num = -1; //�˻� �����Ͱ� �ִ��� Ȯ���ϴ� ����
		
		loop1: while(true) {
			System.out.println("[ �л����� ���α׷� ]");
			System.out.println("1. �л����� �߰�");
			System.out.println("2. �л����� ���");
			System.out.println("3. �л����� ����");
			System.out.println("4. �л����� �˻�");
			System.out.println("5. �л� ���ó��");
			System.out.println("0. ���α׷� ����");
			System.out.println("----------------------------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");

			int choice = scan.nextInt();
			
			switch (choice) {
			case 1: // �л������߰�
				for(int i=Student2.count; i<s.length; i++) {
					// ��ȣ�� �ڵ����� �Էµ�
					System.out.println("�̸��� �Է��ϼ���.>>(0.�����޴��̵�)");
					String check = scan.next();
					
					if(check.equals("0")) {
						System.out.println("�����޴��� �̵��մϴ�.");
						break;
					}
					//s[i]��ü����
					s[i] = new Student2();
					s[i].name = check;
					System.out.println("���� ������ �Է��ϼ���.>>");
					s[i].kor = scan.nextInt();
					System.out.println("���� ������ �Է��ϼ���.>>");
					s[i].eng = scan.nextInt();
					System.out.println("���� ������ �Է��ϼ���.>>");
					s[i].math = scan.nextInt();
					//�հ�
					s[i].total = s[i].kor + s[i].eng + s[i].math;
					//���
					s[i].avg = s[i].total/3.0;
				}
				break;
				
			case 2: // �л��������
				System.out.printf("��ȣ\t�̸�\t����\t����\t����\t�հ�\t���\t���\n");
				System.out.println("-----------------------------------------------");
				
				for(int i=0; i<Student2.count; i++) {
					System.out.print(s[i].stu_number+"\t");
					System.out.print(s[i].name+"\t");
					System.out.print(s[i].kor+"\t");
					System.out.print(s[i].eng+"\t");
					System.out.print(s[i].math+"\t");
					System.out.print(s[i].total+"\t");
					System.out.printf("%.2f\t", s[i].avg);
					System.out.print(s[i].rank+"\n");
				}
				break;
				
			case 3: // �л���������
				System.out.printf("������ �л��� �̸��� �Է��ϼ���.>>");
				search_name = scan.next();

				search_num = -1; //�˻� �����Ͱ� �ִ��� Ȯ���ϴ� ����
				System.out.println("[ �˻��� �л� �̸� ]");
				for(int i=0; i<Student2.count; i++) { //�л�����ŭ �˻�
					if(s[i].name.contains(search_name)) {
						System.out.println(i + "." + s[i].name);
						//0. ȫ�浿
						//1. ȫ����
						//2. ȫ���
						search_num = 0; // �˻� �����Ͱ� ���� ���0, ���� ��� -1
					}
					
				}
				//���� ���
				if(search_num == -1) {
					System.out.println("ã�� �����Ͱ� �����ϴ�.");
					break;
				}
				//���� ���
				System.out.println("������ �л��� ��ȣ�� �Է��ϼ���.>>");
				int temp_num = scan.nextInt();
				
				// ������ ������ ����
				System.out.println("[ ������ ���� ���� ]");
				System.out.println("0.���� 1.���� 2.����");
				System.out.println("������ �����ȣ�� �Է��ϼ���.>>");
				int temp_num2 = scan.nextInt();
				
				switch(temp_num2) {
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
				//��� ����
				s[temp_num].avg = s[temp_num].total/3.0;
				System.out.println("������ �Ϸ�Ǿ����ϴ�!");
				
				break;
				
			case 4: // �л������˻�
				System.out.println("�˻��� �л��� �̸��� �Է��ϼ���.>>");
				search_name = scan.next();
				
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t�հ�\t���\t���\n");
				System.out.println("-----------------------------------------------");
				
				search_num = -1; //�˻� �����Ͱ� �ִ��� Ȯ���ϴ� ����
				for(int i=0; i<Student2.count; i++) {
					if(s[i].name.contains(search_name)) {
						//���
						System.out.print(s[i].stu_number+"\t");
						System.out.print(s[i].name+"\t");
						System.out.print(s[i].kor+"\t");
						System.out.print(s[i].eng+"\t");
						System.out.print(s[i].math+"\t");
						System.out.print(s[i].total+"\t");
						System.out.print(s[i].avg+"\t");
						System.out.print(s[i].rank+"\n");
						search_num = 0; // �����Ͱ� ������� 0���� ����, ���� ��� -1
					}
				}
			
				// �������
				if(search_num == -1) {
					System.out.println("ã�� �����Ͱ� �����ϴ�.");
				}
				break;
			case 5: //�л� ���ó��
				for(int i=0; i<Student2.count; i++) {
					int rankNum =1; // ���count
					for(int j=0; j<Student2.count; j++) {
						if(s[i].total<s[j].total) {
							rankNum++;
						}
					}
					s[i].rank = rankNum;
				}
				System.out.println("��� ó���� �Ϸ�Ǿ����ϴ�!");
				break;
			case 0: //����
			System.out.println("���α׷��� �����մϴ�.");
				break loop1;
			
			}
			
		}
		
	} //main
	
} // class
