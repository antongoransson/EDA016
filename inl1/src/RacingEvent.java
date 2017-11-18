import java.util.Random;
import se.lth.cs.window.*;
import lab4.Turtle;

public class RacingEvent {
	private RaceTrack track;
	private Turtle t1;
	private Turtle t2;

	public RacingEvent(RaceTrack track, Turtle t1, Turtle t2) {
		this.track = track;
		this.t1 = t1;
		this.t2 = t2;

	}

	public void startRace() {
		Random rand = new Random();
		t1.penDown();
		t2.penDown();
		while (t1.getY() >= track.getFinishY()
				&& t2.getY() >= track.getFinishY()) {
			int t1Forw = rand.nextInt(3);
			int t2Forw = rand.nextInt(3);
			t1.forward(t1Forw);
			t2.forward(t2Forw);
			SimpleWindow.delay(10);
		}
	}

}
