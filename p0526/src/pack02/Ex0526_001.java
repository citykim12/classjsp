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
	
	// 2��: �Ʒ��� ���� ��� ��
	class Child extends Parent { }
	// �� ��ó�� Ŭ�� �ڽ��� �ƹ��͵� ���� �ʾ��� ��� ������ ��� ��
//	p.x= 100
//	Parent Method
//	c.x= 100
//	Parent Method

	
	// 1��: �Ʒ��� ���� ��� ��
//	class Child extends Parent{
//		int x = 200;
//		
//		void method() {
//			System.out.println("Child Method");
//		}
//	} �� ���� Ŭ�󽺸� �־��� ����� ��� ��
//	p.x= 100
//	Child Method
//	c.x= 200
//	Child Method


