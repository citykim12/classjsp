package pack01;

public class Ex0526_03 {

	public static void main(String[] args) {
		Car c = null;
		FireEngine f1 = new FireEngine(); 	//��ü����
		FireEngine f2 = null;
		
		f1.water();
		
		c = f1;	//f1��ü���� - ��������� ������� ����
//		c.water();	 //f1���� c ����Ǹ鼭 ��ɾ�� Car �ִ°͸� ���� - ����
		f2 = (FireEngine) c;
		f2.water();
		
		f2 = f1;
		
//		Car c2 = new FireEngine(); 	// ������
//		Car c3 = new FireEngine();	// ������
//		
//		Car c3 = new Ambulance(); 	//�������� ���� ����
		
		

	}//main

}//class
