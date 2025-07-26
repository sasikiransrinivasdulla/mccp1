public class divn3{
  public static void main(String[] args){
    int n = 20;
    for(int i=1; i<=n/2; i++){
    	if(n%i==0) System.out.print(i + " ");
    }
    System.out.print(n + " ");
  }
}
