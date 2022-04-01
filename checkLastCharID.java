



        /*algorithm: find out the length of input. 
         If length = 10, it should be 2 alphabets included.
         if not, it should be the case of 3 alphabets. 
         For different case, it will be calculated in different ways.
         Eventually, the answer will match with the correct output. **/

import java.util.Scanner;
public class checkLastCharID{

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please input an ID: "); //8 digits with 2 or 3 Alphabets
		   
			String ID = input.nextLine();  
		    
	        int IDlength = ID.length();  //length function helps identifying cases
	        
	        boolean twoAlphabet;  //Boolean divides input into 2 cases

			int Sum = 0;        //initiate the variable for later calculation
//-----------------------------------------------------------------------------------------------------------       
	         if( IDlength ==10 )    
	         {
	        	System.out.println("2 alphabets: true");  //case1 : 2 ENG
	        	twoAlphabet = true;
	        	}
	        	else {
	        		System.out.println("2 alphabets: false");//case2 : 3 ENG
	        	    twoAlphabet = false;
	            }	         
	         
//-----------------------------------------------------------------------------------------------------------	         
	         if ( twoAlphabet ) {           // case 1 start  (8 num + 2 eng)
	        	 
	        	Sum =           ( ID.charAt(0) - '0') * 30       //calculation of numeric part 
	        			      - ( ID.charAt(1) - '0') * 29  
	        			      + ( ID.charAt(2) - '0') * 28  
	        			      + ( ID.charAt(3) - '0') * 27 
	        			      + ( ID.charAt(4) - '0') * 26 
	        			      + ( ID.charAt(5) - '0') * 25 
	        			      + ( ID.charAt(6) - '0') * 24  
	        			      + ( ID.charAt(7) - '0') * 23 ;  
	        	
	        	             System.out.println("digitsum = " + Sum); 
	        	  int Alpha1 = (((int)ID.charAt(8)) - 45) * 22 ;  //calculation of Alphabets
	        	  
	        	       System.out.println("alpha1 in case1 = " + Alpha1 );
	        	  int Alpha2 = ((int)ID.charAt(9) - 45)  ;
	                   System.out.println("alpha2 in case1 = " + Alpha2 );
	                   
		           Sum += Alpha1 + Alpha2;
	 
	   } //case1 end 
//-----------------------------------------------------------------------------------------------------------         
	       if (twoAlphabet == false) {   //case 2 start (8 num + 3 eng)
	    	   
	    	   Sum =      250+   
	    			    ( ID.charAt(0)-'0') * 21      //calculation of numeric part 
	 			      + ( ID.charAt(1)-'0') * 20  
	 			      - ( ID.charAt(2)-'0') * 19  
	 			      + ( ID.charAt(3)-'0') * 18 
	 			      + ( ID.charAt(4)-'0') * 17 
	 			      + ( ID.charAt(5)-'0') * 16 
	 			      + ( ID.charAt(6)-'0') * 15  
	 			      + ( ID.charAt(7)-'0') * 14  ;  
	    	         
	 	              System.out.println("digitsum = " + Sum);
	 	              
	 	              int Alpha1 = ((int)ID.charAt(8) - 45) * 13 ;    //calculation of Alphabets
	 	                 System.out.println("alpha1 in case2 = " + Alpha1 );
	 	              
	 	              int Alpha2= ((int)ID.charAt(9) - 45) * 13 ;
	 	                 System.out.println("alpha2 in case2 = " + Alpha2 );
	 	              
	 	              int Alpha3 = ((int)ID.charAt(10) - 45) * 13 ;
	 	                 System.out.println("alpha3 in case2 = " + Alpha3 );
	 	                 
	 	              Sum +=(Alpha1 + Alpha2 + Alpha3);

	 	 	  }  //case 2 end 
 //-----------------------------------------------------------------------------------------------------------      
	                     //final output
		                 System.out.println("Sum of all digits and alpha = " + Sum );
	                     double residual = Sum % 20; 
	                     System.out.println("residual = " + residual); 
	                     
	                     if (residual ==17) {
	                     System.out.println("The last character of ID is & ");
	                     }
	                        else if  (residual == 1){
	 	                    System.out.println("The last character of ID is @ ");
	                        }
	                           else {
	 	                       System.out.println("The last character of ID is !");
	                           }    
	          
	 	  }  //main method end       	   
	 } //class end 
