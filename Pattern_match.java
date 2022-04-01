
import java.util.*;

public class Pattern_matching {


	      public static boolean  FindPattern (String txt, String mypat) {
                int patLen =mypat.length();
		        int j = 0 , x = 0, y = 0;
		    for (int i = 0; i <txt.length(); i++) {
            if ( mypat.charAt(y) == '.' ||txt.charAt(i) == mypat.charAt(y) ) 
            {  j++;  y++;} 
            else if (mypat.charAt(y) == '*')
            { x = y;
              y++;
            } 
            else { j = 0;
                   y = x;
            }
            if (patLen== (x + j) ) 
                {   break; }
		}
		return (patLen == (x + j) );
	   }
	   public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please input your sequence: ");
		String yourtxt = input.nextLine();
		System.out.println("Please input your pattern: ");
		String yourpat = input.nextLine();
		boolean testing = FindPattern(yourtxt, yourpat);
		System.out.println("Is there a match? ");
		   if (testing ==true)
		     {
            System.out.println("true"); 
            System.out.println("Thank you for using the programme.");
            } else {
            System.out.println("false");
            System.out.println("Thank you for using the programme.");
		    }
	}

}
