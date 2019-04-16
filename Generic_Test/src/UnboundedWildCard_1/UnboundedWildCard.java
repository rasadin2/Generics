package UnboundedWildCard_1;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildCard {

	 public static void printItems(List<Object> list){

	        //Only work for the list of object type

	        for(Object listItem: list){

	              // list.forEach((listItem) ->{

	            System.out.println(listItem);

	        }

	        }

	        //Work for the list of any type.

	       public static void printListItems(List<?> list){

	           list.forEach((listItem) -> {

	               System.out.println(listItem);

	        });

	    }

	       

	       public static void main(String[] args){

	           List<Object> list1=new ArrayList<>();

	           //Arraylist of Object type.

	           list1.add("Miraj");

	           list1.add("Islam");

	           list1.add(10101);

	           

	           //Arraylist of String type.

	           List<String> list2=new ArrayList<>();

	           

	           list2.add("Mahabub");

	           list2.add("Alam");

	           list2.add("Miraj");
    
                 list1.remove(list1.get(1));
                 
	           //Only accept Object type list.

			System.out.println("List of object " +

					"using displayItems method:");

			         printItems(list1);

	             //Accept list of any type.

			System.out.println("List of object using " +

					"displayListItems method:");

			printListItems(list1);

			System.out.println("List of strin using " +

					"displayListItems method:");

			printListItems(list2);            

	       }
	
}
