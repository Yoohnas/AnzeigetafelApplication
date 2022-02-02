package main.java;

/**
 * 
 */

/**
 * @author cahenzlj
 *
 */
public class GUI implements UI, Observer{
	private AnzeigetafelController anzeigetafelController;

	public GUI(AnzeigetafelController anzeigetafelController) {
		this.anzeigetafelController = anzeigetafelController;
		anzeigetafelController.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("GUI not implemented");
		
	}

	@Override
	public void update(int toreHeim, int toreGast, Spielzeit aktuelleSpielzeit) {
		// TODO Auto-generated method stub
		display();
		
	}

}
