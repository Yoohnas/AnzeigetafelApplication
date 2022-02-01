package main.java;

/**
 * 
 */

/**
 * @author cahenzlj
 *
 */
public class Anzeigetafel implements Observer{

	@Override
	public void update(int toreHeim, int toreGast, Spielzeit aktuelleSpielzeit) {
		System.out.println("Anteigetafel wird geupdated - C++ Lib");
		
	}

}
