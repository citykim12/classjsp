package p0617;

import java.util.Scanner;

public class Ex0617_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] fileName = {"windows","Windows","WinDows","Win","Window","Window", "wins"};
		
		//windows �� ��ҹ��� ���о��� �˻��ؼ� �˻��� �ܾ� ���, ���� ���
		//win���ԵǾ� �ִ� �ܾ �˻� ���, ���� ���
		// s�� ������ �ܾ �˻� ���, ���� ����� �غ�����.
		
		System.out.println("�˻��� �ܾ �Է��ϼ��� �� ");
		
		String input = scan.nextLine().toLowerCase();
		System.out.println("input �ܾ�: " + input);
		
		int count=0;
		System.out.println("[ �ܾ� �˻� ]");
		for(String str:fileName) {
			if(str.equalsIgnoreCase(input)) {
				count++;
				System.out.println("�ܾ�: " + fileName);
			}
		}
		for(int i=0;i<fileName.length;i++) {
			if(fileName[i].contains(input)){
				count++;
				System.out.println("�����ϴ� �ܾ�: " + count);
			}
		}
		System.out.println("������ �ܾ� ����: " + count);
		
//		System.out.println("�˻��� �ܾ �Է��ϼ��� �� ");
//		String input = scan.nextLine().toLowerCase();
//		System.out.println("input���ܾ�:" + input);
//		
//		int count=0;
//		System.out.println("[ �ܾ� �˻� ]");
//		for(String str:fileName) {
//			if(str.equals(input)) {
//				count++;
//				System.out.println("�ܾ�: " + str);
//			}
//		}
//		System.out.println("������ �ܾ�: " + count);
		
	} //main

} //class
