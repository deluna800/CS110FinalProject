/**
* Nicholas DeLuna
* CS 110
* Deck Class
*
* Forms the deck of 52 cards using the rank and suit and random seperate that cards
* using param seed 
* http://docs.oracle.com/javase/7/docs/api/java/util/Random.html
* seed value is parameter that the "random" number generator uses in order to generate its "random" values. 
*
*/

import java.util.Random;


public class Deck 
{
	private Card[] cards;
	
	public Deck()
   {
		initializeCards();
	}
	
	/**
	 * Creates a new deck of cards
	 */
	private void initializeCards()
   {
		cards = new Card[52];
		
		int cardNum = 0;
		for(Suit suit : Suit.values())
      {
			for(Rank rank : Rank.values())
         {
				Card card = new Card(rank, suit);
				cards[cardNum] = card;
				cardNum++;
			}
		}
	}
	
	public Card[] getAllCards()
   {
		return this.cards;
	}
	
	/**
	 * Shuffles the deck using seed
	 * @param seed- randomly seperates the cards
	 */
	public void shuffle(long seed)
   {
		Random rand = new Random(seed);
		
		for(int n = cards.length - 1; n >= 0; n--)
      {
			int k = rand.nextInt(n + 1);
			 
			Card swap = cards[k];
			cards[k] = cards[n];
			cards[n] = swap;
		}
	}
}
