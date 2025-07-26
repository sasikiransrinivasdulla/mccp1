public class LCMwithGCD{
	public static void main(String[] args){
		int m = 12;
		int n = 18;
		int a = m, b = n;
		int res = 0;
		while(n%m != 0)
		{
			res = n%m;
			n = m;
			m = res;
		}
		int gcd = m;
		int lcm = (a*b)/gcd;
		System.out.println(lcm);
	}
}
