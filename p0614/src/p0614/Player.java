package p0614;

abstract public class Player { //�߻�Ŭ����
	
	int playPoint;
	
	//������
	Player(){
		playPoint = 0;
	}
	abstract void play(int point); //�߻�޼ҵ�
	abstract void stop();
	
//	abstract void work1();
//	abstract void work2();
	
	void play() {
		play(playPoint);
	}
}
