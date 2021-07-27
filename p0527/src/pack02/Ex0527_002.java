package pack02;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex0527_002 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 객체 배열 주소선언 - 참조변수 주소만 생성됨.
		Student[] s = new Student[10]; // 10명의 데이터 저장배열
		ArrayList list = new ArrayList();
		int stu_number = 0, kor = 0, eng = 0, math = 0, tota = 0, rank = 0;
		double avg = 0;
		Score_Process score = new Score_Process();

		loop1: while (true) {
			score.mainPrint(); // 메인메뉴 출력 메소드
			int choice = scan.nextInt();

			switch (choice) {
			case 1: // 학생성적추가
				score.student_insert(list); // 학생성적추가 메소드호출
				break;
			case 2: // 학생성적출력
				score.student_print(list); // 학생성적출력 메소드
				break;
			case 3: // 학생성적수정
				score.student_update(list); // 학생성적 수정 메소드
				break;
			case 4: // 학생성적검색
				score.student_search(list); // 학생성적 검색 메소드
				break;
			case 5: // 학생 등수처리
				score.rank_process(list);
				break;
			case 0: // 종료
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			}
		}

	} // main method


} // class
