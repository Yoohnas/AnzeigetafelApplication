package main.java;

/**
 * 
 */

/**
 * @author cahenzlj
 *
 */
public class AnzeigetafelFake implements Observer{

	@Override
	public void update(int toreHeim, int toreGast, Spielzeit aktuelleSpielzeit) {
		System.out.println("AnzeigetafelFake wird geupdated");
	}

}
