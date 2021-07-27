package p0617;

import java.util.Scanner;

public class Ex0617_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] fileName = {"windows","Windows","WinDows","Win","Window","Window", "wins"};
		
		//windows → 대소문자 구분없이 검색해서 검색된 단어 출력, 갯수 출력
		//win포함되어 있는 단어를 검색 출력, 갯수 출력
		// s로 끝나는 단어를 검색 출력, 갯수 출력을 해보세요.
		
		System.out.println("검색할 단어를 입력하세요 → ");
		
		String input = scan.nextLine().toLowerCase();
		System.out.println("input 단어: " + input);
		
		int count=0;
		System.out.println("[ 단어 검색 ]");
		for(String str:fileName) {
			if(str.equalsIgnoreCase(input)) {
				count++;
				System.out.println("단어: " + fileName);
			}
		}
		for(int i=0;i<fileName.length;i++) {
			if(fileName[i].contains(input)){
				count++;
				System.out.println("포함하는 단어: " + count);
			}
		}
		System.out.println("동일한 단어 갯수: " + count);
		
//		System.out.println("검색할 단어를 입력하세요 → ");
//		String input = scan.nextLine().toLowerCase();
//		System.out.println("input　단어:" + input);
//		
//		int count=0;
//		System.out.println("[ 단어 검색 ]");
//		for(String str:fileName) {
//			if(str.equals(input)) {
//				count++;
//				System.out.println("단어: " + str);
//			}
//		}
//		System.out.println("동일한 단어: " + count);
		
	} //main

} //class
