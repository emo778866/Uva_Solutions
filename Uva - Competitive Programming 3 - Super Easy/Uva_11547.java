import java.io.*;
import java.util.*;
public class Uva_11547{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    String s;
    int c = 0;
    while(!(s = br.readLine()).equals("#")){
      System.out.print("Case "+(++c)+": ");
      if(s.equals(("HELLO"))){
        System.out.println("ENGLISH");
      }
      else if(s.equals(("HOLA"))){
        System.out.println("SPANISH");
      }
      else if(s.equals(("HALLO"))){
        System.out.println("GERMAN");
      }
      else if(s.equals(("BONJOUR"))){
        System.out.println("FRENCH");
      }
      else if(s.equals(("CIAO"))){
        System.out.println("ITALIAN");
      }
      else if(s.equals(("ZDRAVSTVUJTE"))){
        System.out.println("RUSSIAN");
      }
      else{
        System.out.println("UNKNOWN");
      }
    }
  }
}
