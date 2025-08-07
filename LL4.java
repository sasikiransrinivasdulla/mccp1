import java.util.*;
public class LL4{
	public static void main(String[] args){
		LinkedList<Integer> linkedlist = new LinkedList<>();
		linkedlist.add(22);
		linkedlist.add(80);
		linkedlist.add(43);
		linkedlist.add(48);
		linkedlist.add(95);
		ListIterator it = linkedlist.listIterator();
		while(it.hasNext())
			System.out.print(it.next() + " ");
	}
}
