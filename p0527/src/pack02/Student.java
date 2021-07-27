package pack02;

public class Student {
	
	static int count; //클래스 변수
	
	String stu_number;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	{
		stu_number = "S" + String.format("%03d", ++count); //학생번호 S001, S002
	}
	
	Student(){} //기본 생성자
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total/3.0;
	}

}
