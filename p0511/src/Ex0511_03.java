import java.util.Scanner;

public class Ex0511_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 두 숫자를 입력받아
		// 사칙연산(+, -, *, /)를 선택하면 값을 출력하시오.
		// 소수점 출력 가능

//		teachers answer
		System.out.println("1번째 숫자를 입력하세요.>>");
		double num1 = scan.nextDouble();
		System.out.println("2번째 숫자를 입력하세요.>>");
		double num2 = scan.nextDouble();
		System.out.println("사칙연산 입력하세요.(+, -, *, /)>>");
		char input = scan.next().charAt(0);
		
		double result = 0; // 결과값 초기화
		String str = ""; // 사칙연산 글자 초기화
		switch(input) {
		case '+':
			str="더하기";
			result = num1 + num2;
			break;
		case '-':
			str="빼기";
			result = num1 - num2;
			break;
		case '*':
			str="곱하기";
			result = num1 * num2;
			break;
		case '/':
			str="나누기";
			result = num1 / num2;
			break;
		}
		System.out.println("입력값 : " + num1 + "," + num2);
		System.out.println("사칙연산 : " + str);
		System.out.println("결과값 : " + result);
		
//		나의 답
//		int a, b;
//		String cal;
//		
//		System.out.println("첫번째 값 = ");
//		a = scan.nextInt();
//		
//		System.out.println("연산기호입력 = ");
//		cal = scan.next();
//		
//		System.out.println("두번째 값 = ");
//		b = scan.nextInt();
//		
//		switch(cal) {
//		case "+":
//			System.out.println();
//		}
		
		// 서울, 경기, 인천 → 수도권입니다.
		// 부산, 대구, 경주 → 경상도권입니다.
		// 광주, 전주, 군산 → 전라도권입니다.
		// 대전, 충주, 청주 → 충청도권입니다.
		// 춘천, 원주, 강릉 → 강원도권입니다.
		
//		System.out.println("도시를 입력하세요.>>");
//		String input = scan.next();
//		
//		switch(input) {
//		case "서울":	case "경기":	case "인천":
//			System.out.println("수도권입니다.");
//			break;
//		case "부산":
//		case "대구":
//		case "경주":
//			System.out.println("경상도권입니다.");
//			break;
//		case "광주":
//		case "전주":
//		case "군산":
//			System.out.println("전라도권입니다.");
//			break;
//		case "대전":
//		case "충주":
//		case "청주":
//			System.out.println("충청도권입니다.");
//			break;
//		case "춘천":
//		case "원주":
//		case "강릉":
//			System.out.println("강원도권입니다.");
//			break;
//
//		default:
//			break;
//		}
		
//		System.out.println("점수를 입력하세요.>>");
//		int score = scan.nextInt();
//		String grade="";
//		if(score >= 90) {
//			grade="A";
//			if(score >= 98) {
//				grade = grade + "+"; // 지시어는 이것과 같다: grade += "+";
//			}else if(score <= 93) {
//				grade = grade + "-";
//			}
////			System.out.println("A");
//		}else if(score >= 80) {
//			grade="B";
//			if(score >= 88) {
//				grade = grade + "+"; // 지시어는 이것과 같다: grade += "+";
//			}else if(score <= 83) {
//				grade = grade + "-";
//			}
////			System.out.println("B");
//		}else if(score >= 70) {
//			grade="C";
//			if(score >= 78) {
//				grade = grade + "+"; // 지시어는 이것과 같다: grade += "+";
//			}else if(score <= 73) {
//				grade = grade + "-";
//			}
////			System.out.println("C");
//		}else if(score >= 60) {
//			grade="D";
//			if(score >= 68) {
//				grade = grade + "+"; // 지시어는 이것과 같다: grade += "+";
//			}else if(score <= 63) {
//				grade = grade + "-";
//			}
////			System.out.println("D");
//		}else {
//			grade="F";
//			System.out.println("F");
//		}
	}
}