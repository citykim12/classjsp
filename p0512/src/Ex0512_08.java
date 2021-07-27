import java.util.Scanner;

public class Ex0512_08 {

	public static void main(String[] args) {
		// 3���� �Է¹޾� ����ϰ�
		// �ζǹ�ȣ 3���� ����ϼ���.
		// ���� ����: 1 �� 3�� �Է¹޾� ��� / 2 �� �ζǹ�ȣ �迭 ���� / 3 �� �ζǹ�ȣ ���������� ���ֱ� / 4 �� �ζǹ�ȣ ���� / 5 �� �ζǹ�ȣ 3�� ����ϱ�
		// teacher answer
		Scanner scan = new Scanner(System.in);
		int[] mynum = new int[6];
		
		// ��ȣ �Է�
		for(int i=0; i<mynum.length; i++) {
			System.out.println((i+1)+"��° ���ڸ� �Է��ϼ���.>>");
			mynum[i]  = scan.nextInt();
		}
		// ��ȣ ���
		System.out.println("[�Է��� ��ȣ]");
		for(int i=0; i<mynum.length; i++) {
			System.out.print(mynum[i] + " ");
		}
		System.out.println();
		
		// --------------------------------------------------------------
		//1. �ζ� ��ȣ �迭 45��
		int[] ball = new int[45]; 
		//2. ��ȣ �ֱ�
		for(int i=0; i<ball.length; i++) {
			ball[i]=i+1;
		}
		//3. ��ȣ ����
		int temp=0; //�ӽ�����
		for(int i=0; i<200; i++) {
			int rnum = (int)(Math.random()*45); // 0-44
			//0����� ������ �� ����
			temp = ball[0];
			ball[0] = ball[rnum];
			ball[rnum] = temp;
		}
		//4. ��ȣ ���
		System.out.println("[�ζ� ���� ��ȣ]");
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
		
		//5. ���� ��ȣ ã��
		int count = 0;
		int[] win = new int[6]; //��÷ ��ȣ �迭
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(mynum[i] == ball[j]) {
					win[count]=mynum[i]; //��÷��ȣ�� ��÷�迭�� ����
					count++;
					
				}
			}
		}
		System.out.println("[ ��÷ ��ȣ ���� : " + count + " �� ]");
		System.out.println("[ ��÷ ��ȣ ]");
		for(int i=0; i<count; i++) {
			System.out.print(win[i] + " ");
		}
		System.out.println();
		
	} // main

} // class
