package p0621;

public class Ex0621_01 {

	public static void main(String[] args) {
		String[] str = {"ȫ�浿", "�̼���", "������", "������", "������"};
		StringBuffer sbf = new StringBuffer("");
		
		for(int i=0;i<str.length;i++) {
			if(i==0) {
				sbf.append(str[i]);	//ȫ�浿
			}else {
				sbf.append("," + str[i]);	//�̼���, ������,������,������
			}
		}
		
		String str2 = sbf.toString(); //"ȫ�浿,�̼���,������,������,������"
		String[] result = str2.split(",");
		
		for(String i:result) {
			System.out.println(i);
		}
		
	} //main

} //class
