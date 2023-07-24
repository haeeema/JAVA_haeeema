package Day14.Ex01_Inheritance;

public class CellMain {
	public static void main(String[] args) {
		
		DMBCellPhone dmb = new DMBCellPhone();
		
		int channel = 100;
		
		dmb.powerOn();
		dmb.turnOnDmb();
		dmb.turnOffDmb();
		dmb.changeChannelDmb(channel);
		dmb.turnOnDmb();
	}
}
