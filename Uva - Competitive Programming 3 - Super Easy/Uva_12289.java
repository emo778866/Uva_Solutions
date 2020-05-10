import java.io.*;
import java.util.*;
public class Uva_12289{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int test = Integer.parseInt(br.readLine());
    String s;
    for(int t = 0; t < test; t++){
      s = br.readLine();
      if(s.length() == 5){
        System.out.println("3");
      }
      else if((s.contains("o") && s.contains("n")) ||(s.contains("o") && s.contains("e")) ||
              (s.contains("n") && s.contains("e"))){
        System.out.println("1");
      }
      else{
        System.out.println("2");
      }
    } 
  }
}
