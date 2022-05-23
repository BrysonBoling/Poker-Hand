import java.util.ArrayList;
import java.util.Random;

public class PokerHand {
	static class Card{
		String suit;
		int value;

	}

	public static void displayHand(Card[] hand){
		for(int i = 0; i < 5; i++){
			if(hand[i].value == 1)
				System.out.println("Ace of " + hand[i].suit);
			else if(hand[i].value == 13)
				System.out.println("King of " + hand[i].suit);
			else if(hand[i].value == 12)
				System.out.println("Queen of " + hand[i].suit);
			else if(hand[i].value == 11)
				System.out.println("Jack of " + hand[i].suit);
			else
				System.out.println(hand[i].value + " of " + hand[i].suit);

		}
	}

	public static void main(String[] args){
		ArrayList<Card> deck = new ArrayList<Card>();
		int val = 0;
		Card card;
		Card[] player = new Card[5];
		Random rand = new Random();

		//initialize standard deck
		for(int i = 1; i < 14; i++){
			for(int j = 0; j < 4; j++){
				card = new Card();
				switch(j){
					case 0: card.suit = "Hearts";
							break;

					case 1: card.suit = "Spades";
							break;

					case 2: card.suit = "Diamonds";
							break;

					case 3: card.suit = "Clubs";
							break;

					default: card.suit = "";
							break;
				}
				card.value = i;
				deck.add(card);
			}

		}

		//sets player hand
		for(int i = 0; i < 5; i++){
			val = rand.nextInt(52);

			player[i] = deck.get(val);
			deck.remove(val);
		}

		//displays player hand
		displayHand(player);
	}
}