public class Pn1{
  public static void main(String[] args){
    int n = 28,sum=0;
    for(int i=1; i<=n; i++){
    	if(n%i==0) sum += i;
    }
    if(sum/2 == n) System.out.println("Perfect Number!");
    else System.out.println("Not a Perfect Number!");
  }
}
