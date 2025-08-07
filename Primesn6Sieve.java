import java.util.*;
public class Primesn6Sieve{
	public static void findprimes(int n){
		boolean p[] = new boolean[n+1];
		for(int i=0; i<=n; i++) p[i] = true;
		p[0] = false;
		p[1] = false;
		for(int i=2; i*i<=n; i++)
		  if(p[i] == true)
		    for(int j=i+i; j<=n; j+=i)
		      p[j] = false;
		for(int i=2; i<=n; i++)
	  if(p[i] == true) System.out.println(i + " ");
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		findprimes(n);
	}
}
