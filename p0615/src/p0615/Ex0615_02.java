package p0615;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0615_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>(); 
//		int[] arr = new int[3]; // 3�� �̻� �Է��� ��� ���� ��: ��Ÿ�� ����
		int count = 0;
		while(true) {
			System.out.println((count+1) + "��° �����͸� �Է��ϼ���. �� ");
			list.add(scan.nextInt());
//			arr[count] = scan.nextInt(); // 3�� �� �Է�
			System.out.println((count+1) + "��° ������ ��: " + list.get(count));
			count++;
		}
		
		//ó������ ������ ���� ��: ������ ���� / �����ϰ� �ִ� ���߿� ���� ���� ��: ��Ÿ�� ����
//		System.out.println("���� ó���� �ϰ� �ֽ��ϴ�.");
//		System.out.prinln("���� ó���� �ϰ� �ֽ��ϴ�.");	//������ ����
	} //main

} //class
