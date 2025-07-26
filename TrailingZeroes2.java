import java.util.*;
public class TrailingZeroes2{
	public static int findZeroes(int n){
		int c = 0;
		if(n<=4) return c;
		for(int i=5; n/i>=1; i = i*5) c += n/i;
		return c;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The Trailing Zeroes are:- "+findZeroes(n));
	}
}
			
			
		
