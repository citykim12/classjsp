import java.util.Scanner;

public class Ex0514_04 {

	public static void main(String[] args) {
		// 1.ȭ��� ��� - while(), switch()���� ���� ���� ��
		// 2.10�� �л������߰� �κ��� ���� �� �迭 ���� 
		// �� �̸�,����,����,���� �Է� ���� �� �հ�, ��� �Է�
		// 3.�л���������� ����
		
		Scanner scan = new Scanner(System.in);
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		String[] subject = {"����", "����", "����"};
		int count = 0; //�л� ������ ��� �Է��ߴ��� Ȯ���ϴ� ����
		String check = ""; //0 �Ǵ� �л� �̸� Ȯ�κ���
		int searchNum=0; //�л����� ������ ����ϴ� ����
		String check_name = ""; // �л� �̸� �˻�
		int findnum = 0; // ������ ������ ��ġ���� 
		
		loopt1: while(true) {
			System.out.println("------------------------------------");
			System.out.println("[ �л�����ó�� ���α׷� ]");
			System.out.println("------------------------------------");
			System.out.println("1.�л������߰�");
			System.out.println("2.�л���������");
			System.out.println("3.�л��������");
			System.out.println("4.�л������˻�");
			System.out.println("5.�л����ó��");
			System.out.println("0.���α׷�����");
			System.out.println("------------------------------------");			
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1: //�л������߰�
				System.out.println("[ �л������߰� �޴� ]");
				// 3���� �л��̸� ����, ����, ���� ������ �Է¹޾� �հ�, ��ձ��� ��� 
				// �̸�-String, ����, ����, ����, �հ�-int, ���-double
				// �Է�
				for(int i=count; i<name.length; i++) {
					System.out.println("�л� �̸��� �Է��ϼ���.(�����޴��̵�: 0)>>");
					check = scan.next();
					// 0�� �ԷµǾ����� Ȯ��
					if(check.equals("0")) {
						System.out.println("���� �޴��� �̵��մϴ�.");
						break;
					}
					name[i] = check;
					
					for(int j=0; j<(score[i].length-1); j++) {
						System.out.println(subject[j] + " ������ �Է��ϼ���.>>");
						score[i][j] = scan.nextInt();	
					}
					score[i][3] = score[i][0] + score[i][1] + score[i][2]; //�հ�
					avg[i] = score[i][3]/3.0; //���
					count++; //�л� 1���߰�
					System.out.println((i+1) + "�� �л��� ������ �ԷµǾ����ϴ�.");
				}
				
				
				break;
			case 2: // �л���������
				System.out.println("[ �л��������� �޴� ]");
				System.out.println("������ �л��̸��� �Է��ϼ���.>>");
				check_name = scan.next(); // ������ �л��̸� �Է�
				
				// �����Ͱ� ���� ���
				findnum = -1;
				for(int i=0; i<count; i++) {
					if(check_name.equals(name[i])) {
						findnum = i;
					}
				}
				
				if(findnum == -1) {
					System.out.println("�����Ͱ� �����ϴ�.");
					break;
				}
				
				System.out.println("[ �������� ���� ]");
				System.out.println("0.���� 1.���� 2.����");
				System.out.println("���������� �����ϼ���.>>");
				int subname = scan.nextInt();
				System.out.println("�������� �Է�: ");
				score[findnum][subname] = scan.nextInt();
				//�հ� ���ϴ� ����
				score[findnum][3] = score[findnum][0] + score[findnum][1] + score[findnum][2];
				//��� ���ϴ� ����
				avg[findnum] = score[findnum][3]/3.0;

				break;
			case 3: //�л��������
				System.out.println("[ �л�������� �޴� ]");
				System.out.print("�̸�\t����\t����\t����\t�հ�\t���\n");
				System.out.println("-------------------------------------------");
				// ���α׷� ���
				for(int i=0; i<count; i++) {
					System.out.print(name[i]+"\t"); // �̸����
					for(int j=0; j<score[i].length; j++) {
						System.out.print(score[i][j] + "\t"); // ����, ����, ����, �հ�
					}
					System.out.printf("%.2f \n", avg[i]); // ���
				}
				
				break;
			case 4:
				System.out.println("-----> �л������˻�");
				// 
				
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				break loopt1;
				
			default:
				System.out.println("��ȣ�� �� �� �Է��ϼ̽��ϴ�.");
				break;
			
			}//switch
			
		}//while

	} //main

} //class