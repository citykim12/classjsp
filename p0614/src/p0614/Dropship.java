package p0614;

public class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("좌표: ["+ x + "," + y +"]길을 확인해서 이동.(길이 없어도 이동 가능), 이동속도 80");
	}
	
	void load() {
		System.out.println("사람 8명 또는 탱크 2대 태움");
	}
	
	void unload() {
		System.out.println("태운 대상을 내려놓음.");
	}

}
