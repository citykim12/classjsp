
public class Product {

	static int count; 	// Ŭ��������
	int serialNo; 		// �ν��Ͻ� ����
	String product_name;
	int price; 			// ����
	int bonusPoint;
	
	{ // �ν��Ͻ� �ʱ�ȭ ��
		serialNo = ++count;
	}
	
	Product(){
	} //������

	//teacher answer
	Product(String product_name, int price){
		this.product_name = product_name;
		this.price = price;
		this.bonusPoint = price/100;
	} 
	// �����ε�
	Product(String product_name, int price, int bonusPoint){
		this.product_name = product_name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
	
	//me answer
//	Product(String product_name, int price, int bonusPoint){
//	this.product_name = "��Ź��";
//	this.price = 500;
//	this.bonusPoint = price/100;
//	}������
	
	
//	Product(String product_name, int price, int bonusPoint){
//		this("��Ź��", 500, 100);
//	}
	
}