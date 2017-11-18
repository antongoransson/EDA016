package lab5;

import se.lth.cs.window.SimpleWindow;
import java.util.Random;
import lab4.Turtle;

public class TurtleMove {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "ColorTurtle");
		Turtle t1 = new Turtle(w, 300, 300);
		Random rand = new Random();

		t1.penDown();
		for (int i = 0; i < 1000; i++) {
			int n = 1 + rand.nextInt(10);
			t1.forward(n);
			SimpleWindow.delay(0);
			int dir = -180 + rand.nextInt(360);
			t1.left(dir);

		}
	}
}