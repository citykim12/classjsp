package p0617;

public class Ex0617_04 {

	public static void main(String[] args) {

		String str = "hello";
		String str2 = "�ݰ����ϴ�.";
		System.out.println("�׳� ���: " + str);
		System.out.println("toString() ���: "+str.toString());
		
		int a = 5;
		String s = a + "";
		int aa = Integer.parseInt(s);
		double d = 5.0;
		//double to String
		String s1 = d+"";
		String s2 = String.valueOf(d);
		// String to double
		double d2 = Double.parseDouble(s2);
		
		
	} //main
	
	//������ toString()�� �ٸ�
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

} //class
