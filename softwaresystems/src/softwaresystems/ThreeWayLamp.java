package softwaresystems;

public class ThreeWayLamp {

	public static final int OFF = 0;
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;

	
	private int setting;
	
	public ThreeWayLamp(int setting) {
		this.setting = setting;
	}

	public int getSetting(){
		return setting;
	}
	
	public void setSetting(int newSetting) {
		this.setting = newSetting;
	}
	
	public void switchSetting(){
		this.setting = (this.setting + 1) % 4;
		
	}
	
}
