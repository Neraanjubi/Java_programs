 //keywords in exception handling thr r 5 are...try,catch,,finally,throw,throws


package custom_exception;

class AnjuException extends Exception{
	public AnjuException(String msg) {  //Constructor
		super(msg);
	}
	
}

public class Custom_Exception {
	public static void main(String[] args) {
		try {
			//throw new AnjuException("My message");
			checkNumber(10);
		}
		catch(AnjuException e) {
			System.out.println("My Custom Error:"+e);
			
		}
		finally {
			System.out.println("My Custom Error is created");		
		}
	}
	
	public static void checkNumber(int number) throws AnjuException{
		if(number>5) {
			throw new AnjuException("Number is above 5");
		}	
		
	}

}

