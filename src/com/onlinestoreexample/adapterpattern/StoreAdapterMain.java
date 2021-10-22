package com.onlinestoreexample.adapterpattern;



public class StoreAdapterMain {

	public static void main(String[] args) {
		StorePattern st = new StorePattern();

		st.getItems("Vega", "Beauty");
		st.getItems("Loreal", "Hair");
		st.getItems("Lakme", "FaceCream");
		st.getItems("D", "Health");

	}

}
