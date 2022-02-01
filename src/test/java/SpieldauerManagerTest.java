/**
 * 
 */
package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.java.SpieldauerManager;
import main.java.Spielzeit;

/**
 * @author jonas.cahenzli
 *
 */
class SpieldauerManagerTest {
	private SpieldauerManager spieldauerManager;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		spieldauerManager = new SpieldauerManager(90);
	}
	
	@Test
	@DisplayName("Constructor should work")
	public void testSpieldauerManager() {
		//SpielzeitTest mySpielzeitTest = new SpielzeitTest();
		assertNotNull(spieldauerManager);
		assertEquals(90, spieldauerManager.getSpieldauer());
		assertNotNull(spieldauerManager.getAktuelleSpielzeit());
	}

	/**
	 * Test method for {@link main.java.SpieldauerManager#getSpieldauer()}.
	 */
	@Test
	void testGetSpieldauer() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link main.java.SpieldauerManager#setSpieldauer(int)}.
	 */
	@Test
	void testSetSpieldauer() {
		spieldauerManager.setSpieldauer(90);
		assertEquals(90, spieldauerManager.getSpieldauer());
	}

	/**
	 * Test method for {@link main.java.SpieldauerManager#resetSpielzeit()}.
	 */
	@Test
	void testResetSpielzeit() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link main.java.SpieldauerManager#stopSpielzeit()}.
	 */
	@Test
	void testStopSpielzeit() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link main.java.SpieldauerManager#continueSpielzeit()}.
	 */
	@Test
	void testContinueSpielzeit() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link main.java.SpieldauerManager#startSpielzeit()}.
	 */
	@Test
	void testStartSpielzeit() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link main.java.SpieldauerManager#getAktuelleSpielzeit()}.
	 */
	@Test
	void testGetAktuelleSpielzeit() {
		Spielzeit tempSpielzeit = spieldauerManager.getAktuelleSpielzeit();
		assertEquals((tempSpielzeit.getSpielzeit()).get("Minuten"), 0);
		assertEquals((tempSpielzeit.getSpielzeit()).get("Minuten"), 0);
	}

}
