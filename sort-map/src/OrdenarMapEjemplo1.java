import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrdenarMapEjemplo1 {

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
		
		System.out.println("-> HashMap sin ordenar:");
		
		for (Map.Entry<String, String> e : capitalmap.entrySet()) {
			System.out.println("-> key: " + e.getKey() + " - value: " + e.getValue());
		}
		
		Map<String, String> sortedmap = new TreeMap<String, String>(capitalmap);
		
		System.out.println("\n-> TreeMap ordenado por key:");
		
		for (Map.Entry<String, String> e : sortedmap.entrySet()) {
			System.out.println("-> key: " + e.getKey() + " - value: " + e.getValue());
		}
	}
}
