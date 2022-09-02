package com.finzly.fxTrading;

import java.util.ArrayList;
// To print the booked trade history
public class PrintTrade {
	static int  tradeNo=0;
	static ArrayList<GettingValues> bookHistory = new ArrayList<>();
	
	static void addTrading(int tradeNo, String currencyPair, String customerName, double inrAmount, double rate) {
		bookHistory.add(new GettingValues(tradeNo, currencyPair, customerName, inrAmount, rate));
	}
	public static void printTrading() {
		System.out.println("tradeNo\tcurrencyPair\tcustomerName\tinrAmount\trate");
		if(bookHistory.isEmpty()) {
			System.out.println("-----No booking done yet------");
		}
		else {
		for(GettingValues addedValues: bookHistory ) {
			System.out.println(addedValues);
		}
		}
		ListOfOperation list = new ListOfOperation();
		list.operation();
	}
}
