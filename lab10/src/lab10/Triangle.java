package lab10;

import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.window.SimpleWindow;

public class Triangle extends Shape {
	private int side;

	protected Triangle(int x, int y, int side) {
		super(x, y);
		this.side = side;
	}

	public void draw(SimpleWindow w) {
		w.moveTo(x, y);
		w.lineTo((int) Math.round(x + side / 2),
				(int) Math.round(y - Math.sqrt(3) / 2 * side));
		w.lineTo((int) Math.round(x + side), y);
		w.lineTo(x, y);
	}

	public boolean near(int xc, int yc) {
		return Math.abs(x + side / 2 - xc) < side / 2
				&& Math.abs(y - Math.sqrt(3) * side / 2 - yc) < Math.sqrt(3)
						* side / 2;
	}
}
