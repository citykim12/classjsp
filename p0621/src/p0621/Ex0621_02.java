package p0621;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0621_02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		StringBuffer sbf = new StringBuffer(); 
		
		list.add(new Student(1, "홍길동",100,100,100));
		list.add(new Student(2, "이순신",90, 90, 91));
		list.add(new Student(3, "유관순",99, 99, 98));
		list.add(new Student(4, "강감찬",80,80,89));
		list.add(new Student(5, "김구",100,100,99));
		list.add(new Student(6, "김유신",70,70,79));
		list.add(new Student(7, "이율곡",99,99,100));
		
		for(int i=0; i<list.size();i++) {
			Student s = (Student) list.get(i);
			if(i==0) {
				sbf.append(s.getName());
			}else {
				sbf.append("," + s.getName());
			}
		}
		System.out.println("이름StringBuffer: " + sbf.toString());
		
		String[] strName = sbf.toString().split(",");
		for(String i:strName) {
			System.out.println("이름: " + i);
		}
		
		for(int i=0; i<list.size(); i++) {
			Student s = (Student)list.get(i);
			System.out.println("학생성적: " + s.getStuNo()+",");
			System.out.println(s.getName() + ",");
			System.out.println(s.getKor() + ",");
			System.out.println(s.getEng() + ",");
			System.out.println(s.getMath() + ",");
			System.out.println(s.getTotal());
		}
		
		// 1 홍길동 100 100 100
		// 2 이순신 90 90 91
		// 3 유관순 99 99 98
		// 4 강감찬 80 80 89
		// 5 김구 100 100 99
		// 6 김유신 70 70 79
		// 7 이율곡 99 99 100
		// 7명의 학생성적을 ArrayList에 입력 후
		// 이름을 StringBuffer에 추가할 때, ","로 구분해서 저장할 것
		// 이름을 출력하고
		// 2. StringBuffer에 있는 데이터를 각각 분리해서
		// 이름을 각각 출력을 해보세요.
		// 3. ArrayList에 있는 데이터 모두 출력하시오
		
//		Scanner scan = new Scanner(System.in);
//		ArrayList list = new ArrayList();
//		String name = "";
//		int kor = 0, eng =0, math=0;
//		
//		while(true) {
//			System.out.println("1. 학생성적 입력");
//			System.out.println("2. 학생성적 출력");
//			int choice = scan.nextInt();
//			
//			switch (choice) {
//			
//			case 1: 
//				while(true) {
//					System.out.println("학생 이름을 입력하세요 → (0.상위메뉴 이동)");
//					name = scan.next(); 
//					if(name.equals("0")) {
//						System.out.println("상위 메뉴로 이동합니다.");
//					}
//					System.out.println("국어 점수를 입력하세요 → ");
//					kor = scan.nextInt();
//					System.out.println("영어 점수를 입력하세요 → ");
//					eng = scan.nextInt();
//					System.out.println("수학 점수를 입력하세요 → ");
//					math = scan.nextInt();
//					
//					int total = kor+eng+math;
//					double avg = total/3.0;  
//					
//					list.add(new Student(name, kor, eng, math));
//				}
//				
//				break;
//			case 2:
//				String name = "";
//				int kor = 0, eng =0, math=0;
//				
//				System.out.println("번호\t이름\t국어\t영어\t수학\t합계\n");
//				System.out.println("-----------------------------------------");
//				
//				for(int i=0;i<list.size();i++) {
//					Student s = (Student)list.get(i);
//					System.out.print(s.num + "\t");
//					System.out.print(s.name + "\t");
//					System.out.print(s.kor + "\t");
//					System.out.print(s.eng + "\t");
//					System.out.print(s.math + "\t");
//					System.out.print(s.total + "\t");
//				}
//				
//				break;
//			}
//		}
		
	} //main

} //class
