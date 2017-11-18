package lab10;

import se.lth.cs.ptdc.shapes.*;
import se.lth.cs.window.*;

public class Square extends Shape {
	private int side;

	protected Square(int x, int y, int side) {
		super(x, y);
		this.side = side;
	}

	public void draw(SimpleWindow w) {
		w.moveTo(x, y);
		w.lineTo(x, side + y);
		w.lineTo(x + side, y + side);
		w.lineTo(x + side, y);
		w.lineTo(x, y);
	}
	public boolean near(int xc, int yc) {
		return Math.abs(x + side/2 - xc) < side / 2 && Math.abs(y + side / 2 - yc) < side/2;
	}
}