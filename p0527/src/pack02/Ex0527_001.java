package pack02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0527_001 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 학생성적 프로그램
		Student[] s = new Student[10];
		ArrayList list = new ArrayList();
		
		String name = "";
		int stu_num = 0, kor = 0, eng =0, math = 0, total = 0, rank = 0;
		double avg = 0;
		Score_Process score = new Score_Process();
		
		loop1: while(true) {
			score.mainPrint();
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1: // 학생성적 추가
				score.student_insert(list);
				break;
			case 2: // 학생성적 출력
				score.student_print(list);
				break;
			case 3: // 학생성적 수정
				student_update(s);
				break;
			case 4: // 학생성적 검색
				score.student_search(list);
				break;
			case 5: // 학생 등수처리
				student_rank(s);
				break;
			case 0: //종료
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			}
		}
	} //main

	// 3
	static void student_update(Student[] s) {
		// 1. " "(홍길동) 있는지 없는지
		// 2. 있다 → 수정할 과목을 선택하세요. → 1.국어 2.영어 3.수학
		// 원하는 과목 선택
		// 1. 국어선택
		// 현재 국어점수 ""(100) 수정하려는 점수를 입력하세요
		// 90 → 90점 변경되었습니다. out
		// 3. 없다 → out
		
		
		//홍길동 100 100 99 299 99.97
		
		System.out.println("수정할 학생의 이름을 입력하세요 → (0.상위메뉴 이동)");
		String search_name = scan.next();
		
		// 학생 저장장소 - Student[] s: Student.count(입력된 학생수)
		
		System.out.println("[ 수정학생 선택 ]");
		for(int i=0; i<Student.count; i++) {
			if(s[i].name.contains(search_name)) {
				System.out.println(i + "." + s[i].name);
				
			}
		}
		
		System.out.println("원하는 학생 번호를 입력하세요 → ");
		int temp_num = scan.nextInt();
		
		System.out.println("0.국어 1.영어 2.수학");
		System.out.println("수정과목을 선택하세요 → ");
		int temp_num2 = scan.nextInt();
		//s[1].eng 수정
		switch (temp_num2) {
		case 0:
			System.out.println("현재 점수: " + s[temp_num].kor);
			System.out.println("수정할 점수를 입력하세요 → ");
			
			s[temp_num].kor = scan.nextInt();
			System.out.println("수정 후 점수: " + s[temp_num].kor);
			System.out.println("수정이 완료되었습니다!");
			break;
		case 1:
			System.out.println("현재 점수: " + s[temp_num].eng);
			System.out.println("수정할 점수를 입력하세요 → ");
			
			s[temp_num].eng = scan.nextInt();
			System.out.println("수정 후 점수: " + s[temp_num].eng);
			System.out.println("수정이 완료되었습니다!");
			break;
		case 2:
			System.out.println("현재 점수: " + s[temp_num].math);
			System.out.println("수정할 점수를 입력하세요 → ");
			
			s[temp_num].math = scan.nextInt();
			System.out.println("수정 후 점수: " + s[temp_num].math);
			System.out.println("수정이 완료되었습니다!");
			break;
		}
		
		s[temp_num].total = s[temp_num].kor + s[temp_num].eng + s[temp_num].math;
		s[temp_num].avg = s[temp_num].total/3.0;
	}
	
	// 5
	static void student_rank(Student[] s) {
		for(int i=0; i<Student.count; i++) {
			int rankNum = 1;
			for(int j=0; j<Student.count; j++) {
				if(s[i].total<s[j].total) {
					rankNum++;
				}
			}
			s[i].rank = rankNum;
		}
		System.out.println("등수처리가 완료되었습니다.");
	}
	
} //class
