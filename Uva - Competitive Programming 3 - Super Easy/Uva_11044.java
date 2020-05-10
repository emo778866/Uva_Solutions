import java.io.*;
import java.util.*;
public class Uva_11044{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int test = Integer.parseInt(br.readLine());
    int n, m, remain;
    String array [];
    for(int i = 0; i < test; i++){
      array = br.readLine().split(" ");
      n = Integer.parseInt(array[0]);
      m = Integer.parseInt(array[1]);
      System.out.println((n/3)*(m/3));
    }
  }
}