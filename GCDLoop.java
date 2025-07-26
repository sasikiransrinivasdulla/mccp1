import java.util.*;
public class GCDLoop{
	public static void main(String[] args){
		int m = 12;
		int n = 18;
		int res = Math.min(m,n);
		while(res>1){
			if(m%res == 0 && n%res == 0)
				break;
			else res--;
		}
		System.out.println(res);
	}
}
