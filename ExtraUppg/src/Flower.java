import se.lth.cs.window.SimpleWindow;

public class Flower {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(400, 400, "Flower");
		int x0 = w.getWidth() / 2;
		int y0 = w.getHeight() / 2;
		double radius = 1;
		w.moveTo((int) (x0), y0);
		for (int i = 0; i <= 360; ++i) {
			double angle = Math.toRadians(i);
			int x = x0 - (int) Math.round(radius * Math.cos(angle));
			int y = y0 + (int) Math.round(radius * Math.sin(angle));
			w.lineTo(x, y);
			radius -=  10* Math.cos(4  * angle);
		}
	}
}
