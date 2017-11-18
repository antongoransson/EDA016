package lab2;

import java.util.Scanner;
import se.lth.cs.ptdc.square.Square;
import se.lth.cs.window.SimpleWindow;
public class AnimateSquares {




    public static void main(String[] args) {
        System.out.println("Skriv förminskning");
        Scanner scan = new Scanner(System.in);
        int dim = scan.nextInt();
        System.out.println("Skriv rotationen i grader");
        int rot = scan.nextInt();
        scan.close();
        SimpleWindow w = new SimpleWindow(600, 600, "DrawManySquares");
        Square sq = new Square(300, 300, 200);
        for (int i = 1; i > 0; i++) {
                    while (sq.getSide() > 0 ) {
                    sq.draw(w);
                    SimpleWindow.delay(50);
                    sq.erase(w);
                    sq.rotate(rot);
                    sq.setSide(sq.getSide() - dim);
                }
            

                while (sq.getSide() < 600) {
                    sq.draw(w);
                    SimpleWindow.delay(50);
                    sq.erase(w);
                    sq.rotate(rot);
                    sq.setSide(sq.getSide() + dim);

                }
            }
        }
    }



