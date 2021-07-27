package pack01;

import java.util.Scanner;

public class Ex0527_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Buyer b1 = new Buyer(); 
		
		while(true) {
			System.out.println("[ 쇼핑몰 프로그램 ]");
			System.out.println("1. 맥북노트북 구매");
			System.out.println("2. 아이폰 구매");
			System.out.println("3. OLEDTV 구매");
			System.out.println("4. 구매목록 보기");
			System.out.println("5. 현금 충전");
			System.out.println("--------------------------------------");
			System.out.println("원하는 번호를 입력하세요 → ");
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1:	//맥북노트북 구매
				b1.buy(new Computer());
				b1.myInfo();
				break;
			case 2: // 아이폰 구매
				b1.buy(new SmartPhone());
				b1.myInfo();
				break;
			case 3: //OLEDTV 구매
				b1.buy(new Tv());
				b1.myInfo();
				break;
			case 4: //구매목록 보기
				String product_list = "";
				if(b1.list.isEmpty()) {
					System.out.println("구매한 물품이 없습니다.");
					break;
				}
				int sum = 0;
				for(int i=0; i<b1.list.size(); i++) { //크기
					Product p = (Product) b1.list.get(i); //Object
					product_list = product_list + p.getPro_name() + " ";
					// 상품이름 pro_name
//					product_list = product_list + b1.cart[i].getPro_name() + " ";
				}
				System.out.println("총 구매 목록 갯수: " + b1.list.size());
				System.out.println("총 구매 금액: " + sum);
				System.out.println("구매 목록: " + product_list);
				
				
//				for(int i=0; i<b1.getCount(); i++) {
//					product_list = product_list + b1.cart[i].getPro_name() + " ";
//				}
//				System.out.println("총 구매 목록 갯수: " + b1.getCount());
//				System.out.println("구매 목록: " + product_list);
				b1.myInfo();
				break;
			case 5: //현금충전
				//얼마 충전할꺼야? 결제는 카드로? 현금으로?
				System.out.println("얼마를 충전하시겠습니까?(0. 상위메뉴로이동)");
				int cash = scan.nextInt();
				if(cash == 0 ) {
					System.out.println("상위 메뉴로 이동합니다.");
					break;
				}
				cash = cash + b1.getMoney();
				b1.setMoney(cash);
				System.out.println(cash + "(만원)이 충전되었습니다.");
				b1.myInfo();
				break;
			}
			
		}
		
		
//		System.out.println("제품 이름을 입력하세요 → ");
//		String name = scan.next();
//		Product p = new Product(); 
//		p.setPro_name(name);
//		System.out.println(p.getPro_name());
//		p.setPrice(100);
//		System.out.println(p.getPrice());
//		p.setBonusPoint(50);
//		System.out.println(p.getBonusPoint());
		
	}//main

	private static int setMoney() {
		// TODO Auto-generated method stub
		return 0;
	}

}//class
