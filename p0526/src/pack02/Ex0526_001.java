package pack02;

public class Ex0526_001 {

	public static void main(String[] args) {
//		CaptionTv ct = new CaptionTv(); 

		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x= " + p.x);
		p.method();
		
		System.out.println("c.x= " + c.x);
		c.method();
	}
}
	
	class Parent{
		int x = 100;
		
		void method() {
			System.out.println("Parent Method");
		}
	}
	
	// 2번: 아래와 같은 출력 값
	class Child extends Parent { }
	// ↓ 위처럼 클라스 자식이 아무것도 갖지 않았을 경우 나오는 출력 값
//	p.x= 100
//	Parent Method
//	c.x= 100
//	Parent Method

	
	// 1번: 아래와 같은 출력 값
//	class Child extends Parent{
//		int x = 200;
//		
//		void method() {
//			System.out.println("Child Method");
//		}
//	} ↓ 위의 클라스를 넣었을 경우의 출력 값
//	p.x= 100
//	Child Method
//	c.x= 200
//	Child Method


