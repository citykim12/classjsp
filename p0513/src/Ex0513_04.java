import java.util.Scanner;

public class Ex0513_04 {

	public static void main(String[] args) {
		//[5][5] �迭�� ���� �� 1-25���� ���ڸ� �־ ���
		// �ߺ� ��� ����
		Scanner scan = new Scanner(System.in);
		System.out.println("����� ���� 1��° �迭�� �Է��ϼ���.>>");
		int in_arr1 = scan.nextInt();
		System.out.println("����� ���� 2��° �迭�� �Է��ϼ���.>>");
		int in_arr2 = scan.nextInt();
		
		// 54 �� [5][4]
		
		// 1-25 ���� ���� ����
		int[] num = new int[in_arr1*in_arr2];
		for(int i=0;i<num.length;i++) {
			num[i] = i+1; // 1-25
		}
		
		int temp=0;
		int rnum=0;
		for(int i=0; i<num.length*5; i++) {
			rnum = (int)(Math.random()*(in_arr1*in_arr2)); //1-25
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		//���
		int[][] arr = new int[in_arr1][in_arr2];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num[in_arr1*i+j];	// 0-24
				// 0,1,2 - 24
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
