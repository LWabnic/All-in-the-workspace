package vendormachine.users.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WalletTEST {

	Wallet w;
	Wallet wa;
	Wallet wb;
	
	@BeforeEach
	public void init(){
		w=new Wallet();
		wa=new Wallet(100.00f);
		wb=new Wallet("Gucci",50.00f);
		
	}
	@Test
    public void WalletTest(){
		Wallet wc=new Wallet(3.00f);
		assertEquals(3.00f,wc.getAllCredit());
    	
    }
	@Test
    public void WalletTest1(){
		Wallet wc=new Wallet("Prada",3.00f);
		assertEquals(3.00f,wc.getAllCredit());
		assertEquals("Prada",wc.getBrand("Prada"));
    }
	@Test
    public void getAllCredit(){
		
		assertEquals(100.00f,wa.getAllCredit());
    	
    }
	@Test
	   public void getBrand(){
			
			assertEquals("Gucci",wb.getBrand("Gucci"));
	    	
	    }
	@Test
	   public void setBrand(){
			
			wb.setBrand("Louis");
			assertEquals("Louis",wb.getBrand("Louis"));
	    	
	    }
	
	@Test
    public void getAndSetCreditTestFalse(){

		w.setCredit(20.00f);
		float gotCredit=w.getCredit(20.00f);
		
		assertEquals(0,w.getCredit(20.00f));
    	
    }
	@Test
    public void addCreditTestTrue(){

	
		assertEquals(0.4f,w.getCredit(0.4f));
    	
    }
	
	@Test
    public void addCrediFalse(){

		w.addCredit(20.00f);
		//w.getCredit(20.00f);
		
		assertEquals(20.00f,w.getCredit(20.00f));
    	
    }
	
}
