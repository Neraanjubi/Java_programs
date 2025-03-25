//Exception handling in java ............//import (4mrks and 5mrks)
//def , typs ,synxt,exp,advtg,disatg(10mrks)
//Normal and Custom exception
//try , catch ,finally
//d/f b/w final and finally keywrd
//Arthmetic exception program exmpl evn in 2mrks also
package Exception_handling;

public class Exception_Handling {
	public static void main(String[] args) {
		
		try {                                     //throws the excption or not
			int a = 10;
			int b = 0;
			int div = a/b;
			System.out.println("Division is:"+div);
		
		}
	    catch(ArithmeticException e){
	    	System.out.println("My Error:"+e);     //solving or debugging
	    }
//		finally {
//			System.out.println("My Error is solving...");        //always executing                              
//		}
//		
	}

	}
