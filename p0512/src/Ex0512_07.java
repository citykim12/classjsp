import java.util.Scanner;

public class Ex0512_07 {

	public static void main(String[] args) {
		// ��ȣ 1-45������ 6���� �Է¹޾�
		// ���� �ζǹ�ȣ 6���� �Է��� 6���� ����Ͻÿ�.
		
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6];
		for(int i=0; i<input.length; i++) {
			System.out.println((i+1) + "��° ���ڸ� �Է��ϼ���.>>");
			input[i] = scan.nextInt();
		}
		System.out.println("[�Է��� ��ȣ]");
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		
		// ------------------------------------------------------------
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