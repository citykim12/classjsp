import java.util.Scanner;

public class Ex0514_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		String[] subject = {"����", "����", "����"};
		int count = 0; //�л� ������ ��� �Է��ߴ��� Ȯ���ϴ� ����
		String check = ""; //0 �Ǵ� �л� �̸� Ȯ�κ���
		int searchNum=0; //�л����� ������ ����ϴ� ����
		
		loopt1: while(true) {
			System.out.println("------------------------------------");
			System.out.println("[ �л�����ó�� ���α׷� ]");
			System.out.println("------------------------------------");
			System.out.println("1.�л������߰�");
			System.out.println("2.�л���������");
			System.out.println("3.�л��������");
			System.out.println("4.�л������˻�");
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
			case 2:
				System.out.println("[ �л��������� �޴� ]");
				System.out.println("������ �л� �̸��� �Է��ϼ���.(�����޴��̵�: 0)>>");
				check = scan.next();
				if(check.equals("0")) {
					System.out.println("���� �޴��� �̵��մϴ�.");
					break;
				}
				// �ش� �л��� �ִ��� ������ Ȯ��
				searchNum = -1;
				for(int i=0; i<count; i++) {
					if(check.equals(name[i])) {
						searchNum = i;
					}
				}
				// �ش� �л��� ���� ��
				if(searchNum == -1) {
					System.out.println("�ش� �л��� �����ϴ�.");
					break;
				}
				// �ش� �л��� ���� ��
				System.out.println(check + " �л��� ã�ҽ��ϴ�.");
				//���� ������ ��������
				System.out.println("[ ������ ������ ���� ]");
				System.out.println("0.���� 1.���� 2.����"); // ������ 1~3 ���� �����Ǵµ� �迭�� �����ϱ� ���� 0~2�� ó����, 1~3���� ó���Ǹ� -1 ����� ��
				System.out.println("������ ���� ��ȣ�� �Է��ϼ���.>>");
				int sNum = scan.nextInt();
//				System.out.println(subject[sNum] + "���� ����: " + score[searchNum][sNum]);// ���� ���� ����: score[0][0] �� ���� ��������: 100 �� 90
				System.out.println("������ ���� �Է�: ");
				score[searchNum][sNum] = scan.nextInt();
				//�հ� ����
				score[searchNum][3] = score[searchNum][0]+score[searchNum][1]+score[searchNum][2];
				//��� ����
				avg[searchNum] = score[searchNum][3]/3.0;
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");

				break;
			case 3:
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

//		String[] name = new String[3];
//		int[] kor = new int[3];
//		int[] eng = new int[3];
//		int[] math = new int[3];
//		int[] total = new int[3];
//		double[] avg = new double[3];
//		
//		for(int i=0; i<name.length; i++) {
//			System.out.println("�̸��� �Է��ϼ���");
//			name[i] = scan.next();
//			System.out.println("���� ������ �Է��ϼ���");
//			kor[i] = scan.nextInt();
//			System.out.println("���� ������ �Է��ϼ���");
//			eng[i] = scan.nextInt();
//			System.out.println("���� ������ �Է��ϼ���");
//			math[i] = scan.nextInt();
//			total[i] = kor[i]+eng[i]+math[i];
//			avg[i] = total[i]/3.0;
//		}
//		
//		System.out.print("�̸�\t����\t����\t����\t�հ�\t���\n");
//		System.out.println("-------------------------------------------------");
//		for(int i=0;i<name.length; i++) {
//			System.out.print(name[i]+ "\t");
//			System.out.print(kor[i]+ "\t");
//			System.out.print(eng[i]+ "\t");
//			System.out.print(math[i]+ "\t");
//			System.out.print(total[i]+ "\t");
//			System.out.println(avg[i]);
//		}
		
	} // main
} // class