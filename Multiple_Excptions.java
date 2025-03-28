package Exception_handling;

public class Multiple_Excptions {
	public static void main(String[]args) {
		try {
			//ArithmeticException---1
			int div = 10/0;
			
			//ArrayIndexOutOfBoundException---2
			int[]numbers = {1,2,3,4,5};
			System.out.println("My numbers:"+numbers[10]);
			
			//StringIndexOutOfBoundsException--3
			
			String name = "Anju";
			System.out.println("My name :"+name.charAt(15));
			
			//NullPointerException
			
			String a = null;
			System.out.println("My String:"+a.length());
		}catch(ArithmeticException e) {
			System.out.println("My First:"+e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("My Second:"+e);
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("My third:"+e);
		}catch(NullPointerException e) {
			System.out.println("My fourth:"+e);
		}
		finally {
			System.out.println("My Four errors solving..........");
		}
	}

}
