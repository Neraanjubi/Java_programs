//10mrks and 5 mrks ----collections
//definiton,syntax,
package collections;
import java.util.List;
import java.util.ArrayList;

public class Collections {
	
	public static void main(String[] args) {
		
//creating empty list
	List<Integer> numbers = new ArrayList<>();
	System.out.println("My numbers List before adding elements:"+numbers);
//adding an elements
	numbers.add(100);
	numbers.add(200);
	numbers.add(300);
	numbers.add(400);
	numbers.add(500);
	
	//get operations
	int temp = numbers.get(0);
	System.out.println("My numbers List  elements using index:"+temp);
	
	
	System.out.println("My numbers List After adding elements:"+numbers);
//removing an elements
	numbers.remove(2);
	System.out.println("My numbers List After removing adding elements:"+numbers);
//using for loop
	for(int num :numbers) {
		
		System.out.println("My numbers List using Interator:"+num);
	}
	}

}
