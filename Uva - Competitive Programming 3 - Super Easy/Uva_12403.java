import java.io.*;
import java.util.*;
public class Uva_12403{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int test = Integer.parseInt(br.readLine());
    String array [] = new String [2];
    long total = 0;
    String line;
    for(int t = 0; t < test; t++){
      line = br.readLine();
      if(line.equals("report")){
        bw.write(total+"\n");
      }
      else{
        array = line.split(" ");
        total += Integer.parseInt(array[1]);
      }
    }
    bw.flush();
  }
}