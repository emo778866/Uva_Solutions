import java.io.*;
import java.util.*;
public class Uva_12498{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    String line;
    int q = 0;
    int x, y, x_, y_;
    String array [] = new String [2];
    while(!(line = br.readLine()).equals("0")){
      q = Integer.parseInt(line);
      array = br.readLine().split(" ");
      x = Integer.parseInt(array[0]);
      y = Integer.parseInt(array[1]);
      for(int i = 0; i < q; i++){
        array = br.readLine().split(" ");
        x_ = Integer.parseInt(array[0]);
        y_ = Integer.parseInt(array[1]);
        if(x_ == x || y_ == y){
          bw.write("divisa");
        }
        else if(x_ > x && y_ > y){
          bw.write("NE");
        }
        else if(x_ < x && y_ > y){
          bw.write("NO");
        }
        else if(x_ < x && y_ < y){
          bw.write("SO");
        }
        else{
          bw.write("SE");
        }
        bw.write("\n");
      }
    }
    bw.flush();
  }
}
