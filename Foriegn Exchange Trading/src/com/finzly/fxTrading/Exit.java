package com.finzly.fxTrading;

import java.util.Scanner;
//to get exit from the code

public class Exit {
	 static void exit() {
		Scanner scanner = new Scanner(System.in);
		ListOfOperation list = new ListOfOperation();
		System.out.println("Do you really want to exit   (Yes/No)");
		String check = scanner.next();
		if(check.equalsIgnoreCase("yes")) {
			System.out.println("Bye - have a Great day!!!   :-)");
			//System.exit(0);
		}
		else if(check.equalsIgnoreCase("no")) {
			System.out.println("");
			list.operation();
		}
		else{
			System.out.println("Invalid entry");
			System.out.println("");
			exit();
		}
		
	}
}
