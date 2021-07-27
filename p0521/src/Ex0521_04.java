
public class Ex0521_04 {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.product_name = "OLED TV";
		p1.price = 700;
		p1.bonusPoint = p1.price/100;
		Product p2 = new Product("≥√¿Â∞Ì", 500);		// ≥√¿Â∞Ì 500 5;
		Product p3 = new Product("ºº≈π±‚", 200, 2); 	// ºº≈π±‚ 200 2;
		
		System.out.println("p1: " + p1.serialNo);
		System.out.println("p1: " + p1.product_name);
		System.out.println("p1: " + p1.price);
		System.out.println("p1: " + p1.bonusPoint + "\n");
		
		System.out.println("p2: " + p2.serialNo);
		System.out.println("p2: " + p2.product_name);
		System.out.println("p2: " + p2.price);
		System.out.println("p2: " + p2.bonusPoint + "\n");
		
		System.out.println("p3: " + p3.serialNo);
		System.out.println("p3: " + p3.product_name);
		System.out.println("p3: " + p3.price);
		System.out.println("p3: " + p3.bonusPoint + "\n");
		
		System.out.println("¿¸√º count : " + Product.count + " ∞≥");
		
		//me answer
//		p2.product_name = "≥√¿Â∞Ì";
//		p2.price = 500;
//		p2.bonusPoint = p2.price/100;
//		p2.product_name = "ºº≈π±‚";
//		p2.price = 200;
//		p2.bonusPoint = p3.price/100;
	} //main

} //class
