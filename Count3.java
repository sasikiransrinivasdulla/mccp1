public class Count3{
  public static void main(String[] args){
    int n = 20,count=0;
    for(int i=1; i*i<=n; i++){
    	if(n%i==0){
    		count++;
    		if(n/i!=i) count++;
    	}
    }
    System.out.println(count);
  }
}
