import java.io.*;
import java.util.*;
public class Uva_12372{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int cases = sc.nextInt();
    for(int i=1;i<=cases;i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if(a<=20 && b<=20 && c<=20){
        System.out.println("Case "+i+": "+"good");
      }
      else{
        System.out.println("Case "+i+": "+"bad");
      }
    }
  }
}

