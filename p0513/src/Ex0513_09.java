import java.util.Scanner;

public class Ex0513_09 {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학 → 이름, 국어, 영어, 수학, 합계, 평균을 출력
		// 학생 5명, 국어, 영어, 수학, 합계 → 2차원 배열
		// 평균은 소숫점 2째 자리까지
		
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		
		
		for(int i=0; i<name.length; i++) {
			System.out.println("이름을 입력하세요.>>");
			name[i] = scan.next();
			System.out.println("국어 점수를 입력하세요.>>");
			kor[i] = scan.nextInt();
			System.out.println("영어 점수를 입력하세요.>>");
			eng[i] = scan.nextInt();
			System.out.println("수학 점수를 입력하세요.>>");
			math[i] = scan.nextInt();
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i]/3.0;
		}
		
		System.out.print("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("-------------------------------------------------");
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+ "\t");
			System.out.print(kor[i]+ "\t");
			System.out.print(eng[i]+ "\t");
			System.out.print(math[i]+ "\t");
			System.out.print(total[i]+ "\t");
			System.out.printf("%.2f \n", avg[i]);
		}

	} //main

} //class
