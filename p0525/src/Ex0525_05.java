
public class Ex0525_05 {

	public static void main(String[] args) {

		// scan �� �л� �̸�: ȫ�浿, 100, 100, 99
		
		Student s = new Student("ȫ�浿", 100, 100, 99);

		//private ���������� ������ �Ұ��� s.kor = 90;
		System.out.println("�̸�: " + s.getName());
		System.out.println("��������: " + s.getKor());
		s.setKor(90);
		System.out.println("���� ��������: " + s.getKor());
		
	} //main

} //class
