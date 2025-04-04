package LinkedList;
import java.util.List;
import java.util.LinkedList;


public class Linked_List {
	public static void main (String[] args) {
		List<String> heros = new LinkedList<>();
		System.out.println("My Linked List:"+heros);
		heros.add("NTR");
		heros.add("ANR");
		heros.add("NBK");
		heros.add("NKR");
		heros.add("Ram Charan");
		
		System.out.println("My Linked List After adding:"+heros);
		
		heros.remove(4);
		System.out.println("My Linked List After removing:"+heros);
		
		
		String temp = heros.get(0);
		System.out.println("My Linked List After adding:"+temp);
		
		
		for(String hero :heros) {
			
			System.out.println("My Linked list using Iteratorm,:"+hero);
		}
		heros.add("Allu Arjun");	
			System.out.println("My Linked List after adding:"+heros);
		
			((LinkedList<String>)heros).addFirst("Anju");
			((LinkedList<String>)heros).addLast("Bini");
			System.out.println("My Linked List after adding:"+heros);
			
	}

}
