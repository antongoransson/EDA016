package lab5;
import se.lth.cs.window.SimpleWindow;
import java.awt.Color;
import java.util.Random;

public class ColorTurtle2Turtles {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "ColorTurtle");
		ColorTurtle t1 = new ColorTurtle(w, 350, 350, Color.RED);
		ColorTurtle t2 = new ColorTurtle(w,250,250, Color.BLUE);
		Random rand = new Random();
		t1.penDown();
		t2.penDown();
		w.setLineWidth(3);
		while (Math.hypot(t1.getX()-t2.getX(),t1.getY()- t2.getY())>=50 ){
			int n = 1 + rand.nextInt(10);
			int dir = -180 + rand.nextInt(360);
			t1.forward(n);
			t1.left(dir);
			int t = 1 + rand.nextInt(10);
			int beta= -180 + rand.nextInt(360);
			t2.forward(t);
			t2.left(beta);
			SimpleWindow.delay(10);
	}
	}
}
