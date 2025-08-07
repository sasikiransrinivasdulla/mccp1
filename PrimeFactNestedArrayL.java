import java.util.*;
public class PrimeFactNestedArrayL{
	public static void main(String[] args){
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		int n = 108;
		int c = 0;
		if(n%2==0){
			while(n%2 == 0){
				c++;
				n /= 2;
			}
			ArrayList<Integer> factor = new ArrayList<>();
      factor.add(2); 
      factor.add(c);
      list.add(factor);
		}
		for(int i=3; i<=n/i; i+=2){
			c = 0;
			if(n%i == 0){
				while(n%i == 0){
					c++;
					n /= i;
				}
				ArrayList<Integer> factor = new ArrayList<>();
        factor.add(i); 
        factor.add(c);
        list.add(factor);
			}
		}
		if(n>1){
		  ArrayList<Integer> factor = new ArrayList<>();
      factor.add(n); 
      factor.add(1);
      list.add(factor);
		}
		for (ArrayList<Integer> factor : list) {
        System.out.println("Prime: " + factor.get(0) + " Count: " + factor.get(1));
    }
	}
}
