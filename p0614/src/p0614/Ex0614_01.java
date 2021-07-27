package p0614;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0614_01 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Stu_process p = new Stu_process();
		
		loop1: while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 학생성적 추가");
			System.out.println("2. 학생성적 출력");
			System.out.println("3. 학생성적 수정");
			System.out.println("4. 학생성적 검색");
			System.out.println("5. 학생 등수처리");
			System.out.println("0. 프로그램 종료");
			System.out.println("------------------------------");
			System.out.println("원하는 번호르 입력하세요 → ");
			
			int choice = scan.nextInt();
			switch (choice) {
			case 1:p.student_insert(list);
				break;
			case 2:p.student_print(list);
				break;
			case 3:p.student_update(list);
				break;
			case 4:p.student_search(list);
				break;
			case 5:p.student_rank(list);
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop1;
				
			}//switch
			
		}//while

	} //main

} //class
