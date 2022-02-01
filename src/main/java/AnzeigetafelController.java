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
	 * 
	 */
	
	private SpielstandsManager spielstand;
	private SpieldauerManager spieldauer;
	private List<Observer> observers;
	
	public AnzeigetafelController() {
		observers = new ArrayList<Observer>();
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
	
}
