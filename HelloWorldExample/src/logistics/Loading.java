package logistics;

import java.util.ArrayList;
import java.util.List;

public class Loading {

	public static void Arrange(){
		
		double[] case1={100,234.56,349.90,630.34,56.78,123.45,459.43,240.32}; //2194.78
		double[] case2={100,234.56,349.90,630.34,56.78,123.45,459.43,240.32,300.45,640.05,156.34};
		double[] orders=case2; 
		ArrayList<Double> pallet= new ArrayList<>();
		
		double total = 0;
		int howLong = orders.length-1;
		double palletWeight=0;
		
		for(int i=howLong;i>=0;i--)
		{
			palletWeight+=orders[i];
			if(i==0 && palletWeight<650)
			{
				pallet.add(palletWeight);
				break;
			}
			
			
			if(palletWeight>650) {
				palletWeight-=orders[i];
				pallet.add(palletWeight);
				palletWeight=0;
				i++;
				continue;
			}
		
//			if(i==howLong && palletWeight+orders[i]>650) {
//				pallet.remove(orders[i]);
//				palletWeight=0;
//				continue;
//			}
			
		
		}
		
		for(int i=howLong;i>=0;i--)
		{
			total+=orders[i];
		}
		double palletTotal=0;
		for(double i :pallet)
		{
			palletTotal+=i;
		}
		System.out.println(pallet);
		
		System.out.println(total);
		
		System.out.println(palletTotal);
	}
	
	
	
}
