package pack03;

public class Ex0526_1 {

	public static void main(String[] args) {
		// ����: Product 
		// �ڼ�: Refrigerator - "����ũ", 300, 30
		// Washer - "Ʈ��", 180, 18
		// Conditionar - "��ǳ", 230, 23
		// Styler - "��Ÿ�Ϸ�", 130, 13
		// �ʱ� �����ݾ� - 2000
		// ���Ź�ǰ - ����ũ 2��, Ʈ�� 3��, ��ǳ 1��, ��Ÿ�Ϸ� 2��
		// �ѱ��űݾ� ���, �� ���Ź�ǰ, 
		
		Buyer b1 = new Buyer();
		b1.mem_id = "member_01";
		b1.name = "hong gildong";
		
		b1.buy(new Refrigerator());
		b1.buy(new Refrigerator());
		b1.buy(new Wacher());
		b1.buy(new Wacher());
		b1.buy(new Wacher());
		b1.buy(new Conditionar());
		b1.buy(new Styler());
		b1.buy(new Styler());
		
		System.out.println("���� �ݾ�: " + b1.money);
		System.out.println("���� ����Ʈ: " + b1.bonusPoint);
		
		int sum = 0, bonus = 0;
		String buy_print = "";
		for(int i=0; i<b1.i; i++) { //cart.length: 10
			sum = sum + b1.cart[i].price;
			bonus = bonus + b1.cart[i].bonusPoint;
			buy_print = buy_print + b1.cart[i].pro_name + "," + " ";
		}
		
		System.out.println("�� ���� �ݾ�: " + sum);
		System.out.println("�� ���ʽ� ����Ʈ:" + bonus);
		System.out.println("���Ÿ��: " + buy_print);

	} //main

} //class
