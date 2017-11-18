import se.lth.cs.window.SimpleWindow;

public class RaceTrack {
	private int yStart;
	private int yFinish;

	public RaceTrack(int yStart, int yFinish) {
		this.yStart = yStart;
		this.yFinish = yFinish;
	}

	public void draw(SimpleWindow w) {
		w.setLineWidth(3);
		w.moveTo(Math.round(w.getWidth()) / 5, yStart);
		w.lineTo(Math.round(4 * w.getWidth()) / 5, yStart);
		w.moveTo(Math.round(w.getWidth()) / 5, yFinish);
		w.lineTo(Math.round(4 * w.getWidth() / 5), yFinish);
		w.setLineWidth(2);
	}

	public int getStartY() {
		return yStart;
	}

	public int getFinishY() {
		return yFinish;
	}

}
