package p0617;

import java.util.Scanner;

public class Ex0617_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] fileName = {"windows","Windows","WinDows","Win","window","Window", "wins"};
		
		System.out.println("�˻��� �ܾ �Է��ϼ��� �� ");
		
		String input = scan.nextLine().trim(); 	//�յ� ���� ����
		input = input.replaceAll(" ", ""); 	// �߰� ���� ����
		System.out.println("input �ܾ�: " + input);
		
		int count=0;
		System.out.println("[ �ܾ� �˻� ]");
		for(int i=0;i<fileName.length;i++) {
			if(fileName[i].equals(input)) {
				count++;
				System.out.println("�ܾ�: " + fileName[i]);
			}
		}
		
//		for(int i=0;i<fileName.length;i++) {
//			fileName[i] = fileName[i].replace("win", "Win");
//			System.out.println(fileName[i]);
//		}
		
//		String str = "abcdefghijklmnopqrstuvwxyz";
//		
//		System.out.println("�ٲ�� �� �ܾ�: " + str);
//		String result = str.replace("fgh","fff");
//		System.out.println("�ٲ� �ܾ�: " + result);
		
//		while(true) {
//			System.out.println("ã���� �ϴ� ���ڸ� �Է��ϼ��� �� ");
//			String input = scan.next();
//			if(input.length()>4) {
//				System.out.println("3�ڸ� ���ϸ� �Է��ϼž� �մϴ�.");
//				continue;
//			}
			
//			int index = str.indexOf(input);
//			System.out.println(input + "ã�� ����: " + index);
//		}

	} //mian

} //class
