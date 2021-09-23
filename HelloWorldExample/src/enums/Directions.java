package enums;

public enum Directions {

	NORTH("N","Forward"),
	EAST("E","Right"),
	SOUTH("S","Backward"),
	WEST("W","Left");

	private final String Abrev;
	private final String Motion;
	
	public String getAbrev() {
		return Abrev;
	}
	public String getMotion() {
		return Motion;
	}
	
	
	Directions(String Abrev, String Motion) {

		this.Abrev=Abrev;
		this.Motion=Motion;
	}
	public String dir() {
		return Abrev + " is the same as moving "+Motion;
	}
	
	
	
}
