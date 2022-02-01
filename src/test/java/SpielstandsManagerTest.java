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

	@Test
	void testsetSpielstand() {
		spielstandsManager.setSpielstand(3, 2);
		assertEquals(3, spielstandsManager.getToreHeim());
		assertEquals(2, spielstandsManager.getToreGast());
	}

}
