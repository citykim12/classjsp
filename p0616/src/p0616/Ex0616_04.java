package p0616;

public class Ex0616_04 {

	public static void main(String[] args) {
		
		String str = "aaa";
		String str2 = "aaa";
		String str3 = new String("aaa");
		String str4 = new String("aaa");
		
		//1
		if(str==str2) {
			System.out.println("same data");
		}else {
			System.out.println("different data");
		}
		
		//2
		if(str3==str4) {
			System.out.println("str3, str4 same data");
		}else {
			System.out.println("str3, str4 different data");
		}
		
		
		
//		Person p1 = new Person();
//		p1.id = 880101110555L;
//		Person p2 = new Person();
//		p2.id = 880101110555L;
//		
//		if(p1 == p2) {
//			System.out.println("is same data");
//		}else {
//			System.out.println("is different data");
//			System.out.println("p1: " + p1.toString());
//			System.out.println("p2: " + p2.toString());
//		}
//		
//		if(p1.equals(p2)) {
//			System.out.println("equals 비교 is same data");
//		}else {
//			System.out.println("equals 비교 is different data");
//		}
		
//		Ex0616_01 e = new Ex0616_01();
//		System.out.println(e);
		
	} //main

} // class
