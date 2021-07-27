package p0616;

public class Ex0616_09 {

	public static void main(String[] args) {
		 
		String[] fileName = {"file1.txt","file2.hwp","file3.psd","file4.jpg",
							"file5.ppt","file6.doc","file7.java"};
		
		String[] fileName2 = {"ff.hwp","ff2.java","ff.doc"};
		
		String file="";
		for(int i=0;i<fileName.length;i++) {
			if(i==0) {
				file += fileName[i];
			}else {
				file += ", " + fileName[i];
			}
		}
		System.out.println(file);
		
		//txt-문서파일,hwp-한글파일,psd-포토샵파일,jpg-이미지파일,ppt-파워포인트파일
		//doc-워드문서파일,java-java파일
		
//		String str = "file.txt";
//		if(str.endsWith(str)) {
//			System.out.println("is text document file");
//		}else {
//			System.out.println("is not text document file");
//		}

	} //main

} //class
