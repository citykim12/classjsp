package p0614;

import java.util.ArrayList;

public class Ex0614_03 {

	public static void main(String[] args) {
		
		ArrayList<Stu> list = new ArrayList<Stu>();
		
		Stu s1 = new Stu();
		s1.stu_num=1;
		s1.pw = "1111";
		s1.name = "ȫ�浿";
		s1.nickName = "�浿��";
		Stu s2 = new Stu(2, "2222", "�̼���", "���Ž�");
//		Stu s3 = new Stu(3, "3333", "������", "������");
//		Stu s4 = new Stu(4, "4444", "������", "������");
//		Stu s5 = new Stu(5, "5555", "�豸", "����");
		
		//toString ���� ��, �����ϰ� �ۼ��� �� �ϴ� ���(���� ���� �ʾƵ� ��)
		System.out.println("s1��ü: " + s1);
//		System.out.println("s1��ü ��ȣ: " + s1.stu_num);
//		System.out.println("s1��ü ��й�ȣ: " + s1.pw);
//		System.out.println("s1��ü �̸�: " + s1.name);
//		System.out.println("s1��ü �г���: " + s1.nickName);
		
		System.out.println("s2��ü: " + s2);
//		System.out.println("s2��ü ��ȣ: " + s2.stu_num);
//		System.out.println("s2��ü ��й�ȣ: " + s2.pw);
//		System.out.println("s2��ü �̸�: " + s2.name);
//		System.out.println("s2��ü �г���: " + s2.nickName);

		list.add(s1); //remove, get, size
		list.add(s2);
		
		//���� for��
		for(Stu s:list) {
			System.out.println(s);
		}
		
		//���� for��
		for(int i=0; i<list.size();i++) {
			Stu s = (Stu)list.get(i);
			
			System.out.println(s.stu_num);
			System.out.println(s.pw);
			System.out.println(s.name);
			System.out.println(s.nickName);
		}
		
		//����
//		System.out.println("s3��ü: " + s3);
//		System.out.println("s3��ü ��ȣ: " + s3.stu_num);
//		System.out.println("s3��ü ��й�ȣ: " + s3.pw);
//		System.out.println("s3��ü �̸�: " + s3.name);
//		System.out.println("s3��ü �г���: " + s3.nickName);
//
//		System.out.println("s4��ü: " + s4);
//		System.out.println("s4��ü ��ȣ: " + s4.stu_num);
//		System.out.println("s4��ü ��й�ȣ: " + s4.pw);
//		System.out.println("s4��ü �̸�: " + s4.name);
//		System.out.println("s4��ü �г���: " + s4.nickName);
//
//		System.out.println("s5��ü: " + s5);
//		System.out.println("s5��ü ��ȣ: " + s5.stu_num);
//		System.out.println("s5��ü ��й�ȣ: " + s5.pw);
//		System.out.println("s5��ü �̸�: " + s5.name);
//		System.out.println("s5��ü �г���: " + s5.nickName);
	
		
		// ��� for �� - �迭, ArrayList
//		int[] arr1 = {1,2,3,4,5};
//		for(int num:arr1) {
//			System.out.println("int �迭: " + num);
//		}
//		
//		char[] ch = {'a','b','c'};
//		for(char a:ch) {
//			System.out.println("char �迭: " + a);
//		}

	}//main

}//class
