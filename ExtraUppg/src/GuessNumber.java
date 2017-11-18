import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int randomNbr = 1 + rand.nextInt(100);
		int tries = 1;
		System.out
				.print("Jag tänker på ett tal mellan 1 och 100 - gissa vilket:");
		int guess = scan.nextInt();
		while (guess > randomNbr || guess < randomNbr) {
			if (guess > randomNbr) {
				System.out.print("För stort, försök igen: ");
				tries += 1;
				guess = scan.nextInt();
			} else {
				System.out.print("För litet, försök igen: ");
				tries += 1;
				guess = scan.nextInt();
			}
		}
		scan.close();
		System.out.println("Rätt på " + tries + " försök!");
	}
}