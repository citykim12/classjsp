
public class Ex0520_13 {

	public static void main(String[] args) {
		// 10�� �л��Է� �л������߰� �� �غ�����.
		Student[] Stu_num = new Student[10];
//		[0] = new Car("���", "�ڵ����", 4);
		
		for(int i=0; i<Stu_num.length; i++) {
			Stu_num[i] = new Student(); // ��ü����
			Stu_num[i].kor = i;
			Stu_num[i].eng = i;
			Stu_num[i].math = i;
			
		}
		
		for(int i=0; i<Stu_num.length; i++) {
		}
	}
}
