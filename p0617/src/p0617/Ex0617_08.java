package p0617;

import java.util.ArrayList;
import java.util.List;

public class Ex0617_08 {

	public static void main(String[] args) {
		List list1 = null;
		ArrayList list = new ArrayList();
		list.add(1); //1 = int �� Integer: ����ڽ� (WrapperŬ����)
		list.add(new Student(1,"ȫ�浿")); //��ü
		list.add(2); 	//int
		list.add("aaa");	//String
		list.add(12.5);	//double
		list.add(new Student(2,"�̼���"));	//��ü
		
		for(int i=0;i<list.size();i++) {
			System.out.println("list: " + (i+1) + "��°: " + list.get(i));
		}
		
		list.remove(0);
		
		for(int i=0;i<list.size();i++) {
			System.out.println("list: " + (i+1) + "��°: " + list.get(i));
		}
		
//		System.out.println("list 1��°: " + list.get(0));
//		
//		//list.get(1) �� Object��ü, Student��ü ����ȯ�� ���Ѿ� ��� ����
//		System.out.println("list 2��°: " + ((Student)list.get(1)));
//		System.out.println("list 3��°: " + list.get(2));
//		System.out.println("list 4��°: " + list.get(3));
//		System.out.println("list 5��°: " + list.get(4));
//		System.out.println("list 6��°: " + list.get(5));
		
//		list.remove(0);
//		System.out.println("----------------------------------------");
//		System.out.println("list 1��°: " + list.get(0));
//		//list.get(1) �� Object��ü, Student��ü ����ȯ�� ���Ѿ� ��� ����
//		System.out.println("list 2��°: " + ((Student)list.get(1)));
//		System.out.println("list 3��°: " + list.get(2));
//		System.out.println("list 4��°: " + list.get(3));
//		System.out.println("list 5��°: " + list.get(4));
//		System.out.println("list 6��°: " + list.get(5));
		
//		Ex0617_08.add(0,1,2);
		
	}	//main
	
//	public static void add(Object obj, int num1, int num2) {
//		
//	}
	
}	//class
