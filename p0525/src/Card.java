
public class Card {
	
	String kind; //spade, diamond, heart, clover 4��
	String number; // 1,2,3,4,5,6~J,Q,K
	
	Card(){	//�⺻������
		this("SPADE", "1"); //�ٸ� ������ ȣ��
	}
	
	Card(String kind, String number){
		this.kind = kind;
		this.number = number;
	}
//	public String toString() {
//		return "ī��: " + kind + "," + number;
//	}

}
