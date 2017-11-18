import se.lth.cs.window.SimpleWindow;
public class Linjer {

	public static void main(String[] args) {
		SimpleWindow w= new SimpleWindow(600, 600, "Dra linjer");
		w.moveTo(0, 0 );
		while (true) {
			w.waitForMouseClick();
			
			w.lineTo(w.getMouseX(), w.getMouseY());
		}
		

	}

	
}

