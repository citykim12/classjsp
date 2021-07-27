package p0615;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0615_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>(); 
//		int[] arr = new int[3]; // 3번 이상 입력할 경우 에러 뜸: 런타임 에러
		int count = 0;
		while(true) {
			System.out.println((count+1) + "번째 데이터를 입력하세요. → ");
			list.add(scan.nextInt());
//			arr[count] = scan.nextInt(); // 3번 만 입력
			System.out.println((count+1) + "번째 데이터 값: " + list.get(count));
			count++;
		}
		
		//처음부터 에러가 나는 것: 컴파일 에러 / 실행하고 있는 도중에 에러 나는 것: 런타임 에러
//		System.out.println("예외 처리를 하고 있습니다.");
//		System.out.prinln("예외 처리를 하고 있습니다.");	//컴파일 에러
	} //main

} //class
