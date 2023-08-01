package Day18.Ex01_Interface;

public class RemoteControlTest extends Television {
	public static void main(String[] args) {
		/**
		RemoteControl rc = new Television();
		System.out.println(rc);
		
		// Downcasting
		Television tv = (Television) rc;
		tv.print();
		
//		Television tv2 = new Television();
		
		rc = new Audio();
		System.out.println(rc);
		
		// Downcating
		Audio au = (Audio) rc;
		au.amp();
		
		rc = new SmartTelevision();
		rc.setVolume(7);
		
		ISearchable search = new SmartTelevision();
		search.search("www.korea.co.kr");
		**/
		
		RemoteControl rc = null;
		rc = new Television();
		rc.setMute(true);
		
		// Overriding
		rc = new Audio();
		rc.setMute(true);
	}
}
