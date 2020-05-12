import java.io.*;
import java.util.*;
public class Uva_12554{ 
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    String [] song = {
      "Happy", "birthday", "to", "you",   
      "Happy", "birthday", "to", "you",   
      "Happy", "birthday", "to", "Rujia",  
      "Happy", "birthday", "to", "you"  
    }; 
    int total_people = Integer.parseInt(br.readLine());
    String [] names = new String[total_people];  
    for(int i = 0; i < total_people; i++){
      names[i] = br.readLine();
    }
    int i = 0;
    while(true){
      System.out.println(names[(i)%total_people]+": "+song[i%16]);
      if(i%16 == 15 && i >= total_people){
        break;
      }
      i++;
    }
  }
}
