//craeting array using exception handling
package Exception_handling;

public class Exception_Handling2 {
      public static void main(String[] args) {
    	  
		try {                                                 //throws the excption or not
			int []numbers = {1,2,3,4,5};
	    	  System.out.println("My Array:"+numbers[0]);
		
		}
	    catch(ArithmeticException e){
	    	System.out.println("My Error:"+e);
	    	                                                   //solving or debugging
	    }
//		finally {
//			System.out.println("My Error is solving...");       //always executing                               
//		}
//		
	}

	}



