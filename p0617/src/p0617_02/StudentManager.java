package p0617_02;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		Stu_process p = new Stu_process(); 
		
		loop1: while(true) {
			System.out.println("[ �л����� ���α׷� ]");
			System.out.println("1. �л����� �߰�");
			System.out.println("2. �л����� ���");
			System.out.println("3. �л����� ����");
			System.out.println("4. �л����� �˻�");
			System.out.println("5. �л����� ����");
			System.out.println("6. �л� ���ó��");
			System.out.println("0. ���α׷� ����");
			System.out.println("----------------------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ��� �� ");
			
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				p.Student_insert(list);
				break;
			case 2:
				p.Student_print(list);
				break;
			case 3:
				p.Student_update(list);
				break;
			case 4:
				p.Student_search(list);
				break;
			case 5:
				p.Student_rank(list);
				break;
			case 0:
				System.out.println("�ý����� �����մϴ�.");
				break loop1;
			}
		}
		
		
		
	} //main
	
} //class
