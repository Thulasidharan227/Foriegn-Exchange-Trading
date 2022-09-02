package com.finzly.fxTrading;

import java.util.Scanner;

public class BookTrading {
	//Booking the trade

	static void bookTrading() {

		Scanner scanner = new Scanner(System.in);
		ListOfOperation list = new ListOfOperation();
		
		//Getting the customer name
		
		System.out.println("Enter the Customer name");
		String customerName = scanner.nextLine();
		
		if(customerName.matches("[a-zA-Z\\s].*$")) {
			
		//getting currency pair
			
		System.out.println("Enter the Currency pair");
		String currencyPair = scanner.next();

		if (currencyPair.equalsIgnoreCase("USDINR")) {
			int amount;
			System.out.println("Enter the amount to transfer");
			amount = scanner.nextInt();
			System.out.println("Do you want to getRate - (yes/no)");
			String getRate = scanner.next();
			final double rateOfUsd = 66.00;
			double inrAmount = rateOfUsd * amount;
			if(getRate.equalsIgnoreCase("yes")) {
				System.out.println("you are transferring INR " + inrAmount + " to " + customerName);
			}
			else if (getRate.equalsIgnoreCase("no")) {
				System.out.println("WARNING!!! \n Are you sure want to continue without knowing the rate?  (yes or no)");
				String check = scanner.next();
				String rate = (check.equalsIgnoreCase("no"))
						? "you are transferring INR " + inrAmount + " to " + customerName
						: "";
				System.out.println(rate);
			} else {
				System.out.println("Enter valid option");
				
				list.operation();
			}
			System.out.println("Book/Cancel this trade?");
			String book = scanner.next();
			if(book.equalsIgnoreCase("book")) {
					System.out.println("Trade for " + currencyPair + " has been booked with rate " + rateOfUsd + " , The amount of Rs."+ inrAmount + " will be transferred in 2 days to " + customerName + "\n");
			PrintTrade.tradeNo++;
			}
			else if (book.equalsIgnoreCase("cancel")){
				System.out.println("The trade is cancelled..");
			
			}
			else {
				System.out.println("invalid input");
			}
			PrintTrade.addTrading(PrintTrade.tradeNo, currencyPair, customerName, inrAmount, rateOfUsd);
			
			list.operation();

		} else {
			System.out.println("Invalid data!!!...Try again...");
			bookTrading();
		}

	}
		else {
			System.out.println("Invalid Customer name ...Try again");
			bookTrading();
			
		}
}
}