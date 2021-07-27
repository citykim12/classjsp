import java.util.Scanner;

public class Ex0524_05 {

	public static void main(String[] args) {
		// Triangle 객체 Point 3개를 입력 받아 각각의 길이를 구하시오.
		Scanner scan = new Scanner(System.in);
		Point[] in_point = new Point[3];
		
		// 3개의 좌표
		for(int i=0; i<in_point.length; i++) {
			in_point[i] = new Point();
			System.out.println("1번째 X좌표를 입력하세요.");
			// 0,0 10,0 10,10
			String input = scan.next(); // 0,0
			String[] str = input.split(",");
			in_point[i].x = Integer.parseInt(str[0]); 
			// ↑ String → int / 0+"" → int를 String으로 변경 
			// '5' - '0' → 5 / 0 + "" = "0"
			in_point[i].y = Integer.parseInt(str[1]); 
		}
		
		Point[] p = {in_point[0], in_point[1], in_point[2]};
		Triangle t1 = new Triangle(p);
		
		//좌표 출력
		t1.triangle_point();
		
		// 좌표 길이
		t1.triangle_length();
		
		// 좌표 넓이
		t1.triangle_area();

	} //main

} //class
