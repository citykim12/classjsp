import java.util.Scanner;

public class Ex0512_05 {

	public static void main(String[] args) {
		// 5���� �л��� �̸�, ����, ����, ���������� �Է¹޾�
		// �̸�, ����, ����, ����, �հ�, ����� ����Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		int[] rank = new int[5]; //���
		
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
		// ��� ���
		System.out.println("�̸�: \t ����: \t ����: \t ����: \t �հ�: \t ���: \t \n");
		System.out.println("----------------------------------------------------------");
		
		// ���
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(kor[i] + "\t");
			System.out.print(eng[i] + "\t");
			System.out.print(math[i] + "\t");
			System.out.print(total[i] + "\t");
			System.out.printf("%.2f", avg[i]);
			System.out.println();
		}
		

	}

}
