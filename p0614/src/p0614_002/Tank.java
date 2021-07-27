package p0614_002;

public class Tank extends GroundUnit implements Repairable{

	Tank() { //기본생성자
		super(150); //탱크 체력: 150
		hitPoint = MAX_HP; //Tank 생성시 현재체력: 150
	}
	
}
