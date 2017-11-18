package inl2;

import se.lth.cs.ptdc.fractal.MandelbrotGUI;
import java.awt.Color;

/**
 * Beräknar punkterna i Mandelbrotmängden och visar dem i fönstret
 *
 */
public class Generator {

	/**
	 * Ritar en bild i fönstret i användargränssnittet gui, håller även
	 * koll på om upplösningen ändras och om bilden ska ritas i färg eller
	 * inte
	 * 
	 * @param gui
	 */

	public void render(MandelbrotGUI gui) {
		gui.disableInput();
		boolean bw = true;
		int pixelSize = 1;
		switch (gui.getResolution()) {
		case MandelbrotGUI.RESOLUTION_VERY_LOW:
			pixelSize = 9;
			break;
		case MandelbrotGUI.RESOLUTION_LOW:
			pixelSize = 7;
			break;
		case MandelbrotGUI.RESOLUTION_MEDIUM:
			pixelSize = 5;
			break;
		case MandelbrotGUI.RESOLUTION_HIGH:
			pixelSize = 3;
			break;
		case MandelbrotGUI.RESOLUTION_VERY_HIGH:
			pixelSize = 1;
			break;
		}
		switch (gui.getMode()) {
		case MandelbrotGUI.MODE_BW:
			bw = true;
			break;
		case MandelbrotGUI.MODE_COLOR:
			bw = false;
			break;
		}
		int height = gui.getHeight() / pixelSize;
		int width = gui.getWidth() / pixelSize;
		double minRe = gui.getMinimumReal();
		double maxRe = gui.getMaximumReal();
		double minIm = gui.getMinimumImag();
		double maxIm = gui.getMaximumImag();
		Complex[][] complex = mesh(minRe, maxRe, minIm, maxIm, width, height);
		Color[][] picture = new Color[height][width];
		Color[] colors = new Color[256];
		for (int i = 0; i < 256; i++) {
			colors[i] = new Color(i, i, i);
		}
		for (int im = 0; im < height; im++) {
			for (int re = 0; re < width; re++) {
				Complex z = new Complex(0, 0);
				Complex c = complex[im][re];
				int k = 0;
				while (z.getAbs2() <= 4 && k < 200) {
					z.mul(z);
					z.add(c);
					k++;
				}
				if (bw) {
					if (z.getAbs2() <= 4) {
						picture[im][re] = Color.BLACK;
					} else {
						picture[im][re] = new Color(k * 1000000);
					}
				}
				if (bw) {
					Color col = picture[im][re];
					int intensity = (col.getRed() + col.getGreen() + col.getBlue()) / 3;
					picture[im][re] = colors[intensity];// s(intensity,
														// intensity,
														// intensity);
				}
			}
		}
		gui.putData(picture, pixelSize, pixelSize);
		gui.enableInput();
	}

	/**
	 * Skapar en matris där varje element är ett komplext tal
	 * 
	 * @param minRe
	 * @param maxRe
	 * @param minIm
	 * @param maxIm
	 * @param width
	 * @param height
	 * @return
	 */

	private Complex[][] mesh(double minRe, double maxRe, double minIm, double maxIm, int width, int height) {
		Complex[][] complex = new Complex[height][width];
		for (int im = 0; im < height; im++) {
			for (int re = 0; re < width; re++) {
				complex[im][re] = new Complex(minRe + re * (maxRe - minRe) / width,
						maxIm - im * (maxIm - minIm) / height);
			}
		}
		return complex;
	}
}
