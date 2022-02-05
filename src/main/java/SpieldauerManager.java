package main.java;

import java.util.Timer;
import java.util.TimerTask;

import org.junit.rules.Stopwatch;

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
	private Timer timer;
	private TimerTask task;
	
	//Constructor with spieldauer of the game
	public SpieldauerManager(int spieldauer) {
		this.spieldauer = spieldauer;
		aktuelleSpielzeit = new Spielzeit();
		timer = new Timer();
		task = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("Task finish");
			}
		};
	}
	
	
	public static void main(String[] args) {
		SpieldauerManager testSpieldauerManager = new SpieldauerManager(10000);
		testSpieldauerManager.startSpielzeit();
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
		//timer.wait();
	}
	
	public void continueSpielzeit() {
		//timer.notify();
	}	
	
	public void startSpielzeit() {
		timer.schedule(task, spieldauer);
	}
		
	/**
	 * @return the aktuelleSpielzeit
	 */
	public Spielzeit getAktuelleSpielzeit() {
		return aktuelleSpielzeit;
	}
	
}
