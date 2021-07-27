package p0616;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex0616_01 {

	public static void main(String[] args) {
		//폴더 생성
		File dir1 = new File("c:/temp01/directory");
		if(!dir1.exists()) {
			dir1.mkdirs();
		}
		
		File file1 = new File("c:/temp01/file1.txt");
		if(!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileWriter fw = new FileWriter(file1); // 글자 있는 곳에 true 뒷 부분에 추가 가능
			String str = "[second file] Next class is JSP web Programming \n on Start Next week";
			fw.write(str + "\r \n"); // \r은 마지막 줄로 이동하여 줄바꿈
			fw.flush(); //버퍼에 기록되어 있는 내용을 모두 저장시키는 명령어
			fw.close();
			System.out.println("text is saved!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		//글자 읽기
		try {
			Scanner scan = new Scanner(file1);
			String str = " ";
			while(scan.hasNextLine()) {
				str = str + scan.nextLine() + "\n";
			}
			
			File file2 = new File("c:/temp01/file2.txt");
			if(!file2.exists()) {
				file2.createNewFile();
			}
			
			FileWriter fw2 = new FileWriter(file2);
			fw2.write(str + "\r \n");
			fw2.flush(); 
			fw2.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}	//main

}	//class
