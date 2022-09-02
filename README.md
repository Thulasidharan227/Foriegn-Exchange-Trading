# Foriegn-Exchange-Trading
FX Trading Assignment 

Main class [here](https://github.com/Thulasidharan227/main/blob/Foriegn-Exchange-Trading/src/com/finzly/fxTrading/FxTrading.java) click here<br/>
 

Write a java program for converting USD to INR. This is small stripped down use case of Foreign exchange trading. This program should be designed to assist users with transferring USD to INR. The design should be flexible such that new currency can be added with minimal change and impact to existing functionality.

Program should display following options to user and should work as explained below:


l Book Trade - 1

l Print Trades - 2

l Exit - 3

 

Book Trade -1 

Enter customer Name

 John M.

Enter Currency Pair

	USDINR

Enter amount to transfer

	1000

Do you want to get Rate

	Yes

You are transferring INR 66,0000 to John M.( Assuming that rate was 66.00)

Book/Cancel this trade?

Book - Trade should be booked and confirmation to be displayed as below

	Trade for USDINR has been booked with rate 66.00 , The amount of Rs 66,0000 will  be transferred in 2 working days to John M..

Cancel : Print message as below

	Trade is Canceled. 

Display list of operation supported by the program ( Book Trade, Print Trades , Exit)

 

Program should allow users to book only USDINR, on entering invalid input ,appropriate error message must be displayed.

 

The rate for USDINR can be hardcoded in program but should be easy to change.

 

The Total amount displayed should be shown in expected format only.

 

Print Trades -2 

When user enters 2 , print the list of trades booked. The information must be printed as shown below

 

TradeNo CurrencyPair CustomerName Amount   Rate 

1          USDINR John M.      INR66,000 66.00

 

Exit -3

 

Prompt user for confirmation

Do you really want to exit (y/n)

Y

Bye - have a good day

N

Show standard operations supported by the program.
