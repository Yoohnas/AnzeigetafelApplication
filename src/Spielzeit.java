/**
 * 
 */

/**
 * @author cahenzlj
 *
 */
public class Spielzeit {

	/**
	 * 
	 */
	
	int spielzeitMinuten;
	int spielzeitSekunden;
	
	public Spielzeit() {
		this.spielzeitMinuten = 0;
		this.spielzeitSekunden = 0;
	}

	
	public Spielzeit getSpielzeit() {
		return this;
	}
	
	public void setSpielzeit(int Minuten, int Sekunden) {
		this.spielzeitMinuten = Minuten;
		this.spielzeitSekunden = Sekunden;
	}
	
	public void printSpielzeit() {
		System.out.println("Spielzeit: "+spielzeitMinuten+":"+spielzeitSekunden);
	}
	}
