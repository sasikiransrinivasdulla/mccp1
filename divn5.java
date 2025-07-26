public class divn5{
  public static void main(String[] args){
    int n = 20;
    for(int i=1; i*i<=n; i++){
    	if(n%i==0){
    		System.out.print(i + " ");
    		if(n/i!=i) System.out.print(n/i + " ");
    	}
    }
  }
}
