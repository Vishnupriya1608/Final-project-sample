package com.onlinestoreexample.factorypattern;

public class OnlineStoreFactoryMain {

	public static void main(String[] args) {
	      Order shapeFactory = new Order();

	      Cart shape1 = shapeFactory.getCartDetails("Lakme");

	      shape1.add();

	      Cart shape2 = shapeFactory.getCartDetails("Loreal");

	      shape2.add();

	      Cart shape3 = shapeFactory.getCartDetails("Vega");

	      shape3.add();
	   }

}
