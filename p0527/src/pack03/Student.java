package pack03;

public class Student {
	static int count; // Ŭ���� ����: ��ü���� ���� ��� ����
	String stu_num; // �ν��Ͻ� ����: ��ü���� �� ��� ����
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

	{
		count++;
		stu_num = "S" + count; // s1, s2~
	}

	Student() {}

	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total/3.0;
		this.rank = rank;
	}
}
