package pack02;

public class Buyer {
	String mem_id;
	String mem_pw;
	String name;
	int money = 1000;	// ������ 1000����
	double bonusPoint = 0;
	int i=0;
	Product[] cart = new Product[10]; 	//���Ÿ�� Ȯ�� �迭
	
	// �Ʒ��� ���� ������ �鸸�� ���� �ʰ�, �Ѱ� �� �ۼ��Ͽ��� ��� �ޱ� ������ ��°��� ���� �� �ִ�.
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����մϴ�. ��ǰ�� ������ �� �����ϴ�. �����ϼ���.");
			return; 	//�޼ҵ� return
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		cart[i++] = p;
		System.out.println(p.pro_name + " ���ŵǾ����ϴ�.");
	}
	
//	void buy(Tv t) {
//		money -= t.price; 	//(money = money - t.price;)
//		bonusPoint += t.bonusPoint; 	//(bonusPoint = bonusPoint + t.bonusPoint;)
//		System.out.println("OLEDTV ���ŵǾ����ϴ�.");
//	}
//	
//	void buy(Computer c) {
//		money -= c.price; 	//(money = money - t.price;)
//		bonusPoint += c.bonusPoint; 	//(bonusPoint = bonusPoint + t.bonusPoint;)
//		System.out.println("MAC ���ŵǾ����ϴ�.");
//	}
//	
//	void buy(Audio a) {
//		money -= a.price; 	//(money = money - t.price;)
//		bonusPoint += a.bonusPoint; 	//(bonusPoint = bonusPoint + t.bonusPoint;)
//		System.out.println("SONY ���ŵǾ����ϴ�.");
//	}
}
