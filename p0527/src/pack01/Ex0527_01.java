package pack01;

import java.util.Scanner;

public class Ex0527_01 {

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
			case 1:	//�ƺϳ�Ʈ�� ����
				b1.buy(new Computer());
				b1.myInfo();
				break;
			case 2: // ������ ����
				b1.buy(new SmartPhone());
				b1.myInfo();
				break;
			case 3: //OLEDTV ����
				b1.buy(new Tv());
				b1.myInfo();
				break;
			case 4: //���Ÿ�� ����
				String product_list = "";
				if(b1.list.isEmpty()) {
					System.out.println("������ ��ǰ�� �����ϴ�.");
					break;
				}
				int sum = 0;
				for(int i=0; i<b1.list.size(); i++) { //ũ��
					Product p = (Product) b1.list.get(i); //Object
					product_list = product_list + p.getPro_name() + " ";
					// ��ǰ�̸� pro_name
//					product_list = product_list + b1.cart[i].getPro_name() + " ";
				}
				System.out.println("�� ���� ��� ����: " + b1.list.size());
				System.out.println("�� ���� �ݾ�: " + sum);
				System.out.println("���� ���: " + product_list);
				
				
//				for(int i=0; i<b1.getCount(); i++) {
//					product_list = product_list + b1.cart[i].getPro_name() + " ";
//				}
//				System.out.println("�� ���� ��� ����: " + b1.getCount());
//				System.out.println("���� ���: " + product_list);
				b1.myInfo();
				break;
			case 5: //��������
				//�� �����Ҳ���? ������ ī���? ��������?
				System.out.println("�󸶸� �����Ͻðڽ��ϱ�?(0. �����޴����̵�)");
				int cash = scan.nextInt();
				if(cash == 0 ) {
					System.out.println("���� �޴��� �̵��մϴ�.");
					break;
				}
				cash = cash + b1.getMoney();
				b1.setMoney(cash);
				System.out.println(cash + "(����)�� �����Ǿ����ϴ�.");
				b1.myInfo();
				break;
			}
			
		}
		
		
//		System.out.println("��ǰ �̸��� �Է��ϼ��� �� ");
//		String name = scan.next();
//		Product p = new Product(); 
//		p.setPro_name(name);
//		System.out.println(p.getPro_name());
//		p.setPrice(100);
//		System.out.println(p.getPrice());
//		p.setBonusPoint(50);
//		System.out.println(p.getBonusPoint());
		
	}//main

	private static int setMoney() {
		// TODO Auto-generated method stub
		return 0;
	}

}//class
