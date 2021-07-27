
public class Car {
	
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white", "auto", 4);
//		color = "white";
//		gearType = "auto";
//		door = 4;
	}
	
	Car(String color, String gearType, int door){
		color = color;
		gearType = gearType;
		door = door;
	}
}
