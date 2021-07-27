package p0615;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex0615_06 {

	public static void main(String[] args) {
		
		File fileName = new File("c:/Windows/");
		File[] f_contents = fileName.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm"); 
		for(int i=0; i<f_contents.length; i++) {
			//파일 이름
			System.out.printf("%s \t",f_contents[i].getName());
			//파일 유형
			if(f_contents[i].isDirectory()) {
				System.out.printf("%s \t", "<폴더>");
			}else {
				System.out.printf("%s \t", "<파일>");
			}
			//파일 크기
			System.out.printf("%d KB \t", f_contents[i].length());
			//파일 날짜
			System.out.printf("%s \n", sdf.format(f_contents[i].lastModified()));
		}

	}	//main

}	//class
