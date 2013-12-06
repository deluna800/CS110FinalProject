/**
* Nicholas DeLuna
* CS 110
* Suits class
*
* When I original created the card class I had suit and rank 
* in that class the but I was having a hard time with the icons
**

/**
 *	Enum used to store the 4 suits in the deck
 */
public enum Suit 
{
	CLUBS('c', "Clubs"),
	DIAMONDS('d', "Diamonds"),
	HEARTS('h', "Hearts"),
	SPADES('s', "Spades");
	
	private final char symbol;
	private final String name;
	
	/**
	 * Internal constructor used to create suit enums
	 * @param symbol the character representation of the suit
	 * @param name the string representation of the suit
	 */
	private Suit(char symbol, String name)
   {
		this.symbol = symbol;
		this.name = name;
	}
	
	public char getSymbol()
   {
		return this.symbol;
	}
	
	public String getName()
   {
		return this.name;
	}
}
