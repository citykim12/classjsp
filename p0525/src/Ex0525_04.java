import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;

public class Ex0525_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int stu_number = 0;
		String student_name = "";
		String stu_date = "";
		int count = 0;
		
		System.out.println("�л� �̸��� �Է��ϼ��� �� ");
		student_name = scan.next();
		stu_number = ++count;
		// ��¥ ����
		Date today = new Date();
		//��¥ �ð� ����
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		// ��¥ �ð� ���˿� �°� ǥ��
		stu_date = date.format(today);
		
		System.out.println("[ �л����� ]");
		System.out.println("�й�: " + stu_number);
		System.out.println("�л� �̸�: " + student_name);
		System.out.println("�Է� ��¥: " + today);
		System.out.println("�Է� ��¥: " + stu_date);
		
	}//main

}//class
