package sets;
import java.util.TreeSet;
import java.util.HashSet;

public class Sets {
	public static void main(String[]args) {
		TreeSet<String>gods = new TreeSet<>();
		System.out.println("My Empty Set:"+gods);
		gods.add("Shiva");
		gods.add("Krishna");
		gods.add("Murugan");
		gods.add("Parvathi");
		gods.add("Vishnu");
		gods.add("Shiva");    //duplicate are not allowed
//		gods.add(null);
//		gods.add(null);
		System.out.println("My Empty Set After Adding:"+gods);
		
//In set only add and for loop wll work and remove and get operation won't work
		
//		gods.remove(4);
//		System.out.println("My Empty Set After removing:"+gods);
//		
//		String temp = gods.get(0);
//		System.out.println("My  Empty Set After adding:"+temp);
		
        for(String new1 :gods) {
			
			System.out.println("My Empty Set using Iteratorm,:"+gods);
		}
		
	}

}
