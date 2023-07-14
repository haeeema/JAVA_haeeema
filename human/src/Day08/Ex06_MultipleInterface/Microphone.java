package Day08.Ex06_MultipleInterface;

public interface Microphone {
	int inputVolumeMax = 50;
	int inputVolumeMin = 5;
	
	// 음성인식
	String receiveVoice(String voice);
}
