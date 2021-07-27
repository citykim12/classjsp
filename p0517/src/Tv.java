
public class Tv {

	// 변수
	String color;
	boolean power; //on OR off → 0 OR 1
	int channel; //3-tvn 5-sbs 7-kbs 9-kbs1 11-mbc
	
	//메소드
	void power() {power = !power;} //true and false
	void channelUp(){channel++;}
	void channelDown() {
		channel--;
	}
	
	
	
}
