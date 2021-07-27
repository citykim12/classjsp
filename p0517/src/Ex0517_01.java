import java.util.Scanner;

public class Ex0517_01 {

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
		int choice = 0; // ���ù�ȣ ����
		int count=0; //�л����� ����
		String search_name = ""; // ã���� �ϴ� �̸��� ����
		int search_num1 = 0; // ã�� �̸���ȣ ����
		int search_num2 = 0; // ã�� �����ȣ ����
		
		loop1: while(true) { //���ѹݺ�
			System.out.println("-------------------------------------");
			System.out.println("         [ �л�����ó�� ���α׷� ]         ");
			System.out.println("-------------------------------------");
			System.out.println("1. �л������߰�");
			System.out.println("2. �л��������");
			System.out.println("3. �л���������");
			System.out.println("4. �л������˻�");
			System.out.println("5. �л����ó��");
			System.out.println("6. �л����� ���α׷�����");
			System.out.println("-------------------------------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
			choice = scan.nextInt();
			
			switch (choice) {
			case 1://�л����� �߰�
				System.out.println("< �л������߰� �޴� >");
				//1. �̸�, ����, ����, ���� �� �հ�, ���
				for(int i=0; i<name.length; i++) {
					System.out.println("�̸��� �Է��ϼ���.(0.�����޴��̵�)>>");
					name[i] = scan.next();
					//��
					if(name[i].equals("0")) {
						System.out.println("< �����޴��� �̵��մϴ�! >");
						break;
					}
					//�����Է�
					for(int j=0; j<score[i].length-1; j++) {
						System.out.println(title[j+1] + "������ �Է��ϼ���.>>");
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
				//���Ÿ��Ʋ ���
				for(int i=0; i<title.length; i++) { //�̸� ���� ����~ ������� ����
					System.out.print(title[i] + "\t");
					
				}
				System.out.println();
				System.out.println("-----------------------------");
				//�̸� ���
				for(int i=0; i<name.length; i++) {
					System.out.print(name[i]+"\t");
					
				//���� ���
				for(int j=0; j<score[i].length; j++) {
					System.out.print(score[i][j]+"\t"); //������� ����
				}
				//���
				System.out.printf("%.2f \t", avg[i]);
				//���
				System.out.println(rank[i]+"\n");
				}
				System.out.println();
				break;
			case 3://�л����� ����
				// ������ �л��� �̸��� �Է� �� � ���� ������ �������� ���� �� ����
				System.out.println("������ �л��� �̸��� �Է��ϼ���.>>");
				search_name = scan.next();
				
				//�̸� �˻�
				search_num1 = -1;
				for(int i=0; i<name.length; i++) {
					if(search_name.equals(name[i])) {
						search_num1 = i;
						break; //ã���� for�� ����
					}
				}
				// ã���� �ϴ� �̸��� ���� ��
				if(search_num1 == -1) {
					System.out.println("ã���� �ϴ� �̸��� �����ϴ�.");
					break;
				}
				// ������ ������ ����
				System.out.println("[ ������ ���� ���� ]");
				System.out.println("0.���� 1.���� 2.����");
				System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
				search_num2 = scan.nextInt();
				// ���� ���� Ȯ��
				System.out.println("���� ����: " +score[search_num1][search_num2]);
				System.out.println("�������� �Է�: "); //100 �� 90
				
				//���� ����
				score[search_num1][search_num2] = scan.nextInt();
				// ������ �հ�� ���
				//������ �հ�
				score[search_num1][3] =score[search_num1][0]+score[search_num1][1]+score[search_num1][2];
				//������ ���
	            avg[search_num1]=score[search_num1][3]/3.0;
	            System.out.println("������ �Ϸ�Ǿ����ϴ�");
				break;
			case 4://�л����� �˻�
	            //�˻��� �л��� �̸��� �Է��ϼ���
	            System.out.println("�˻��� �л��� �̸��� �Է��ϼ���.");
	            search_name = scan.next();
	            
	            //�̸� �˻�
	            search_num1 = -1;
	            for(int i=0; i<name.length; i++) {
	               if(search_name.equals(name[i])) {
	                  search_num1 = i;
	                  break; //ã���� for�� ����
	               }
	            }
	            //ã���� �ϴ� �л��� ���� ��
	            if(search_num1==-1) {
	               System.out.println("ã���� �ϴ� �л��� �����ϴ�");
	               break;
	            }
	            //ã���� �ϴ� �л��� ���� �� ã�� �л� ���
	            for(int i=0; i<title.length; i++) { // �̸� ���� ���� ����..
	               System.out.print(title[i]+"\t");
	            }
	            System.out.println();
	            System.out.println("-------------------------");
	            //�̸� ���
	            for(int i=search_num1; i<search_num1+1; i++) { //�Էµ� �л� �� ��ŭ ����
	               System.out.print(name[i]+"\t");
	               //���� ���
	               for(int j=0; j<score[i].length; j++) {
	                  System.out.print(score[i][j]+"\t"); //������� ����
	               }
	               //���
	               System.out.printf("%.2f\t",avg[i]);
	               //���
	               System.out.println(rank[i]+"\n");
	               
	            }
	            System.out.println();
				break;
			case 5://��� ó��
				for(int i=0; i<count; i++) {
					int rankNum=1;
					for(int j=0; j<count; j++){
						if(score[i][3]<score[j][3]) {
							rankNum++;
						}
					}
					rank[i]=rankNum;
				}
				System.out.println("��� ó���� �Ϸ�Ǿ����ϴ�!");
				
				break;
			case 6:// ����
				System.out.println("< ���α׷����� �޴�>");
				break loop1;
				
			default:
				System.out.println("��ȣ�� �� �� �ԷµǾ����ϴ�. �ٽ� �Է��ϼ���!");
				break;
				
			} // switch
		} // while
		
	} // main

} // class
