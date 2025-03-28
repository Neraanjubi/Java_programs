	//StringOutOfBoundsException-- 3

package Exception_handling;

public class Exception_Handling3 {
	public static void main(String[]args) {
	
//		String name = "Anju";
//		System.out.println("My name:"+name.charAt(5));
//		NullPointerException==4
//		String a = "null";
//		System.out.println("My name:"+a.length());
	

        try {
        	String a = null;
        	System.out.println("My name:"+a.length());
        }catch(NullPointerException e) {
        	System.out.println("My String:"+e);
        }
        	
        }

	}


	