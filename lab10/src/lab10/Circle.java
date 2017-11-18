package lab10;

import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.window.SimpleWindow;

public class Circle extends Shape {
	private int radius;

	protected Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public void draw(SimpleWindow w) {
		final int corners = 3000;
		w.moveTo(x + radius, y);
		double conv = Math.PI * 2 / corners;
		for (int i = 0; i <= corners; i++) {
			double angle = i * conv;
			w.lineTo((int) Math.round(x + radius * Math.cos(angle)),
					(int) Math.round(y + radius * Math.sin(angle)));
		}
	}
	public boolean near(int xc, int yc) {
		return Math.hypot((Math.abs((x - xc))),Math.abs((y - yc)))< radius;
	}
}
