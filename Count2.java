public class Count2{
  public static void main(String[] args){
    int n = 20,count=0;
    for(int i=1; i<=n/2; i++){
    	if(n%i==0) count++;
    }
    count++;
    System.out.println(count);
  }
}
