package p0616;

public class Ex0616_03 {

	public static void main(String[] args) {
		String str = "1,ȫ�浿,100,100,100,300,100";
		System.out.println("���ڿ�: " + str);
		String[] strArr = str.split(",");		
		System.out.println("�̸�: "+ strArr[1]);
		System.out.println("�հ�: "+ strArr[5]);
		
	} //main

}//class
