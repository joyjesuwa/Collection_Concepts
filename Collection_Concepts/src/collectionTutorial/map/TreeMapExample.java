package collectionTutorial.map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, String> placesInMadurai = new TreeMap<String, String>();
		placesInMadurai.put("Kalavasal", "Madurai");
		placesInMadurai.put("Koodal Nagar", "Madurai");
		placesInMadurai.put("Maatuthavani", "Madurai");
		
		System.out.println("Tree Map : " +placesInMadurai);
		
		TreeMap<String, String> nullEx = new TreeMap<String, String>();
		nullEx.put("Kalavasal", "Madurai");
		nullEx.put("Koodal Nagar", "Madurai");
		nullEx.put("Maatuthavani", "Madurai");
		nullEx.put(null, "ABC"); //Null Keys is not allowed. Bcz in TreeMap we will be sorting the Entries in Natural Sorting Order so it will be comparing the keys to sort. At the time Null can't be compared. so It is not allowed.
		nullEx.put(null, "XYZ"); //So, Null-Pointer Exception will be raised
		nullEx.put("Trichy", null);
		
		System.out.println("Tree Map : " +nullEx);

	}

}
