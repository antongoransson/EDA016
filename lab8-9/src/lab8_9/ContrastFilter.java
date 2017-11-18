package lab8_9;

import java.awt.Color;

import se.lth.cs.ptdc.images.ImageFilter;

public class ContrastFilter extends ImageFilter {

	protected ContrastFilter(String name) {
		super(name);
	}

	public Color[][] apply(Color[][] inPixels, double paramValue) {
		int height = inPixels.length;
		int width = inPixels[0].length;
		short[] histogram = new short[256];
		Color[][] outPixels = new Color[height][width];
		short[][] intensity = computeIntensity(inPixels);
		double cutoff = paramValue / 100;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				int index = intensity[i][j];
				histogram[index]++;
			}
		}
		int lowCut = 0;
		int sum = 0;
		while (sum < cutoff * height * width) {
			sum += histogram[lowCut];
			lowCut++;
		}
		int highCut = 255;
		sum = 0;
		while (sum > cutoff * height * width) {
			sum += histogram[highCut];
			highCut--;
		}
		short[] newIntensity = new short[256];
		for (int k = 0; k < newIntensity.length; k++) {
			int n = k;
			if (n < lowCut) {
				n = lowCut;
			}
			if (n > highCut) {
				n = highCut;
			}
			newIntensity[k] = (short) (255 * (n - lowCut) / (highCut - lowCut));
		}
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				Color pixel = inPixels[i][j];
				short red = newIntensity[pixel.getRed()];
				short blue = newIntensity[pixel.getBlue()];
				short green = newIntensity[pixel.getGreen()];
				outPixels[i][j] = new Color(red, green, blue);
			}
		}
		return outPixels;
	}
}
