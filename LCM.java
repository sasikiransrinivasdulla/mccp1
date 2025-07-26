public class LCM{
	public static void main(String[] args){
		int m = 12;
		int n = 18;
		int x = Math.max(m,n);
		int y = Math.min(m,n);
		for(int i = x; i <= m*n; i = i+x)
			if(i%y==0){
			System.out.println(i);
			break;
			}
	}
}
