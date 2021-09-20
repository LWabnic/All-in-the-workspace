package co.uk.idestsoft;

public class Taxes {

	public static void method1(float salary) {
		if (salary > 14999) {
			if (salary > 19999) {

				if (salary > 29999) {
					if (salary > 44999) {
						System.out.println(25 + "%");
					} else {
						System.out.println(20 + "%");

					}

				} else {
					System.out.println(15 + "%");
				}
			} else {
				System.out.println(10 + "%");
			}
		}

		else {
			System.out.println(0 + "%");
		}
	}
	
	public static float method2(float salary) {
		if (salary > 14999) {
			if (salary > 19999) {

				if (salary > 29999) {
					if (salary > 44999) {
						return (float) (salary*0.25);
					} else {
						
						return (float) (salary*0.20);
					}

				} else {
					return (float) (salary*0.15);
				}
			} else {
				return (float) (salary*0.10);
			}
		}

		else {
			return 0;
		}
	}
}
