package p0616;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex0616_05 {

	public static void main(String[] args) {
		Student s1 = new Student(1, "ȫ�浿", 100, 100, 100);
		Student s2 = new Student(2, "�̼���", 90, 90, 90);
		
		System.out.println("s1�� class �̸�: " + s1.getClass().getName());
		
		
		//�Էµ� �����͸� ����Ͻÿ�
		System.out.println(s1);
		System.out.println(s2.toString());
		
	} //main

} //class
