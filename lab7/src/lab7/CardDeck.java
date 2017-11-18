package lab7;

import java.util.Random;

import se.lth.cs.ptdc.cardGames.Card;

/**
 * En kortlek med Card-objekt. 
 */
public class CardDeck {
	private Card[] cards;
	private int current = 0;
	private static Random rand = new Random();

	/**
	 * Skapar en kortlek som inte är blandad.
	 */
	public CardDeck() {
		cards = new Card[52];
		for (int suit = 1; suit <= 4; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards[current] = new Card(suit, rank);
				current++;
			}
		}
		current = 0;
	}

	/**
	 * Blandar kortleken.
	 */
	public void shuffle() {
		for (int i = 51; i >= 0; i--) {
			int nbr = rand.nextInt(i + 1);
			Card temp = cards[i];
			cards[i] = cards[nbr];
			cards[nbr] = temp;
		}
	}

	/**
	 * Undersöker om det finns fler kort i kortleken.
	 * 
	 * @return true om det finns fler kort, false annars
	 */
	public boolean moreCards() {
		if (current < (52)) {
			current++;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Drar det översta kortet i leken. Fungerar bara om moreCards är true.
	 * 
	 * @return det översta kortet i leken
	 */
	public Card getCard() {
		return cards[current - 1];
	}
}
