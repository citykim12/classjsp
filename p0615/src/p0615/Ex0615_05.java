package p0615;

import java.io.File;

public class Ex0615_05 {

	public static void main(String[] args) throws Exception {
		//work1/file
		//work1/f1.txt, f2.txt, f3.txt, f4.txt ������ ��������
		
		File d1 = new File("c:/work1/file");
		File f1 = new File("c:/wokr1/f1.txt");
		File f2 = new File("c:/wokr1/f2.txt");
		File f3 = new File("c:/wokr1/f3.txt");
		File f4 = new File("c:/wokr1/f4.txt");
		
		if(d1.exists()==false) {
			d1.mkdirs();
			System.out.println("������ �����Ǿ����ϴ�.");
		}
		
		if(f1.exists()==false) {
			f1.createNewFile();
			System.out.println("������ �����Ǿ����ϴ�.");
		}
		if(f2.exists()==false) {
			f2.createNewFile();
			System.out.println("������ �����Ǿ����ϴ�.");
		}
		if(f3.exists()==false) {
			f3.createNewFile();
			System.out.println("������ �����Ǿ����ϴ�.");
		}
		if(f4.exists()==false) {
			f4.createNewFile();
			System.out.println("������ �����Ǿ����ϴ�.");
		}
		
//		File fileName = new File("c:/work1");
//		//���丮�� ���Ե� ���ϰ� ������丮�� Ȯ���ؼ� String �迭�� ����
//		File[] f_contents = fileName.listFiles(); 
//		for(int i=0; i<f_contents.length; i++) {
//			System.out.println("���ϸ�: " + f_contents[i].getName());
//		}
		
	}	//main

}	//class
