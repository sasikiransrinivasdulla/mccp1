import java.util.*;
public class divn2{
  static ArrayList<Integer> Divisors(int n){
    ArrayList<Integer> l = new ArrayList<>();
    for(int i=1; i<=n; i++){
      if(n%i==0) l.add(i);
    }
    return l;
  }
  public static void main(String[] args){
    int n = 20;
    ArrayList<Integer> l = divn2.Divisors(n);
    for (Integer x : l) System.out.println(x + " ");
  }
}
