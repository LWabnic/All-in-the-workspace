package designPatterns;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton single=Singleton.getInstance();
		
		System.out.println(single.getInfo());
		
		single.setInfo("New info");
		
		System.out.println(single.getInfo());
	}

}
