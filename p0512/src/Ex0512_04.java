import java.util.Scanner;

public class Ex0512_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int kor 5�� ���� 100
		
		String[] name = new String[3]; 
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		
		// �Է�
		for(int i=0; i<name.length; i++) {
			System.out.println("�̸��� �Է��ϼ���.>>");
			name[i] = scan.next();
			System.out.println("���� ������ �Է��ϼ���.>>");
			kor[i] = scan.nextInt();
			System.out.println("���� ������ �Է��ϼ���.>>");
			eng[i] = scan.nextInt();
			System.out.println("���� ������ �Է��ϼ���.>>");
			math[i] = scan.nextInt();
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0;
		}
		// ���
		for(int i=0; i<name.length; i++) {
			System.out.print("�̸�: " + name[i] + "\t");
			System.out.print("���� ����: " + kor[i] + "\t");
			System.out.print("���� ����: "+ eng[i] + "\t");
			System.out.print("���� ����: "+ math[i] + "\t");
			System.out.print("�հ�: "+ total[i] + "\t");
			System.out.printf("���: %.2f", avg[i]);
			System.out.println();
		}
		
//		int[] kor = {100, 100, 100, 100, 100};
		
		
//		int[] score = new int[6];
//		score[0] = 100;
//		score[1] = 90;
//		score[2] = 80;
//		score[3] = 70;
//		score[4] = 60;
//		score[5] = 50;
		
//		int[] score= {100, 90, 80, 70, 60};
//		for(int i=0; i<score.length; i++) {
//			System.out.println(score[i]);
//		}

		
		
		//number int �迭 3���� �����ؼ� 1~3���� �Է��Ͻÿ�.
//		int[] number = new int[3];
//		number[0]=1;
//		number[1]=2;
//		number[2]=3;
//		
//		int[] number2 = {1, 2, 3}; // ���� ���� ���þ�
//		
//		int[] num = new int[100];
//		for(int i=0; i<100;i++) {
//			num[i]=i+1;
//		}
//		
//		for(int i=0; i<100; i++) {
//			System.out.println(num[i]);
//		}
				
//		int num = 0;
//		int[] score = new int[5];
//		score[0]=1;
//		score[1]=2;
//		score[2]=3;
//		score[3]=4;
//		score[4]=5;
//
//		if(score[0]==1) {
//			System.out.println("score[0]�� ���� 1�Դϴ�.");
//		}
//		System.out.println(score[0]);

	}//main
}//class
