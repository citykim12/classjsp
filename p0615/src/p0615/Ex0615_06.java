package p0615;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex0615_06 {

	public static void main(String[] args) {
		
		File fileName = new File("c:/Windows/");
		File[] f_contents = fileName.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm"); 
		for(int i=0; i<f_contents.length; i++) {
			//���� �̸�
			System.out.printf("%s \t",f_contents[i].getName());
			//���� ����
			if(f_contents[i].isDirectory()) {
				System.out.printf("%s \t", "<����>");
			}else {
				System.out.printf("%s \t", "<����>");
			}
			//���� ũ��
			System.out.printf("%d KB \t", f_contents[i].length());
			//���� ��¥
			System.out.printf("%s \n", sdf.format(f_contents[i].lastModified()));
		}

	}	//main

}	//class
