package receipt;
import java.math.BigDecimal;
import java.util.*;

public class ReceiptPrinter {
	 public static class selected {
		 private int key;
		 private String name;
		 private double price;
		 private double quantity;	
		 
		 public selected(int key, String name,double price, double quantity) {
			 this.key=key;
			 this.name=name;
			 this.price=price;
			 this.quantity=quantity;
		 }
		 public int getKey() {
				return key;
			}
		 public String getName() {
				return name;
			}
		 public double getPrice() {
				return price;
			}
		 public double getQuantity() {
				return quantity;
			}
		 public double getSum() {
			 return price * quantity;
		 }
	 }
	public static void main(String[] args) {		
	 
       HashMap<Integer, String> product = new HashMap<Integer, String>();
	    
	    product.put(1, "storybook");
	    product.put(2, "magazine");
	    product.put(3, "pencil");
	    product.put(4, "shirt");
	    product.put(5, "jeans");
	    product.put(6, "jacket");
	    product.put(7, "chips ");
	    product.put(8, "beef");
	    product.put(9, "milk");
 
	    ArrayList shoppingCart= new ArrayList();
	    
		Scanner input = new Scanner(System.in);
		System.out.print("Input Location: CA / NY  ");
		String location = input.next();
		System.out.println("****Input 88 to finish shopping and get receipt****");	
		System.out.println();
		System.out.println(product);
		System.out.print("Choose product by input the index or 88 to end: ");
		int key =Integer.parseInt(input.next());
	
		while(key!=88) {	
		    while(key<1 ||key>9 && key <88 ||key>88) {
			System.out.print("Choose product by input the index or 88 to end: ");
			key =Integer.parseInt(input.next());
		    }
		String name = product.get(key);
		System.out.println(name);
		System.out.print("Input the price:");
		double price = input.nextDouble();
		System.out.print("Input the quantity:");
		double quantity = input.nextDouble();
	
		selected s1=new selected(key,name,price,quantity);
		shoppingCart.add(s1);
		
		for(int i=0;i<shoppingCart.size();i++) {
			System.out.print(((selected)(shoppingCart.get(i))).getName()+"  ");
			System.out.print(((selected)(shoppingCart.get(i))).getPrice()+"   ");
			System.out.print(((selected)(shoppingCart.get(i))).getQuantity()+"   ");
			System.out.println(((selected)(shoppingCart.get(i))).getSum()+ " ");
		   }
		
		System.out.println(product);
		System.out.print("Choose product by input the index or 88 to end: ");
		key =Integer.parseInt(input.next());
		} //end of while loops
		
		System.out.println("Receipt: ");
		System.out.println("item      price    qty ");
		
		for(int i=0;i<shoppingCart.size();i++) {
			System.out.print(((selected)(shoppingCart.get(i))).getName()+"  ");
			System.out.print("$"+((selected)(shoppingCart.get(i))).getPrice()+"     ");
			System.out.println(((selected)(shoppingCart.get(i))).getQuantity()+"     ");
		   }
		
		double subTotal=0;
		
		for(int i=0;i<shoppingCart.size();i++) {
			subTotal+=(((selected)(shoppingCart.get(i))).getSum());
		   }
		
		double roundSubTotal = Double.parseDouble(String.format("%.2f",(subTotal)));
		System.out.println("subtotal:        "+ roundSubTotal);
		
		boolean caTax =true;
        if(location.equals("ny")){
			caTax=false;
		}
        
		double taxSum =0;
		
	    if (caTax==true) {
	    	for(int i=0;i<shoppingCart.size();i++) {    		
	    		int keyNum=((((selected)(shoppingCart.get(i))).getKey()));
	    		if(keyNum<7) {
	    			taxSum+= ((selected)(shoppingCart.get(i))).getSum()*0.0975;
	    		}
			   } 
	    }
	    else{
	    	for(int i=0;i<shoppingCart.size();i++) {
	    		int keyNum=((((selected)(shoppingCart.get(i))).getKey()));
	    		if(keyNum<4) {
	    			taxSum+= ((selected)(shoppingCart.get(i))).getSum()*0.08875;
	    		}
			   } 
	    }
	    
	    double roundTaxSum =  Math.ceil(taxSum*20)/20;
	      
	    BigDecimal bdSubTotal = new BigDecimal(Double.toString(roundSubTotal));
	    BigDecimal bdTaxSum = new BigDecimal(Double.toString(roundTaxSum));
	    double total = bdSubTotal.add(bdTaxSum).doubleValue();
	    System.out.println("tax:              $"+ roundTaxSum);
	    System.out.println("total:            $"  + total      );

	
	}
}
