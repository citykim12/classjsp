package p0615;

public class Scv extends GroundUnit {

	Scv() {
		super(60);
	}
	
	//hitPoint 현재 체력을 최대체력까지 증가시키는 작업
	void repair(Repairable r) {	//Unit, Repairable
		//MAX_HP까지 증가시켜줌.	Tank,DropShip
		Unit u = (Unit) r;
		while(u.MAX_HP != u.hitPoint) {
			u.hitPoint++;
		}
	}

//	void repair(DropShip u) {	//
//		//MAX_HP까지 증가시켜줌.
//		while(u.MAX_HP != u.hitPoint) {
//			u.hitPoint++;
//		}
//	}
//	
//	void repair(Vulture u) {
//		//MAX_HP까지 증가시켜줌.
//		while(u.MAX_HP != u.hitPoint) {
//			u.hitPoint++;
//		}
//	}
	
}
