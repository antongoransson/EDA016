package lab6;

import lab4.Turtle;
import se.lth.cs.window.*;
import se.lth.cs.ptdc.maze.*;

public class MazeTurtle extends Turtle {

	public MazeTurtle(SimpleWindow w, int x, int y) {
		super(w, x, y);
	}

	public void walk(Maze maze) {
		SimpleWindow.delay(3);
		penDown();
		jumpTo(maze.getXEntry(), maze.getYEntry());
		while (!maze.atExit(getX(), getY())) {
			SimpleWindow.delay(5);
			if (!maze.wallAtLeft(getDirection(), getX(), getY())) {
				left(90);
			}
			if (maze.wallInFront(getDirection(), getX(), getY())) {
				left(-90);
			}
			forward(1);
		}
	}
}
