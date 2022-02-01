/**
 * 
 */
package test.java;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.java.Spielzeit;

/**
 * @author cahenzlj
 *
 */
class SpielzeitTest {
	
	private Spielzeit spielzeit;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() {
		System.out.println("BeforeEach");
		spielzeit = new Spielzeit();
	}

	/**
	 * Test method for {@link main.java.Spielzeit#Spielzeit()}.
	 */
	@Test
	@DisplayName("Constructor should work")
	public void testSpielzeit() {
		//SpielzeitTest mySpielzeitTest = new SpielzeitTest();
		assertNotNull(spielzeit);
	}

	/**
	 * Test method for {@link main.java.Spielzeit#getSpielzeit()}.
	 */
	@Test
	@DisplayName("GetSpielzeit should work")
	void testGetSpielzeit() {
		assertEquals(0, spielzeit.getSpielzeit().get("Minuten"));
		assertEquals(0, spielzeit.getSpielzeit().get("Sekunden"));
	}

	/**
	 * Test method for {@link main.java.Spielzeit#setSpielzeit(int, int)}.
	 */
	@Test
	@DisplayName("SetSpielzeit for Minuten should work")
	void testSetSpielzeitMinuten() {
		spielzeit.setSpielzeit(90, 0);
		assertEquals(90, spielzeit.getSpielzeit().get("Minuten"));
	}
	
	/**
	 * Test method for {@link main.java.Spielzeit#setSpielzeit(int, int)}.
	 */
	@Test
	@DisplayName("SetSpielzeit for Sekunden should work")
	void testSetSpielzeitSekunden() {
		spielzeit.setSpielzeit(0, 45);
		assertEquals(45, spielzeit.getSpielzeit().get("Sekunden"));
	}

	/**
	 * Test method for {@link main.java.Spielzeit#printSpielzeit()}.
	 */
	@Test
	void testPrintSpielzeit() throws Exception {
		ByteArrayOutputStream  outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		// After this all System.out.println() statements will come to outContent stream.
		
		spielzeit.setSpielzeit(89, 59);
		spielzeit.printSpielzeit();
		String expectedOuput = "Spielzeit: 89 Minuten : 59 Sekunden"; 
	
		// Actual assertion.
	
		assertEquals(expectedOuput, outContent.toString());
	}

}
