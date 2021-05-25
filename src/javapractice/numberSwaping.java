package javapractice;

public class numberSwaping {
	
	public static void main(String[] args) {
		int x=10, y=20, t;
		
		   t = x;  
	       x = y;  
	       y = t;  
	       System.out.println("x="+x + "y="+y);
	       
	       int x1 = 10, y1 = 5;
	       
	       // Code to swap 'x' and 'y'
	       x1 = x1 + y1; // x now becomes 15
	       y1= x1 - y1; // y becomes 10
	       x1 = x1 - y1; // x becomes 5
	       System.out.println("x1="+x1 + "y1="+y1);
	       
	}

}
