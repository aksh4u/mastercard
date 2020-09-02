package com.mastercard.main.java.restaurant.user;

import java.util.Date;

import com.mastercard.main.java.restaurant.resources.Location;

/** This class stores information of people associated with restaurant
 * This includes customers, online buyers, restaurant staff, chef and owner 
 * 
 * @author Akshata.Naikar
 *
 */
public abstract class User 
{
	String _userId; // can be used as primary key to uniquely identify a user
	
	String _firstName;
	String _lastName;
	
	Date _birthDay;
	
	Location _homeAddress;
	String _creditCardInfo; // encrypted version will be stored
	
	public static User findByName(String firstName, String lastName)
	{
		// method to look up user by first name and last name
		return null;
	}
	
}
