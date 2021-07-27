package pack01;

import java.util.ArrayList;

public class Buyer extends Product {
	private String member_id;
	private String member_pw;
	private String name;
	private int money = 2000;
	private int bonusPoint;
	
//	private int count=0;
//	Product[] cart = new Product[10];	//���Ÿ�� ���庯�� �迭 
	ArrayList list = new ArrayList(); 
	
	// ���� �޼ҵ� �� ��ǰ���� ����, ���ʽ� ����Ʈ �߰� 
	void buy(Product p) {	//������: �θ��� ���������� �ڼ��� ��ü�� �ٷ�� ��
		if(money<p.getPrice()) {
			System.out.println("�ܾ��� �����մϴ�. �ܾ׺����� ���ּ���.");
			return; //�޼ҵ� return; // for, while, switch �� break, continue;
		}
		
		money = money - p.getPrice(); // ��ǰ ������ ����
		bonusPoint = bonusPoint + p.getBonusPoint();
		System.out.println(p.getPro_name() + " �����Ͽ����ϴ�.");
		list.add(p);
//		cart[count++] = p; //pro_name, price, bonusPoint
	}
	void myInfo() {
		System.out.println("�����ݾ�: " + money);
		System.out.println("���ʽ�����Ʈ: " + bonusPoint);
	}
	
	void summary() {
		String product_list = "";
		if(list.isEmpty()) {
			System.out.println("������ ��ǰ�� �����ϴ�.");
			return; //�޼ҵ� ����
		}
		int sum = 0;
		for(int i=0; i<list.size(); i++) { //ũ��
			Product p = (Product) list.get(i); //Object
			product_list = product_list + p.getPro_name() + " ";
			// ��ǰ�̸� pro_name
//			product_list = product_list + b1.cart[i].getPro_name() + " ";
		}
		System.out.println("�� ���� ��� ����: " + list.size());
		System.out.println("�� ���� �ݾ�: " + sum);
		System.out.println("���� ���: " + product_list);
		
		
//		for(int i=0; i<b1.getCount(); i++) {
//			product_list = product_list + b1.cart[i].getPro_name() + " ";
//		}
//		System.out.println("�� ���� ��� ����: " + b1.getCount());
//		System.out.println("���� ���: " + product_list);
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
	
	
//	public int getCount() {
//		return count;
//	}
//	public void setCount(int count) {
//		this.count = count;
//	}
}
