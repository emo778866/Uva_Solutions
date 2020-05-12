import java.io.*;
import java.util.*;
public class Uva_12503{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    String s;
    String array [] = new String [3];
    int n, count;
    int test = Integer.parseInt(br.readLine());
    for(int t = 0; t < test; t++){
      count = 0;
      n = Integer.parseInt(br.readLine());
      int arr [] = new int [n+1];
      for(int i = 1; i <= n; i++){
        s = br.readLine();
        if(s.equals("LEFT")){
          arr[i] = -1;
          count += arr[i];
        }
        else if(s.equals("RIGHT")){
          arr[i] = 1;
          count += arr[i];
        }
        else{
          array = s.split(" ");
          arr[i] =  arr[Integer.parseInt(array[2])];
          count += arr[i];
        }
      }
      System.out.println(count);
    }
    bw.flush();
  }
}
