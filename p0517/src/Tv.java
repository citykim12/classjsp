
public class Tv {

	// ����
	String color;
	boolean power; //on OR off �� 0 OR 1
	int channel; //3-tvn 5-sbs 7-kbs 9-kbs1 11-mbc
	
	//�޼ҵ�
	void power() {power = !power;} //true and false
	void channelUp(){channel++;}
	void channelDown() {
		channel--;
	}
	
	
	
}
