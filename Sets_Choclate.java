package Sets2;
import java.util.TreeSet;
import java.util.HashSet;

public class Sets_Choclate {
	public static void main(String[]args) {
		TreeSet<String>Chocolate = new TreeSet<>();
		System.out.println("My Empty Set:"+Chocolate);
		Chocolate.add("milkybar");
		Chocolate.add("5star");
		Chocolate.add("Manch");
		Chocolate.add("dairy milk");
		Chocolate.add("galaxy");
		Chocolate.add("kitkat");    //duplicate are not allowed

		System.out.println("My Empty Set After Adding:"+Chocolate);
		
		//Chocolate.remove(4);
	 //   System.out.println("My Empty Set After removing:"+Chocolate);
	
	   // String temp = Chocolate.get(0);
	  //  System.out.println("My  Empty Set After adding:"+temp);
		
        for(String new1 :Chocolate) {
			
			System.out.println("My Empty Set using Iteratorm,:"+Chocolate);
		}
	

}
}
