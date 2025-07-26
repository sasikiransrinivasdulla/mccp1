public class GCDSub{
	public static void main(String[] args){
		int m = 12;
		int n = 18;
		while(m!=n)
		{
			if(m>n) m = m - n;
			else n = n - m;
		}
		System.out.println(m);
	}
}
