package p0614;

abstract public class AudioPlayer extends Player {
	
	@Override
	void play(int point) {
		System.out.println("음성코덱 읽어오기 → 음성코덱 해독 → 음성파일 우퍼전달 → 오디오 좌우스피커 출력");
	}

	@Override
	void stop() {
		
	}

}
