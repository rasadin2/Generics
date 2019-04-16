package GenericConstructorWithTwoParameter;


class GenericConstructorWithTwoParameters{



    public <T,U>GenericConstructorWithTwoParameters(T itemT, U itemU) {

    

     System.out.println("Value of the itemT: " + itemT);

//		 System.out.println("Type of the itemT: " 
//-
//				 + itemT.getClass().getName());

		 System.out.println("Value of the itemU: " + itemU);

//		 System.out.println("Type of the itemU: " 
//
//				 + itemU.getClass().getName());

    }

    

}
