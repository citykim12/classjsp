package shopMall;

import java.util.ArrayList;

public class Buyer extends Product {
	private String member_id;
	private String member_pw;
	private String name;
	private int money = 2000;
	private int bonusPoint;
	
	ArrayList list = new ArrayList();
	
	void buy(Product p) {
		if(money<p.getPrice()) {
			System.out.println("잔액이 부족합니다. 잔액 충전 해주세요.");
			return;
		}
		money -= p.getPrice();
		bonusPoint += p.getBonusPoint();
		System.out.println(p.getPro_name() + "구매하였습니다.");
		list.add(p);
	}
	
	void myInfo() {
		System.out.println("보유 금액: " + money);
		System.out.println("보너스 포인트: " + bonusPoint);
	}
	
	void summary() {
		String product_list = " ";
		if(list.isEmpty()) {
			System.out.println("구매한 물품이 없습니다.");
			return;
		}
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			Product p = (Product)list.get(i);
			product_list = product_list + p.getPro_name() + " ";
			sum += p.getPrice();
		}
		System.out.println("총 구매 목록 갯수: " + list.size());
		System.out.println("총 구매 금액: " + sum);
		System.out.println("구매 목록: " + product_list);
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pw() {
		return member_pw;
	}

	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		this.list = list;
	}

}
