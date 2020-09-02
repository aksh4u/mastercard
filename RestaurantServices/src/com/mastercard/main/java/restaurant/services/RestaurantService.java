package com.mastercard.main.java.restaurant.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.mastercard.main.java.invoice.Invoice;
import com.mastercard.main.java.order.Order;
import com.mastercard.main.java.restaurant.resources.MenuItem;

@WebService
public interface RestaurantService 
{
	// basic calls for dinner experience
	
	// User orders drinks with a list of menu items, either new order is generated
	// or existing order is updated
	@WebMethod public Order orderDrinks(List<MenuItem> items);
	
	// User orders food with a list of menu items, either new order is generated
	// or existing order is updated
	@WebMethod public Order orderFood(List<MenuItem> items);
	
	// User orders desserts with a list of menu items, either new order is generated
	// or existing order is updated
	@WebMethod public Order orderDessert(List<MenuItem> items);
	
	// User provides credit card info, we generate the invoice
	@WebMethod public Invoice acceptPayment(Order order, String creditCardInfo);
	
	// Status is updated to true once food is delivered or picked up
	@WebMethod public boolean cateringService(Order order);
	
	// Status is updated to true once food is delivered
	@WebMethod public boolean deliveryService(Order order);
	
	//Status is updated to true once food is picked up
	@WebMethod public boolean pickUpService(Order order);
	
	// Order is generated
	@WebMethod public Order onlineOrderingService(List<MenuItem> items, String userName);
	
	// Order is generated
	@WebMethod public Order phoneOrderingService(List<MenuItem> items, String userName);
}
