/**
* Nicholas DeLuna
* CS 110
* Rank class
* 
* When I original created the card class I had suit and rank 
* in that class the but I was having a hard time with the icons
**

/**
 * Enum used to store the rank of the 13 ranks in the deck
 */
public enum Rank 
{
	ACE('a', "ace"),
	TWO('2', "two"),
	THREE('3', "three"),
	FOUR('4', "four"),
	FIVE('5', "five"),
	SIX('6', "six"),
	SEVEN('7', "seven"),
	EIGHT('8', "eight"),
	NINE('9', "nine"),
	TEN('t', "ten"),
	JACK('j', "jack"), 
	QUEEN('q', "queen"),
	KING('k', "king");
	
	private final char symbol;
	private final String name;
	
	/**
	 * Internal constructor used to create rank enums
	 * @param symbol the character representation of the rank
	 * @param name the string representation of the rank
	 */
	private Rank(char symbol, String name)
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
