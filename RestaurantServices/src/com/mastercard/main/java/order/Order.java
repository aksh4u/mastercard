package com.mastercard.main.java.order;

import java.util.List;

import com.mastercard.main.java.invoice.Invoice;
import com.mastercard.main.java.restaurant.resources.MenuItem;

/** This class stores information of Order palced by customer  
 * 
 * @author Akshata.Naikar
 *
 */
public class Order 
{
	OrderType _orderType;
	List<MenuItem> _menuItems;
	Invoice _invoice;
	String _status; // new, in progress, closed
}
