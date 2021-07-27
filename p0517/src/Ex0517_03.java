import java.util.Scanner;

public class Ex0517_03 {

	public static void main(String[] args) {
		// 1. �迭����, ȭ����� ���
		// 2. �л����� �߰�, �л����� ���, �л����� ����, �л����� �˻�, ���ó��, ��������� ����
		// �л��̸�, ����, ����, ����, �հ�, ���, ���
		
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[][] score = new int[5][4];
		double[] avg = new double[5];
		int[] rank = new int[5];
		String[] title = {"�̸�", "����", "����", "����", "�հ�", "���", "���"};
		int choice = 0;
		int count = 0;
		String search_name =""; // ã���� �ϴ� �̸��� ����
		int[] search_num1 = new int[5];
		int search_num2 = 0;
		
		
		loop1: while(true) {
			System.out.println("[ �л�ó�� ���α׷� ]");
			System.out.println("1. �л������߰�");
			System.out.println("2. �л��������");
			System.out.println("3. �л���������");
			System.out.println("4. �л������˻�");
			System.out.println("5. �л����ó��");
			System.out.println("6. �л����� ���α׷�����");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
			choice = scan.nextInt();
			
			switch (choice) {
			case 1: // �л����� �߰�
				System.out.println("<�л������߰� �޴�>");
				//1. �̸�, ����, ����, ���� �� �հ�, ���
				for(int i=0; i<name.length; i++) {
					System.out.println("�̸� �Է�(0. �����޴� �̵�)>>");
					name[i] = scan.next();
					//��
					if(name[i].equals("0")) {
						System.out.println("< ���� �޴��� �̵�! >");
						break;
					}
					//���� �Է�
					for(int j=0; j<score[i].length-1; j++) {
						System.out.println(title[j+1] + "���� �Է�>>");
						score[i][j] = scan.nextInt();
					}
					//�հ�
					score[i][3] = score[i][0] + score[i][1] + score[i][2];
					//���
					avg[i] = score[i][3]/3.0;
					count++;
				}
				break;
			case 2://�л����� ���
				// ��� Ÿ��Ʋ ���
				for(int i=0; i<title.length; i++) {//�̸� ���� ����~ ������ ����
					System.out.print(title[i]+ "\t");
				}
				System.out.println();
				System.out.println("--------------------------------");
				// �̸� ���
				for(int i=0; i<name.length; i++) {
					System.out.print(name[i] + "\t");
					// ���� ���
					for(int j=0; j<score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					//���
					System.out.printf("%.2f \t", avg[i]);
					//���
					System.out.println(rank[i] + "\n");
				}
				System.out.println();
				break;
			case 3://�л����� ����
				// ������ �л��� �̸��� �Է� �� � ���� ������ �������� ���� �� ����
				System.out.println("������ �л��� �̸��� �Է��ϼ���.>>");
				search_name = scan.next();
				// �̸� �˻�
				int temp_num = -1; // �˻��� �л��� ��ȣ���� ����
				System.out.println("������ �л��� �������ּ���.>>");
				for(int i=0; i<count; i++) {
					if(name[i].contains(search_name)) {
						System.out.printf("%d. %s \n",i,name[i]);
						// 0. ȫ�浿
						// 1. ȫ����
						// 2. ȫ���
						temp_num=0;
					}
				}
				// ã���� �ϴ� �̸��� ���� ��/���� ��
				if(temp_num == -1) {
					System.out.println("ã���� �ϴ� �̸��� �����ϴ�!");
					break;
				}else {
					System.out.println("���ϴ� �л���ȣ�� �Է��ϼ���.>>");
					temp_num = scan.nextInt();
				}
				// ������ ���� ����
				System.out.println("[ ������ ���� ���� ]");
				System.out.println("0. ���� 1.���� 2.����");
				System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
				search_num2 = scan.nextInt();
				// ���� ���� Ȯ��
				System.out.println("���� ����: " + score[temp_num][search_num2]);
				System.out.println("�������� �Է�: "); // 100 �� 90
				//���� ����
				score[temp_num][search_num2] = scan.nextInt();
				//������ �հ�
				score[temp_num][3] = score[temp_num][0] + score[temp_num][1] + score[temp_num][2];
				// ������ ���
				avg[temp_num] = score[temp_num][3]/3.0;
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				break;
				
			case 4://�л����� �˻�
				System.out.println("�˻��� �л��� �̸��� �Է��ϼ���.>>");
				search_name = scan.next();
				//ã�� �л� ���
				for(int i=0; i<title.length; i++) {
					System.out.print(title[i] + "\t");
				}
	            System.out.println();
	            
	          //�̸� �˻�
				search_num1[0] = -1;
				for (int i = 0; i < name.length; i++) {
					if (name[i].contains(search_name)) {

						// �̸� ���
//			            for(int i=search_num1[0]; i<(search_num1[0]+1); i++) {
						System.out.print(name[i] + "\t");
						// �������
						for (int j = 0; j < score[i].length; j++) {
							System.out.print(score[i][j] + "\t");
						}
						// ���
						System.out.printf("%.2f \t", avg[i]);
						// ���
						System.out.println(rank[i] + "\n");
						System.out.println();
					}
				}
				// ã���� �ϴ� �л��� ���� ��
				if(search_num1[0] == -1) {
					System.out.println("ã���� �ϴ� �л��� �����ϴ�.");
				}
				break;
			case 5://��� ó��
				for(int i=0; i<count; i++) {
					int rankNum=1;
					for(int j=0; j<count; j++) {
						if(score[i][3]<score[j][3]) {
							rankNum++;
						}
					}
					rank[i] = rankNum;
				}
				System.out.println("��� ó���� �Ϸ�Ǿ����ϴ�.");
	
				break;
			case 6://����
				System.out.println("< ���α׷� ���� �޴� >");
				break loop1;
				
			default:
				System.out.println("��ȣ�� �� �� �ԷµǾ����ϴ�. �ٽ� �Է��ϼ���!");
				break;
			}
		}

	}//main

}//class
