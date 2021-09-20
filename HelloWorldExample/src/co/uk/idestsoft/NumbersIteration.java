package co.uk.idestsoft;

public class NumbersIteration {
	public static final String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };

			 public static final String[] tens = { "", // 0
			"", // 1
			"twenty", // 2
			"thirty", // 3
			"forty", // 4
			"fifty", // 5
			"sixty", // 6
			"seventy", // 7
			"eighty", // 8
			"ninety" // 9
			};

			 public static String numberToWord(final int n) {
			if (n < 0) {
			return "minus " + numberToWord(-n);
			}

			 if (n < 20) {
			return units[n];
			}

			 if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
			}

			 if (n < 1000) {
			return units[n / 100] + " hundred" + ((n % 100 != 0) ? " " : "") + numberToWord(n % 100);
			}

			 return numberToWord(n / 1000) + " thousand" + ((n % 1000 != 0) ? " " : "") + numberToWord(n % 1000);

			 }
}
