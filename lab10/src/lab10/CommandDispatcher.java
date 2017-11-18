package lab10;

import se.lth.cs.window.*;
import se.lth.cs.ptdc.shapes.*;

public class CommandDispatcher {
	private SimpleWindow w;
	private ShapeList shapes;

	public CommandDispatcher(SimpleWindow w, ShapeList shapes) {
		this.w = w;
		this.shapes = shapes;
	}

	public void mainLoop() {
		while (true) {
			w.waitForMouseClick();
			Shape s = shapes.findHit(w.getMouseX(), w.getMouseY());
			if(s!=null){
			w.waitForMouseClick();
			s.moveToAndDraw(w, w.getMouseX(), w.getMouseY());
			}
		}
	}
}
