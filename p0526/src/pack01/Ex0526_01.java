package pack01;

public class Ex0526_01 {

	public static void main(String[] args) {
		Tv t = new Tv();
		t.channel = 7;
		CaptionTv ctv = new CaptionTv();
		ctv.text = "����~~~";
		
		Tv t2 = new CaptionTv(); // ���⼺
		
		Tv tt = null;
		CaptionTv cctv = null;
		
		tt = cctv;	// �ڼ� �� ����: ����ȯ ����
		cctv = (CaptionTv) tt;	// ���� �� �ڼ� �� �� ����ȯ �ʼ� 	
		//������ ��������, �ڼ��� ���������� ���� ���� ����
		
		// t = ctv; 	//������: ������ ���������� �ڼ��� ��ü�� �ٷ�� �� �󪭪�
		// Tv t = new CaptionTv(); �� �̰Ͱ� ����
		
		// ctv = t; // �ڼ��� ���������� ������ ��ü�� �ٷ� �� ���� �󪭪ت�
	}//main

}//class
