package lab8_9;

import java.awt.Color;
import se.lth.cs.ptdc.images.ImageFilter;

public class GrayScaleFilter extends ImageFilter {

	protected GrayScaleFilter(String name) {
		super(name);
	}

	public Color[][] apply(Color[][] inPixels, double paramValue) {
		int height = inPixels.length;
		int width = inPixels[0].length;
		Color[] grayLevels = new Color[256];
		for (int k = 0; k < 256; k++) {
			grayLevels[k] = new Color(k, k, k);
		}
		short[][] intensity = computeIntensity(inPixels);
		Color[][] outPixels = new Color[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				outPixels[i][j] = grayLevels[intensity[i][j]];
			}
		}
		return outPixels;
	}
}
