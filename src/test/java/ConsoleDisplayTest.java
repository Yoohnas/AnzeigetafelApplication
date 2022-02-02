package test.java;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.AnzeigetafelController;
import main.java.ConsoleDisplay;

class ConsoleDisplayTest {
	ConsoleDisplay consoleDisplay;
	

	@BeforeEach
	void setUp() throws Exception {
		AnzeigetafelController testAnzeigeController = new AnzeigetafelController();
		consoleDisplay = new ConsoleDisplay(testAnzeigeController);
	}

	@Test
	void testConsoleDisplay() {
        String expectedOutput = "***ConsoleDisplay***\nHeim: 0\nGast: 0\nSpielzeit: 0 Minuten : 0 Sekunden\n";
        ByteArrayOutputStream  outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		// After this all System.out.println() statements will come to outContent stream.

		consoleDisplay.display();
		//FIXME test fails - no idea why 02.02.2022 
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testDisplay() {
		//TODO think about a good test strategy
		fail("Not yet implemented");
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

}
