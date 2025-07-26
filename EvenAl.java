import java.util.*;
public class EvenAl{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
		for(Integer x : list) {
			System.out.print(x + " ");
		}
		list.removeIf(a->(a%2==0));
		System.out.println("After Removal of Evens...");
		for(Integer x : list) {
			System.out.print(x + " ");
		}
	}
}
