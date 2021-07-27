
public class LottoBall {
	static int[] ball = new int[45];
	
	//생성자 혹은 초기화 블럭 모두 사용가능
	//생성자
	LottoBall() {
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		int temp = 0;
		int rnum = 0; // 배열 랜덤번호 사용
		for(int i=0; i<200; i++) {
			rnum = (int)(Math.random() * 45); 
			temp = ball[0];
			ball[0] = ball[rnum];
			ball[rnum] = temp;
		}
	}
	
	//초기화블럭()
//	static {
//	for(int i=0; i<ball.length; i++) {
//		ball[i] = i+1;
//	}
//	int temp = 0;
//	int rnum = 0; // 배열 랜덤번호 사용
//	for(int i=0; i<200; i++) {
//		rnum = (int)(Math.random() * 45); 
//		temp = ball[0];
//		ball[0] = ball[rnum];
//		ball[rnum] = temp;
//	}
//	}
}
