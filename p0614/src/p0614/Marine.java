package p0614;

public class Marine extends Unit{
	
	public int hitPoint = 0; // default - ���� Ŭ����, ���� ��Ű��
	
	void move(int x, int y) {
		System.out.println("��ǥ: ["+ x + "," + y +"]���� Ȯ���ؼ� �̵�.(������ ���� �־�� �̵��� �� ����.)");
	}
	void stimPack() {
		System.out.println("������ �ֻ縦 ġ��.");
	}
	
}
