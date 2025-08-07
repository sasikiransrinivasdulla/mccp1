import java.util.*;
public class Pf3{
	public static void pfind(int n){
		int c = 0;
		while(n%2 == 0){
			c++;
			n /= 2;
		}
		System.out.print(2 + ":" + c + " ");
		for(int i=3; i*i<=n; i+=2){
			if(n%i == 0)
			{
				c = 0;
				while(n%i == 0){
				  c++;
				  n /= i;
				}
				System.out.print(i + ":" + c + " ");
			}
		}
		c = 1;
		if(n>1) System.out.print(n + ":" + c + " ");
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pfind(n);
	}
}
