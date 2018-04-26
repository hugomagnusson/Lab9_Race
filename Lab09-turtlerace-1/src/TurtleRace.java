import java.util.ArrayList;

public class TurtleRace {

	private static ArrayList<RaceTurtle> turtles;
	private static ArrayList<RaceTurtle> winners;
	private static RaceWindow w;
	private static TurtleRace race;
	
	public static void main(String []args) {
		
		w = new RaceWindow();
		turtles = new ArrayList<RaceTurtle>();
		winners = new ArrayList<RaceTurtle>();
		
		for (int i = 1; i < 9; i++) {
			RaceTurtle obj = new RaceTurtle(w, i);
			turtles.add(obj);
		}
		
		while(!turtles.isEmpty()) {
			
			for (int i = 0; i < turtles.size(); i++) {
				RaceTurtle turtle = turtles.get(i);
				turtle.raceStep();
				if (turtle.getX() >= w.X_END_POS) {
					winners.add(turtle);
					turtles.remove(turtle);
				}
			}
			w.delay(50);
			
		}
		
		for (int i = 0; i < winners.size(); i++) {
			System.out.println("På plats " + (i + 1) + ": " + winners.get(i));
		}
	}
}