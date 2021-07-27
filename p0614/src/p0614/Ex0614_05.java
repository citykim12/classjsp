package p0614;

public class Ex0614_05 {

	public static void main(String[] args) {
		// marine 8명, 탱크 7대, 수송선 5대, 생성

		Unit[] u = new Unit[20];
		for(int i=0; i<u.length; i++) {
			if(i<8) {
				u[i] = new Marine();
			}else if(i<15) {
				u[i] = new Tank();
			}else {
				u[i] = new Dropship();
			}
		}
//		Marine[] m = new Marine[8];
//		
//		for(int i=0; i<m.length; i++) {
//			m[i] = new Marine();
//		}
//		
//		Tank[] t = new Tank[7];
//		for(int i=0; i<t.length; i++) {
//			t[i] = new Tank();
//		}
//		
//		Dropship[] d = new Dropship[5];
//		for(int i=0; i<d.length; i++) {
//			d[i] = new Dropship();
//		}
		
		//이동
		// x=1000, y=2000 으로 이동
		for(int i=0; i<u.length; i++) {
			u[i].move(1000, 2000);
		}
//		for(int i=0; i<m.length; i++) {
//			m[i].move(1000, 2000);
//		}
//		for(int i=0; i<t.length; i++) {
//			t[i].move(1000, 2000);
//		}
//		for(int i=0; i<d.length; i++) {
//			d[i].move(1000, 2000);
//		}
		
//		m[0] = new Marine();
//		Marine m1 = new Marine();
//		Marine m2 = new Marine();
//		Marine m3 = new Marine();
//		Marine m4 = new Marine();
//		Marine m5 = new Marine();
//		Marine m6 = new Marine();
//		Marine m7 = new Marine();
//		Marine m8 = new Marine();
		
//		Tank t1 = new Tank();
//		Tank t2 = new Tank();
//		Tank t3 = new Tank();
//		Tank t4 = new Tank();
//		Tank t5 = new Tank();
//		Tank t6 = new Tank();
//		Tank t7 = new Tank();
		
//		Dropship d1 = new Dropship();
//		Dropship d2 = new Dropship();
//		Dropship d3 = new Dropship();
//		Dropship d4 = new Dropship();
//		Dropship d5 = new Dropship();
		
		// x=1000, y=2000 으로 이동
//		m1.move(1000, 2000);
//		m2.move(1000, 2000);
//		m3.move(1000, 2000);
//		m4.move(1000, 2000);
//		m5.move(1000, 2000);
//		m6.move(1000, 2000);
//		m7.move(1000, 2000);
//		m8.move(1000, 2000);
//		
//		t1.move(1000, 2000);
//		t2.move(1000, 2000);
//		t3.move(1000, 2000);
//		t4.move(1000, 2000);
//		t5.move(1000, 2000);
//		t6.move(1000, 2000);
//		t7.move(1000, 2000);
//		
//		d1.move(1000, 2000);
//		d2.move(1000, 2000);
//		d3.move(1000, 2000);
//		d4.move(1000, 2000);
//		d5.move(1000, 2000);
	} //main

} //class
