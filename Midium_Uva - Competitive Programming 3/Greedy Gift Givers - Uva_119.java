import java.io.*;
import java.util.*;
public class Uva_119{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
    Scanner sc = new Scanner(System.in);
    int n, total_money, getters, avg, count = 0;
    String giver, getter, line;
    while((line = br.readLine()) != null){
      n = Integer.parseInt(line);
      HashMap <String, Integer> map = new HashMap<>();
      String names [] = br.readLine().split(" ");
      for(int i = 0; i < n; i++){
        map.put(names[i], 0);
      }
      for(int j = 0; j < n; j++){
        String details [] = br.readLine().split(" ");
        giver = details[0];
        total_money = Integer.parseInt(details[1]);
        getters = Integer.parseInt(details[2]);
        if(getters != 0){
          avg = total_money / getters;
          map.put(giver, map.get(giver) - (avg * getters));
          for(int k = 3; k < details.length; k++){
            getter = details[k];
            map.put(getter, (map.get(getter)+ avg));
          }
        }
      }
      if(count > 0){
        System.out.println();
      }
      count++;
      for(int i = 0; i < n; i++){
        System.out.println(names[i]+" "+map.get(names[i]));
      }
    }
  }
}
//public class Uva_{
//  public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    int counter=0;
//    while(sc.hasNext())
//    {
//      int n=sc.nextInt();
//      HashMap<String, Integer> map=new HashMap<>();
//      String [] names=new String[n];
//      for(int i=0;i<n;i++)
//      {
//        String s=sc.next();
//        names[i]=s;
//        map.put(s, 0);
//      }
//      for(int p=0;p<n;p++)
//      {
//        String giver=sc.next();
//        int money=sc.nextInt();
//        int getters=sc.nextInt();
//        if(getters==0)
//        {
//          continue;
//        }
//        int perPerson=money/getters;
//        map.put(giver,map.get(giver)-(perPerson*getters));
//        for(int i=0;i<getters;i++)
//        {
//          String per=sc.next();
//          map.put(per, map.get(per)+perPerson);
//        }
//      }
//      if(counter>0)
//        System.out.println();
//      counter++;
//      for(int i=0;i<n;i++)
//      {
//        System.out.println(names[i]+" "+map.get(names[i]));
//      }
//      
//    }
//    sc.close();
//  }
//}
