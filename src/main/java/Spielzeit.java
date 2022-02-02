package main.java;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

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
	
	private Map<String, Integer> spielzeit;

	
	public Spielzeit() {
		spielzeit = new HashMap<>();
		spielzeit.put("Minuten", 0);
		spielzeit.put("Sekunden", 0);
	}

	
	public Map<String, Integer> getSpielzeit() {
		return spielzeit;
	}
	
	public void setSpielzeit(int Minuten, int Sekunden) {
		spielzeit.put("Minuten", Minuten);
		spielzeit.put("Sekunden", Sekunden);
	}
	
	public void printSpielzeit() { 
		
		System.out.println("Spielzeit: "+spielzeit.get("Minuten")+" Minuten : "+spielzeit.get("Sekunden")+" Sekunden");
	}
	}
