import java.util.*;
public class PrimeFactNestedHM{
	public static void main(String[] args){
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = 108;
		int c = 0;
		if(n%2==0){
			while(n%2 == 0){
				c++;
				n /= 2;
			}
			map.put(2,c);
		}
		for(int i=3; i<=n/i; i+=2){
			c = 0;
			if(n%i == 0){
				while(n%i == 0){
					c++;
					n /= i;
				}
				map.put(i,c);
			}
		}
		if(n>1){
		  map.put(n,1);
		}
		Set<Integer> set = map.keySet();
		for (Integer x : set) {
        System.out.println("Prime: " + x + " Count: " + map.get(x));
    }
	}
} 
