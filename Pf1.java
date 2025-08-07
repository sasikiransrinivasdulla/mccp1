import java.util.*;
public class Pf1{
	public static void pfind(int n){
		while(n%2 == 0){
			System.out.print(2 + " ");
			n/=2;
		}
		for(int i=3; i*i<=n; i+=2){
			while(n%i == 0){
				System.out.print(i + " ");
				n/=i;
			}
		}
		if(n>1){
			System.out.print(n);
		}
		System.out.println();
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pfind(n);
	}
}
