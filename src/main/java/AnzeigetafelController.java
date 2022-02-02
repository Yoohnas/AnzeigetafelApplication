package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author jonas cahenzli
 *
 */
public class AnzeigetafelController implements Subject{

	/**
	 * Attributes
	 */
	
	private SpielstandsManager spielstand;
	private SpieldauerManager spieldauer;
	private List<Observer> observers;
	
	//Constructor without parameters
	public AnzeigetafelController() {
		observers = new ArrayList<Observer>();
		spielstand = new SpielstandsManager();
		spieldauer = new SpieldauerManager(90); //default 90 min
	}
	
	public static void main(String[] args) {
	AnzeigetafelController testAnzeigetafelController = new AnzeigetafelController();
	ConsoleDisplay testConsoleDisplay = new ConsoleDisplay(testAnzeigetafelController);
	GUI testGUI = new GUI(testAnzeigetafelController);
	//1 - Heimteam erzielt Tor
	testAnzeigetafelController.spielstand.incToreHeim();
	testAnzeigetafelController.someChange();
	//2 - Heimteam erzielt weiteres Tor
	testAnzeigetafelController.spielstand.incToreHeim();
	testAnzeigetafelController.someChange();
	//3 - Gästeteam erzielt ein Tor
	testAnzeigetafelController.spielstand.incToreGast();
	testAnzeigetafelController.someChange();
	
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(spielstand.getToreHeim(), spielstand.getToreGast(), spieldauer.getAktuelleSpielzeit());
		}
	}
	
	public void someChange() {
		notifyObservers();
	}

	public SpielstandsManager getSpielstand() {
		return spielstand;
	}

	public void setSpielstand(SpielstandsManager spielstand) {
		this.spielstand = spielstand;
	}

	public SpieldauerManager getSpieldauer() {
		return spieldauer;
	}

	public void setSpieldauer(SpieldauerManager spieldauer) {
		this.spieldauer = spieldauer;
	}
	
}
