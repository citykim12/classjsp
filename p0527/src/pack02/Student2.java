package pack02;

public class Student2 {
	static int count; // Ŭ���� ����: ��ü���� ���� ��� ����
	String stu_number; // �ν��Ͻ� ����: ��ü���� �� ��� ����
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

	{
		count++;
		stu_number = "S" + count; // s1, s2~
	}

	Student2() {}

	Student2(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total/3.0;
		this.rank = rank;
	}
}
