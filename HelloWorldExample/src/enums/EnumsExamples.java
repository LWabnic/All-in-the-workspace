package enums;

public enum EnumsExamples {

	MON(1),
	TUE(2),
	WED(3),
	THU(4),
	FRI(5),
	SAT(6),
	SUN(7);
	
	private final int weekDay;
	
	
	
	EnumsExamples(int weekDay){

		this.weekDay=weekDay;
	}



	public int getWeekDay() {
		return weekDay;
	}

	
	
	
}
