package pack01;

public class Ex0526_04 {

	public static void main(String[] args) {
		Product p1 = null;
		Product p2 = new Product();
		Product p3 = null;
		
		Computer c1 = new Computer(); 	//cpuSpeed()
		Computer c2 = null;
		Computer c3 = null;
		
		SmartPhone s1 = new SmartPhone();
		SmartPhone s2 = null;
		SmartPhone s3 = null;
		
		// c1 → p1, p1 → c2 ; cpuSpeed 메소드 호출
		// s1 → p3, p3 → s2  / s2 → p1, p1 → s3

		p1 = c1;
		c2 = (Computer) p1;
		
		p3 = s1;
		s2 = (SmartPhone)p3;
		
		p1 = s2;
		s3 = (SmartPhone)p1;
		
//		p2.production_year(); 	//2021년도 제품 출력
////		p1.production_year(); //에러 → 객체생성이 있을 경우만 출력 가능
//		c1.cpuSpeed();
//		
//		p1 = c1; 	// 다형성: 조상의 참조변수로 자손의 객체를 다루는 것
////		p1.cpuSpeed(); 		//에러
//		c1 = (Computer) p1;
//		c1.cpuSpeed();
//		
//		p1 = c1;
//		c2 = (Computer) p1;
//		c2.cpuSpeed();
		
	} //main

} //class
