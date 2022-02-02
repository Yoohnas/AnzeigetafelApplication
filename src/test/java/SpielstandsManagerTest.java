/**
 * 
 */
package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.java.SpielstandsManager;

/**
 * @author jonas.cahenzli
 *
 */
class SpielstandsManagerTest {
	private SpielstandsManager spielstandsManager;


	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		spielstandsManager = new SpielstandsManager();
	}
	
	@Test
	@DisplayName("Constructor should work")
	public void testSpielzeit() {
		//SpielzeitTest mySpielzeitTest = new SpielzeitTest();
		assertNotNull(spielstandsManager);
	}

	/**
	 * Test method for {@link main.java.SpielstandsManager#setSpielstand(int, int)}.
	 */
	@Test
	void testsetSpielstand() {
		spielstandsManager.setSpielstand(3, 2);
		assertEquals(3, spielstandsManager.getToreHeim());
		assertEquals(2, spielstandsManager.getToreGast());
	}

	/**
	 * Test method for {@link main.java.SpielstandsManager#resetSpielstand()}.
	 */
	@Test
	void testResetSpielstand() {
		spielstandsManager.setSpielstand(3, 2);
		spielstandsManager.resetSpielstand();
		assertEquals(0, spielstandsManager.getToreHeim());
		assertEquals(0, spielstandsManager.getToreHeim());

	}

	/**
	 * Test method for {@link main.java.SpielstandsManager#incToreHeim()}.
	 */
	@Test
	void testIncToreHeim() {
		spielstandsManager.setSpielstand(3, 2);
		spielstandsManager.incToreHeim();
		assertEquals(4, spielstandsManager.getToreHeim());
	}

	/**
	 * Test method for {@link main.java.SpielstandsManager#incToreGast()}.
	 */
	@Test
	void testIncToreGast() {
		spielstandsManager.setSpielstand(3, 2);
		spielstandsManager.incToreGast();
		assertEquals(3, spielstandsManager.getToreGast());	}

	/**
	 * Test method for {@link main.java.SpielstandsManager#getToreHeim()}.
	 */
	@Test
	void testGetToreHeim() {
		spielstandsManager.setSpielstand(3, 2);
		assertEquals(3, spielstandsManager.getToreHeim());
	}

	/**
	 * Test method for {@link main.java.SpielstandsManager#getToreGast()}.
	 */
	@Test
	void testGetToreGast() {
		spielstandsManager.setSpielstand(3, 2);
		assertEquals(2, spielstandsManager.getToreGast());	}

}
