import java.io.*;
import java.util.*;
public class Uva_{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    String line;
    String array [] = new String [4];
    int number_of_players, budget, hotels, price_per_room, cost, c;
    while((line = br.readLine()) != null){
      array = line.split(" ");
      number_of_players = Integer.parseInt(array[0]);
      budget = Integer.parseInt(array[1]);
      hotels = Integer.parseInt(array[2]);
      int results [] = new int[hotels];
      c = 0;
      for(int h = 0; h < hotels; h++){
        price_per_room = Integer.parseInt(br.readLine());
        String availble_rooms [] = br.readLine().split(" ");
        for(int r = 0; r < availble_rooms.length; r++){
          if(Integer.parseInt(availble_rooms[r]) >= number_of_players){
            if(number_of_players * price_per_room <= budget){
              results[c++] = number_of_players * price_per_room;
              break;
            }
          }
        }
      }
      cost = results[0];
      if(c > 0){
        for(int i = 0; i < c; i++){
          cost = Math.min(cost, results[i]);
        }
        System.out.println(cost);
      }
      else{
        System.out.println("stay home");
      }
    }
    bw.flush();
  }
}
