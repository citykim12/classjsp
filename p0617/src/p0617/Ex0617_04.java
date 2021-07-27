package p0617;

public class Ex0617_04 {

	public static void main(String[] args) {

		String str = "hello";
		String str2 = "반갑습니다.";
		System.out.println("그냥 출력: " + str);
		System.out.println("toString() 출력: "+str.toString());
		
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
	
	//메인의 toString()과 다름
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

} //class
