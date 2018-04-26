import java.util.Random;

import se.lth.cs.pt.window.SimpleWindow;

public class RaceTurtle extends Turtle {
	
	private Random rand = new Random(); 
	private int nbr;
	
	public RaceTurtle(RaceWindow w, int nbr) {
		super(w, 0, 0);
		this.nbr = nbr;
		jumpTo(RaceWindow.getStartXPos(nbr), RaceWindow.getStartYPos(nbr));
		left(270);
		penDown();
	}
	
	public void raceStep() {
		int r = rand.nextInt(6) + 1;
		forward(r);
		//System.out.println(r);
	}
	
	public String toString(){
		return "Nummer: " + nbr;
	}
	
	

	
	
}
