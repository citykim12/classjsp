package p0615;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0615_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		ArrayList list = new ArrayList();
		int[] arr = new int[3];
		int count = 0;
		
		while(true) {
			//[try - catch�� ���� ��]
//			System.out.println("3�� ����");
//			System.out.println(0/0);
//			System.out.println("4�� ����");
//			System.out.println("5�� ����");
			
			//		//�̻��� ���� ��� try ����, �̻��� ����� catch�� ���� ��
			try {
				System.out.println("�����Ϸ��� �ƹ�Ű�� �������� �� ");
				arr[count] = scan.nextInt();
				
				System.out.println("1�� ����");
				System.out.println("2�� ����");
				
				System.out.println("3�� ����");
//				Exception e = new Exception("���Ƿ� ���� �߻� ��Ŵ.");
//				throw e;
				System.out.println(0/0);	//0���� �����°��� ���� ���� �� runŸ�� ����
				System.out.println("4�� ����");
			} catch (ArithmeticException e) {		//Exception���� ������ ��� ���� ó���� ����
//				System.out.println(e.getMessage());
				e.printStackTrace();
				System.out.println("0���� ���ڸ� ���� �����Դϴ�.");
				System.out.println("5�� ����");
				System.out.println("����ó���� �ؼ� ���α׷��� �ٽ� �����մϴ�.");
			} catch(ArrayIndexOutOfBoundsException e ) {
				System.out.println("���� �߻��� �迭�� 10�� �÷���");
				for(int i=0; i<arr.length; i++) {
					list.add(arr[i]);
				}
			}
			System.out.println("6�� ����");
			count++;
			
		} //while
		
	} //main

} //class
