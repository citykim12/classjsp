package pack01;

public class Lotto_process {
	
	//�ζ� ��ȣ ���� �޼ҵ�
	void lotto_insert(int[] ball) { //�ν��Ͻ� �޼ҵ�

		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1; 	//1 ~~~~ 45
		}
		System.out.println("45�� ��ȣ�� �����Ǿ����ϴ�.");
	}
	
	void lotto_random(int[] ball) {
		int temp = 0;
		for(int i=0; i<500; i++) {
			int random = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[random];
			ball[random] = temp;
		}
		System.out.println("�ζ� ��ȣ ���Ⱑ �Ϸ�Ǿ����ϴ�.");
	}

}
