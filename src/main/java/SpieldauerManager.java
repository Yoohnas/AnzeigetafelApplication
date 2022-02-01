package main.java;

/**
 * 
 */

/**
 * @author cahenzlj
 *
 */
public class SpieldauerManager {

	private Spielzeit aktuelleSpielzeit;
	private int spieldauer;
	
	//Constructor with spieldauer of the game
	public SpieldauerManager(int spieldauer) {
		this.spieldauer = spieldauer;
		aktuelleSpielzeit = new Spielzeit();
	}
	
	/**
	 * @return the spieldauer
	 */
	public int getSpieldauer() {
		return spieldauer;
	}

	/**
	 * @param spieldauer the spieldauer to set
	 */
	public void setSpieldauer(int spieldauer) {
		this.spieldauer = spieldauer;
	}

	public void resetSpielzeit() {
		
	}
	
	public void stopSpielzeit() {
		
	}
	
	public void continueSpielzeit() {
		
	}	
	
	public void startSpielzeit() {
		
	}

	/**
	 * @return the aktuelleSpielzeit
	 */
	public Spielzeit getAktuelleSpielzeit() {
		return aktuelleSpielzeit;
	}
	
}
