
public class Point3D extends Point {

	int z;
	
	//�⺻ ������ �������� ����
	Point3D(int x, int y, int z) { //�Ű������� �ִ� ������
		super();
//		super(x, y);
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "X: " + x + "," + "Y: " + y;
	}
}
