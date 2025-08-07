import java.util.*;
public class Primesn5{
	public static boolean isPrime(int n){
		if(n<=1) return false;
		if(n==2 || n==3) return true;
		if(n%2 == 0 || n%3 == 0) return false;
		for(int i=5; i*i<=n; i+=6) if(n%i == 0 || n%(i+2) == 0) return false;
		return true;
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
