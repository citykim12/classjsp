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
		
		// c1 �� p1, p1 �� c2 ; cpuSpeed �޼ҵ� ȣ��
		// s1 �� p3, p3 �� s2  / s2 �� p1, p1 �� s3

		p1 = c1;
		c2 = (Computer) p1;
		
		p3 = s1;
		s2 = (SmartPhone)p3;
		
		p1 = s2;
		s3 = (SmartPhone)p1;
		
//		p2.production_year(); 	//2021�⵵ ��ǰ ���
////		p1.production_year(); //���� �� ��ü������ ���� ��츸 ��� ����
//		c1.cpuSpeed();
//		
//		p1 = c1; 	// ������: ������ ���������� �ڼ��� ��ü�� �ٷ�� ��
////		p1.cpuSpeed(); 		//����
//		c1 = (Computer) p1;
//		c1.cpuSpeed();
//		
//		p1 = c1;
//		c2 = (Computer) p1;
//		c2.cpuSpeed();
		
	} //main

} //class
