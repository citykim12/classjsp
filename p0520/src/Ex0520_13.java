
public class Ex0520_13 {

	public static void main(String[] args) {
		// 10명 학생입력 학생성적추가 만 해보세요.
		Student[] Stu_num = new Student[10];
//		[0] = new Car("흰색", "자동기어", 4);
		
		for(int i=0; i<Stu_num.length; i++) {
			Stu_num[i] = new Student(); // 객체선언
			Stu_num[i].kor = i;
			Stu_num[i].eng = i;
			Stu_num[i].math = i;
			
		}
		
		for(int i=0; i<Stu_num.length; i++) {
		}
	}
}
