import se.lth.cs.window.*;
import lab4.Turtle;

public class TurtleRace {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow( 1000, 800, "TurtleRace");
		RaceTrack track = new RaceTrack( 700, 100);	
		Turtle t1 = new Turtle(w, w.getWidth()/3, track.getStartY());
		Turtle t2 = new Turtle(w, 2*w.getWidth()/3, track.getStartY());
		RacingEvent event = new RacingEvent(track,t1,t2);
		track.draw(w);
		w.waitForMouseClick();
		event.startRace();

	}

}
