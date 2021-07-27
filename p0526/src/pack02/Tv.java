package pack02;

public class Tv extends Product {
	Tv(){
		super("OLEDTV", 100, 100/10);
		// 아래처럼 두줄로 작성해도 되고 super의 지시어를 사용하여 한줄로 작성해도 된다
//		price = 100;
//		bonusPoint = price/0.1;
	}
}
