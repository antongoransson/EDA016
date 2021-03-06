package lab5;

import se.lth.cs.window.SimpleWindow;
import java.awt.Color;
import lab4.Turtle;

public class ColorTurtle extends Turtle {
	private Color color;

	public ColorTurtle(SimpleWindow w, int x, int y, Color color) {
		super(w, x, y);
		this.color = color;
	}

	public void forward(int n) {
		Color savedcolor = w.getLineColor();
		w.setLineColor(color);
		super.forward(n);
		w.setLineColor(savedcolor);

	}
}
