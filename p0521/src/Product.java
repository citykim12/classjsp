
public class Product {

	static int count; 	// 클래스변수
	int serialNo; 		// 인스턴스 변수
	String product_name;
	int price; 			// 가격
	int bonusPoint;
	
	{ // 인스턴스 초기화 블럭
		serialNo = ++count;
	}
	
	Product(){
	} //생성자

	//teacher answer
	Product(String product_name, int price){
		this.product_name = product_name;
		this.price = price;
		this.bonusPoint = price/100;
	} 
	// 오버로딩
	Product(String product_name, int price, int bonusPoint){
		this.product_name = product_name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
	
	//me answer
//	Product(String product_name, int price, int bonusPoint){
//	this.product_name = "세탁기";
//	this.price = 500;
//	this.bonusPoint = price/100;
//	}생산자
	
	
//	Product(String product_name, int price, int bonusPoint){
//		this("세탁기", 500, 100);
//	}
	
}