
public class LottoBall {
	static int[] ball = new int[45];
	
	//������ Ȥ�� �ʱ�ȭ �� ��� ��밡��
	//������
	LottoBall() {
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		int temp = 0;
		int rnum = 0; // �迭 ������ȣ ���
		for(int i=0; i<200; i++) {
			rnum = (int)(Math.random() * 45); 
			temp = ball[0];
			ball[0] = ball[rnum];
			ball[rnum] = temp;
		}
	}
	
	//�ʱ�ȭ��()
//	static {
//	for(int i=0; i<ball.length; i++) {
//		ball[i] = i+1;
//	}
//	int temp = 0;
//	int rnum = 0; // �迭 ������ȣ ���
//	for(int i=0; i<200; i++) {
//		rnum = (int)(Math.random() * 45); 
//		temp = ball[0];
//		ball[0] = ball[rnum];
//		ball[rnum] = temp;
//	}
//	}
}
