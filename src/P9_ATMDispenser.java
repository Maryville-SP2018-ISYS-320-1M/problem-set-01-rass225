/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P9_ATMDispenser {

	public static void main(String[] args) {
		int dollars;
		int tens;
		int ones; 
		
		dollars = 54;
		tens = dollars / 10;
		ones = dollars % 10;
		
		System.out.print("Dispense "+ tens +" $10 bills and "+ ones+" $1 bills.");
	}

}

