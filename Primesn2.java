import java.util.*;
public class Primesn2{
	public static boolean isPrime(int n){
		int c = 1;
		for(int i=1; i<=n/2; i++)
			if(n%i == 0) c++;
		if(c == 2) return true;
		else return false;
	}
	public static void primes(int n){
		for(int i=1; i<=n; i++)
			if(isPrime(i))
				System.out.println(i + " ");
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		primes(n);
	}
}
		
