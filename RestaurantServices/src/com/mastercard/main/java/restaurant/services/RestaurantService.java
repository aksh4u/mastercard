package com.mastercard.main.java.restaurant.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface RestaurantService 
{
	@WebMethod public void cateringService();
	@WebMethod public void deliveryService();
	@WebMethod public void dinnerService();
	@WebMethod public void lunchService();
	@WebMethod public void onlineOrderingService();
	@WebMethod public void phoneOrderingService();
	@WebMethod public void pickUpService();
	
	// order drinks
	// order food
	// order dessert
	// accept payment
	
}
