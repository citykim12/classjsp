
public class Triangle extends Shape {
	Point[] p; // »ï°¢ÇüÀÇ 3°³ÀÇ ÁÂÇ¥ °ª
	double[] point_length = new double[3]; // »ï°¢ÇüÀÇ 3°³ÀÇ ±æÀÌ

	Triangle() {
	} // ±âº»»ý¼ºÀÚ

	Triangle(Point[] p) {
		this.p = p;
	}

	Triangle(Point p1, Point p2, Point p3) {
		p = new Point[] { p1, p2, p3 };
	}

	// »ï°¢Çü x, yÁÂÇ¥ Ãâ·Â
	void triangle_point() {
		// »ï°¢Çü ÁÂÇ¥ Ãâ·Â
		for(int i=0; i<p.length; i++) {
			System.out.printf("[ %d¹øÂ° x, yÁÂÇ¥: %d, %d ] \n", (i+1), p[i].x, p[i].y);
		}
	}
	// »ï°¢Çü ±æÀÌ Ãâ·Â
	void triangle_length() {
		// »ï°¢Çü ÁÂÇ¥ ±æÀÌ
		for(int i = 0;i<p.length;i++){
			if (i < 2) {
				point_length[i] = Math
						.sqrt(Math.pow((p[i].x - p[i + 1].x), 2) + Math.pow((p[i].y - p[i + 1].y), 2));
			} else {
				point_length[i] = Math
						.sqrt(Math.pow((p[i].x - p[i - 2].x), 2) + Math.pow((p[i].y - p[i - 2].y), 2));
			}
			System.out.printf("%d¹øÂ° ±æÀÌ: %.2f \n", (i + 1), point_length[i]);
		}
	}// triangle_length
	
	//»ï°¢Çü ³ÐÀÌ Ãâ·Â
	void triangle_area() {
		//¹ÝµÑ·¹ ±¸ÇÏ´Â °ø½Ä s = 1/2(length1 + length2 + length3)
		double s = 0.5*(point_length[0] + point_length[1] + point_length[2]);
		
		double triangle_area = Math.sqrt(s*(s-point_length[0])*(s-point_length[1])*(s-point_length[2]));
		System.out.println("»ï°¢Çü ³ÐÀÌ: " + triangle_area);
	}
}
