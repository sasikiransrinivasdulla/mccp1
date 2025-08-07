import java.util.*;
public class Pf4{
	public static void pfind(int n){
		while(n%2 == 0){
			return 2;
		}
		for(int i=3; i*i<=n; i+=2){
			if(n%i == 0)
			{
				return i;
			}
		}
		
		if(n>1) return n;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int lpf = pfind(n);
		System.out.printf("The LEAST PRIME FACTOR : " + lpf);
	}
}
