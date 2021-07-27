package pack02;

public class Buyer {
	String mem_id;
	String mem_pw;
	String name;
	int money = 1000;	// 적립금 1000만원
	double bonusPoint = 0;
	int i=0;
	Product[] cart = new Product[10]; 	//구매목록 확인 배열
	
	// 아래와 같이 적으면 백만번 적지 않고, 한개 만 작성하여도 상속 받기 때문에 출력값을 얻을 수 있다.
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다. 물품을 구매할 수 없습니다. 충전하세요.");
			return; 	//메소드 return
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		cart[i++] = p;
		System.out.println(p.pro_name + " 구매되었습니다.");
	}
	
//	void buy(Tv t) {
//		money -= t.price; 	//(money = money - t.price;)
//		bonusPoint += t.bonusPoint; 	//(bonusPoint = bonusPoint + t.bonusPoint;)
//		System.out.println("OLEDTV 구매되었습니다.");
//	}
//	
//	void buy(Computer c) {
//		money -= c.price; 	//(money = money - t.price;)
//		bonusPoint += c.bonusPoint; 	//(bonusPoint = bonusPoint + t.bonusPoint;)
//		System.out.println("MAC 구매되었습니다.");
//	}
//	
//	void buy(Audio a) {
//		money -= a.price; 	//(money = money - t.price;)
//		bonusPoint += a.bonusPoint; 	//(bonusPoint = bonusPoint + t.bonusPoint;)
//		System.out.println("SONY 구매되었습니다.");
//	}
}
