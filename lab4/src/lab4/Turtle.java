package lab4;

import se.lth.cs.window.SimpleWindow;

public class Turtle {
	protected SimpleWindow w;
	private double x;
	private double y;
	private boolean penDown = false;
	private double dir = 90;

	/**
	 * Skapar en sköldpadda som ritar i ritfönstret w. Från början befinner sig
	 * sköldpaddan i punkten x,y med pennan lyft och huvudet pekande rakt uppåt
	 * i fönstret (i negativ y-riktning)
	 */
	public Turtle(SimpleWindow w, int x, int y) {
		this.w = w;
		this.x = x;
		this.y = y;
		w.moveTo((int) Math.round(x), (int) Math.round(y));

	}

	/** Sänker pennan */
	public void penDown() {
		penDown = true;

	}

	/** Lyfter pennan */
	public void penUp() {
		penDown = false;

	}

	/** Går rakt framåt n pixlar i den riktning som huvudet pekar */
	public void forward(int n) {
		double alpha = Math.toRadians(dir);
		w.moveTo((int) Math.round(x), (int) Math.round(y));
		int x1 = (int) (Math.round(x + n * Math.cos(alpha)));

		int y1 = (int) (Math.round(y - n * Math.sin(alpha)));

		if (penDown) {

			w.lineTo((int) Math.round(x1), (int) Math.round(y1));

		} else {
			w.moveTo((int) Math.round(x1), (int) Math.round(y1));
		}
		x = x1;
		y = y1;

	}

	/** Vrider beta grader åt vänster runt pennan */
	public void left(int beta) {
		dir = dir + beta;

	}

	/**
	 * Går till punkten newX,newY utan att rita. Pennans läge (sänkt eller lyft)
	 * och huvudets riktning påverkas inte
	 */
	public void jumpTo(int newX, int newY) {
		x = newX;
		y = newY;

	}

	/** Återställer huvudriktningen till den ursprungliga */
	public void turnNorth() {
		this.dir = 90;

	}

	/** Tar reda på x-koordinaten för sköldpaddans aktuella position */
	public int getX() {
		return (int) x;

	}

	/** Tar reda på y-koordinaten för sköldpaddans aktuella position */
	public int getY() {
		return (int) y;
	}

	/** Tar reda på sköldpaddans riktning, i grader från positiv x-led */
	public int getDirection() {
		return (int) dir;

	}
}
