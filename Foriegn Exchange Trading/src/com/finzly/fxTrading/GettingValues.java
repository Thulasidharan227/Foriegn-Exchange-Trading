package com.finzly.fxTrading;

public class GettingValues {

	private int tradeNo;
	private String currencyPair;
	private String customerName;
	private double inrAmount;
	private double rate;
	
	public GettingValues(int tradeNo, String currencyPair, String customerName, double inrAmount, double rate) {
		super();
		this.tradeNo = tradeNo;
		this.currencyPair = currencyPair;
		this.customerName = customerName;
		this.inrAmount = inrAmount;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "\t"+ tradeNo + "\t" + currencyPair + "\t" + customerName
				+ "\t" + inrAmount + "\t" + rate ;
	}
	
	
}
