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
	private AnzeigetafelController anzeigetafelController;

//	static boolean running;
//	private static ConsoleDisplay consoleDisplay;
//	private static AnzeigetafelController anzeigetafelController;
//	private static SpielstandsManager spielstandManager;
//	private static SpieldauerManager spieldauerManager;
	
	public AnzeigetafelApp() {
//		running = true;
		anzeigetafelController = new AnzeigetafelController(); 
		spielzeit = new Spielzeit();

	}
	
	public static void main(String[] args) {
		//gibt es hier deinen einen while(running) Loop?
		Stopwatch testStopwatch = new Stopwatch();
	}
}
