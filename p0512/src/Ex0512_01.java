import java.util.Scanner;

public class Ex0512_01 {

	public static void main(String[] args) {
		// �������� ����ϴµ�
		// ����� ������ ������ �Է¹޾� ����Ͻÿ�.
		// 2, 5�� �Է¹޾��� ��, 2-5�ܱ��� ����Ͻÿ�.
		
//		Math.ceil(2.015); // �ø�
//		Math.round(3.541); // �ݿø�
//		Math.floor(10.789); // ����
//		int num = (int)(Math.random()*100)+1; // 1-100
//		int input1 = Math.max(10, 2); // ū�� ���, ���� ǥ�� �� Math.max(10, 2);
//		int input2 = Math.min(5, 15); // ������ ���, ���� ǥ�� �� Math.min(5, 15);
		
		
		Scanner scan = new Scanner(System.in);
//		// �μ� �Է�
		System.out.println("������ ���� �Է��Ͻÿ�.>>");
		int start = scan.nextInt();
		System.out.println("���� ���� �Է��Ͻÿ�.>>");
		int end = scan.nextInt();
//		System.out.println("������ ���ڸ��� �Է��Ͻÿ�.>>");
//		int gugu = scan.nextInt();
		
		// ��
//		if(start>end) {
//			int k=0;
//			k = start;
//			start = end;
//			end = k;
//		}
		
		int input1 = Math.max(start, end); // ū�� ���, ���� ǥ�� �� Math.max(10, 2);
		int input2 = Math.min(start, end);
		
		//������ ���
		for(int i=input1; i<=input2; i++) {
			for(int j=1; j<=9; j++){
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println();
		}	
		
		// 1~100���� ���ϴ� �հ谪�� 200�� �Ѵ� ������ ��ȣ�� ����Ͻÿ�.
		// �� ���� ����Ͻÿ�.

//		int i=0;
//		int sum=0;
//		
//		for(i=1; i<=100; i++) {
//			if(sum>200) {
//				break;
//			}
//			sum = sum + i;
//		}
//		System.out.println("���� ��ȣ: " + ((i-1)-1));
//		System.out.println("���� �հ�: " + (sum-(i-1)));
		
//		int i=1;
//		int sum=0;
//		
//		while(true) {
//			if(sum>200) {
//				break;
//			}
//			sum = sum + i;
//			i++;
//		}
//		System.out.println("������ȣ: " + (i));
//		System.out.println("�հ�: " + sum);
		
		
	} //main
} // class
