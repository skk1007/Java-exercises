
import java.util.*;

public class lastCharacterOfID  {	
    static void checkSD(int numm) {
		int num =numm;		
		int count = 0;
		int result =0;
		int temp1 = num;  
		int temp2 =num;   
		System.out.println("-----------------------------------");	
		System.out.println("Self-dividing--Checking digits for : "+ temp1);
	    while (temp1>1) {	    	
	    	temp1 = temp1 /(10);	    	
		    System.out.println("count = " + count);
		    System.out.println("userinput = " + temp1);
		    count ++;
	    }	    
	    System.out.println("The user input has "+ count + " digits.");
	        
	    int digits = count;   
	    int divisor = 1; 

	    for (int i = 0; i < digits; i ++) {
	    	int quotion = temp2/divisor;   // 128=128/1
	    	
	    	if (quotion-10>=0) {
	    		result = quotion%10;  //result = 8
	    		System.out.println(result + " is scanned");
	    		if(result ==0){
	    			System.out.println(result + " not fits SD");
	    			System.out.println(temp2 + " is not a self-dividing number.");
	    			System.out.println("-----------------------------------");
	    			break;
	    		}
	    		
	    		else if(temp2%result ==0) {
	    			System.out.println(result + " fits SD");	    			
	    		}
	    		else if(temp2%result !=0) {
	    			System.out.println(result + " not fits SD");
	    			System.out.println(temp2 + " is not a self-dividing number.");
	    			System.out.println("-----------------------------------");
	    			break;
	    		}
	    		
	    	}
	    	else if (quotion - 10 <0) { //1- 10 <0
	    		result = quotion;  //result = 1
	    		System.out.println(result + " is last digit.");
	    		if(result ==0) {
	    			System.out.println(result + " not fits SD");
	    			System.out.println(temp2 + " is not a self-dividing number.");
	    			System.out.println("-----------------------------------");
	    			break;
	    		}
	    		
	    		else if(temp2%result ==0) {
	    			System.out.println(result + " fits SD");
	    			System.out.println(temp2 + " is a self-dividing number.");
	    			System.out.println("-----------------------------------");	
	    		}
	    		else if(temp2%result !=0) {
	    			System.out.println(result + " not fits SD.");
	    			System.out.println(temp2 + " is not a self-dividing number.");
	    			System.out.println("-----------------------------------");	
	    		}
	    		break; // to avoid a zero is count 
	    	}
	    	divisor *=10;
	    	}
		  } //end of checkSD method
    
    
    static void checkPal(int numm) {
    	int num =numm;
		int count = 0;
		int result =0;
		int temp1 = num; 
		int temp2 =num;   
		System.out.println("Palindrome --Checking digits for : "+ temp1);
	    while (temp1>=1 ) {   	    	
	    	temp1 = temp1 /(10);	    	
		    System.out.println("count = " + count);
		    System.out.println("userinput = " + temp1);
		    count ++;
	    }
	    System.out.println("The user input has "+ count + " digits.");    
	    int digits = count;       	
	    int divisor = 1; 
	    int cases = 0;
	    //----------------------------------------------------------------------------
	    if (digits%2==1 && digits>1 ) {
	    	System.out.println("Odd digits case(except 1 ), we apply case 1.");	 
	    	cases =1;
	    }
	    else if(digits %2 ==0){
	    	System.out.println("Even digits case, we apply case 2.");
	    	cases =2;
	    }
	    else if(digits ==1) {
	    	System.out.println("1 digit case, we apply case 3.");
	    	cases =3;
	    }
	    
	  //----------------------------------------------------------------------------
	    for (int i = 0; i < digits; i ++) {
	    	int quotion = temp2/divisor;   // 128=128/1
	    	
	    	if (quotion-10>=0) {
	    		result = quotion%10;  //result = 8
	    		System.out.println(result + " is scanned");
	    	}
	    	else if (quotion - 10 <0) { //1- 10 <0
	    		result = quotion;  //result = 1
	    		System.out.println(result + " is last digit.");

	    		break; // to avoid a zero is count 
	    	}
	    	divisor *=10;
	    	}
	    String digstring = Integer.toString(num); //convert it to string
	    System.out.println("digstring = "+ digstring);
	    //---------------------------------------------------------------------------- 
	    
	    if (cases ==1) {
	    int midIndex = (int) Math.floor(digits/2);
	    char mid = digstring.charAt(midIndex);
	    System.out.println("mid number is = " + mid); 
	    System.out.println("mid number's index = " +midIndex); 
	    
	    
	    
	    System.out.println("Now check the palindrome:"); 
	    int head = 0; int tail =0;
	    boolean isPalindrome = true;
	    for (head = 0, tail = digits-1; head<midIndex; head++,tail --) {
	    	
	    	System.out.println(digstring.charAt(head));
	    	System.out.println(digstring.charAt(tail));
	    	if(digstring.charAt(head)==digstring.charAt(tail)) {
	    		System.out.println( "Match.");
	    		if(head==midIndex-1) {
	    			isPalindrome= true;
	    			break;
	    		}     	
	    	}
	    		else
	    		{
	    			System.out.println( "Not match.");
	    			System.out.println( digstring + " is not palindrome.");
	    			isPalindrome =false;
	    			break;
	    		}
	    	}	    
	    if (isPalindrome ==true) {
	    	System.out.println(digstring + " is palindrome.");    	
	    }
	    	}//case 1 end 
	  //----------------------------------------------------------------------------
	    if(cases==2) {
	    	
	    	System.out.println("Now check the palindrome:"); 
		    int head = 0; int tail =0;
		    boolean isPalindrome = true;
		    for (head = 0, tail = digits-1; head<=(digits/2-1); head++,tail --) {
		    	
		    	System.out.println(digstring.charAt(head));
		    	System.out.println(digstring.charAt(tail));
		    	if(digstring.charAt(head)==digstring.charAt(tail)) {
		    		System.out.println( "Match.");
		    		if(head==(digits/2-1)) {
		    			isPalindrome= true;
		    			break;
		    		}     	
		    	}
		    		else
		    		{
		    			System.out.println( "Not match.");
		    			System.out.println( digstring + " is not palindrome.");
		    			System.out.println("-----------------------------------");
		    			isPalindrome =false;
		    			break;
		    		}
		    	}	    
		    if (isPalindrome ==true) {
		    	System.out.println(digstring + " is palindrome.");    	
		    	System.out.println("-----------------------------------");
		    }
	    }
        if(cases==3) {
	    	
	    	System.out.println("Now check the palindrome:"); 

		    boolean isPalindrome = true;
		    isPalindrome =true;
		    if (isPalindrome ==true) {
		    	System.out.println(digstring + " is palindrome.");  
		    	System.out.println("-----------------------------------");
		    }
	    }
    	
    } //end of checkpal method
    
    
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	   boolean rightRange = false;	
	   int upper =0, lower=0;
	   while(rightRange ==false)	{
		   
	       System.out.println("Input a lower limit: ");
		   lower = input.nextInt();   
		   
	        System.out.println("Input a upper limit: ");
	        upper = input.nextInt();

	   if (upper -lower >0) {
		       System.out.println("Range is acceptable");		   
	           rightRange =true;
	           break;}
	        else if (upper -lower<0) {
		        System.out.println("Error, upper can not be smaller than lower.");
	            rightRange =false;}
	        else if (upper -lower==0) {
			    System.out.println("Error, upper and lower can not be equal.");
		        rightRange =false; 	    	   
	            }
	       } //while end
	   int looping=0;
	   while (lower<=upper) {
		   System.out.println(lower);
		   
		   checkSD(lower);
		   checkPal(lower);
		   lower++;
	   }
	   System.out.println("Thank you for using the programme.");
	}//main end 
	    	
	    }//class end 
	    
	    
	    
	    
	    
	    