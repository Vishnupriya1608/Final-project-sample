package com.onlinestoreexample.adapterpattern;

public class AddToCart implements Cart {

	@Override
	public void addToCart(String itemname) {
		System.out.println(itemname+" Added to the cart");

	}

	@Override
	public void showCart(String itemname) {
		// TODO Auto-generated method stub

	}

}
