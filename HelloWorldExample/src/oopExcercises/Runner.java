package oopExcercises;

public class Runner {

	public static void main(String[] args) {

//		Encapsulation emp = new Encapsulation();
//		emp.setDaysInEmployment(36);
//		emp.setDaysInEmployment(12345);
//		emp.setName("Luke Wabnic");
//		emp.setHolidays(34.56f);
//		emp.setSalary(47000.00);
//		
//		System.out.println(emp.getAge()+" "+emp.getDaysInEmployment()+" "+emp.getHolidays()+" "+emp.getName()+" "+emp.getSalary());
//		
//		
//		System.out.println(emp.toString());
//		
		String someName="Pawel";
		
		Person pBank = new Banker("Dennis",1,"Pink",1);
		Person pFarmer = new Farmer("Roger",2,"Yellow",2);
		
		
		Person me = new Person("Mike", 34);
//		me.eat();
//		me.sleep();
//		me.setName(someName);
//		me.eat();
		
		Banker joe = new Banker("Joe",34,"Grey", 1000);
//		joe.eat();
//		joe.sleep();
//		joe.countingMoney();
		
		Banker def = new Banker("def", 100);
//		def.sleep();
//		def.eat();
//		def.countingMoney();
		
		
		
		Farmer donald = new Farmer("Donald",40,"Red",5);
		
//		donald.eat();
//		donald.sleep();
//		donald.countingSheep();
//		
//		System.out.println(me.toString());
//		System.out.println(joe.toString());
//		System.out.println(donald.toString());
		
		pBank.eat();
		((Banker)pBank).countingMoney();
		pFarmer.eat();

	}

}
