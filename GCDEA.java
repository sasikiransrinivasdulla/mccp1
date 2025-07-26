public class GCDEA{
	public static void main(String[] args){
		int m = 12;
		int n = 18;
		int res = 0;
		while(n%m != 0)
		{
			res = n%m;
			n = m;
			m = res;
		}
		System.out.println(m);
	}
}
