import java.io.*;
import java.util.*;
public class Uva_12468 {
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b =  sc.nextInt();
    while(a != -1 || b != -1){
      if(a > b){
        System.out.println(Math.min((a-b), (100+b-a)));
      } 
      else if(a == b){
        System.out.println(0);
      }
      else{
        System.out.println(Math.min((b-a), (100+a-b)));
      }
      a = sc.nextInt();
      b =  sc.nextInt();
    }
    bw.flush();
  }
}
//====Another Solution==========
// import java.io.*;
// import java.util.*;
// class Uva_{
//   public static void main(String[] args)throws IOException{
//     BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
//     BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
//     Scanner sc = new Scanner(System.in);
//     int a, b, d;
//     a = sc.nextInt();
//     b =  sc.nextInt();
//     while(a != -1 || b != -1){
//       d = Math.abs(a-b);
//       if(d > 50){
//         System.out.println(100-d);
//       }
//       else{
//         System.out.println(d);
//       }
//       a = sc.nextInt();
//       b =  sc.nextInt();
//     }
//     bw.flush();
//   }
// }
