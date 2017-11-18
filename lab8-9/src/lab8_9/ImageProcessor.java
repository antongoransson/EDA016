package lab8_9;
import se.lth.cs.ptdc.images.ImageFilter;
import se.lth.cs.ptdc.images.ImageGUI;

public class ImageProcessor {
	public static void main(String[] args) {
		ImageFilter[] filters = new ImageFilter[5];	
		filters[0] = new IdentityFilter("Choose Filter");
		filters[1] = new BlueFilter("BlueFilter");
		filters[2] = new InvertFilter("InverFilter");	
		filters[3] = new GrayScaleFilter("GrayScaleFilter");
		filters[4] = new ContrastFilter("ContrastFilter");
		new ImageGUI(filters);
	}
}
