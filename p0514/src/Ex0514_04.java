import java.util.Scanner;

public class Ex0514_04 {

	public static void main(String[] args) {
		// 1.화면단 출력 - while(), switch()구문 먼저 만들 것
		// 2.10명 학생성적추가 부분을 구현 → 배열 저장 
		// → 이름,국어,영어,수학 입력 받음 → 합계, 평균 입력
		// 3.학생성적출력을 구현
		
		Scanner scan = new Scanner(System.in);
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		String[] subject = {"국어", "영어", "수학"};
		int count = 0; //학생 성적을 몇명 입력했는지 확인하는 변수
		String check = ""; //0 또는 학생 이름 확인변수
		int searchNum=0; //학생성적 수정에 사용하는 변수
		String check_name = ""; // 학생 이름 검색
		int findnum = 0; // 수정할 데이터 위치변수 
		
		loopt1: while(true) {
			System.out.println("------------------------------------");
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("------------------------------------");
			System.out.println("1.학생성적추가");
			System.out.println("2.학생성적수정");
			System.out.println("3.학생성적출력");
			System.out.println("4.학생성적검색");
			System.out.println("5.학생등수처리");
			System.out.println("0.프로그램종료");
			System.out.println("------------------------------------");			
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1: //학생성적추가
				System.out.println("[ 학생성적추가 메뉴 ]");
				// 3명의 학생이름 국어, 영어, 수학 점수를 입력받아 합계, 평균까지 출력 
				// 이름-String, 국어, 영어, 수학, 합계-int, 평균-double
				// 입력
				for(int i=count; i<name.length; i++) {
					System.out.println("학생 이름을 입력하세요.(상위메뉴이동: 0)>>");
					check = scan.next();
					// 0이 입력되었는지 확인
					if(check.equals("0")) {
						System.out.println("상위 메뉴로 이동합니다.");
						break;
					}
					name[i] = check;
					
					for(int j=0; j<(score[i].length-1); j++) {
						System.out.println(subject[j] + " 점수를 입력하세요.>>");
						score[i][j] = scan.nextInt();	
					}
					score[i][3] = score[i][0] + score[i][1] + score[i][2]; //합계
					avg[i] = score[i][3]/3.0; //평균
					count++; //학생 1명추가
					System.out.println((i+1) + "명 학생의 성적이 입력되었습니다.");
				}
				
				
				break;
			case 2: // 학생성적수정
				System.out.println("[ 학생성적수정 메뉴 ]");
				System.out.println("수정할 학생이름을 입력하세요.>>");
				check_name = scan.next(); // 수정할 학생이름 입력
				
				// 데이터가 없을 경우
				findnum = -1;
				for(int i=0; i<count; i++) {
					if(check_name.equals(name[i])) {
						findnum = i;
					}
				}
				
				if(findnum == -1) {
					System.out.println("데이터가 없습니다.");
					break;
				}
				
				System.out.println("[ 수정과목 선택 ]");
				System.out.println("0.국어 1.영어 2.수학");
				System.out.println("수정과목을 선택하세요.>>");
				int subname = scan.nextInt();
				System.out.println("수정점수 입력: ");
				score[findnum][subname] = scan.nextInt();
				//합계 구하는 공식
				score[findnum][3] = score[findnum][0] + score[findnum][1] + score[findnum][2];
				//평균 구하는 공식
				avg[findnum] = score[findnum][3]/3.0;

				break;
			case 3: //학생성적출력
				System.out.println("[ 학생성적출력 메뉴 ]");
				System.out.print("이름\t국어\t영어\t수학\t합계\t평균\n");
				System.out.println("-------------------------------------------");
				// 프로그램 출력
				for(int i=0; i<count; i++) {
					System.out.print(name[i]+"\t"); // 이름출력
					for(int j=0; j<score[i].length; j++) {
						System.out.print(score[i][j] + "\t"); // 국어, 영어, 수학, 합계
					}
					System.out.printf("%.2f \n", avg[i]); // 평균
				}
				
				break;
			case 4:
				System.out.println("-----> 학생성적검색");
				// 
				
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loopt1;
				
			default:
				System.out.println("번호를 잘 못 입력하셨습니다.");
				break;
			
			}//switch
			
		}//while

	} //main

} //class