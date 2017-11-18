import se.lth.cs.window.SimpleWindow;
import java.util.Random;
import java.awt.Color;

public class Lines {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "Lines");
		Random rand = new Random();
		Color col = new Color(0, 0, 0);
		int x = 0;
		int y = 0;
		while (w.getWidth() >= x) {
			x = x + 1;
			y = y + 1;
			int i = 1 + rand.nextInt(255);
			col = new Color(i, i, i);
			w.setLineColor(col);
			w.moveTo(0, y);
			w.lineTo(x, y);
			w.lineTo(x, 0);

		}

	}

}
