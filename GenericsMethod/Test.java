package GenericsMethod;

public class Test {
	  public <T> void showItemDetails(T item){

	         System.out.println("Value of the item: "+ item);

	         System.out.println("Type of the item: "+ item.getClass().getName());

	     }
}
