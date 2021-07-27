package p0614;

abstract public class Player { //추상클래스
	
	int playPoint;
	
	//생성자
	Player(){
		playPoint = 0;
	}
	abstract void play(int point); //추상메소드
	abstract void stop();
	
//	abstract void work1();
//	abstract void work2();
	
	void play() {
		play(playPoint);
	}
}
