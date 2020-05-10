import java.io.*;
import java.util.*;
public class Uva_11364{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int test = Integer.parseInt(br.readLine());
    long n, m;
    String array [];
    for(int i = 0; i < test; i++){
      array = br.readLine().split(" ");
      n =  Long.parseLong(array[0]);
      m =  Long.parseLong(array[1]); 
      if(n > m){
        System.out.println(">");
      }
      else if(n < m){
        System.out.println("<");
      }
      else{
        System.out.println("=");
      }
    }
  }
}