

import java.util.Scanner;

public class Ex0513_01 {

	public static void main(String[] args) {
		// �л����� ���α׷� - 3�� �Է��ؼ� ����� �غ�����.
		// �̸�, ����, ����, ������ �Է¹޾� �̸�, ����, ����, ����, �հ�, ���
		// 1. �迭����
		// 2. �л������Է� - �հ���, ��հ�� ������ �ֱ�
		// 3. �л��������
		
		Scanner scan = new Scanner(System.in);
		//1. �迭����
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		
		//2. �л������Է�
		for(int i=0;i<name.length;i++) {
			System.out.println("�л� �̸��� �Է��ϼ���.>>");
			name[i] = scan.next();
			System.out.println("���� ������ �Է��ϼ���.>>");
			kor[i] = scan.nextInt();
			System.out.println("���� ������ �Է��ϼ���.>>");
			eng[i] = scan.nextInt();
			System.out.println("���� ������ �Է��ϼ���.>>");
			math[i] = scan.nextInt();
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i]/3.0;
		}
		//3. �л��������
		System.out.println("�̸�\t ����\t����\t����\t�հ�\t���\n");
		System.out.println("--------------------------------------------");
		for(int i=0; i<name.length;i++) {
			System.out.println();
		}
		
	}

}
