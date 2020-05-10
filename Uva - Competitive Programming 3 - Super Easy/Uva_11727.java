import java.io.*;
import java.util.*;
public class Uva_11727{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    int array [] = new int [3];
    for(int t = 1; t <= test; t++){
      array[0] = sc.nextInt();
      array[1] = sc.nextInt();
      array[2] = sc.nextInt();
      Arrays.sort(array);
      System.out.println("Case "+t+": "+array[1]);
    }
  }
}
