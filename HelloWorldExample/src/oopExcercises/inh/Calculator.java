package interfaces;

public class Calculator implements MathsChallenge{

	@Override
	public int sumOfDivisors(int input) {
		
		int sum=0;
		for(int i=1;i<11;i++)
		{
			if(input%i==0) {
				sum+=i;
			}
		}

		return sum;
	}

}
