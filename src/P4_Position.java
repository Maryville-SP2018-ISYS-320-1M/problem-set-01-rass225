/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

public class P4_Position {

	public static void main(String[] args) {
		double v0;
		double s0;
		double t;
		double a;
		double tSquared;
		double s;
				
		v0 = 60;
		s0 = 12;
		t  = 25;
		a  = 8;
		tSquared = t*t; 
		s  = s0 + v0*t + 0.5*(a*tSquared);
		
		System.out.print("s = "+ s);		
	}
}
