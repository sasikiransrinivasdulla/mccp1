import java.util.*;
public class Pf5{
	public static int pfind(int n){
	  if(n<=1) return -1;
		if(n%2 == 0) return 2;
		for(int i=3; i*i<=n; i+=2)
			if(n%i == 0) return i;
		return n;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int lpf = pfind(n);
		System.out.println("The LEAST PRIME FACTOR : " + lpf);
	}
}
