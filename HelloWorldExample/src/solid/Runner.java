package solid;

public class Runner {

	public static void main(String[] args) {
//		FormalGreeting fg = new FormalGreeting();
//		CasualGreeting cg = new CasualGreeting();
//		
//		Greeter gr = new Greeter(cg);
//		
//		System.out.println(gr.greet());
//		Studio s = new Studio();
//		Penthouse p =new Penthouse();
//		BedroomAdder ba =new BedroomAdder();
//		
//		//ba.addBedroom(p);
//		ba.addBedroom(p);
		
		Project p =new Project();
		
		BackendDeveloper be =new BackendDeveloper();
		FrontEndDeveloper fe =new FrontEndDeveloper();
		
		p.implement(be);
		p.implement(fe);
		
		
	}

	
}
