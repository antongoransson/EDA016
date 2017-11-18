package lab10;

import java.util.ArrayList;

import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.window.SimpleWindow;

public class ShapeList {
	ArrayList<Shape> shapes;

	/** Skapar en tom lista */
	public ShapeList() {
		shapes = new ArrayList<Shape>();

	}

	/** Lägger in figuren s i listan */
	public void insert(Shape s) {
		shapes.add(s);

	}

	/** Ritar upp figurerna i listan i fönstret w */
	public void draw(SimpleWindow w) {
		for (int i = 0; i < shapes.size(); i++){
			shapes.get(i).draw(w);
		}
	}

	/**
	 * Tar reda på en figur som ligger nära punkten xc,yc (null om ingen sådan
	 * figur finns i listan
	 */
	public Shape findHit(int xc, int yc) {
		for (int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i).near(xc, yc)) {
				return shapes.get(i);
			}
		}
		return null;
	}
}
