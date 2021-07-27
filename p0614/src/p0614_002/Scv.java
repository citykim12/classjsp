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
			System.out.println(u.hitPoint + "체력으로 수리가 완료되었습니다!");
		}
	}
	
//	void repair(Tank a) {
//		while(t.hitPoint != t.MAX_HP) {
//			t.hitPoint++;
//		}
//		if(t.hitPoint == t.MAX_HP) {
//			System.out.println(t.hitPoint + "체력으로 수리가 완료되었습니다!");
//		}
//	}
	
//	void repair(Vulture a) {
//	while(v.hitPoint != v.MAX_HP) {
//		v.hitPoint++;
//	}
//	if(v.hitPoint == v.MAX_HP) {
//		System.out.println(v.hitPoint + "체력으로 수리가 완료되었습니다!");
//	}
//}

}
