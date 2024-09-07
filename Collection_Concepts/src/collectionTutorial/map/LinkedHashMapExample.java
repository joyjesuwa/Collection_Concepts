package collectionTutorial.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String, String> heros = new LinkedHashMap<String, String>();
		heros.put("Iron Man", "Tony Stark");
		heros.put("Bat Man", "Bruce Wayne");
		heros.put("Super Man", "Clark");
		
		System.out.println("Linked Hash Map : " +heros);
		
		LinkedHashMap<String, String> nullEx = new LinkedHashMap<String, String>();
		nullEx.put("Iron Man", "Tony Stark");
		nullEx.put("Bat Man", "Bruce Wayne");
		nullEx.put("Super Man", "Clark");
		nullEx.put(null, "ABC"); //Only one Null Key is allowed. If there is two are more null keys. The Key will have only single null key and the value will be overridden to the Last Entry of the Null Key's Value.
		nullEx.put(null, "XYZ"); //So It will be (null, "XYZ")
		//nullEx.put(null, null);
		
		System.out.println("Linked Hash Map : " +nullEx);

	}

}
