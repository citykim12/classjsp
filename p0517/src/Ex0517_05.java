
public class Ex0517_05 {

	public static void main(String[] args) {
		
		String str = new String();
		//��ü���� �Ǵ� ��ü����
		Tv t = new Tv();
		t.channel = 7;
		System.out.println(t.channel);
		System.out.println(t.power);
		
		t.power();
		t.channelDown();
		System.out.println("power�� : " + t.power);
		System.out.println("down�� : " + t.channel);
		
//		Tv t2 = new Tv();
		
	} //main
	
} // class
