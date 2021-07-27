
public class Ex0512_06 {

	public static void main(String[] args) {
		
		// 로또 맞추기 - 45
		int[] ball = new int[45];
		
		for(int i=0; i<45; i++) {
			ball[i]=i+1;
		}
		
		// 번호 섞기
		int temp=0; // 저장할 변수 초기화
		for(int i=0; i<500; i++) {
			int rnum = (int)(Math.random()*45); // 0-44
			temp = ball[0]; //0번 배열값을 먼저 임시 저장변수에 저장
			ball[0] = ball[rnum]; // 0번 배열장소에 랜덤 숫자를 넣음
			ball[rnum] = temp;
		}
		
		// 출력
		System.out.println("[ 로또 랜덤 번호 ]");
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
		

	} //main

} //class
