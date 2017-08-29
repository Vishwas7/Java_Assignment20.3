package Assignment_3;

/**
 * In here importing class, which are belong from java.util.package;
 */
import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author Vishwas
 * creating class HashMapInJava...
 *
 */
public class HashMapInJava {
	//3. main method
	public static void main(String[] args) {
		
		/**
		 * IN her Creating a HashMap object(hashMap) and performing the following functionalities:
		 * 1.Adding key-value pairs to the HashMap object
		 * 2.Adding a key-value pair to the HashMap object if the key-value pair doesn’t exist already.
		 * 3.Retrieving a value associated with a given key from the HashMap.
		 * 4.Clearing all the key-value pair present in the HashMap.		 
		 */
		HashMap<String, String> hashMap = new HashMap<String, String>();
		//1.
		hashMap.put("First_Name", "Shshant");
		hashMap.put("Last_Name", "Vishwas");
		//2.
		hashMap.put("Last_Name", "Vishwas");		
		//3.
		System.out.println(hashMap.get("First_Name"));		
		//4.
		hashMap.clear();
		//In here initializing the hashmap..
		for (Map.Entry<String, String> name : hashMap.entrySet()) {
			String key = name.getKey();
			String value = name.getValue();
			System.out.println(key + " : " + value);
		}

	}
}
