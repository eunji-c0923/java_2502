package ch08;  

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;  
public class HashMapExample {
			
		public static void main(String[] args) {
 
			Map<String, Integer> map = new HashMap<>();
			
			
    
  map.put("남예준", 183);
  map.put("한노아", 179);
  map.put("채봉구", 173);
  map.put("도은호", 182);
  map.put("유하민", 185);
  map.put("김풀리", 195);
System.out.println("총 Entry 수: " + map.size());
System.out.println();

String key = "남예준";
int value = map.get(key);
System.out.println(key + ": " + value);
System.out.println();
Set<String> keySet= map.keySet();
Iterator<String> keyIterator = keySet.iterator();
while (keyIterator.hasNext()); {
	String K = keyIterator.next();
	Integer v = map.get(K);
	System.out.println(K+ " : " +v);
	
}
  System.out.println();
  
  Set<Entry<String, Integer>> entrySet = map.entrySet();
  Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
  while (entryIterator.hasNext()) {
	  Entry<String, Integer> entry = entryIterator.next();
	  
	 String k = entry.getKey();
	 Integer v = entry.getValue();
	 System.out.println(k + " : " + v);
  }
  
  System.out.println();
  
map.remove("남예준");
System.out.println("총 Entry 수: " + map.size());
System.out.println();
	
	}

}
