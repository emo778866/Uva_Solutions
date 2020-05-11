import java.io.*;
import java.util.*;
public class Uva_10300{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(br.readLine());
    String array [] = new String [3];
    long area, fef, final_premium, x, total;
    while(n-- > 0){
      total = 0;
      x = Integer.parseInt(br.readLine());
      for(int i = 0; i < x; i++){
        array = br.readLine().split(" ");
        area = Long.parseLong(array[0]);
        fef = Long.parseLong(array[2]);
        final_premium = area* fef;
        total += final_premium;
      }
      System.out.println(total);
    }
    bw.flush();
  }
}
