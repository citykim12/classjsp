
public class Point extends Object {
	int x;
	int y;
	
	//�⺻������ �ڵ����� �ȵ�
	Point(){}
	
	Point(int x, int y){	//�Ű������� �ִ� ������
		super();	//�ڵ����� ����
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "X: " + x + "," + "Y: " + y;
	}
}
