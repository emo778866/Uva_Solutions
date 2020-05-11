import java.io.*;
import java.util.*;
public class Uva_621{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(br.readLine());
    String s;
    for(int i = 0; i < n; i++){
      s = br.readLine();
      if(s.equals("1") || s.equals("4") || s.equals("78")){
        System.out.println("+");
      }
      else if(s.endsWith("35")){
        System.out.println("-");
      }
      else if(s.startsWith("9") && s.endsWith("4")){
        System.out.println("*");
      }
      else if(s.startsWith("190")){
        System.out.println("?");
      }
    }
    bw.flush();
  }
}
