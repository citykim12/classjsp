import java.util.Scanner;

public class Ex0511_01 {

	public static void main(String[] args) {
		// ����2
		// ���� 2.031457 �Է� �޾� 5�ڸ� �ݿø��ؼ� ����Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.>>");
		double num = scan.nextDouble();
		double result = Math.round(num*10000) / 10000d;
		System.out.println("result: " + result);
		
		// ���� 1
		// ���ڸ� �Է� �޾� ¦������, Ȧ�� ���� ����Ͻÿ�.(if)
//        Scanner scan = new Scanner(System.in);
//        int num = 0;
//         System.out.print("���ڸ� �Է��ϼ���.>> ");
//         num = scan.nextInt();
//         scan.nextLine();
//         System.out.println("���ڸ� �Է��ϼ���.>>");
//         String str = scan.nextLine(); // ���ڿ� �Ÿ��� ��Ÿ�
//         System.out.println("���:" + num);
//         System.out.println("���� ���:" + str);
//         if (num % 2 == 0) {
//            System.out.print(num + "�� ¦���Դϴ�.");
//        } else {
//            System.out.print(num + "�� Ȧ���Դϴ�.");
//	}
//         
//         scan.nextInt(); // ������
//         scan.nextDouble(); // �Ǽ���
//         scan.nextFloat(); // �Ǽ���
//         scan.next(); // ���ڿ� �Ÿ��� ��Ÿ�
//         scan.nextLine(); // ���ڿ� �Ÿ��� ��Ÿ�

	}
}