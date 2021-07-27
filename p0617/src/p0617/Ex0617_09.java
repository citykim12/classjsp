package p0617;

import java.util.HashSet;
import java.util.Iterator;

public class Ex0617_09 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(new Tv(1, "OLEDTV"));
		hs.add(3);
		hs.add(new Tv(2, "OLEDTV2"));
		hs.add(4);
		hs.add(new Student(1,"ȫ�浿"));
		
		Iterator itr = hs.iterator();	//set �÷��ǿ��� iterator��ü�� ������.

		while(itr.hasNext()) {	//hasNext():�о�� �����Ͱ� �ִ��� Ȯ��
			Object obj = itr.next();
			if(obj instanceof Student) {
				System.out.println("������: " + ((Student)obj).name);
			}else if(obj instanceof Tv){
				System.out.println("������: " + ((Tv)obj).name);
			}else {
				System.out.println("������: " + obj);	//next():��ü�� 1�� ������
			}
		}
		
		hs.remove(3);
		
		Iterator itr2 = hs.iterator();
		while(itr2.hasNext()) {	//hasNext():�о�� �����Ͱ� �ִ��� Ȯ��
			System.out.println("������: " + itr2.next());	//next():��ü�� 1�� ������
		}
		
	} //main

} //class
