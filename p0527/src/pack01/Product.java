package pack01;

public class Product {
	private String pro_name; 	//인스턴스 변수 - 객체 생성 후 사용(참조변수명.변수명)
	private int price;
	private int bonusPoint;
	
	Product(){}
	Product(String pro_name, int price, int bonusPoint){
		this.pro_name = pro_name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
	public String getPro_name() { 	//인스턴스 메소드 - 객체 생성 후 사용(참조변수명.메소드명)
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

}
