import java.util.Scanner;

public class Ex0512_09 {

	public static void main(String[] args) {
		//1. 6�� �Է¹޾� ���
		//2. �ζǹ�ȣ �迭����
		//3. �ζǹ�ȣ ���������� ��ȣ�ֱ�
		//4. �ζǹ�ȣ ����
		//5. �ζǹ�ȣ 6�� ����ϱ�
		//6. �ζǹ�ȣ ���� ���
		//7. ��÷��ȣ ���
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[6];
		
		for(int i=0; i<num.length; i++) {
			System.out.println((i+1) + "��° ��ȣ�� �Է��ϼ���.>>");	
			num[i] = scan.nextInt();
		}
		System.out.println("[ �Է��� ��ȣ ]");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+ " ");	
		}
		System.out.println();
		//---------------------------------------------
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;	
		}
		int temp = 0;
		for(int i=0; i<200; i++) {
			int rdnum = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = rdnum;
			rdnum = temp;
		}
		System.out.println("[ �ζ� ��ȣ ]");
		for(int i=0; i<6; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println();
		//-------------------------------------------------	
		int count = 0;
		int[] win = new int[6];
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(num[i] == ball[j]) {
					win[count]=num[i];
					count++;
				}
				
			}
		}
		System.out.println("[ ��÷ ��ȣ ����: " + count + " �� ]");
		System.out.println("[ ��÷ ��ȣ ]");
		for(int i=0; i<count; i++) {
			System.out.print(win[i] + " ");
		}
		System.out.println();

	} // main

} // class
