package pack02;

public class Ex0526_002 {

	public static void main(String[] args) {
		Buyer b1 = new Buyer();
		b1.mem_id = "member01";
		b1.name = "hong gildong";
		
		b1.buy(new Tv()); 	//�̰͵� �Ʒ��� ���� �ƶ����� ��� ���� //100
		b1.buy(new Audio()); //50
		b1.buy(new Tv()); //100
		b1.buy(new Tv()); //100
		b1.buy(new Tv()); //100
		b1.buy(new Computer()); // 150
		b1.buy(new Computer()); // 150
		b1.buy(new Computer()); // 150
		b1.buy(new Computer()); // 150
		
//		Tv t1 = new Tv(); 	// "OLEDTV", 100, 10
//		b1.buy(t1);
		
//		Computer c1 = new Computer();
//		b1.buy(c1);
//		
//		Audio a1 = new Audio();
//		b1.buy(a1);
		
		System.out.println("���� �ݾ�: " + b1.money);
		System.out.println("���ʽ� ����Ʈ: " + b1.bonusPoint);
		
		int sum = 0, bonus = 0;
		String buy_print = "";
		for(int i=0; i<b1.cart.length; i++) {
//			System.out.print(b1.cart[i].pro_name + " ");
			sum = sum + b1.cart[i].price;
			bonus = bonus + b1.cart[i].bonusPoint;
			buy_print = buy_print + b1.cart[i].pro_name + " ";
		}
		System.out.println("���Ÿ��: " + buy_print);
		System.out.println("�� ���űݾ�: " + sum);
		System.out.println("�� ���ʽ� ����Ʈ: " + bonus);

	} //main

} //class
