package p0616;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex0616_02 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		File file1 = new File("c:/temp01/student.txt");
		//������
		int count=0, stuNo=0, kor=0, eng=0, math=0, total=0;
		double avg=0;
		String name = " ";
		//�������� �ӽú���
		
		while(count<2) {
			String content = " ";
			System.out.println("�й��� �Է��ϼ��� �� ");
			stuNo = scan.nextInt();
			content += stuNo + ",";
			System.out.println("�̸��� �Է��ϼ��� �� ");
			name = scan.next();
			content += name + ",";
			System.out.println("���� ������ �Է��ϼ��� �� ");
			kor = scan.nextInt();
			content += kor + ",";
			System.out.println("���� ������ �Է��ϼ��� �� ");
			eng = scan.nextInt();
			content += eng + ",";
			System.out.println("���� ������ �Է��ϼ��� �� ");
			math = scan.nextInt();
			content += math + ",";
			total = kor + eng + math;
			content += total + ",";
			avg = total/3.0;
			content += avg;
			
			//���� ����
			try {
				if(!file1.exists()) {
					file1.createNewFile();
				}
				FileWriter fw = new FileWriter(file1,true);
				fw.write(content+"\r\n");
				fw.flush();
				fw.close();
				System.out.println("file is saved!");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			count++;
		} //while
		
		//���� �б�
		try {
			Scanner scan2 = new Scanner(file1);
			String str = " ";
			while(scan2.hasNextLine()) {	//���� �о���� ������ �����Ͱ� �ִ��� Ȯ�� �޼ҵ�
				str += scan2.nextLine() + ",";
			}
			//��ü ���
			System.out.println("��ü ������: " + str);
			String[] strArr = str.split(",");
			//������ ������ ���
			for(int i=0;i<strArr.length;i++) {
				System.out.println("������ ������: " + strArr[i]);
			}
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			
	} //main

} //class
