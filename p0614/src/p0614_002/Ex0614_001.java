package p0614_002;

//import p0614.Dropship;
//import p0614.*; // 같은 패키지 사용, 만약 다른 패키지 사용 원하면 앞에 예 → p0614.Marine

public class Ex0614_001 {

	public static void main(String[] args) {
		Tank t1 = new Tank();
		Marine m1 = new Marine();
		Medic me1 = new Medic();
		Firebat f1 = new Firebat();
		DropShip d1 = new DropShip();
		Wraith w1 = new Wraith();
		Scv s1 = new Scv();
		Vulture v1 = new Vulture();

		//[데미지]
		t1.hitPoint = t1.hitPoint-10;
		f1.hitPoint = f1.hitPoint-30;
		m1.hitPoint -= 20;
		d1.hitPoint -= 15;
		
		//[힐링]
		s1.repair(t1);
		s1.repair(d1);
		me1.healing(f1);
		me1.healing(m1);

	}

}
