import java.util.Scanner;

public class Ex0514_03 {

	public static void main(String[] args) {
		// 3���� �迭 ����
		// �л��̸�, ����, ����, ���� ������ �Է¹޾� �� �հ�, ����� ���

		Scanner scan = new Scanner(System.in);
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int count = 0; //�Է��� �л� ��
		
		
		while(true) {
			System.out.println("[ ����ó�� ���α׷� ]");
			System.out.println("1. �л������߰�");
			System.out.println("3. �л��������");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
			int choice = scan.nextInt();
			String check = ""; //0���� Ȯ���ϴ� ����
			
			switch (choice) {
			case 1:
				System.out.println("[ �л������߰� �޴� ]");
				// �л� 3���� �Է¹޾� �ٷ� ���
							
				for(int i=count; i<name.length; i++) {
					System.out.println("�̸��� �Է��ϼ���.(0.�����޴��̵�)>>");
					check = scan.next();
					// 0���� �ƴ��� Ȯ��
					if(check.equals("0")) {
						break;
					}
					
					name[i] = check;
					for(int j=0; j<(score[i].length-1); j++) {
						System.out.println("������ �Է��ϼ���.>>");
						score[i][j] = scan.nextInt();
					}
					//�հ�
					score[i][3] = score[i][0] + score[i][1] + score[i][2];
					//���
					avg[i] = score[i][3]/3.0;
					count++;
				}
				break;
			case 3:
				System.out.println("�̸�\t����\t����\t����\t�հ�\t���\n");
				for(int i=0; i<name.length; i++) {
					System.out.print(name[i] + "\t");
					for(int j=0; j<score[i].length; j++){
						System.out.print(score[i][j] + "\t");	
					}
					System.out.printf("%.2f \n", avg[i]);
				}
				System.out.println();
				break;

			default:
				break;
			}
		}
		
//				int[][] score = new int[3][4];
//				int[] total = new int[3];
//				double[] avg = new double[3];
		
		
//		String[] name = new String[3];
//		int[][] score = new int[3][4];
//		double[] avg = new double[3];
//		int check = 0;
//		
//		for(int i=0; i<name.length; i++) {
//			System.out.println("�̸��� �Է��ϼ���.>>");
//			for(int j=0; j<score.length; j++) {
//				System.out.println(score + "������ �Է��ϼ���.>>");
//				check = scan.nextInt();	
//			}
			
		} //main

	} //class