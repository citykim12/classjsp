package pack03;

public class Buyer {
	String mem_id;
	String mem_pw;
	String name;
	int money = 2000;
	int bonusPoint = 0;
	int i = 0;
	Product[] cart = new Product[10];
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ��ǰ�� ������ �� �����ϴ�. �����ϼ���.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		cart[i++] = p;
		System.out.println(p.pro_name + " ���ŵǾ����ϴ�.");
	}
	
}
