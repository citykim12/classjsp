package pack01;

import java.util.Scanner;

public class Ex0528_01 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		while(true) {
			Process01 p = new Process01();
			System.out.println("[ ���α׷� ]");
			System.out.println("1. �μ��� ��"); // 2+7=9
			System.out.println("2. �μ� ������ ��"); // 1~10 = 55(1���� 10����)
			System.out.println("3. �μ� ũ�� ��"); //�μ��Է¹޾� ū��: 10, ������: 5 ã�Ƴ���
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ��� �� ");
			int choice = scan.nextInt();
			
			//�μ� �Է¹ޱ� �޼ҵ�
			int[] num = p.numInput();
			
			switch (choice) {
			case 1:
				// 1.�μ��� �Է¹޾� 2.����� �ؾ��Ѵ�.
				int result = p.add(num[0], num[1]);
				System.out.println("��� ��: " + result);
				
				break;
				
				
			case 2:
				// 1.�μ��� �Է¹޾� 2.for�� �̿��Ͽ� 3.���ϱ� ����� �Ѵ�.
				//num[0],num[1]
				
				int sum = p.numBetween(num[0],num[1]); 	//����������.�޼ҵ��
				System.out.println("�μ��� ���� �� : " + sum);
				break;
				
			case 3:
				// 1.�μ��� �Է¹޾� 2.if���� �̿��Ͽ� 3.ū�� �������� ����Ѵ�
				//num[0],num[1]
				//teacher answer
				
				String str = p.numCompare(num[0], num[1]);
				System.out.println(str);
				//me answer
//				int result1 = p.numCompare(num[0],num[1]); 	//����������.�޼ҵ��
				break;
				
			default:
				break;
			}
		} //while

	} //main
	
} //class
