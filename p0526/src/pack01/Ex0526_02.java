package pack01;

public class Ex0526_02 {

	public static void main(String[] args) {
		Car c1 = null;	//��ü ���� ���� ��������
		Car c2 = new Car();	//��ü ���� �ִ� ��������
		
		FireEngine f1 = null;
		FireEngine f2 = new FireEngine();
		
		Ambulance a1 = null;
		Ambulance a2 = new Ambulance();
		
		Car c3 = new FireEngine(); 	//������: ������ ���������� �ڼ��� ��ü�� �ٷ�� ��
		Car c4 = new Ambulance();	//������
		
//		FireEngine f3 = new Car(); //�ڼ��� ���������� ������ ��ü�� �ٷ�� ���� �Ұ���
		
		c1 = f1;	// ���� ��ü�� ������� ���� ���������� ����
		c1 = f2;	// ������
		
		f1 = (FireEngine) c1; 	// ����ȯ �ʼ�
//		f1 = (FireEngine) c2;	// ǥ�������� ���� but ���� - ��ü���� �Ǿ� �ִ� �θ� ���������� ��ȯ�Ұ���(Car c2 = new Car();)
		
		c1 = a1;
		c1 = a2;	//������ a2: ��ü���� �Ǿ� ����
		a1 = (Ambulance) c1;
//		a1 = (Ambulance) c2; // ���� - �θ�ü ����Ǿ� ����
		
//		f1 = (FireEngine) a1; 	// �ڼճ����� ����ȯ �Ұ�
		
		c1 = f1; 	// Car 	�� FireEngine
//		a1 = (FireEngine) c1; 	// ����
		
		
		
	} //main

} //class
