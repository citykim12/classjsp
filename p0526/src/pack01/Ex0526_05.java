package pack01;

public class Ex0526_05 {

	public static void main(String[] args) {
		//Product
		//p1�� c1 �������� ����
		//c1�� p1 �������� ����
		//p1�� c2 �������� ����
		//p1�� s1 �������� ����
		//s1�� p1 �������� ����
		//p1�� s2 �������� ����
		//p1�� ���������� ���������� instanceof�����ڸ� ����ؼ� ����غ��ÿ�.
		
		Product p1 = null;
		Computer c1 = new Computer();
		Computer c2 = null;
		SmartPhone s1 = new SmartPhone();
		SmartPhone s2 = null;
		
		p1 = s1;
		s1 = (SmartPhone) p1;
		s2 = s1;
//		c2.cpuSpeed();
		
		if(p1 instanceof Computer) {
			System.out.println("p1�� ���������� Computer ���������Դϴ�.");
		}else {
			System.out.println("p1�� ���������� SmartPhone ���������Դϴ�.");
		}
		
//		Car c1 = null;	//c1�� Car�� ��������
//		FireEngine f1 = new FireEngine();
//		FireEngine f2 = null;
//		FireEngine f3 = null;
//		
//		Ambulance a1 = new Ambulance();
//		Ambulance a2 = null;
//		Ambulance a3 = null;
//		
//		c1 = f1;
//		if(c1 instanceof FireEngine) {
//			f3 = (FireEngine) c1;
//			System.out.println("FireEngine ���������� �����߽��ϴ�.");
//		}else if(c1 instanceof Ambulance) {
//			a3 = (Ambulance) c1;
//			System.out.println("Ambulance ���������� �����߽��ϴ�.");
//		}
		
//		if(c1 instanceof FireEngine) {
//			System.out.println("FireEngine ���������Դϴ�.");
//		}
		
	}//main

}//class
