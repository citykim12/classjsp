package pack03;

import java.util.Scanner;

public class Homework_01_City {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Student[] s = new Student[10];
		String name = "";
		int stu_num = 0, kor = 0, eng = 0, math = 0, total = 0, rank = 0;
		double avg = 0;
		
		loop1: while(true) {
			mainPrint();
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				student_insert(s);
				break;
			case 2:
				student_print(s);
				break;
			case 3:
				student_update(s);
				break;
			case 4:
				student_search(s);
				break;
			case 5:
				rank_process(s);
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			}
		}
		

	} //main
	static void mainPrint() {
		System.out.println("- 학생성적 프로그램 -");
		System.out.println("1. 학생성적 추가");
		System.out.println("2. 학생성적 출력");
		System.out.println("3. 학생성적 수정");
		System.out.println("4. 학생성적 검색");
		System.out.println("5. 학생 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("---------------------------------");
		System.out.println("원하는 번호를 입력하세요 → ");
	}
	// 1. 
	static void student_insert(Student[] s) {
		String name = "";
		int kor = 0, eng = 0, math = 0;
		
		for(int i=Student.count; i<s.length; i++) {
			System.out.println("이름을 입력하세요 → (0.상위메뉴 이동)");
			String check = scan.next();
			
			if(check.equals("0")) {
				System.out.println("상위 메뉴로 이동합니다.");
				break;
			}
			name = check;
			System.out.println("국어 점수를 입력하세요 → ");
			kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요 → ");
			eng = scan.nextInt();
			System.out.println("수학 점수를 입력하세요 → ");
			math = scan.nextInt();
			
			s[i] = new Student(name, kor, eng, math);
		}
	}
	
	//상단 출력
	static void top_title() {
		System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("--------------------------------------------------");
	}
	
	// 2.
	static void student_print(Student[] s) {
		top_title();
		for(int i=0; i<Student.count; i++) {
			System.out.print(s[i].stu_num + "\t");
			System.out.print(s[i].name + "\t");
			System.out.print(s[i].kor + "\t");
			System.out.print(s[i].eng + "\t");
			System.out.print(s[i].math + "\t");
			System.out.print(s[i].total + "\t");
			System.out.printf("%.2f \t", s[i].avg);
			System.out.print(s[i].rank + "\n");
		}
	}
	//3. 
	static void student_update(Student[] s) {
		String search_name = "";
		int search_num = 1;
		System.out.println("수정할 학생의 이름을 입력하세요 → ");
		search_name = scan.next();
		
		if(search_name.equals("0")) {
			System.out.println("상위 메뉴로 이동합니다. (0.상위메뉴로 이동)");
		}else {
			search_num = -1;
			System.out.println("- 검색된 학생 이름 -");
			for(int i=0; i<Student.count; i++) {
				if(s[i].name.contains(search_name)) {
					System.out.println(i + "." + s[i].name);
					search_num = 0;
				}
			}
			if(search_num == -1) {
				System.out.println("찾는 데이터가 없습니다.");
			}else {
				System.out.println("수정할 학생의 번호를 입력하세요 → ");
				int temp_num = scan.nextInt();
				
				System.out.println("- 수정할 과목 선택 -");
				System.out.println("0.국어 1.영어 2.수학");
				System.out.println("수정할 과목번호를 입력하세요 → ");
				int temp_num2 = scan.nextInt();
				
				switch (temp_num2) {
				case 0:
					System.out.println("현재 점수: " + s[temp_num].kor);
					System.out.println("수정할 점수를 입력하세요 → ");
					s[temp_num].kor = scan.nextInt();
					break;
				case 1:
					System.out.println("현재 점수: " + s[temp_num].eng);
					System.out.println("수정할 점수를 입력하세요 → ");
					s[temp_num].eng = scan.nextInt();
					break;
				case 2:
					System.out.println("현재 점수: " + s[temp_num].math);
					System.out.println("수정할 점수를 입력하세요 → ");
					s[temp_num].math = scan.nextInt();
					break;
				}
				s[temp_num].total = s[temp_num].kor + s[temp_num].eng + s[temp_num].math;
				s[temp_num].avg = s[temp_num].total/3.0;
				System.out.println("수정이 완료되었습니다!");
			}
		}
		
	}
	//4.
	static void student_search(Student[] s) {
		String search_name = "";
		int search_num = 1;
		System.out.println("검색할 학생의 이름을 입력하세요 → ");
		search_name = scan.next();
		
		top_title();
		search_num = -1;
		for(int i=0; i<Student.count; i++) {
			if(s[i].name.contains(search_name)) {
				System.out.print(s[i].stu_num + "\t");
				System.out.print(s[i].name + "\t");
				System.out.print(s[i].kor + "\t");
				System.out.print(s[i].eng + "\t");
				System.out.print(s[i].math + "\t");
				System.out.print(s[i].total + "\t");
				System.out.printf("%.2f \t", s[i].avg);
				System.out.print(s[i].rank + "\n");
			}
		}
		if(search_num == -1) {
			System.out.println("찾는 데이터가 없습니다.");
		}
	}
	//5.
	static void rank_process(Student[] s) {
		for(int i=0; i<Student.count; i++) {
			int rankNum = 1;
			for(int j=0; j<Student.count; j++) {
				if(s[i].total<s[j].total) {
					rankNum++;
				}
			}
			s[i].rank = rankNum;
		}
		System.out.println("등수 처리가 완료되었습니다!");
	}
	
} //class
