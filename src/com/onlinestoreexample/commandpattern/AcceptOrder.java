package com.onlinestoreexample.commandpattern;

public class AcceptOrder implements Order{
	OrderRequest or;
	
	public AcceptOrder(OrderRequest or) {
		this.or = or;
	}
	@Override
	public void deliver() {
		
		or.accept();
	}

}
