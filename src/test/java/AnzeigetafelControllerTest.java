package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.java.AnzeigetafelController;

class AnzeigetafelControllerTest {
	AnzeigetafelController anzeigetafelController;

	@BeforeEach
	void setUp() throws Exception {
		anzeigetafelController = new AnzeigetafelController();
	}
	
	@Test
	@DisplayName("Constructor should work")
	public void testAnzeigetafelController() {
		assertNotNull(anzeigetafelController);
		assertNotNull(anzeigetafelController.getSpieldauer());
		assertNotNull(anzeigetafelController.getSpielstand());
	}

	@Test
	void testHeimTeamErzieltTore() {
		anzeigetafelController.getSpielstand().setSpielstand(9,9);
		anzeigetafelController.getSpielstand().incToreHeim();
		int toreHeim = anzeigetafelController.getSpielstand().getToreHeim();
		assertEquals(toreHeim, 10);
	}
	
	@Test
	void testGastTeamErzieltTore() {
		anzeigetafelController.getSpielstand().setSpielstand(6,6);
		anzeigetafelController.getSpielstand().incToreGast();
		int toreGast = anzeigetafelController.getSpielstand().getToreGast();
		assertEquals(toreGast, 7);
	}

	@Test
	void testRegisterObserver() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveObserver() {
		fail("Not yet implemented");
	}

	@Test
	void testNotifyObservers() {
		fail("Not yet implemented");
	}

	@Test
	void testSomeChange() {
		fail("Not yet implemented");
	}

}
