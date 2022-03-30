


       /*algorithm: For user input, using string length to identify the cases, 
        4 char means not negative and 5 char means negative. 
        Next, check the zero is included or not.
		And then, find out the max and min of the 4 digits. 
		For remaining 2 digits,I will find out the max or 
		the min among them depending on which cases. 
		Finally, we can print out the answer.**/

import java.util.Scanner;
public class Pattern_matching {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please input 4 digits: " );	
		
		String digits = input.nextLine();
		
		int digitsLength = digits.length();
		
		boolean fiveChar;              // input 5 char means negative sign is included 
		
		boolean isNegative;            
		
		int n1 , n2 , n3 , n4 ;        //for indexing digits after switching to integer    		
//-----------------------------------------------------------------------------------------------------------		
		if (digitsLength == 4) {                             // indicator of the digit length
			fiveChar = false;
			System.out.println( "length = "+ digitsLength ); //minus sign is not included 
		}
			else {
			fiveChar = true;
			System.out.println( "length = "+ digitsLength );//minus sign is included
		}
//-----------------------------------------------------------------------------------------------------------		
		if ( fiveChar == false ){                        // only 4 char, check zero 
				if (digits.charAt(0)=='0'|| digits.charAt(1)=='0'
						||digits.charAt(2)=='0'||digits.charAt(3)=='0')
				{
				System.out.println( "Invalid input, it is positive but with 0, please run again ");
                }
				else {
					isNegative = false;             // positive 4 digits without zero
					
					System.out.println( "Positive case, the smallest 2 in ascending: ");
					
					int number = Integer.parseInt(digits);
					n1 = (int) Math.floor ( number / 1000 ) ;
					n2 = (int) Math.floor ( ( number % 1000 ) / 100 );
					n3 = (int) Math.floor ( ( number % 100 ) / 10 );
					n4 = (int) Math.floor ( ( number % 10 ) );
                    int candidate1 =0 , candidate2 =0 ;  
                    //to locate the possible second smallest digit later
                    
					int smallest =  Math.min( ( Math.min ( n1 , n2) ), Math.min ( n3 , n4 ) );
			   
	                int largest = Math.max( ( Math.max ( n1 , n2 ) ), Math.max ( n3 , n4 ) );
	                System.out.println("Searching the possible second smallest: ");
	                if ( n1 == smallest || n1 == largest ) {
	                	System.out.println("Ignore n1");}
	                	else {
	                	candidate1 = n1;
	                	}
	                if ( n2 == smallest || n2 == largest ) {
	                	System.out.println("Ignore n2");}
	                	else if ( candidate1 != 0 ){
	                	candidate2 = n2;}
	                	else {
	                		candidate1 =n2;
	                	}	
	                if (n3 == smallest || n3 == largest ) {
	                	System.out.println( "Ignore n3" );}
	                	else if ( candidate1 != 0 ) {
	                	candidate2 = n3; }
	                	else {
	                		candidate1 =n3;
	                	}	
	                if (n4 == smallest || n4 == largest ) {
	                	System.out.println("Ignore n4");}
	                	else if (candidate1 != 0){
	                	candidate2 = n4;}
	                	else {
	                		candidate1 =n4;
	                	}	 
				   
	                int secondSmall = Math.min(candidate1, candidate2);
					System.out.print("The smallest two-digit positive number is "+
							smallest + secondSmall);						
	           }
		} //end of 4 characters situation (positive)
//-----------------------------------------------------------------------------------------------------------		
		if ( fiveChar == true ) {                   // 5 char, then check zero 
				if (digits.charAt(1)=='0'||digits.charAt(2)=='0'
						||digits.charAt(3)=='0'||digits.charAt(4)=='0') {
					System.out.println("Invalid input, it is negative but with 0, please run again ");
		        }
				else {
					isNegative = true;                 //negative 4 digits without zero
					System.out.println("Negative case, the largest 2 in decending: ");
					int number = ( Integer.parseInt ( digits ) ) * (-1);
					
					n1 = (int) Math.floor ( number / 1000 ) ;
					n2 = (int) Math.floor ( ( number % 1000 ) / 100 );
					n3 = (int) Math.floor ( ( number % 100 ) / 10 );
					n4 = (int) Math.floor ( ( number % 10 ) );
                    int candidate1 =0 , candidate2 =0 ;   //to locate the possible second largest digit later
                    
					int smallest =  Math.min((Math.min(n1,n2)), Math.min(n3,n4) );
			   
	                int largest = Math.max((Math.max(n1,n2)), Math.max(n3,n4) );
	                System.out.println("Searching the possible second largest: ");
	                if (n1 == smallest || n1 == largest) {
	                	System.out.println("Ignore n1");}
	                	else {
	                	candidate1 = n1;
	                	}
	                if (n2 == smallest || n2 == largest) {
	                	System.out.println("Ignore n2");}
	                	else if (candidate1 != 0){
	                	candidate2 = n2;}
	                	else {
	                		candidate1 =n2;
	                	}	
	                if (n3 == smallest || n3 == largest) {
	                	System.out.println("Ignore n3");}
	                	else if (candidate1 != 0){
	                	candidate2 = n3;}
	                	else {
	                		candidate1 =n3;
	                	}	
	                if (n4 == smallest || n4 == largest) {
	                	System.out.println("Ignore n4");}
	                	else if (candidate1 != 0){
	                	candidate2 = n4;}
	                	else {
	                		candidate1 =n4;
	                	}	 
	                int secondlargest = Math.max ( candidate1 , candidate2 );
					System.out.print( "The largest two-digit number is "+
							 largest  + secondlargest );				
				}
	     } //end of 5 character situation (negative)
		} //end of main method 
 }    //end of class
