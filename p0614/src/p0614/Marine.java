package p0614;

public class Marine extends Unit{
	
	public int hitPoint = 0; // default - 같은 클래스, 같은 패키지
	
	void move(int x, int y) {
		System.out.println("좌표: ["+ x + "," + y +"]길을 확인해서 이동.(마린은 길이 있어야 이동할 수 있음.)");
	}
	void stimPack() {
		System.out.println("스팀팩 주사를 치료.");
	}
	
}
