import java.util.*;
public class CountX{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,2,1,2,7,2));
		for(Integer x : list) {
			System.out.print(x + " ");
		}
		int x = 2, count = 0;
		for(Integer num : list) {
			if(num == x) count++;
		}
		System.out.println("");
		System.out.println("Element " + x + " appered this many times :" + count);
	}
}
