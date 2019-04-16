package Pyramid;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//            int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Charcter");
		char input=sc.next().charAt(0); //ascii character input function
		
		int ascii_number=input;// convert character to ascii value  (integer value)
		
		int space =ascii_number-64;
		
		int space1 =ascii_number-96;
		int ascii_value=0;
		
          String ascii=null;// decleare String store ascii 
          
          if((ascii_number>=65 && ascii_number<=90)) { //ascii condition use for upper character
        	  

  	        for (int i = 1; i <= space; i++)
  	        {
  	            for (int j = space; j > i; j--)
  	            {
  	                System.out.print(" ");
  	            }
  	            for (int k = 1; k <= i; k++)
  	            {
  	            	
  	            	 ascii_value=64+k;
  	            	 ascii=Character.toString((char)ascii_value);
  	            	
  	                System.out.print(ascii);
  	            }
//  	            
  	            for (int l = i - 1; l >= 1; l--)
  	            {
  	            	ascii_value=64+l;
 	            	 ascii=Character.toString((char)ascii_value);
 	            	 System.out.print(ascii);
  	            }
//  	            
  	            System.out.println();
  	        }

          }
          
          
          
          else if((ascii_number>=97 && ascii_number<=122)){//ascii condition use for lower character
              for (int i = 1; i <= space1; i++)
    	        {
    	            for (int j = space1; j > i; j--)
    	            {
    	                System.out.print(" ");
    	            }
    	            for (int k = 1; k <= i; k++)
    	            {
    	            	 ascii_value=96+k;
    	            	 ascii=Character.toString((char)ascii_value);
    	            	
    	                System.out.print(ascii);
    	            }
    	            
    	            for (int l = i - 1; l >= 1; l--)
    	            {
    	            	ascii_value=96+l;
   	            	 ascii=Character.toString((char)ascii_value);
   	            	 System.out.print(ascii);
    	            }
    	            System.out.println();
    	        }
        
          }
          
          else {
        	  System.out.println("This Ascii False");
          }
          
          
//          
//         
	}

}
