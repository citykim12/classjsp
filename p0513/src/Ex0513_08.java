import java.util.Scanner;

public class Ex0513_08 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		//1-100���� �� 1���� ���ڸ� �������� �޾� ���ڸ� ���ߴ� ���α׷��� ����
		// Ƚ���� 10������ ���� ����!, �Է��� ���� ���
		int randomNo = (int)(Math.random()*100)+1;
		int[] arr = new int[10];
		int count = 0;
		while(true) {
			if(count>10) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			System.out.println("���ڸ� �Է��ϼ���.>>");
			int input = scan.nextInt();
			arr[count] = input; //�Է��� ���� arr�迭�� ����
			if(randomNo==input) {
				System.out.println("�����Դϴ�.");
				break;
			}else if(randomNo<input) {
				System.out.println(input + "���� ���� ���� �Է��ϼ���. �ٽ� ����!");
			}else {
				System.out.println(input + "���� ū ���� �Է��ϼ���. �ٽ� ����!");
			}
			count++;
		}
		
		System.out.println("����: " + randomNo);
		System.out.println("�� ���� Ƚ��: " + (count+1));
		System.out.print("�Է��� ����: ");
		for(int i=0; i<(count+1); i++) {
			System.out.print(arr[i]+"\t");
		}
		
//		System.out.println("���ڸ� �Է��ϼ���.>>");
//		String input = scan.next();
//		// �ѱ����������б�
//		// �� �ڸ� ����Ͻÿ�.
//		// �Է��� ��� ���ڸ� 1���� ���
//		for(int i=0; i<input.length();i++) {
//			System.out.println(input.charAt(i)); //charAt �ѱ��ڸ� ��������
//		}
//		System.out.println(input.substring(4,7)); //substring ���� ���� ���� ����
//		

	} // main

} // class
