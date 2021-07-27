package pack02;
import java.util.ArrayList;
import java.util.Scanner;

public class Score_Process {
	static Scanner scan = new Scanner(System.in);

	// 메인 메뉴 출력메소드
	void mainPrint() {
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 학생성적 추가");
		System.out.println("2. 학생성적 출력");
		System.out.println("3. 학생성적 수정");
		System.out.println("4. 학생성적 검색");
		System.out.println("5. 학생 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("----------------------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
	}

	// 1. 학생성적추가 메소드
	void student_insert(ArrayList list) {
		String name = "";
		int kor = 0, eng = 0, math = 0;
		
		while(true) {
			// 번호는 자동으로 입력됨
			System.out.println("이름을 입력하세요.>>(0.상위메뉴이동)");
			String check = scan.next();
			
			if (check.equals("0")) {
				System.out.println("상위메뉴로 이동합니다.");
				break;
			}
			name = check;
			System.out.println("국어 점수를 입력하세요.>>");
			kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요.>>");
			eng = scan.nextInt();
			System.out.println("수학 점수를 입력하세요.>>");
			math = scan.nextInt();
			
			// s[i]객체선언
			// list.add(객체);
			list.add(new Student(name, kor, eng, math));
//			s[i] = new Student(name, kor, eng, math);
			
			}
	}// 학생성적추가 메소드
	
	// 상단출력 부분 메소드
	static void top_title() {
		System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("-----------------------------------------------");
	}

	// 2. 학생성적출력 메소드
	static void student_print(ArrayList list) {
		top_title(); // 상단출력 부분 메소드
		for (int i = 0; i < list.size(); i++) {
			Student s = (Student) list.get(0); //Student
			
			System.out.print(s.stu_number + "\t");
			System.out.print(s.name + "\t");
			System.out.print(s.kor + "\t");
			System.out.print(s.eng + "\t");
			System.out.print(s.math + "\t");
			System.out.print(s.total + "\t");
			System.out.printf("%.2f\t", s.avg);
			System.out.print(s.rank + "\n");
		}
	}
	// 3. 학생성적수정 메소드
	static void student_update(ArrayList list) {
		String search_name = "";
		int search_num = 1;
		System.out.printf("수정할 학생의 이름을 입력하세요.>>");
		search_name = scan.next();
		Student s = (Student) list.get(0);

		if (search_name.equals("0")) {
			System.out.println("상위메뉴로 이동합니다.(0. 상위메뉴 이동)>>");
//			break;
		} else {
			search_num = -1; // 검색 데이터가 있는지 확인하는 변수
			System.out.println("[ 검색된 학생 이름 ]");
			for (int i = 0; i < Student.count; i++) { // 학생수만큼 검색
				if (s.name.contains(search_name)) {
					System.out.println(i + "." + s.name);
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
					System.out.println("현재 점수: " + s.kor);
					System.out.println("수정할 점수를 입력하세요.>>");
					// 점수수정
					s.kor = scan.nextInt();

					break;
				case 1:
					System.out.println("현재 점수: " + s.eng);
					System.out.println("수정할 점수를 입력하세요.>>");
					// 점수수정
					s.eng = scan.nextInt();
					break;
				case 2:
					System.out.println("현재 점수: " + s.math);
					System.out.println("수정할 점수를 입력하세요.>>");
					// 점수수정
					s.math = scan.nextInt();
					break;
				}
				// 합계수정
				s.total = s.kor + s.eng + s.math;
				// 평균 수정
				s.avg = s.total / 3.0;
				System.out.println("수정이 완료되었습니다!");
			} //else
		} //if
	}
	// 4
	static void student_search(ArrayList list) {
		String search_name = "";
		int search_num = 1;
		System.out.println("검색할 학생의 이름을 입력하세요 → ");
		search_name = scan.next();
		top_title();
		Student s = (Student) list.get(0);
		
		search_num = 1;
		for(int i=0; i<Student.count; i++) {
			if(s.name.contains(search_name)) {
				System.out.print(s.stu_number + "\t");
				System.out.print(s.kor + "\t");
				System.out.print(s.eng + "\t");
				System.out.print(s.math + "\t");
				System.out.print(s.total + "\t");
				System.out.printf("%.2f \t", s.avg);
				System.out.print(s.rank + "\t");
				search_num = 0;
			}
		}
		if(search_num == -1) {
			System.out.println("찾는 데이터가 없습니다.");
		}
	}
	// 5. 학생 등수처리
	static void rank_process(ArrayList list) {
		Student s = (Student) list.get(0);
		for (int i = 0; i < Student.count; i++) {
			int rankNum = 1; // 등수count
			for (int j = 0; j < Student.count; j++) {
				if (s.total < s.total) {
					rankNum++;
				}
			}
			s.rank = rankNum;
		}
		System.out.println("등수 처리가 완료되었습니다!");
	}
	
}
