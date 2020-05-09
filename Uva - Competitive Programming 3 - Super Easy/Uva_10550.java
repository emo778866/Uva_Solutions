import java.io.*;
import java.util.*;
public class Uva_10550{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int i, c1, c2, c3;
    i = sc.nextInt();
    c1 = sc.nextInt();
    c2 = sc.nextInt();
    c3 = sc.nextInt();
    int deg;
    while(i !=0 || c1 != 0 || c2 != 0 || c3 != 0){
      deg = (1080 + ((i - c1 + 40) % 40 + (c2 - c1 + 40) % 40 + (c2 - c3 + 40) % 40) * 9);
      System.out.println(deg);
      i = sc.nextInt();
      c1 = sc.nextInt();
      c2 = sc.nextInt();
      c3 = sc.nextInt();
    }
  }
}
// Alternative Solution:
//(1080 + [((i - c1 + 40) % 40] + [(c2 - c1 + 40) % 40] + [(c2 - c3 + 40) % 40) * 9)]