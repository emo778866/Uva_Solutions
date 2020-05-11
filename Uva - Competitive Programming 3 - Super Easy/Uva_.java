import java.io.*;
import java.util.*;
class Uva_12498{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    String line;
    int c = 1;
    while(!(line = br.readLine()).equals("#")){
      bw.write("Case "+(c++)+": ");
      if(line.equals("HELLO")){
        bw.write("ENGLISH");
      }
      else if(line.equals("HOLA")){
        bw.write("SPANISH");
      }
      else if(line.equals("HALLO")){
        bw.write("GERMAN");
      }
      else if(line.equals("BONJOUR")){
        bw.write("FRENCH");
      }
      else if(line.equals("CIAO")){
        bw.write("ITALIAN");
      }
      else if(line.equals("ZDRAVSTVUJTE")){
        bw.write("RUSSIAN");
      }
      else{
        bw.write("UNKNOWN");
      }
      bw.write("\n");
    }
    bw.flush();
  }
}