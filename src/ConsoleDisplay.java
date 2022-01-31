/**
 * 
 */

/**
 * @author cahenzlj
 *
 */
public class ConsoleDisplay implements UI, Observer {
	private int toreHeim;
	private int toreGast;
	private Spielzeit aktuelleSpielzeit;
	private AnzeigetafelController anzeigetafelController;
	
	/**
	 * 
	 */
	public ConsoleDisplay(AnzeigetafelController anzeigetafelController) {
		this.anzeigetafelController = anzeigetafelController;
		anzeigetafelController.registerObserver(this);
		toreHeim = 0;
		toreGast = 0;
		aktuelleSpielzeit = new Spielzeit();
		aktuelleSpielzeit.setSpielzeit(0, 0);
	}

	@Override
	public void display() {
		System.out.println("Heim: "+toreHeim);
		System.out.println("Gast: "+toreGast);
		aktuelleSpielzeit.printSpielzeit();
}

	@Override
	public void update(int toreHeim, int toreGast, Spielzeit aktuelleSpielzeit) {
		this.toreHeim = toreHeim;
		this.toreGast = toreGast;
		this.aktuelleSpielzeit = aktuelleSpielzeit;
		display();
		
	}



}
