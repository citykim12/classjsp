package pack01;

public class Ex0526_03 {

	public static void main(String[] args) {
		Car c = null;
		FireEngine f1 = new FireEngine(); 	//객체선언
		FireEngine f2 = null;
		
		f1.water();
		
		c = f1;	//f1객체선언 - 저장공간이 만들어져 있음
//		c.water();	 //f1에서 c 변경되면서 명령어는 Car 있는것만 사용됨 - 에러
		f2 = (FireEngine) c;
		f2.water();
		
		f2 = f1;
		
//		Car c2 = new FireEngine(); 	// 다형성
//		Car c3 = new FireEngine();	// 다형성
//		
//		Car c3 = new Ambulance(); 	//참조명이 같아 에러
		
		

	}//main

}//class
