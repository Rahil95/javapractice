package arraydemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arrayexp {

	public static void main(String[] args) {
		List l1 = new ArrayList ();
	     
	     
	     l1.add(1);
	     l1.add(2);
	     l1.add(3);
	     l1.add(4);
	     //Object total = 0;
	     
	     Iterator<String> i1 = l1.iterator();
	     
	     while(i1.hasNext()) {
	    	 System.out.println(i1.next());
	     }
//	     for (int i = 0; i < l1.size(); i++) {
//	            total  = l1.get(i);
//	        }
//	        System.out.println("The total is: " + total);
	    
	     //System.out.println(i1);
	}
	
	//create arraylist of 5 numbers and do the total of all the number
}
