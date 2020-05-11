import java.io.*;
import java.util.*;
class Uva_{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int test = Integer.parseInt(br.readLine());
    String array [];
    int high, low, x;
    for(int t = 1; t <= test; t++){
      high = 0; low = 0;
      br.readLine();
      array = br.readLine().split(" ");
      if(array.length > 1){
        for(int i = 0; i < array.length-1; i++){
          x = Integer.parseInt(array[i]);
          if(Integer.parseInt(array[i+1]) > x){
            high++;
          }
          else if(Integer.parseInt(array[i+1]) < x){
            low++;
          }
        }
      }
      System.out.println("Case "+t+": "+high+" "+low);
    }
    bw.flush();
  }
}