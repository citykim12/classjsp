

import java.util.Scanner;

public class Ex0511_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학교를 영어로 입력하세요.>>");
		String input = scan.nextLine();
		if(input.equals("school")) {
			System.out.println("정답입니다. 입력: " + input);
		}else {
			System.out.println("오답입니다. 정답: school, 입력: " + input);
		}
		
//		빈값 사용 테스트 해 봐야 함
//		String str = "";
//		if(str != null && !str.equals(""));{
//			char ch = scan.next().charAt(0);
//		}
		
		
		// 문자 1개를 입력받아 알파벳인지 아닌지를 출력하시오.
		// 알파벳입니다. 알파벳이 아닙니다.
		// 대소문자 모두 포함.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("알파벳을 입력하세요.>>");
//		char ch = scan.next().charAt(0);
//		if(ch == 'a-z' || ch == 'A-Z') {
//		System.out.println("알파벳입니다.");	
//		}else {
//			System.out.println("알파벳이 아닙니다.");
//		}
		
//      System.out.println("입력하세요");
//      char ch = scan.next().charAt(0);
//      
//      if(ch>='a' && ch<='z'|| ch>='A' && ch<='Z') {
//         System.out.println("알파벳입니다");
//      }else {
//         System.out.println("알파벳이 아닙니다.");
//      }
				
//		Scanner scan = new Scanner(System.in);
//		System.out.println("프로그램을 종료하려면 X 또는 x를 입력하세요.>>");
//		char ch = scan.next().charAt(0);
//		if(ch == 'X' || ch == 'x') {
//		System.out.println("프로그램을 종료합니다.");	
//		}else {
//			System.out.println("프로그램을 계속 실행합니다.");
//		}
		
//		System.out.println("글자를 입력하세요>>");
//		char ch = scan.next().charAt(2); // 캐릭터는 캐릭터로 리턴 값을 받아야 함, 한글자만 받으려면 두가지 섞어서 지시어를 지정
//		if(ch == 'C' || ch == 'c') {
//		System.out.println("C가 입력되었습니다.");	
//		}else {
//			System.out.println("C가 아닙니다.");
//		}
		
//		if(ch >= '0' && ch <= '9') {
//			System.out.println("숫자 1개를 입력하셨습니다.");
//		}else {
//			System.out.println("숫자가 아닙니다.");
		
		
//		String str = scan.next(); // 스트링으로 받으면 문자열로 받음
//		System.out.println("결과 값: " + str);
			
//		String str = "abcdef";
//		char ch1 = str.charAt(3);
//		System.out.println(ch1);

	}

}