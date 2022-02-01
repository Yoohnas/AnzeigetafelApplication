/**
 * 
 */
package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.java.Anzeigetafel;

/**
 * @author cahenzlj
 *
 */
class AnzeigetafelTest {

	private Anzeigetafel anzeigetafel;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		anzeigetafel = new Anzeigetafel();
	}

	/**
	 * Test method for {@link main.java.Spielzeit#Spielzeit()}.
	 */
	@Test
	@DisplayName("Constructor should work")
	public void testAnzeigetafel() {
		assertNotNull(anzeigetafel);
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
