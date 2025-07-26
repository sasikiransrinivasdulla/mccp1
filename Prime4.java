import java.util.*;
public class Prime4{
	public static boolean isPrime(int n){
		if(n<=1) return false;
		for(int i=2; i*i<=n; i++)
		  if(n%i == 0) return false;
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num :");
		int n = sc.nextInt();
		if(isPrime(n)) System.out.println("Prime Number!");
		else System.out.println("Not a prime Number!");
	}
}
