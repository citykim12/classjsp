
public class Ex0512_06 {

	public static void main(String[] args) {
		
		// �ζ� ���߱� - 45
		int[] ball = new int[45];
		
		for(int i=0; i<45; i++) {
			ball[i]=i+1;
		}
		
		// ��ȣ ����
		int temp=0; // ������ ���� �ʱ�ȭ
		for(int i=0; i<500; i++) {
			int rnum = (int)(Math.random()*45); // 0-44
			temp = ball[0]; //0�� �迭���� ���� �ӽ� ���庯���� ����
			ball[0] = ball[rnum]; // 0�� �迭��ҿ� ���� ���ڸ� ����
			ball[rnum] = temp;
		}
		
		// ���
		System.out.println("[ �ζ� ���� ��ȣ ]");
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
		

	} //main

} //class
