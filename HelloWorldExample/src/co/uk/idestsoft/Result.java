package co.uk.idestsoft;

public class Result {

	public static void method1(int physics, int chemistry, int biology, int totalMark) {
		System.out.println("Physics result: " + physics + "\n" + "Chemistry result: " + chemistry + "\n"
				+ "Biology result: " + biology + "\n" + "Total mark: " + totalMark);
	}

	public static void method2(int phy, int chem, int bio) {
		double phyPer = ((phy) * 100) / 150;
		double chemPer = ((chem) * 100) / 150;
		double bioPer = ((bio) * 100) / 150;

		double percentage = ((phy + chem + bio) * 100) / 450;
		System.out.println(percentage + "%");

		if (phyPer < 60 || chemPer < 60 || bioPer < 60) {
			System.out.println("You failed the exam because of: ");
			if (phyPer < 60) {
				System.out.println("Physics");
			}
			if (chemPer < 60) {
				System.out.println("Chemistry");
			}
			if (bioPer < 60) {
				System.out.println("Biology");
			}

		}

		else {
			System.out.println("You passed");
		}
	}
}
