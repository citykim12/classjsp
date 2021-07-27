
public class Point3D extends Point {

	int z;
	
	//기본 생성자 생성되지 않음
	Point3D(int x, int y, int z) { //매개변수가 있는 생성자
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
