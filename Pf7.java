import java.util.*;
public class Pf7{
	public static ArrayList<Integer> pfind(int n){
		ArrayList<Integer> list = new ArrayList<>();
		while(n%2 == 0){
			list.add(2);
			while(n%2 == 0){n/=2;}
		}
		for(int i=3; i*i<=n; i+=2){
			if(n%i == 0)
			{
				list.add(i);
				while(n%i == 0){n/=i;}
			}
		}
		if(n>1) list.add(n);
		return list;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> resultlist = new ArrayList<>();
		resultlist = pfind(n);
		System.out.print("UNIQUE PRIME FACTORS -> ");
		resultlist.forEach(x -> System.out.print(x + " "));
	}
}
