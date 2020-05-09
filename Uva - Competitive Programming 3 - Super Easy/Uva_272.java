import java.io.*;
import java.util.*;
public class Uva_272{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner scanner = new Scanner(System.in);
    String line;
    boolean open = true;
    while((line = br.readLine()) != null){
      for(int i = 0; i < line.length(); i++){
        if(line.charAt(i) == '\"'){  
          if(open == true){
            System.out.print("``");  
            open = false;  
            continue;  
          }
          else{
            System.out.print("''");  
            open = true;  
            continue;  
          }
        }
        System.out.print(line.charAt(i));
      }
      System.out.print("\n");
    }
  }
}