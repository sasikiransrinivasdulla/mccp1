import java.util.*;
public class Map2{
	public static void main(String[] args){
		LinkedHashMap<Integer, Double> map = new LinkedHashMap<>();
		map.put(615,8.70);
		map.put(659,9.70);
		map.put(633,7.50);
		map.put(648,7.70);
		map.put(660,6.70);
		Set<Integer> set = map.keySet();
		System.out.println("Key \t Value");
		for(Integer i: set)
			System.out.println(i + " \t " + map.get(i));
	}
}
