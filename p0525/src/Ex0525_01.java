import java.util.Scanner;

public class Ex0525_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck(); //52�� ī����� �� kind, number �Է� �Ϸ�
		
		// ���� �ݺ�
		loop1: while(true) {
			d.menu_print(); // �޴� ���
			int choice = scan.nextInt(); // ��ȣ ����
			
			// 0���� Ȯ�� �� ���α׷� ����
			if(choice == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			switch (choice) {
			case 1: //ī�� 1�� ���
				System.out.println("ī�� ��ȣ�� �Է��ϼ���!(0~52) �� ");
				int num = scan.nextInt();
				d.print_1card(num);//��ȣ�� �ϳ� �޾ƾ� ��
				break;
			case 2: 
				d.print_5card();
				break;
			case 3: 
				d.print_52card();
				break;
			case 4: 
				d.shuffle();
				break;
			case 5:
//				//ī�� 7���� ���Ͱ� ��ǻ�� ���� ��½�Ű�� �޼ҵ带 �ۼ��غ��ÿ�
//				// MYCARD: SPADE,1 HEART,9 ~~
//				// ComputerCARD: SPADE,J DIAMOND,K ~~
//				d.print_7card();
//				d.print_7Ccard();
				d.handOut7card();
				break;
			case 0: 
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}

	}//main

}//class
