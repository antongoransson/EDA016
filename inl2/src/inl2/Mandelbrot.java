package inl2;

import se.lth.cs.ptdc.fractal.MandelbrotGUI;
/** 
 * Genererar Mandelbrotsmängden
 */
public class Mandelbrot {
	public static void main(String[] args) {
		MandelbrotGUI gui = new MandelbrotGUI();
		Generator gen = new Generator();
		boolean reset = true;
		while(true){
			switch (gui.getCommand()){
			case MandelbrotGUI.ZOOM: if(reset) break;
			case MandelbrotGUI.RENDER:gen.render(gui);reset=false; break;
			case MandelbrotGUI.RESET:gui.resetPlane(); gui.clearPlane();reset=true; break;
			case MandelbrotGUI.QUIT: System.exit(0); break;
			}
			
			}
			
		
	}
}
