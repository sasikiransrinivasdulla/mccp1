import java.util.*;
public class LL1{
	public static void main(String[] args){
		LinkedList<Integer> linkedlist = new LinkedList<>();
		linkedlist.add(22);
		linkedlist.add(80);
		linkedlist.add(43);
		linkedlist.add(48);
		linkedlist.add(95);
		for(int i=0; i<linkedlist.size(); i++)
			System.out.print(linkedlist.get(i) + " ");
	}
}
