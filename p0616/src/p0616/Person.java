package p0616;

public class Person {
	long id; 
	
	@Override
	public boolean equals(Object obj) {	//(Object obj) → Object obj = new Person() 이것과 같다
		if(obj != null && obj instanceof Person) {
			Person p2 = (Person)obj;
			if(id == p2.id) return true;
		else return false;
		}else {
			return false;
		}
	}
		
}
