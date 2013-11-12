/**
* Nicholas Deluna
* CS 110
* Assingment 8 Ship class
*
* This program creates a ship Class 
*/

public class Ship
{
   private String shipName;
   private String Year;
   
 
   
  	/**
   * Class constructors
   * Constructs a Ship object with an shipName and yearBuilt
   * @param  shipName - The ships name
   * @param  yearBuilt - The the year the ship was built
   * 
   */
   public Ship(String ShipName,String Year)
   {
        setShipName(ShipName);    
        setYear(Year);
   }
   /**public Ship(String shipName, String yearBuilt)
   {
  	   shipName = shipName;
  	   yearBuilt = yearBuilt;
   }
   */
   /**
   * Class setters
   * sets The Ship name and yearBuil
   * setShipName - Sets the name of the ship
   * setyeatBuilt - sets the year built
   * 
   */
   
   public void setShipName(String shipName)     	 
   {
  	this.shipName = shipName;
   }
   
   public void setYear(String Year)	 
   {
  	this.Year = Year;
   }
   
	/**
   * Class getters
   * Returns the Ship name and year built 
   *
   *@return	getShipName - the name of the ship
   *@return	getYearBuilt -  the year the ship was built
   *
   */
   public String getShipName()  	 
   {
  	return this.shipName;
   }
   
   public String getYear()	 
   {
  	return this.Year;
   }
   
  /**
   * toString methog
   * Returns a string representation of the person object
   * Name:
   * TelePhone Number:
   * Address:
   *@return  the string representation of the person
   */
   public String toString()
   {
        String str;
        str = "Ship Name: " + this.shipName + "\nYear: " + this.Year; 
        return str;
   }


}
