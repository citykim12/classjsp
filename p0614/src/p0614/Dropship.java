package p0614;

public class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("��ǥ: ["+ x + "," + y +"]���� Ȯ���ؼ� �̵�.(���� ��� �̵� ����), �̵��ӵ� 80");
	}
	
	void load() {
		System.out.println("��� 8�� �Ǵ� ��ũ 2�� �¿�");
	}
	
	void unload() {
		System.out.println("�¿� ����� ��������.");
	}

}
