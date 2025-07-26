import java.util.*;
public class Prime2{
	public static boolean isPrime(int n){
		int c = 1;
		for(int i=1; i<=n/2; i++)
			if(n%i == 0) c++;
		if(c==2) return true;
		else return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num :");
		int n = sc.nextInt();
		if(isPrime(n)) System.out.println("Prime Number!");
		else System.out.println("Not a prime Number!");
	}
}
