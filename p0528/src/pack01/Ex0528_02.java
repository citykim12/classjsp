package pack01;

import java.util.Scanner;

public class Ex0528_02 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] ball = new int[45];
		Lotto_process p = new Lotto_process();
		
		while(true) {
			System.out.println("[�ζ� ���α׷� ]");
			System.out.println("1. �ζǹ�ȣ ����");
			System.out.println("2. �ζǹ�ȣ ����");
			System.out.println("3. �ζǹ�ȣ ���ι�ȣ 6�� �Է�");
			System.out.println("4. �ζǹ�ȣ ��÷��ȣ ���");
			System.out.println("--------------------------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ��� �� ");
			
			int choice = scan.nextInt();
			switch (choice) {
			case 1: //�ζ� ��ȣ ����
				p.lotto_insert(ball);
				break;
			case 2:
				//1. temp 2.random 3.for����
				p.lotto_random(ball);
				break;

			default:
				break;
			}
			
		} //while

	} //main

}//class
