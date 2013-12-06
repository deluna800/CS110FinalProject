/**
* Nicholas DeLuna
* CS 110
* CardPile class
* Creats an arraylist for each plays cards and adds the card 
**/
import java.util.ArrayList;
import java.util.List;

public class CardPile 
{
	private List<Card> pile = new ArrayList<Card>();
	
	/**
	 * Constructor
	 */
	public CardPile()
   {
	}
	
	/**
	 * Adds card to playing pile
	 * @param card
	 */
	public void addCard(Card card)
   {
		this.pile.add(0, card);
	}
	
	/**
	 * size of the playing pile
	 * @return size
	 */
	public int size()
   {
		return this.pile.size();
	}
	
	/**
	 * Gets top card of playing pile
	 * @return Card removed
	 */
	public Card removeTopCard()
   {
		return this.pile.remove(0);
	}
	
	public void clear()
   {
		this.pile.clear();
	}
	
	/**
	 * Gets list of all cards on pile
	 * @return List<Card>
	 */
	public List<Card> getCards()
   {
		return this.pile;
	}
}
