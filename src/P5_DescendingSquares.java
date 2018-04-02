/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/* 6. Your pseudocode algorithm here
A given number is multiplied with itself and then printed out. It repeats this from 10 to 1.

*/

public class P5_DescendingSquares {

	public static void main(String[] args) {		
		for (int x = 10; x >=1; x--) {
			int result = x * x;
			System.out.print(result + " ");
		}
	}

}

