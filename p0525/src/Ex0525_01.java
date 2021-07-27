import java.util.Scanner;

public class Ex0525_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck(); //52장 카드생성 후 kind, number 입력 완료
		
		// 무한 반복
		loop1: while(true) {
			d.menu_print(); // 메뉴 출력
			int choice = scan.nextInt(); // 번호 선택
			
			// 0인지 확인 후 프로그램 종료
			if(choice == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			switch (choice) {
			case 1: //카드 1장 출력
				System.out.println("카드 번호를 입력하세요!(0~52) → ");
				int num = scan.nextInt();
				d.print_1card(num);//번호를 하나 받아야 함
				break;
			case 2: 
				d.print_5card();
				break;
			case 3: 
				d.print_52card();
				break;
			case 4: 
				d.shuffle();
				break;
			case 5:
//				//카드 7장을 내것과 컴퓨터 것을 출력시키는 메소드를 작성해보시오
//				// MYCARD: SPADE,1 HEART,9 ~~
//				// ComputerCARD: SPADE,J DIAMOND,K ~~
//				d.print_7card();
//				d.print_7Ccard();
				d.handOut7card();
				break;
			case 0: 
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}//main

}//class
