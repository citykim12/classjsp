import java.util.Scanner;

public class Ex0517_04 {

	public static void main(String[] args) { //�������� �� ����
		// ��ȣ ��(0-23), ��(0-59), ��(0-59.999)�� �Է� �޾� ����Ͻÿ�.
		// time[3][3], second[3]
		// int[] num, int[] hour, int[] minute, double[] second
		// 3���� �Է¹޾� ���
		// �ð��� ������ �����ϰ� ���
		// 1. �ð��߰�
		// 2. �ð����
		// 3. �ð�����
		
		// teacher answer
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		int[] hour = new int[3];
		int[] minute = new int[3];
		double[] second = new double[3];
		
		while(true) {
			System.out.println("[ �ð� ���α׷� ]");
			System.out.println("1.�ð� �Է�");
			System.out.println("2.�ð� ���");
			System.out.println("3.�ð� ����");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
			int choice = scan.nextInt();
			
			switch (choice) {
			
			case 1:
				for(int i=0; i<hour.length; i++) {
					num[i] = i+1;
				System.out.println("�ø� �Է��ϼ���.>>");
				hour[i] = scan.nextInt();
				System.out.println("���� �Է��ϼ���.>>");
				minute[i] = scan.nextInt();
				System.out.println("�ʸ� �Է��ϼ���.>>");
				second[i] = scan.nextDouble();
			}
				break;
			case 2:
				for(int i=0; i<hour.length; i++) {
				System.out.print(num[i] + " : ");
				System.out.print(hour[i] + " : ");
				System.out.print(minute[i] + " : ");
				System.out.print(second[i] + "\n");
				
				}
				break;
			case 3:
				//�����κ� homework
				break;	
				
			default:
				break;
			}
			}

		// me answer
//		int[] num = new int[1];
//		int[] time = new int[2];
//		double[] sec = new double[1];
//		int table = 0 ;
//		
//		while(true) {
//			System.out.println("�ð�Ȯ�� ���α׷�");
//			System.out.println("1. �ð��߰�");
//			System.out.println("2. �ð����");
//			System.out.println("3. �ð�����");
//			
//			switch (table) {
//			case 1://�ð� �߰�
//				System.out.println("<�ð��߰� �޴�>");
//				for(int i=0; i<num.length; i++) {
//				System.out.println("�ð� �Է�(0. �����޴� �̵�)>>");
//					num[i] = scan.next();
//					if(num[i].equals("0")) {
//						System.out.println("< ���� �޴��� �̵�! >");
//						break;
//					}
//					for(int j=0; j<time[i].length-1; j++) {
//						System.out.println("�ð��� �Է��ϼ���.>>");
//						time[j] = scan.nextInt(); 
//					}
//					
//				}
//				break;
//				
//			case 2://�ð� ���
//				System.out.println("[ �ð� ����ϱ� ]");
//				for(int i=0; i<num.length; i++) {
//					System.out.println("����ϱ�");
//					
//				}
//				
//				break;
//
//			default:
//				break;
//			}
//			
//		}
		
		

	} // main

} // class
