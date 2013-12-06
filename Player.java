/**
* Nicholas DeLuna
* CS 110
* Player class
*
* Create two players and their piles
*
*/
import java.util.List;

public class Player 
{
	private String playerName;
	private CardPile cardPile = new CardPile();
	private CardPile winCardPile = new CardPile();
	private int warsWon;
	private int wins = 0;

	public Player(String name)
   {
		this.playerName = name;
	}


	/**
	 * Adds a card to playing pile
	 * @param card
	 */
	public void addCard(Card card)
   {
		this.cardPile.addCard(card);
	}

	/**
	 * Removes top card from playing pile
	 * @return Card
	 */
	public Card removeTopCard()
   {
		return this.cardPile.removeTopCard();
	}

	public String getName()
   {
		return this.playerName;
	}


	/**
	 * Player still has cards to play
	 * @return
	 */
	public boolean hasCardsRemaining()
   {
		// if card pile is empty
		if(this.cardPile.size() == 0 && this.winCardPile.size() > 0)
      {
      
			for(int i = 0; i < winCardPile.size(); i++){
				cardPile.addCard(winCardPile.removeTopCard());
			}
		}
		return this.cardPile.size() > 0;
	}
}
