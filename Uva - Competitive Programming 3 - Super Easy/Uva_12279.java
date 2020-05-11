import java.io.*;
import java.util.*;
public class Uva_12250{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int o = 0;
    int g = 0;
    int i = 0;
    int count = 1;
    while(sc.hasNext()){
      o = 0;
      g = 0;
      int c = sc.nextInt();
      if(c!=0){
        for(i=1;i<=c;i++){
          int in = sc.nextInt();
          if(in==0){
            g++;
          }
          else{
            o++;
          }
        }
        System.out.println("Case "+(count++)+": "+(o-g));
      }
    }
    bw.flush();
  }
}
