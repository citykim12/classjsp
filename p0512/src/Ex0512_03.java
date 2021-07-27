
public class Ex0512_03 {

	public static void main(String[] args) {
		
		// 구구단 홀수 출력 2*1=2, 2*2...2*5=10
			
		for(int i=2; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				if(j>5) {
					break;
//				if(j%2 == 0) {
//					continue;
				}
				System.out.printf("%d * %d = %d %n", i, j, (i*j));
			}
		}
		
		
//		double a = 14255.2345678;
//		int b = 100;
//		String str = "school";
//		System.out.println("println출력 : " + a + ", " + b);
//		System.out.printf("printf출력 : %09.2f, %d\n", a,b); // 동일 지시어, 엔터 역할: %n = \n
//		System.out.printf("printf출력 : %d %n", b);
//		System.out.printf("printf출력 : %s", str);
//		
//		for(int i=2; i<=9; i++) {
//			for(int j=2; j<=9; j++) {
////				System.out.println(i+"*"+j+"="+(i*j));
//				System.out.printf("%d * %d = %di %n", i, j, (i*j));
//			}
//		}

	}
}
