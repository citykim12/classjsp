package p0617;

import java.io.File;
import java.util.Scanner;

public class Ex0617_01 {

	public static void main(String[] args) {
		// work1 ������ txt ������ � �ִ��� ����غ�����.
		// 1. ��ü ������ ������ ��� �о����
		// 2. txt �������� Ȯ�� ī��Ʈ
		// 3. ī��Ʈ ���
		Scanner scan = new Scanner(System.in);
		System.out.println("ã������ �ϴ� �����ּҸ� �Է��ϼ��� �� ");
		String dir = scan.nextLine();
		System.out.println("���� Ȯ���ڸ��� �Է��ϼ��� �� ");
		String ext = scan.next();
		System.out.println("1. ���ԵǾ� �ִ� ���� �˻�");
		System.out.println("2. ���ڿ��� ������ ���� �˻�");
		int choice = scan.nextInt();		
		
		
		File fileName = new File("dir");
		File[] f_name = fileName.listFiles();	//�����ȿ� ��� ���ϵ� ���� ������ 
//		f_name[0].getName();
		
		// �迭��ŭ for ������ �̸��� ��
		int count = 0;	//txt���� ����
		if(choice==1) {
			//���ԵǾ� �ִ� ����
			for(int i=0;i<f_name.length;i++) {
				if(f_name[i].getName().contains(ext)){
					count++;
				}
			}
		}else {
			//������ ����
			for(int i=0;i<f_name.length;i++) {
				if(f_name[i].getName().endsWith(ext)){
					count++;
				}
			}
			System.out.println("�������� " + ext + "���� ����: " + count);
		}
		
//		File fileName = new File("c:/work1");
//		File[] f_name = fileName.listFiles();	//�����ȿ� ��� ���ϵ� ���� ������ 
//		// �迭��ŭ for ������ �̸��� ��
//		f_name[0].getName();
//		
//		int count = 0;
//		for(int i=0;i<f_name.length;i++) {
//			if(f_name[i].getName().endsWith("txt")){
//				count++;
//			}
//		}
//		System.out.println("���� ����: " + count);
		
	}	//main

}	//class
