package pack02;

public class Student {
	
	static int count; //Ŭ���� ����
	
	String stu_number;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	{
		stu_number = "S" + String.format("%03d", ++count); //�л���ȣ S001, S002
	}
	
	Student(){} //�⺻ ������
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total/3.0;
	}

}
