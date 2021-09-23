package enums;

public class Runner {

public static void main(String[] args) {
//System.out.println(EnumsExamples.MON.getWeekDay());
	
	Directions[] values=Directions.values();
	
	for(int i=0;i<values.length;i++)
	{
		System.out.println(values[i].getMotion());
	}
	
	 for(Directions d : Directions.values()) {
        System.out.println(d.dir());
     }
	
}
}
