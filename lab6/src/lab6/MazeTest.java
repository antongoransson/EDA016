package lab6;

import java.util.Scanner;

import se.lth.cs.ptdc.maze.Maze;
import se.lth.cs.window.SimpleWindow;

public class MazeTest {

	public static void main(String[] args) {
		System.out.println("Vilken labyrint 1-5?");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		SimpleWindow w = new SimpleWindow(400, 400, "MazeTest");
		Maze m = new Maze(n);
		w.waitForMouseClick();
		m.draw(w);
		MazeTurtle mt = new MazeTurtle(w, 1, 1);
		mt.walk(m);
	}
}
