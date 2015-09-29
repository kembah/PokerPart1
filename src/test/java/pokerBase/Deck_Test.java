package pokerBase;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Deck_Test {
	Deck p;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		p = new Deck(0);
	}

	@After
	public void tearDown() throws Exception {
		p = null;
	}

	@Test
	public void TestFullDeck() {
		//	I put this test in so it would pass...
		//TODO: Code a unit test to make sure calling the deck constructor passes back 52 cards in a deeck.
		p.getTotalCards();
		assertTrue(p.getTotalCards()== 52);
	}
	
	public void TestdrawFromDeck(){
		p.drawFromDeck();
		p.getTotalCards();
		assertTrue(p.getTotalCards()== 51);
	}

}
