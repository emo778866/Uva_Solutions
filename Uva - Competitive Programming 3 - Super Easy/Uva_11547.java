import java.io.*;
import java.util.*;
public class Uva_11547{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int test = Integer.parseInt(br.readLine());
    int n;
    for(int i = 0; i < test; i++){
      n = Integer.parseInt(br.readLine());
      n = Math.abs((((((n*567)/9)+7492)*235)/47)-498);
      System.out.println(n/10%10);
    }
  }
}
