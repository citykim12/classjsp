
public class Ex0524_03 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("c1�� x,y��ǥ: " + c1.center.x + "," + c1.center.y);
		System.out.println("c1�� ������: " + c1.r);
		System.out.println("c1�� ����: " + (3.14*Math.pow(c1.r, 2)));
		//Math round, ceil, floor, random, pow: ���� sqrt:��Ʈ(������)
		
		// x,y ��ǥ, ������, ���̸� ���Ͻÿ�.
		Circle c2 = new Circle(new Point(150, 150),50);  
		System.out.println("c2�� x,y��ǥ: " + c2.center.x + "," + c2.center.y);
		System.out.println("c2�� ������: " + c2.r);
		System.out.println("c2�� ����: " + (3.14*Math.pow(c2.r, 2)));
		
		// �迭ũ�� 3
		Point[] p = {new Point(0, 0), new Point(100, 0), new Point(100, 100)};
		
		Triangle t1 = new Triangle(p);
		System.out.println("t1�� 1��° ��ǥ: " + t1.p[0].x + t1.p[0].y);
		System.out.println("t1�� 2��° ��ǥ: " + t1.p[1].x + t1.p[1].y);
		System.out.println("t1�� 3��° ��ǥ: " + t1.p[2].x + t1.p[2].y);
		int x_length = t1.p[1].x-t1.p[0].x;
		int y_length = t1.p[2].y-t1.p[0].y;
		System.out.println("x��ǥ�� ����: " + x_length);
		System.out.println("y��ǥ�� ����: " + y_length);
		
		//�밢�� ���� ���� = ������(x����+y����)
		System.out.println("�밢�� ����: " + Math.sqrt(Math.pow(x_length, 2)+Math.sqrt(Math.pow(y_length,2))));
		
		

	} //main

} //class
