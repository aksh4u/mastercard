package com.mastercard.main.java.restaurant.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.mastercard.main.java.order.Order;
import com.mastercard.main.java.restaurant.user.User;

@WebService
public interface PandemicService extends RestaurantService
{
	// Services supported during COVID pandemic
	
	@WebMethod public boolean curbsidePickUpService(Order order);
	
	@WebMethod public boolean groceryService(Order order);
	
	// User subscribes to 4 monthly dinners
	@WebMethod public Order monthlyDinnerService(User user);
	
	// User orders picnic box
	@WebMethod public Order picnicBoxService(User user);
	
	// User orders regional specialty
	@WebMethod public Order regionalSpecialtyService(User user);
	
	// 
	@WebMethod public void scanMenuService();

}
