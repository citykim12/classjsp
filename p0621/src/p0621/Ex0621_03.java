package p0621;

import java.util.HashSet;
import java.util.Iterator;

public class Ex0621_03 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		Student stu = new Student(1,"ȫ�浿",100,100,100);
		set.add(stu);
		stu = new Student(2,"�̼���",90, 90, 91);
		set.add(stu);
		stu = new Student(3,"������",99, 99, 98);
		set.add(stu);
		set.add(new Student(4,"������",80,80,89));
		set.add(new Student(5,"�豸",100,100,99));
		set.add(new Student(6,"������",70,70,79));
		set.add(new Student(7,"������",99,99,100));
		set.add(new Student(1,"ȫ�浿",100,100,100));
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Student s = (Student) itr.next();
			System.out.print("�л�����set: " + s.getStuNo() + ",");
			System.out.print(s.getName() + ",");
			System.out.print(s.getKor() + ",");
			System.out.print(s.getEng() + ",");
			System.out.print(s.getMath() + ",");
			System.out.println(s.getTotal());
			
		}

	}//main

}//class