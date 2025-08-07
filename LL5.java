import java.util.*;
public class LL5{
	public static void main(String[] args){
		LinkedList<Integer> linkedlist = new LinkedList<>();
		linkedlist.add(22);
		linkedlist.add(80);
		linkedlist.add(43);
		linkedlist.add(48);
		linkedlist.add(95);
		ListIterator it = linkedlist.listIterator();
		linkedlist.forEach((x) -> System.out.print(x + " "));
	}
}
