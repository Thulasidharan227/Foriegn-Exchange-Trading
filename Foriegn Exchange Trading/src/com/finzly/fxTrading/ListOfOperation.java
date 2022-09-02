package com.finzly.fxTrading;

import java.util.Scanner;

public class ListOfOperation {
	
public void operation() {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.println("l Book Trade - 1");
	System.out.println("l Print Trade - 2");
	System.out.println("l Exit - 3");
	System.out.println("select an option: ");
	try{
	int input = scan.nextInt();
	
// Fetching options from user for further booking process or to exit .....
		switch(input){
	
		case(1):
			//for booking the trade
			BookTrading.bookTrading();
			break;
		case(2):
			//for print the booking trade history 
			PrintTrade.printTrading();
			break;
		case(3):
			//to exit
			Exit.exit();
			break;
		default:
			System.out.println("Select a valid option \n");
			operation();
			break;
		}
		
		
	}
	catch(Exception e){
		System.out.println("Invalid data....Caution : enter in number...");
		operation();
	}
}
}
