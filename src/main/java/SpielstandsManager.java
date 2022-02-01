package main.java;

/**
 * 
 */

/**
 * @author cahenzlj
 *
 */
public class SpielstandsManager {
	
private int toreHeim;
private int toreGast;

public void setSpielstand(int Heim, int Gast) {
	toreHeim = Heim;
	toreGast = Gast;
}

public void resetSpielstand() {
	toreHeim = 0;
	toreGast = 0;
	
}

public void incToreHeim() {
	toreHeim++;
}

public void incToreGast() {
	toreGast++;
}

/**
 * @return the toreHeim
 */
public int getToreHeim() {
	return toreHeim;
}

/**
 * @return the toreGast
 */
public int getToreGast() {
	return toreGast;
}
}
