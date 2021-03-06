package junitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BlackJackTest {


//	BlackJack c;
//	
//	@Before
//	public void init() {
//		c=new BlackJack();
//	}
	
//	public static int play(int dealer, int player) {
//        if (dealer > 21 && player > 21) {
//            return 0;
//        } else if (dealer > 21) {
//            return player;
//        } else if (player > 21) {
//            return dealer;
//        }
//        return Math.max(dealer, player);
//    }
	
	@Test
	public void dealerAndPlayerLoseTest() {

		assertEquals(0,BlackJack.play(22, 22));
	}
	@Test
	public void playerWinsTest() {

		assertEquals(18,BlackJack.play(18, 22));
	}
	@Test
	public void DealerWinsTest() {
		assertEquals(18,BlackJack.play(22, 18));
	}
	@Test
	public void DrawTest() {
		assertEquals(18,BlackJack.play(18, 18));
	}
	@Test
	public void ZeroTest() {
		assertEquals(0,BlackJack.play(0, 0));
	}

}
