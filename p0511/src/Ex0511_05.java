import java.util.Scanner;

public class Ex0511_05 {

	public static void main(String[] args) {
		
		// 1~100���� ������ �����ؼ�
		// ���ѹݺ��ؼ� ��ȣ�� ���⶧ break������ ������������.
		// ���� ���ڸ� ����Ͻÿ�.
		
//		// teacher answer
//		Scanner scan = new Scanner(System.in);
//		int score = (int)(Math.random()*100)+1;
//		
//		// ���� �ݺ�
//		int num = 0;
//		int count = 1;
//		while(count<=5) {
//			System.out.println(count + "���ڸ� �Է��ϼ���.>>");
//			if(num==score) {
//				System.out.println("�����Դϴ�!");
//				break;
//			}else if(num>score) {
//				System.out.println("Ʋ�Ƚ��ϴ�.");
//				System.out.println(num + "�Է��� ���ں��� �������� �Է��ϼ���!");
////			else {
////				System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �����ϼ���!");
//			}else {
//				System.out.println(num + "�Է��� ���ں��� ū���� �Է��ϼ���!");
//			}
//							count++;
//			}
//			System.out.println("����: " + score);
//		}
//		
		
		// me answer
//		Scanner scan = new Scanner(System.in);
//		int sum = (int)(Math.random()*100)+1;
//		int i=1;
//		while(true) {
//			if(sum>100) {
//				break;
//			}
//			sum = sum + i;
//			i++;
//		}
//		System.out.println("�ݺ�: " + i);
//		System.out.println("����: " + sum);
				
		//1~100�������� Ȧ���� ���ؼ� 200�� �Ѵ� sum���� ������ȣ�� ����غ�����.
//		teacher answer
//		int i=1;
//		int sum=0;
//		
//		while(true) {
//			if(sum>200) {
//				break;
//			}
//			
//			sum = sum + i;
//			i += 2;
//		}
//		System.out.println("������ȣ: " + (i-2));
//		System.out.println("�հ�: " + sum);
		
//		me answer
//		int i=1;
//		int sum=0;
//		
//		while(true) {
//			if(sum>200) {
//				break;
//			}
//			
//			sum = sum + i;
//			i += 2;
//		}
//		System.out.println("������ȣ: " + i);
//		System.out.println("�հ�: " + sum);
		
		// 1~100���� �հ谡 500�� �Ѿ�� ������ ���ڿ� �հ踦 ���Ͻÿ�.
//		int i=0;
//		int sum=0;
//		
//		while(true) {
//			if(sum>500) {
//				break;
//			}
//			i++;
//			sum = sum + i;
//		}
//		System.out.println("������ȣ: "+ i);
//		System.out.println("�հ�: "+ sum);
		
		
//		int i = 0; // ���� ��ȣ
//		int sum = 0; // �հ� �ʱ�ȭ
//		
//		while(true) { //for (;;)�� ����
//			if(sum>100) {
//				break;
//			}
//			i++;
//			sum = sum + i;
//			
//		}
//		System.out.println("���� ��ȣ : " + i);
//		System.out.println("�հ� : " + sum);
		
		// �Ʒ��� ���� ǥ���϶�
		// 000
		// 001
		// 002
		// 003 ...
		// 999

		// ���� �� ���� ���� �߰�ȣ{} ���� ����, �ظ��ϸ� �ִ°� ����
//		for(int i=0; i<=9; i++) 
//			for(int j=0; j<=9; j++) 
//				for(int k=0; k<=9; k++) 
//					System.out.println(""+i+j+k);
	}

}
