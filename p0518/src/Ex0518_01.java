
public class Ex0518_01 {

	public static void main(String[] args) {

		Time[] t = new Time[3];
		for(int i=0; i<t.length; i++) {
			t[i] = new Time(); // ��ü����
			t[i].hour = i+1;
			t[i].minute = i+1;
			t[i].second = i+1;
		}
		
		for(int i=0; i<t.length; i++) {
			System.out.printf("%d��%d��%d�� \n", t[i].hour, t[i].minute, t[i].second);
		}
		
		
//		Time t = new Time(); // (); = �޼ҵ� ȣ�� / (�ȿ� ���ڰ� ������) = �޼ҵ� ����
//		t.hour = 1;
//		t.minute = 1;
//		t.second = 1;
//		
//		System.out.println(t.hour + "��" + t.minute + "��" + t.second + "��");

	}

}
