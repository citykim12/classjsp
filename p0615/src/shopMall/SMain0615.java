package shopMall;

import java.util.ArrayList;
import java.util.Scanner;

public class SMain0615 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Buyer b1 = new Buyer();
		
		while(true) {
		System.out.println("[ ���θ� ���α׷� ]");
		System.out.println("1. �ƺϳ�Ʈ�� ����");
		System.out.println("2. ������ ����");
		System.out.println("3. OLEDTV ����");
		System.out.println("4. ���Ÿ�� ����");
		System.out.println("5. ���� ����");
		System.out.println("--------------------------------------");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ��� �� ");
		
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			b1.buy(new Computer());
			b1.myInfo();
			break;
		case 2:
			b1.buy(new SmartPhone());
			b1.myInfo();
			break;
		case 3:
			b1.buy(new Tv());
			b1.myInfo();
			break;
		case 4:
			b1.summary();
			b1.myInfo();
			break;
		case 5:
			System.out.println("�󸶸� �����Ͻðڽ��ϱ�? (0.�����޴� �̵�)");
			int cash = scan.nextInt();
			if(cash == 0) {
				System.out.println("���� �޴��� �̵��մϴ�.");
				break;
			}
			cash = cash + b1.getMoney();
			b1.setMoney(cash);
			System.out.println(cash + "�� �����Ǿ����ϴ�.");
			b1.myInfo();
			break;
			}
		}
		
	} //main

}//class
