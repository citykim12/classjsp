import java.util.Scanner;

public class Ex0521_02 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 객체 배열 주소선언 - 참조변수 주소만 생성됨.
		Student[] s = new Student[10]; // 10명의 데이터 저장배열
		int stu_number = 0, kor = 0, eng = 0, math = 0, tota = 0, rank = 0;
		double avg = 0;
		Score_Process score = new Score_Process();

		loop1: while (true) {
			score.mainPrint(); // 메인메뉴 출력 메소드
			int choice = scan.nextInt();

			switch (choice) {
			case 1: // 학생성적추가
				score.student_insert(s); // 학생성적추가 메소드호출
				break;
			case 2: // 학생성적출력
				score.student_print(s); // 학생성적출력 메소드
				break;
			case 3: // 학생성적수정
				student_update(s); // 학생성적 수정 메소드
				break;
			case 4: // 학생성적검색
				student_search(s); // 학생성적 검색 메소드
				break;
			case 5: // 학생 등수처리
				rank_process(s);
				break;
			case 0: // 종료
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			}
		}

	} // main method
	// 3. 학생성적수정 메소드
	static void student_update(Student[] s) {
		String search_name = "";
		int search_num = 1;
		System.out.printf("수정할 학생의 이름을 입력하세요.>>");
		search_name = scan.next();

		if (search_name.equals("0")) {
			System.out.println("상위메뉴로 이동합니다.(0. 상위메뉴 이동)>>");
//			break;
		} else {
			search_num = -1; // 검색 데이터가 있는지 확인하는 변수
			System.out.println("[ 검색된 학생 이름 ]");
			for (int i = 0; i < Student.count; i++) { // 학생수만큼 검색
				if (s[i].name.contains(search_name)) {
					System.out.println(i + "." + s[i].name);
					// 0. 홍길동
					// 1. 홍길자
					// 2. 홍길순
					search_num = 0; // 검색 데이터가 있을 경우0, 없을 경우 -1
				}
			}
			// 없을 경우
			if (search_num == -1) {
				System.out.println("찾을 데이터가 없습니다.");
			} else {
				// 있을 경우
				System.out.println("수정할 학생의 번호를 입력하세요.>>");
				int temp_num = scan.nextInt();

				// 수정할 과목을 선택
				System.out.println("[ 수정할 과목 선택 ]");
				System.out.println("0.국어 1.영어 2.수학");
				System.out.println("수정할 과목번호를 입력하세요.>>");
				int temp_num2 = scan.nextInt();

				switch (temp_num2) {
				case 0:
					System.out.println("현재 점수: " + s[temp_num].kor);
					System.out.println("수정할 점수를 입력하세요.>>");
					// 점수수정
					s[temp_num].kor = scan.nextInt();

					break;
				case 1:
					System.out.println("현재 점수: " + s[temp_num].eng);
					System.out.println("수정할 점수를 입력하세요.>>");
					// 점수수정
					s[temp_num].eng = scan.nextInt();
					break;
				case 2:
					System.out.println("현재 점수: " + s[temp_num].math);
					System.out.println("수정할 점수를 입력하세요.>>");
					// 점수수정
					s[temp_num].math = scan.nextInt();
					break;
				}
				// 합계수정
				s[temp_num].total = s[temp_num].kor + s[temp_num].eng + s[temp_num].math;
				// 평균 수정
				s[temp_num].avg = s[temp_num].total / 3.0;
				System.out.println("수정이 완료되었습니다!");
			} //else
		} //if
	}

	// 4. 학생성적 검색
	static void student_search(Student[] s) {
		String search_name = "";
		int search_num = 1;
		System.out.println("검색할 학생의 이름을 입력하세요.>>");
		search_name = scan.next();

		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("-----------------------------------------------");

		search_num = -1; // 검색 데이터가 있는지 확인하는 변수
		for (int i = 0; i < Student.count; i++) {
			if (s[i].name.contains(search_name)) {
				// 출력
				System.out.print(s[i].stu_number + "\t");
				System.out.print(s[i].name + "\t");
				System.out.print(s[i].kor + "\t");
				System.out.print(s[i].eng + "\t");
				System.out.print(s[i].math + "\t");
				System.out.print(s[i].total + "\t");
				System.out.printf("%.2f \t", s[i].avg);
				System.out.print(s[i].rank + "\n");
				search_num = 0; // 데이터가 있을경우 0으로 변경, 없을 경우 -1
			}
		}
		// 없을경우
		if (search_num == -1) {
			System.out.println("찾을 데이터가 없습니다.");
		}
	}

	// 5. 학생 등수처리
	static void rank_process(Student[] s) {
		for (int i = 0; i < Student.count; i++) {
			int rankNum = 1; // 등수count
			for (int j = 0; j < Student.count; j++) {
				if (s[i].total < s[j].total) {
					rankNum++;
				}
			}
			s[i].rank = rankNum;
		}
		System.out.println("등수 처리가 완료되었습니다!");
	}

} // class
