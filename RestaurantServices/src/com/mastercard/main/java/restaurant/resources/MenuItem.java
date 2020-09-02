package com.mastercard.main.java.restaurant.resources;

/** This class stores information of menu item
 * 
 * @author Akshata.Naikar
 *
 */
public class MenuItem 
{
	String _itemName;
	Double _cost;
	boolean _available;
	
	// determines if this is dinner item or not
	// LUNCH, DINNER, BOTH
	String _itemType;
}
