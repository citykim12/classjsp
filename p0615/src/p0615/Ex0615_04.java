package p0615;

import java.io.File;
import java.io.IOException;

public class Ex0615_04 {

	public static void main(String[] args) {
		String filePath = "c:/work/file/";
		File dir1 = new File(filePath);
		File f1 = new File("c:/work/file/file1.txt");
		
//		dir1.mkdir(); 	// �� c:/work��� ������ �� �־�� �������� ����.	
//		dir1.mkdirs();	// �� c:/work�� ������ work�� �����, file������ �������.
		
		if(dir1.exists() == false) {
			dir1.mkdirs();
			System.out.println("������ �����Ǿ����ϴ�.");
		}
		
		if(f1.exists() == false) {
			try {
				f1.createNewFile();
				System.out.println("������ �����Ǿ����ϴ�.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} 	//main

}	//class
