
public class Ex0511_06 {
	public static void main(String[] args) {

		loop1: for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5) {
					break loop1;
				}
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}
		
		
		
//		// 1-100 ����� �ϴµ� 5�� ����� �����ϼ���.
//		for(int i=1; i<=100; i++) {
//			if(i%5==0) {
//				continue;			
//			}
//			System.out.println(i);
//		}
		
	}

}
