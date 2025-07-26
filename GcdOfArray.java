public class GcdOfArray{
	public static int gcd(int a, int b){
		while(b!=0){
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
	public static int gcda(int a[]){
		int ans = gcd(a[0],a[1]);
		for(int i=2; i<a.length; i++) ans = gcd(ans, a[i]);
		return ans;
	}
	public static void main(String[] args){
		int a[] = {6,12,18,54};
		int gcd = gcda(a);
		System.out.println("The GCD is "+gcd);
	}
}
		
		
		
