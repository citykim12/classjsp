package p0614_002;

public class Scv extends GroundUnit {

	Scv() {
		super(40);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		Unit u = (Unit)r;
		while(u.hitPoint != u.MAX_HP) {
			u.hitPoint++;
		}
		if(u.hitPoint == u.MAX_HP) {
			System.out.println(u.hitPoint + "ü������ ������ �Ϸ�Ǿ����ϴ�!");
		}
	}
	
//	void repair(Tank a) {
//		while(t.hitPoint != t.MAX_HP) {
//			t.hitPoint++;
//		}
//		if(t.hitPoint == t.MAX_HP) {
//			System.out.println(t.hitPoint + "ü������ ������ �Ϸ�Ǿ����ϴ�!");
//		}
//	}
	
//	void repair(Vulture a) {
//	while(v.hitPoint != v.MAX_HP) {
//		v.hitPoint++;
//	}
//	if(v.hitPoint == v.MAX_HP) {
//		System.out.println(v.hitPoint + "ü������ ������ �Ϸ�Ǿ����ϴ�!");
//	}
//}

}
