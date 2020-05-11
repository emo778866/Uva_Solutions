import java.io.*;
import java.util.*;
public class Uva_11942{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int test = Integer.parseInt(br.readLine());
    int n, m;
    String array [] = new String [10];
    String s;
    System.out.println("Lumberjacks:");
    for(int t = 1; t <= test; t++){
      s = "Ordered";
      array = br.readLine().split(" ");
      n = Integer.parseInt(array[0]);
      m = Integer.parseInt(array[1]);
      if(n > m){
        for(int i = 2; i < 10; i++){
          if(Integer.parseInt(array[i-1]) <= Integer.parseInt(array[i])){
            s = "Unordered";
            break;
          }
        }
      }
      else{
        for(int i = 2; i < 10; i++){
          if(Integer.parseInt(array[i-1]) >= Integer.parseInt(array[i])){
            s = "Unordered";
            break;
          }
        }
      }
      System.out.println(s);
    }
    bw.flush();
  }
}
