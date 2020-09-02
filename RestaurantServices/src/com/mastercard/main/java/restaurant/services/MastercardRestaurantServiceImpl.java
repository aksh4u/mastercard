package com.mastercard.main.java.restaurant.services;

import java.util.List;

import javax.jws.WebService;

import com.mastercard.main.java.invoice.Invoice;
import com.mastercard.main.java.order.Order;
import com.mastercard.main.java.restaurant.resources.MenuItem;
import com.mastercard.main.java.restaurant.user.User;

@WebService(endpointInterface = "com.mastercard.main.java.restaurant.services.PandemicService")
public class MastercardRestaurantServiceImpl implements PandemicService
{

	@Override
	public Order orderDrinks(List<MenuItem> items) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order orderFood(List<MenuItem> items) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order orderDessert(List<MenuItem> items) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Invoice acceptPayment(Order order, String creditCardInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cateringService(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deliveryService(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean pickUpService(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Order onlineOrderingService(List<MenuItem> items, String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order phoneOrderingService(List<MenuItem> items, String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean curbsidePickUpService(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean groceryService(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Order monthlyDinnerService(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order picnicBoxService(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order regionalSpecialtyService(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void scanMenuService() {
		// TODO Auto-generated method stub
		
	}
	
}
