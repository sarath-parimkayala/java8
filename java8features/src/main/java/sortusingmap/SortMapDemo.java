package sortusingmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("eight", 8);
		map.put("six", 6);
		map.put("four", 4);
		
		List<Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, new MyComparator());
		/*
		 * for(Entry<String, Integer> k : entries) { System.out.println(k.getKey()+ " "+
		 * k.getValue()); }
		 */
		
		entries.stream().forEach(t -> System.out.println(t));
		

	}
	
}
class MyComparator implements Comparator<Entry<String,Integer>>{

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		
		return o1.getKey().compareTo(o2.getKey());
	}
	
}
