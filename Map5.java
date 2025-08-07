import java.util.*;
public class Map5{
	public static void main(String[] args){
		int arr[] = {2,3,4,1,2,3,6,7,3,5,7,2,3,5,1,1,3,5,6,7,3};
		HashMap<Integer, Integer> freq = new HashMap<>();
		for(int x: arr)
			if(freq.containsKey(x))
				freq.put(x,freq.get(x) + 1);
			else freq.put(x,1);
		Set<Integer> set = freq.keySet();
		System.out.println("Number \t Frequency");
		for(Integer i: set)
			System.out.println(i + " \t " + freq.get(i));
	}
}
