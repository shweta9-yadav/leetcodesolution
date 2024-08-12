package tested;
import java.util.*;

public class hashtablevshashmap {
	public static void main(String[] args) {
		  Hashtable<Integer, String> hashtable = new Hashtable<>();
		  HashMap<Integer, String> hashmap = new HashMap<>();
		  hashtable.put(0, "test");
		  hashtable.put(1, "test1");
		  hashtable.put(2, "test2");
		  hashtable.put(3, "test3");
		  hashtable.put(4, "test4");
		  hashtable.put(5, "test5");
		  hashtable.put(6,"test6" );
		  
		  hashmap.put(0, "test");
		  hashmap.put(1, "test1");
		  hashmap.put(2, "test2");
		  hashmap.put(3, "test3");
		  hashmap.put(4, "test4");
		  hashmap.put(5, "test5");
		  hashmap.put(null,null );
		  
		  
		  hashtable.forEach((key,value)->{
			  System.out.println(key+"----"+value);
		  });
		  hashmap.forEach((key,value)->{
			  System.out.println(key+"-=--"+value);
		  });
		  
		  
	}

}
