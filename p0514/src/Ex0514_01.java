
public class Ex0514_01 {

	public static void main(String[] args) {
		// 1차원 30개짜리 배열 생성해서 랜덤으로 1~100까지 숫자를 넣고
		// 1차원 40개짜리 배열 생성해서 배열 5번째방부터 20개만 복사
		// for문, arraycopy메소드 2가지를 모두 사용
		
		int[] num = new int[30];
		int[] newNum = new int[40];
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100)+1;
		}
		
		// for문 배열복사
		for(int i=4; i<24; i++) { //0,1,2,3,4
			newNum[i] = num[i];
		}
		
		//arraycopy메소드 배열복사
		System.arraycopy(num, 4, newNum, 0, 20);
		
		//출력
		for(int i=0; i<newNum.length; i++) {
			System.out.println(newNum[i]);
		}
		
//		int temp = 0;
//		int rnum = 0;
//		temp = num[0];
//		num[0] = num[rnum];
//		num[rnum] = temp;
		
//		int[] num = {1,2,3,4,5};
//		int[] newNum = new int[10];
		
		//System.arraycopy() 메소드 사용해서 배열 복사
//		System.arraycopy(num, 0, newNum, 0, num.length);
		
		
		//for문을 사용한 배열 복사
//		for(int i=0; i<num.length; i++) {
//			newNum[i] = num[i];
//		}
		
		
//		for(int i=0; i<newNum.length; i++) {
//			System.out.println(newNum[i]);
//		}

	} //main

} //class
