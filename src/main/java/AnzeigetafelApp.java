package main.java;

/**
 * 
 */

/**
 * @author cahenzlj
 * 
 * Test class
 *
 */
public class AnzeigetafelApp {
	
	private Spielzeit spielzeit;

//	static boolean running;
//	private static ConsoleDisplay consoleDisplay;
//	private static AnzeigetafelController anzeigetafelController;
//	private static SpielstandsManager spielstandManager;
//	private static SpieldauerManager spieldauerManager;
	
	public AnzeigetafelApp() {
//		running = true;
		spielzeit = new Spielzeit();

	}
	
	public static void main(String[] args) {
		
		AnzeigetafelApp testAnzeigetafelApp = new AnzeigetafelApp();
		testAnzeigetafelApp.spielzeit.printSpielzeit();
//		anzeigetafelController = new AnzeigetafelController();
//		consoleDisplay = new ConsoleDisplay(anzeigetafelController);
//		spieldauerManager = new SpieldauerManager();
//		spielstandManager = new SpielstandsManager();
//		
//		spielstandManager.incToreGast();
//		spielstandManager.incToreHeim();
//		anzeigetafelController.someChange();
		
	}
}
