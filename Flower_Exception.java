package Exception_handling;

public class Flower_Exception {

		public static void main(String[] args) {
	        try {
	        	// ArrayIndexOutOfBoundsException
	            String[] flowers = {"Rose", "Jasmine", "Lavender", "Lotus", "Sunflower", "Hibiscus", "Lily"};
	            System.out.println("My flowers: " + flowers[10]);
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("My Error " + e);
	        } 
	        finally {
	            System.out.println("Execution completed.");
	        }
	        }

	}

