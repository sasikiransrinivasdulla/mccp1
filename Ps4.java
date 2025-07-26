import java.util.*;
public class Ps4{
	static boolean perfectSquare(int n){
		int low = 1, high = n, mid = 0;
		while(low<=high){
			mid = (low + high)/2;
			if(mid*mid == n) return true;
			else if(mid*mid < n) low = mid + 1;
			else high = mid - 1;
		}
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A number to check Perfect Square or not :");
		int n = sc.nextInt();
		if(Ps1.perfectSquare(n)) System.out.println("Yes "+n+" is a Perfect Sqaure");
		else System.out.println("No "+n+" is not a Perfect Sqaure");
	}
}
