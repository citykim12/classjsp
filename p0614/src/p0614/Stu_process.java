package p0614;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_process {
	Scanner scan = new Scanner(System.in);
		
	//1.
	void student_insert(ArrayList list) {
		String stu_name = " ";
		int kor = 0, eng = 0, math = 0;
		
		while(true) {
			System.out.println("학생 이름을 입력하세요 →(0. 상위메뉴로 이동)");
			stu_name = scan.next();
			if(stu_name.equals("0")) {
				System.out.println("상단 메뉴로 이동합니다.");
				break;
			}
			System.out.println("국어 점수를 입력하세요 → ");
			kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요 → ");
			eng = scan.nextInt();
			System.out.println("수학 점수를 입력하세요 → ");
			math = scan.nextInt();

			list.add(new Student(stu_name, kor, eng, math));
		}
		
	}
	//2.
	void student_print(ArrayList list) {
		System.out.print("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("----------------------------------------");
		
		for(int i=0; i<list.size(); i++) {
			Student s = (Student)list.get(i);
			System.out.print(s.stu_num+"\t");
			System.out.print(s.stu_name+"\t");
			System.out.print(s.kor+"\t");
			System.out.print(s.eng+"\t");
			System.out.print(s.math+"\t");
			System.out.print(s.total+"\t");
			System.out.printf("%.2f \t", s.avg);
			System.out.print(s.rank+"\n");
			
		}
	}
	//3.
	void student_update(ArrayList list) {
		String stu_name = " ";
		int kor = 0, eng = 0, math = 0;
		
		System.out.println("검색할 학생의 이름을 입력하세요 → ");
		stu_name = scan.next();
		
		int check_flag = 0;
		for(int i=0; i<list.size(); i++) {
			Student s = (Student)list.get(i);
			if(stu_name.equals(stu_name)) {
				System.out.println("수정하고자 하는 학생을 찾았습니다!");
				System.out.println("[ 수정할 과목 선택 ]");
				System.out.println("1.국어 2.영어 3.수학");
				System.out.println("수정할 과목 번호를 입력하세요 →");
				int choice = scan.nextInt();
				switch (choice) {
				case 1:
					System.out.println("현재 점수: " + s.kor);
					System.out.println("수정하고 싶은 점수를 입력하세요 → ");
					s.kor = scan.nextInt();
					break;
				case 2:
					System.out.println("현재 점수: " + s.eng);
					System.out.println("수정하고 싶은 점수를 입력하세요 → ");
					s.eng = scan.nextInt();
					break;
				case 3:
					System.out.println("현재 점수: " + s.math);
					System.out.println("수정하고 싶은 점수를 입력하세요 → ");
					s.math = scan.nextInt();
					break;
				}
				s.total = s.kor + s.eng + s.math;
				s.avg = s.total/3.0;
				check_flag = 1;
			}
		}
		if(check_flag == 0) {
			System.out.println("찾는 데이터가 없습니다.");
		}
	}
	
	//4.
	void student_search(ArrayList list) {
		String stu_name = " ";
		int kor = 0, eng = 0, math = 0;
		
		System.out.println("검색할 학생의 이름을 입력하세요 → ");
		stu_name = scan.next();
		
		int check_flag = 0;
		for(int i=0; i<list.size(); i++) {
			Student s = (Student)list.get(i);
			
			if(s.stu_name.contains(stu_name)) {
				System.out.print(s.stu_num+"\t");
				System.out.print(s.stu_name+"\t");
				System.out.print(s.kor+"\t");
				System.out.print(s.eng+"\t");
				System.out.print(s.math+"\t");
				System.out.print(s.total+"\t");
				System.out.printf("%.2f \t", s.avg);
				System.out.print(s.rank+"\n");
				check_flag = 1;
			}
		}
		if(check_flag == 0) {
			System.out.println("찾는 데이터가 없습니다.");
		}
		
	}
	
	//5.
	void student_rank(ArrayList list) {
		for(int i=0; i<list.size(); i++) {
			Student s1 = (Student)list.get(i);
			int rCount = 1;
			for(int j=0; j<list.size(); j++) {
				Student s2 = (Student)list.get(i);	
				if(s1.total<s2.total) {
					rCount++;
				}
			}
			s1.rank = rCount;
		}
		System.out.println("등수 처리가 완료되었습니다.");
	}

}
