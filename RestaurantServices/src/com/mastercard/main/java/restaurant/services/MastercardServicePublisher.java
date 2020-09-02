package com.mastercard.main.java.restaurant.services;

import javax.xml.ws.Endpoint;

public class MastercardServicePublisher 
{
	public static void main(String[] args)
	{
		Endpoint.publish("http://localhost:9901/MC", new MastercardRestaurantServiceImpl());
	}
}
