import java.util.Scanner;

public class Ex0513_05 {

	public static void main(String[] args) {
		//[0,0][0,1][0,2]
		//[3][3]
		// ���ڸ� �Է¹޾� ���ϴ� �迭�� ������
		
		Scanner scan = new Scanner(System.in);
		System.out.println("����� ���� 1��° �迭�� �Է��ϼ���.>>");
		int in_arr1 = scan.nextInt();
		System.out.println("����� ���� 2��° �迭�� �Է��ϼ���.>>");
		int in_arr2 = scan.nextInt();
		
		String[][] arr = new String[in_arr1][in_arr2];
		//�Է�
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length; j++) {
				arr[i][j] = "["+i+", "+j+"]";
			}
		}
		//���
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	} //main

} //class
