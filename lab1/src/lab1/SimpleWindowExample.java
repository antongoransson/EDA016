package lab1;
import java.awt.Color;

import se.lth.cs.window.SimpleWindow;

public class SimpleWindowExample {
	public static void main(String[] args) {
		SimpleWindow w= new SimpleWindow(500, 500, "Drawing Window");
		
		w.setLineColor(Color.RED);
		w.moveTo(100, 100);
		w.lineTo(480,333);

	}

}
