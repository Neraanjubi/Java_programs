package collections_maps;
import java.util.Map;
import java.util.HashMap;

public class Maps {
	public static void main(String[] args) {
		Map<String,Integer> colors = new HashMap<>();
		
		System.out.println("My Empty Map:"+colors);
//put()	
		colors.put("Red",1);
		colors.put("Yellow",2);
		colors.put("Blue",3);
		colors.put("Black",4);
		colors.put("White",5);
		
		System.out.println("My Empty Map After Adding:"+colors);
		
//remove()
		colors.remove("Red");
		System.out.println("My Empty Map after removing:"+colors);
		
//for loop
		
		for(Map.Entry<String,Integer>entry : colors.entrySet()) {
			System.out.println("Keys:=>"+entry.getKey()+"Values:"+entry.getValue());
		}
	}

}
