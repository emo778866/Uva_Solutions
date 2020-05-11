import java.io.*;
import java.util.*;
class Uva_{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int test = Integer.parseInt(br.readLine());
    int max;
    for(int t = 1; t <= test; t++){
      max = 0;
      String s [] = br.readLine().split(" ");
      for(int i = 0; i < s.length; i++){
        if(Integer.parseInt(s[i]) > max){
          max = Integer.parseInt(s[i]);
        }
      }
      System.out.println("Case "+t+": "+max);
    }
    bw.flush();
  }
}