package com.mastercard.main.java.restaurant.resources;

import java.awt.Image;
import java.util.Set;

/** This class stores information of menu 
 * 
 * @author Akshata.Naikar
 *
 */
public class Menu 
{
	MenuType _menuType;
	Set<MenuItem> _menuItems;
	
	// Need to add a class variable to represent bar code
	// Scanning this bar code on mobile phone camera would open the menu on 
	// phone UI
	
	Image _barCode;
	
}
