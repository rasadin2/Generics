package GenericsMethodUsingArray_A;

public class GenericsArray {



    public <E> void printArray(E[] inputArray) {

        // display array elements

        for (E element : inputArray) {

            System.out.printf("%s ", element);

        }

     System.out.println();

    }
	
}
