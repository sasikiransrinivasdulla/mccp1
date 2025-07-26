import java.util.*;
public class Print3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of ArrayList: ");
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			System.out.print("Enter " + (i+1) + " Value:");
			list.add(sc.nextInt());
		}
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next() + " ");
		}
		sc.close();
	}
}
