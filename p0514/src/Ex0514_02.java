import java.util.Scanner;

public class Ex0514_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		String[] subject = {"국어", "영어", "수학"};
		int count = 0; //학생 성적을 몇명 입력했는지 확인하는 변수
		String check = ""; //0 또는 학생 이름 확인변수
		int searchNum=0; //학생성적 수정에 사용하는 변수
		
		loopt1: while(true) {
			System.out.println("------------------------------------");
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("------------------------------------");
			System.out.println("1.학생성적추가");
			System.out.println("2.학생성적수정");
			System.out.println("3.학생성적출력");
			System.out.println("4.학생성적검색");
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
			case 2:
				System.out.println("[ 학생성적수정 메뉴 ]");
				System.out.println("수정할 학생 이름을 입력하세요.(상위메뉴이동: 0)>>");
				check = scan.next();
				if(check.equals("0")) {
					System.out.println("상위 메뉴로 이동합니다.");
					break;
				}
				// 해당 학생이 있는지 없는지 확인
				searchNum = -1;
				for(int i=0; i<count; i++) {
					if(check.equals(name[i])) {
						searchNum = i;
					}
				}
				// 해당 학생이 없을 시
				if(searchNum == -1) {
					System.out.println("해당 학생이 없습니다.");
					break;
				}
				// 해당 학생이 있을 시
				System.out.println(check + " 학생을 찾았습니다.");
				//무슨 과목을 수정할지
				System.out.println("[ 수정할 과목을 선택 ]");
				System.out.println("0.국어 1.영어 2.수학"); // 원래는 1~3 으로 나열되는데 배열과 같이하기 위해 0~2로 처리함, 1~3으로 처리되면 -1 해줘야 함
				System.out.println("수정할 과목 번호를 입력하세요.>>");
				int sNum = scan.nextInt();
//				System.out.println(subject[sNum] + "현재 점수: " + score[searchNum][sNum]);// 국어 현재 점수: score[0][0] → 국어 현재점수: 100 → 90
				System.out.println("수정할 점수 입력: ");
				score[searchNum][sNum] = scan.nextInt();
				//합계 수정
				score[searchNum][3] = score[searchNum][0]+score[searchNum][1]+score[searchNum][2];
				//평균 수정
				avg[searchNum] = score[searchNum][3]/3.0;
				System.out.println("수정이 완료되었습니다.");

				break;
			case 3:
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

//		String[] name = new String[3];
//		int[] kor = new int[3];
//		int[] eng = new int[3];
//		int[] math = new int[3];
//		int[] total = new int[3];
//		double[] avg = new double[3];
//		
//		for(int i=0; i<name.length; i++) {
//			System.out.println("이름을 입력하세요");
//			name[i] = scan.next();
//			System.out.println("국어 점수를 입력하세요");
//			kor[i] = scan.nextInt();
//			System.out.println("영어 점수를 입력하세요");
//			eng[i] = scan.nextInt();
//			System.out.println("수학 점수를 입력하세요");
//			math[i] = scan.nextInt();
//			total[i] = kor[i]+eng[i]+math[i];
//			avg[i] = total[i]/3.0;
//		}
//		
//		System.out.print("이름\t국어\t영어\t수학\t합계\t평균\n");
//		System.out.println("-------------------------------------------------");
//		for(int i=0;i<name.length; i++) {
//			System.out.print(name[i]+ "\t");
//			System.out.print(kor[i]+ "\t");
//			System.out.print(eng[i]+ "\t");
//			System.out.print(math[i]+ "\t");
//			System.out.print(total[i]+ "\t");
//			System.out.println(avg[i]);
//		}
		
	} // main
} // class