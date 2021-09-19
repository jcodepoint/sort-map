import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class OrdenarMapEjemplo2 {

	public static void main(String[] args) {
		Map<String, String> capitalmap = new HashMap<String, String>();
		capitalmap.put("D", "Viena");
		capitalmap.put("E", "Bruselas");
		capitalmap.put("B", "Copenhague");
		capitalmap.put("A", "Madrid");
		capitalmap.put("C", "Helsinki");
		capitalmap.put("Z", "París");
		capitalmap.put("X", "Budapest");
		capitalmap.put("W", "Dublin");
		capitalmap.put("Y", "Roma");
		capitalmap.put("Q", "Luxemburgo");
		capitalmap.put("R", "Mónaco");
		capitalmap.put("S", "Oslo");
		
		System.out.println("-> Map sin ordenar:");
		capitalmap.forEach((k, v) -> System.out.println("-> key: " + k + " - value: " + v));
		
		List<Map.Entry> l = 
				Arrays.asList(capitalmap.entrySet().toArray(new Map.Entry[0]));
		
		Collections.sort(l, new Comparator<Map.Entry>(){
			@Override
			public int compare(Entry entry1, Entry entry2) {
				return entry1.getValue().toString().compareTo(entry2.getValue().toString());
			}
		});
		
		Map<String, String> lmap = new LinkedHashMap<String, String>();
		
		for (Entry<String, String> e : l) {
			lmap.put(e.getKey(), e.getValue());
		}
		
		System.out.println("\n-> Map ordenado por value:");
		lmap.forEach((k, v) -> System.out.println("-> key: " + k + " - value: " + v));
	}
}
