import java.io.*;
import java.util.*;
public class Uva_12157{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    int mile_rate, juice_rate, duration;
    String m = "Mile";
    String j = "Juice";
    int n;
    for(int t = 1; t <= test; t++){
      mile_rate = 0;
      juice_rate = 0;
      System.out.print("Case "+t+": ");
      n = sc.nextInt();
      for(int i = 0; i < n; i++){
        duration = sc.nextInt();
        mile_rate += ((duration/30)+1)*10;
        juice_rate += ((duration/60)+1)*15;
      }
      if(mile_rate < juice_rate){
        System.out.println(m+" "+mile_rate);
      }
      else if(mile_rate > juice_rate){
        System.out.println(j+" "+juice_rate);
      }
      else if(mile_rate == juice_rate){
        System.out.println(m+" "+j+" "+mile_rate);
      }
    }
    bw.flush();
  }
}
