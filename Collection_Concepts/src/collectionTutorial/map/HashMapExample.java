package collectionTutorial.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
		//To insert an element Put method is used. Inserting an element is called Entry
		employeeMap.put(1, "Agni"); //Entry
		employeeMap.put(2, "Riya");
		employeeMap.put(3, "Arya");
		employeeMap.put(4, "Munima");
		employeeMap.put(5, "Duck");
		System.out.println("Employee Map : " +employeeMap);
		
		//To make a copy of the existing map.
		Map<Integer, String> duplicateMap = new HashMap<Integer, String>();
		duplicateMap.putAll(employeeMap);
		System.out.println("Duplicate Map : " +duplicateMap);
		
		//Clear to delete the map contents
		duplicateMap.clear();
		System.out.println("After Clearing : " +duplicateMap);
		
		//To check if a Key is present or not in the Map
		System.out.println("Does the map has Key 1 ?" + employeeMap.containsKey(1));
		
		//To check if a Value is present or not in the Map
		System.out.println("Does the map has Value Arya ?" + employeeMap.containsValue("Arya"));
		
		//Clone the Map
		System.out.println("Cloned Map : " +employeeMap.clone());
		
		//Check if the Map is Empty or Not
		System.out.println("Cloned Map : " +duplicateMap.isEmpty());
		
		//Fetch the set of Keys in the Map (NOTE: Here it is not list of Keys, it is set of Keys Bcz List will allow duplicate but Set won't. Keys should be Unique ).
		System.out.println("Key Set : " +employeeMap.keySet());
		
		//Fetch a value
		System.out.println("Get the Value of Key 1 : " + employeeMap.get(1));
		
		//Fetch all the values
		System.out.println("Fetch all the Values : " + employeeMap.values());
		
		//Entry Set will Fetch all the Entries in the Map
		System.out.println(employeeMap.entrySet());
		

	}

}
