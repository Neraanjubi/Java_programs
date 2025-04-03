package collections;
import java.util.List;
import java.util.ArrayList;
public class Collection2 {
	public static void main (String[] args) {
		List<String> fruits = new ArrayList<>();
		System.out.println("My fruits List before adding elements:"+fruits);
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Bannana");
		fruits.add("Graphs");
		fruits.add("Papaya");
		fruits.add("Orange");
		fruits.add("star apple");
		fruits.add("green apple");
		fruits.add("Kiwi");
		fruits.add("Water meleon");
		System.out.println("My fruits List After adding elements:"+fruits);
		fruits.remove(2);
		System.out.println("My fruits List After removing adding elements:"+fruits);
	}

}
