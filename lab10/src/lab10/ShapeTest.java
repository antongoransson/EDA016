package lab10;
import java.util.Scanner;
import se.lth.cs.window.SimpleWindow;
import java.io.File;
import java.io.FileNotFoundException;

public class ShapeTest {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "ShapeTest");
		ShapeList shapes = new ShapeList();
		CommandDispatcher cd= new CommandDispatcher(w, shapes);
		Scanner scan = null;
		try {
			scan = new Scanner(new File("shapedata.txt"));
			
		} catch (FileNotFoundException e) {
			System.err.println("Filen shapedata.txt kunde inte öppnas");
				System.exit(1);			
		}
		while(scan.hasNext()) {
			  switch(scan.next().charAt(0)) {
			  case 'S': shapes.insert(new Square(scan.nextInt(),scan.nextInt(),scan.nextInt())); break;
			  case 'C': shapes.insert(new Circle(scan.nextInt(),scan.nextInt(),scan.nextInt()));break;
			  case 'T': shapes.insert(new Triangle(scan.nextInt(),scan.nextInt(),scan.nextInt())); break;
			  }
		}
		shapes.draw(w);
		cd.mainLoop();
	}
}