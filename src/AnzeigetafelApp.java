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

	static boolean running;
	private static ConsoleDisplay consoleDisplay;
	private static AnzeigetafelController anzeigetafelController;
	private static SpielstandsManager spielstandManager;
	private static SpieldauerManager spieldauerManager;
	
	public AnzeigetafelApp() {
		running = true;

	}
	
	public static void main(String[] args) {
		
		anzeigetafelController = new AnzeigetafelController();
		consoleDisplay = new ConsoleDisplay(anzeigetafelController);
		spieldauerManager = new SpieldauerManager();
		spielstandManager = new SpielstandsManager();
		
		spielstandManager.incToreGast();
		spielstandManager.incToreHeim();
		anzeigetafelController.someChange();
		
	}
}
