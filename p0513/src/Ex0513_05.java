import java.util.Scanner;

public class Ex0513_05 {

	public static void main(String[] args) {
		//[0,0][0,1][0,2]
		//[3][3]
		// 숫자를 입력받아 원하는 배열을 만들어라
		
		Scanner scan = new Scanner(System.in);
		System.out.println("만들고 싶은 1번째 배열을 입력하세요.>>");
		int in_arr1 = scan.nextInt();
		System.out.println("만들고 싶은 2번째 배열을 입력하세요.>>");
		int in_arr2 = scan.nextInt();
		
		String[][] arr = new String[in_arr1][in_arr2];
		//입력
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length; j++) {
				arr[i][j] = "["+i+", "+j+"]";
			}
		}
		//출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	} //main

} //class
