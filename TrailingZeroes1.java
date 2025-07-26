import java.util.*;
public class TrailingZeroes1{
	public static long fact(int n){
		long f = 1;
		for(int i=1; i<=n; i++) f *= i;
		return f;
	}
	public static int findZeroes(int n){
		int c = 0;
		long factorial = fact(n);
		while(factorial%10==0){
			c++;
			factorial /= 10;
		}
		return c;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The Trailing Zeroes are:- "+findZeroes(n));
	}
}
			
			
		
