
public class Deck {
	// 52���� ī�����
	// 52���� ī�忡 kind, number
	// 52���� ���� �޼ҵ�
	// 52���� ī�带 ������ �޼ҵ�
	
	String[] kinds = {"SPADE", "DIAMOND", "HEART", "CLOVER"};
	String[] numbers = {"0","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	Card[] c = new Card[52]; //52���� ī�����
	Card[] myCard = new Card[7];
	Card[] comCard = new Card[7];
			
	Deck() { //�⺻������ 13*i+j - ���, ���� �ֱ�
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				c[13*i+j] = new Card(kinds[i], numbers[j]);
				//c[0] SPADE, 1 SPADE,2 SPADE,3 ~
			}
		}
	}//Deck
	
	// ���� �޼ҵ�
	void shuffle() {
		for(int i=0; i<1000; i++) {
			int random_no = (int)(Math.random()*52); //0-51
			Card temp = c[0];
			c[0] = c[random_no];
			c[random_no] = temp;
		}
	}
	void print_1card(int index) {
		System.out.printf("ī��: %s, %s \n", c[index].kind, c[index].number);
	}
	
	//5���� ī�� ���
	void print_5card() {
		System.out.println("[ 5�� ��� ]");
		for(int j=0;j<5;j++) {
			System.out.printf("ī��: %s, %s \n", c[j].kind, c[j].number);
		}
	}
	// 52���� ī�� ���
	void print_52card() {
		System.out.println("[ 52�� ��� ]");
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				System.out.printf("ī��: %s, %s \n", c[13*i+j].kind, c[13*i+j].number);
			}
		}
	}
	// 7�� ��� �޼ҵ�
	void handOut7card() {
		System.out.println("[ 7�徿 ī�� ��� ]");
			for(int j=0; j<14; j++) {
				if(j<=6) {
					myCard[j] = new Card(c[j].kind, c[j].number);
					System.out.printf("MYī��: %s, %s \n", myCard[j].kind, myCard[j].number);
				}else {
					comCard[j-7] = new Card(c[j].kind, c[j].number);
					System.out.printf("COMī��: %s, %s \n", comCard[j-7].kind, comCard[j-7].number);
				}
		}
	}
	
	//me answer
//	void print_7card() {
//		System.out.println("[ 7�� MYCARD ��� ]");
//		for(int i=0;i<7;i++) {
//			System.out.printf("ī��: %s, %s \n", c[i].kind, c[i].number);
//			}
//	}
//	void print_7Ccard() {
//		System.out.println("[ 7�� ComputerCARD ��� ]");
//		for(int j=0;j<(3+4);j++) {
//			System.out.printf("ī��: %s, %s \n", c[j].kind, c[j].number);
//			}
//	}
	
	//�޴� ���
	void menu_print() {
		System.out.println("[ ī�� ���α׷� ]");
		System.out.println("1. ī�� 1�� ���");
		System.out.println("2. ī�� 5�� ���");
		System.out.println("3. ī�� 52�� ���");
		System.out.println("4. ī�� ����");
		System.out.println("5. 7�� ���");
		System.out.println("0. ����");
		System.out.println("-------------------------------");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ��� �� ");
	}
}
