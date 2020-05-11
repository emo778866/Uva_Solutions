import java.io.*;
import java.util.*;
public class Uva_11332{
  public static int f(int n){
    String s = n+"";
    int number = n;
    while(s.length() != 1){
      number = 0;
      for(int i = 0; i < s.length(); i++){
        number += Character.getNumericValue(s.charAt(i));
      }
      s = number+"";
    }
    return number;
  }
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int n;    
    while((n = Integer.parseInt(br.readLine())) != 0){
      System.out.println(f(n));
    }
    bw.flush();
  }
}
