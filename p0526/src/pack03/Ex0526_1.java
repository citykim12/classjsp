package pack03;

public class Ex0526_1 {

	public static void main(String[] args) {
		// 조상: Product 
		// 자손: Refrigerator - "비스포크", 300, 30
		// Washer - "트롬", 180, 18
		// Conditionar - "무풍", 230, 23
		// Styler - "스타일러", 130, 13
		// 초기 보유금액 - 2000
		// 구매물품 - 비스포크 2대, 트롬 3대, 무풍 1대, 스타일러 2대
		// 총구매금액 출력, 총 구매물품, 
		
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
		
		System.out.println("보유 금액: " + b1.money);
		System.out.println("보유 포인트: " + b1.bonusPoint);
		
		int sum = 0, bonus = 0;
		String buy_print = "";
		for(int i=0; i<b1.i; i++) { //cart.length: 10
			sum = sum + b1.cart[i].price;
			bonus = bonus + b1.cart[i].bonusPoint;
			buy_print = buy_print + b1.cart[i].pro_name + "," + " ";
		}
		
		System.out.println("총 구매 금액: " + sum);
		System.out.println("총 보너스 포인트:" + bonus);
		System.out.println("구매목록: " + buy_print);

	} //main

} //class
