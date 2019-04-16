package GenericsConstructor_t;

public class GenericConstructor {
	
	  public <T> GenericConstructor(T item){

	         System.out.println("Value of the item: " + item);

			 System.out.println("Type of the item: " 
//
					 + item.getClass().getName());

	    } 
}
