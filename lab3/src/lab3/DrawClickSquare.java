package lab3;

import java.awt.Color;

import se.lth.cs.ptdc.square.Square;
import se.lth.cs.window.SimpleWindow;

public class DrawClickSquare {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "ClickSquare");
		int oldX = 300;
		int oldY = 300;
		Square sq = new Square(300, 300, 100);
		sq.draw(w);
		while (true) {
			w.waitForEvent();
			if (w.getEventType() == SimpleWindow.MOUSE_EVENT) {
				w.clear();
				
				int newX = w.getMouseX();
				int newY = w.getMouseY();
				for (int i = 0; i < 10; i++) {

					sq.move(i * (newX - oldX) / 10, i * (newY - oldY) / 10);
					sq.draw(w);
					sq.move(-i * (newX - oldX) / 10, -i * (newY - oldY) / 10);

				}
				sq.move(newX - oldX, newY - oldY);
				oldX = newX;
				oldY = newY;
			} else {
				char ch = w.getKey();
				if (ch == 'r') {
					w.setLineColor(Color.red);
				} else {
					w.setLineColor(Color.black);
				}

			}
		}
	}
}