/**
* Nicholas DeLuna
* CS 110
* Card class
* Creates a card class that both compares the rank and suit, and also places .jpg of each card 
* with the correct suit and rank
*
* I had to change the names of the face cards in order for if statemnt to run through the folder 
* a place the correct face card with the right suit
*/
import javax.swing.ImageIcon;


public class Card 
{
	private Rank rank;
	private Suit suit;
	
	/*
	 * New card constructor
	 */
	public Card(Rank rank, Suit suit)
   {
		this.rank = rank;
		this.suit = suit;
	}
	
	public Rank getRank()
   {
		return this.rank;
	}
	
	public void setRank(Rank rank)
   {
		this.rank = rank;
	}
	
	public Suit getSuit()
   {
		return this.suit;
	}
	
	public void setSuit(Suit suit)
   {
		this.suit = suit;
	}
	
	/*
	 * Returns the image for the appropriate card base upon symbol and rank, if isWar is true return the back of the card
	 * to simulate face down
	 */
	public ImageIcon getCardImage(boolean isWar)
   {
		ImageIcon icon;
		if(isWar)
			icon = new ImageIcon("Pictures/back.jpg");
        
		else 
			icon = new ImageIcon("Pictures/" +  this.rank.getSymbol() +this.suit.getSymbol() + ".jpg");
		
		return icon;
	}
	
	/**
	 * Returns the winning crad or tie
	 * @param card2
	 * @return 0 for tie, 1 for card1, 2 for card2
	 */
	public int compareTo(Card card2)
   {
		// gets rank of current card
		char card1Rank = this.getRank().getSymbol();
		// gets rank of parameter card
		char card2Rank = card2.getRank().getSymbol();
		
		// Tie
		if(card1Rank == card2Rank)
			return 0;
		
		// Nothing past here can be a tie
		// Ace wins
		if(card1Rank == 'a')
			return 1;
		
		if(card2Rank == 'a')
			return -1;
		
		// compare rank in enum
		int winnerCard = this.getRank().compareTo(card2.getRank());
		if(winnerCard > 0)
			// card 1 is larger
			return 1;
		else
			// card 2 is larger
			return -1;
	}
}
