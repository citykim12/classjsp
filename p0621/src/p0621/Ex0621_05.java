package p0621;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex0621_05 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		MapProcess mp = new MapProcess();
		list.add(new Student(1, "ȫ�浿",100,100,100));
		list.add(new Student(2, "�̼���",90, 90, 91));
		list.add(new Student(3, "������",99, 99, 98));
		list.add(new Student(4, "������",80,80,89));
		list.add(new Student(5, "�豸",100,100,99));
		list.add(new Student(6, "������",70,70,79));
		list.add(new Student(7, "������",99,99,100));
		
		HashMap map = mp.selectStudent(list);
		
		System.out.println("list��� �̸�: " + map.get("strName"));
		System.out.println("result ��ȣ: " + map.get("result"));
		System.out.println("result ���: " + map.get("resultTitle"));
		System.out.println("�˻���� �̸�: " + map.get("name"));
	}

}
