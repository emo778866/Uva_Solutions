import java.io.*;
import java.util.*;
public class Uva_12577{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    String line;
    int c = 0;
    while(!(line = br.readLine()).equals("*")){
      bw.write("Case "+(++c)+": ");
      if(line.equals("Hajj")){
        bw.write("Hajj-e-Akbar"+"\n");
      }
      else{
        bw.write("Hajj-e-Asghar"+"\n");
      }
    }
    bw.flush();
  }
}