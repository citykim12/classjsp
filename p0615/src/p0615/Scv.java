package p0615;

public class Scv extends GroundUnit {

	Scv() {
		super(60);
	}
	
	//hitPoint ���� ü���� �ִ�ü�±��� ������Ű�� �۾�
	void repair(Repairable r) {	//Unit, Repairable
		//MAX_HP���� ����������.	Tank,DropShip
		Unit u = (Unit) r;
		while(u.MAX_HP != u.hitPoint) {
			u.hitPoint++;
		}
	}

//	void repair(DropShip u) {	//
//		//MAX_HP���� ����������.
//		while(u.MAX_HP != u.hitPoint) {
//			u.hitPoint++;
//		}
//	}
//	
//	void repair(Vulture u) {
//		//MAX_HP���� ����������.
//		while(u.MAX_HP != u.hitPoint) {
//			u.hitPoint++;
//		}
//	}
	
}
