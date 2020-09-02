package com.mastercard.main.java.restaurant.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface PandemicService extends RestaurantService
{
	// Services supported during COVID pandemic
	@WebMethod public void curbsidePickUpService();
	@WebMethod public void groceryService();
	@WebMethod public void monthlyDinnerService();
	@WebMethod public void picnicBoxService();
	@WebMethod public void regionalSpecialtyService();
	@WebMethod public void scanMenuService();

}
