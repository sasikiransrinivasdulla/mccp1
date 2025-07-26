import java.util.*;
public class Ps2{
	static boolean perfectSquare(int n){
		if((int)Math.sqrt(n)*(int)Math.sqrt(n) == n)
		return true;
		else return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A number to check Perfect Square or not :");
		int n = sc.nextInt();
		if(Ps1.perfectSquare(n)) System.out.println("Yes "+n+" is a Perfect Sqaure");
		else System.out.println("No "+n+" is not a Perfect Sqaure");
	}
}
