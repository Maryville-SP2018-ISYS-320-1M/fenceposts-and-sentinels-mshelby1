/*
	ISYS 320
	Name(s): Matthew Shelby
	Date: 4/22/2018
*/

import java.util.Scanner;

public class P1_FindMinAndMax {

	public static void main(String[] args) {
        Scanner console = new Scanner( System.in );
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        // YOUR CODE STARTS HERE
        
        System.out.print("Type a number (or -1 to stop): ");
        int number = console.nextInt();
        while (number >= 0) {
        	System.out.print("Type a number (or -1 to stop): ");
        	number = console.nextInt();
        }
        

        // YOUR CODE ENDS HERE
        
        System.out.println( "Maximum was " + max );
        System.out.println( "Minimum was " + min );
    }

}
