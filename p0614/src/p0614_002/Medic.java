package p0614_002;

public class Medic extends GroundUnit implements Healable {

	Medic() {
		super(30); //ü��: 30
		hitPoint = MAX_HP;
	}
	
	void healing(Healable h) {
		Unit u = (Unit)h;
		while(u.hitPoint != u.MAX_HP) {
			u.hitPoint++;
		}
		if(u.hitPoint == u.MAX_HP) {
			System.out.println(u.hitPoint + "ü������ ġ�ᰡ �Ϸ�Ǿ����ϴ�!");
		}
	}

}