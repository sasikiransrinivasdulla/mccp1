import java.util.*;
public class Print6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of ArrayList: ");
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			System.out.print("Enter " + (i+1) + " Value:");
			list.add(sc.nextInt());
		}
		list.forEach(x -> System.out.print(x + " "));
		sc.close();
	}
}
